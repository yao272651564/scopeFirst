package com.xx.scope.user.service;

import com.alibaba.fastjson.JSONArray;
import com.xx.scope.base.domain.BaseDomain;
import com.xx.scope.common.enumerate.YesOrNoEnum;
import com.xx.scope.common.exception.ServiceException;
import com.xx.scope.common.utils.*;
import com.xx.scope.hero.domain.CombatUnitDTO;
import com.xx.scope.hero.domain.HeroDO;
import com.xx.scope.hero.mapper.HeroDOMapper;
import com.xx.scope.item.domain.*;
import com.xx.scope.item.enumerate.ItemTypeEnum;
import com.xx.scope.item.mapper.*;
import com.xx.scope.monster.domain.Monster;
import com.xx.scope.monster.domain.MonsterMap;
import com.xx.scope.monster.mapper.MonsterMapMapper;
import com.xx.scope.monster.mapper.MonsterMapper;
import com.xx.scope.user.enumerate.OverTypeEnum;
import com.xx.scope.user.domain.*;
import com.xx.scope.user.mapper.*;
import com.xx.scope.user.vo.FightSceneVO;
import com.xx.scope.user.vo.UserAllInfoResponseVO;
import com.xx.scope.user.vo.UserRequestVO;
import org.apache.commons.lang3.RandomUtils;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import java.math.BigDecimal;
import java.sql.Time;
import java.util.*;
import java.util.stream.Collectors;

@Repository
public class UserServiceImpl implements UserService {
    private static final Logger logger = LoggerFactory.getLogger(UserServiceImpl.class);

    @Autowired
    private UserItemArmMapper userItemArmMapper;

    @Autowired
    private UserItemConsumeMapper userItemConsumeMapper;

    @Autowired
    private UserDOMapper userDOMapper;

    @Autowired
    private UserSkillDOMapper userSkillDOMapper;

    @Autowired
    private UserPetDOMapper userPetDOMapper;

    @Autowired
    private UserGongfaDOMapper userGongfaDOMapper;

    @Autowired
    private GradeDOMapper gradeDOMapper;

    @Autowired
    private DropGroupMapper dropGroupMapper;

    @Autowired
    private UserItemDOMapper userItemDOMapper;

    @Autowired
    private UserArmDOMapper userArmDOMapper;

    @Autowired
    private UserHeroDOMapper userHeroDOMapper;

    @Autowired
    private UserHeroSkillDOMapper userHeroSkillDOMapper;

    @Autowired
    private HeroDOMapper heroDOMapper;

    @Autowired
    private MonsterMapper monsterMapper;

    @Autowired
    private MonsterMapMapper monsterMapMapper;

    @Autowired
    private UserPropertyMapper userPropertyMapper;
    @Autowired
    private TestInsertMapper testInsertMapper;

    @Override
//    @Transactional(propagation = Propagation.REQUIRED,isolation = Isolation.DEFAULT,timeout=36000,rollbackFor=Exception.class)
    public UserDO addUser() throws Exception {
        UserDO user = userDOMapper.selectByPrimaryKey(666l);
        if(user == null) {
            user = new UserDO();
        }
        user.setId(123L);
        user.setMobile("13651031234");
        int insert = userDOMapper.insert(user);
        if(insert == 1) {
            throw new ServiceException("111");
        }
        return user;
    }

    @Override
    public String getUserProperty(UserRequestVO requestVO) {
        UserProperty userProperty = userPropertyMapper.selectByPrimaryKey(StrUtils.strToLong(requestVO.userId));
        if(userProperty == null) {
            throw new ServiceException("??????????????????????????????");
        }
        return JsonUtil.ObjToJsonStr(userProperty);
    }

    @Override
    public String addAndLogin(String account, String password) {
        if(StringUtils.isEmpty(account) || account.length() < 6) {
            throw new ServiceException("?????????????????????,??????????????????6???!");
        }
        if(StringUtils.isEmpty(password) || StringUtils.isEmpty(password)) {
            throw new ServiceException("??????????????????,??????????????????6???!");
        }
        //??????????????????????????????
        UserDO userByAccount = null;
        userByAccount = userDOMapper.selectUserByAccount(account);
        //???????????????, ??????????????????
        if(userByAccount == null) {
            userByAccount = new UserDO();
            long id = PrimaryKeyGenerator.getInstance().nextId();
            userByAccount.setId(id);
            userByAccount.setStatus("1");
            userByAccount.setCreateTime(new Date());
            userByAccount.setAccount(account);
            userByAccount.setPassword(Md5Util.strMD5(account+password));
            userDOMapper.insert(userByAccount);
            long zero = 0L;
            UserProperty userProperty = new UserProperty();
            userProperty.setUserId(id);
            userProperty.setChenghao("??????");
            userProperty.setDaode(0);
            userProperty.setExp(BigDecimal.ZERO);
            userProperty.setMoney(BigDecimal.ZERO);
            userProperty.setOrgId(zero);
            userProperty.setX(BigDecimal.ZERO);
            userProperty.setY(BigDecimal.ZERO);
            userProperty.setYuanBao(BigDecimal.ZERO);
            userProperty.setYueli(zero);
            userProperty.setYunqi(zero);
            userPropertyMapper.insert(userProperty);
        } else {
            //?????????????????????????????????1,????????????, 2, ????????????
            if(!Md5Util.strMD5(account + password).equals(userByAccount.getPassword())) {
                throw new ServiceException("????????????????????????!");
            }
        }

        return JsonUtil.ObjToJsonStr(userByAccount);
    }


    @Override
    public List<String> addAttackMonster(String userId, String mapId) {
        return null;
    }

    @Override
    public String addExp(String userId) {
        //????????????????????????(??????*lingen+????????????)

//          userDOMapper.selectByPrimaryKey(userId);
        userDOMapper.updateExp(userId);
        return "";
    }

    @Override
    public String getMonsterMapList(String type) {
//        List<MonsterMapDO> selectList = monsterMapDOMapper.selectMonsterMapList(type);
return null;
    }

    @Override
    public String getUserHeroList(String userId) {
        List<UserHeroDTO> selectList = userHeroDOMapper.selectUserHeroList(userId, YesOrNoEnum.YES.getValue());
        return JSONArray.toJSON(selectList).toString();
//        List<GetUserHeroListRspVO.UserHeroVO> dataList = new ArrayList<>();
//        //??????????????????
//        //????????????
//        for (UserHeroDO userHeroDO : selectList) {
//            GetUserHeroListRspVO.UserHeroVO userHeroVO = new GetUserHeroListRspVO.UserHeroVO();
//            userHeroVO.actionStatusName = UserHeroActionStatusEnum.getName(userHeroDO.getActionStatus());
//            userHeroVO.color = userHeroDO.getColor();
////            userHeroVO.gradeName = userHeroDO.getGrade();
//            userHeroVO.isUpGrade = null;//??????????????????????????????=??????
//            userHeroVO.nextExp = null;
//            userHeroVO.nowExp = null;
//            userHeroVO.tianfuName = null;
//            userHeroVO.iconId = userHeroDO == null ? "" : String.valueOf(userHeroDO.getIconId());
//            userHeroVO.id = String.valueOf(userHeroDO.getId());
//            userHeroVO.name = userHeroDO.getName();
////            userHeroVO.nowMapName = null;
////            userHeroVO.starLevel = String.valueOf(userHeroDO.getStaLevel());
//            userHeroVO.zhiwei = UserHeroActionStatusEnum.getName(userHeroDO.getZhiWei());
//            dataList.add(userHeroVO);
//        }
//        GetUserHeroListRspVO rspVO = new GetUserHeroListRspVO();
    }

    @Override
    public FightSceneVO addFightScene(String userId, String mapId) {
        return null;
    }

    @Override
    public String insertHeroCard(String userId) {
        //todo ?????????????????????, ??????????????????, ??????????????????
        List<HeroDO> heroList = heroDOMapper.selectRandomHeroList();
        for (HeroDO heroDO : heroList) {
            UserHeroDO userHeroDO = new UserHeroDO();
            BeanUtil.copyProperties(userHeroDO, heroDO);
            userHeroDO.setId(PrimaryKeyGenerator.getInstance().nextId());
            userHeroDO.setUserId(Long.valueOf(userId));
            userHeroDO.setCurrentAttack(heroDO.getAttack());
            userHeroDO.setCurrentDefense(heroDO.getDefense());
            userHeroDO.setCurrentHp(heroDO.getHp());
            userHeroDO.setCurrentMp(heroDO.getMp());
            userHeroDO.setCurrentSpeed(heroDO.getSpeed());
            userHeroDOMapper.insert(userHeroDO);
        }
        return JsonUtil.ObjToJsonStr(heroList);
    }

    @Override
    public String getUserHeroAciontList(String userId) {
        List<UserHeroDTO> userHeroList = userHeroDOMapper.selectUserHeroList(userId, YesOrNoEnum.YES.getValue());
        List<UserItemArm> userItemArmDOS = userItemArmMapper.selectUserArmList(userId);
        /*//????????????,
        for (UserHeroDTO userHeroDTO : userHeroList) {

        }*/
        List<UserItemConsume> userItemConsumeDOS = userItemConsumeMapper.selectUserItemConsumeList(userId);
        UserAllInfoResponseVO responseVO = new UserAllInfoResponseVO();
        responseVO.setUserHeroList(JsonUtil.ObjToJsonStr(userHeroList));
        responseVO.setUserItemArmList(JsonUtil.ObjToJsonStr(userItemArmDOS));
        responseVO.setUserItemConsumeList(JsonUtil.ObjToJsonStr(userItemConsumeDOS));
        String s = JsonUtil.ObjToJsonStr(responseVO);
        return s;
    }

    @Override
    public String updateUserHeroArm(UserRequestVO requestVO) {
        String userHeroId = requestVO.userHeroId;
        Long heroId = Long.valueOf(userHeroId);

        //1.????????????????????????, ?????????????????????
        UserItemArm userItemArm = userItemArmMapper.selectByPrimaryKey(Long.valueOf(requestVO.armId));
        Long otherHeroId = userItemArm.getHeroId();
        //?????????????????????????????????????????????
        UserItemArm userItemArmByPosion = userItemArmMapper.selectUserItemArmByPosion(requestVO.userId, requestVO.userHeroId, requestVO.armPostion);

        if(otherHeroId != null  && !heroId.equals(otherHeroId)) { //??????????????????
            if(userItemArmByPosion != null){ //??????
                userItemArmByPosion.setHeroId(otherHeroId);
                userItemArmByPosion.setHeroUseSort(userItemArm.getHeroUseSort());
                userItemArmMapper.updateByPrimaryKey(userItemArmByPosion);
            }
            userHeroDOMapper.updateHeroPropertyById(otherHeroId);
        } else {
            //????????????, ?????????????????????
            if(userItemArmByPosion != null){//????????????
                userItemArmByPosion.setHeroId(null);
                userItemArmByPosion.setIsUse(YesOrNoEnum.NO.getValue());
                userItemArmByPosion.setHeroUseSort(null);
                userItemArmMapper.updateByPrimaryKey(userItemArmByPosion);
            }
        }
        userItemArm.setIsUse(YesOrNoEnum.YES.getValue());
        userItemArm.setHeroUseSort(Byte.valueOf(requestVO.armPostion));
        userItemArm.setHeroId(heroId);
        userItemArmMapper.updateByPrimaryKey(userItemArm);
        userHeroDOMapper.updateHeroPropertyById(heroId);
      /*  if(userItemArmByPosion != null) {
            if(!heroId.equals(otherHeroId)) {//??????????????????, ???????????????????????? //??????
                userItemArmByPosion.setHeroId(otherHeroId);
                //dodo ????????????????????????????????????
            } else {//??????, ???????????????, ????????????, ????????????
                userItemArmByPosion.setHeroId(null);
                userItemArmByPosion.setIsUse(YesOrNoEnum.NO.getValue());

            }
            userItemArmMapper.updateByPrimaryKey(userItemArmByPosion);
        } else {
            //????????????
            //????????????
            userItemArmByPosion.setHeroId(null);
            userItemArmByPosion.setIsUse(YesOrNoEnum.NO.getValue());
        }*/
        return "????????????!";
    }

    @Override
    public String updateHeroCancelDressAram(UserRequestVO requestVO) {
        UserItemArm userItemArm = userItemArmMapper.selectByPrimaryKey(Long.valueOf(requestVO.armId));
        if(userItemArm != null) {
            Long heroId = userItemArm.getHeroId();
            userItemArm.setHeroUseSort(null);
            userItemArm.setIsUse(YesOrNoEnum.NO.getValue());
            userItemArm.setHeroId(null);
            userItemArmMapper.updateByPrimaryKey(userItemArm);
            userHeroDOMapper.updateHeroPropertyById(heroId);
        }
        return "???????????????!";
    }

    @Override
    public String AddBattleAction(UserRequestVO requestVO) {
        String battleOverType = "";
        //1.??????????????????, ?????????????????????,?????? ?????????, ?????????????????????????????????, ?????????????????????????????????
        //????????????????????????

        //????????????????????????
        String userId = requestVO.userId;
        List<UserHeroDTO> userHeroList = userHeroDOMapper.selectUserHeroList(userId, YesOrNoEnum.YES.getValue());
        //????????????????????????
        List<Monster> monsterList = monsterMapper.selectMonsterList(requestVO.mapId);
        if(monsterList.isEmpty()) {
            throw new ServiceException("?????????????????????!");
        }
        //???????????????????????????
        List<CombatUnitDTO> combatUnitList = getCombatUnit(userHeroList, monsterList);
        //??????????????????
        List<FightSceneVO.ZhanDouGC> zdgcList = new ArrayList<>();
        //????????????
        Boolean finishFlag = false;
        for (int count = 1; count <= 10; count++) {//??????????????????10?????????
            //??????????????????
            combatUnitList.forEach(p->p.setAction(false));
            logger.info("???"+count+"????????????!");
            int tempCount = 0;
             do {
                 tempCount++;
                 if(tempCount >= 30) { //???????????????
                     break;
                 }
                //???????????????
                CombatUnitDTO combatUnitDTO = combatUnitList.stream().filter(o -> o.getHp() != null && o.getHp() > 0 && !o.getAction()).max(Comparator.comparing(CombatUnitDTO::getCurrentSpeed)).orElse(null);
                if(combatUnitDTO == null) {//??????????????????
                    break;
                }
                FightSceneVO.ZhanDouGC zhanDouGC = new FightSceneVO.ZhanDouGC();
                zhanDouGC.id = String.valueOf(combatUnitDTO.getId());
                zhanDouGC.killId = "1";//???????????????????????????
                zhanDouGC.isPlayer = combatUnitDTO.isPlayer;
                zhanDouGC.huiHe = String.valueOf(count);
                 //??????,??????????????????, ????????????
                List<FightSceneVO.ZhanDouHpChange> zhandouHpChangeList = action(combatUnitDTO,combatUnitList, count);
                 zhanDouGC.hpChangeList = JsonUtil.ObjToJsonStr(zhandouHpChangeList);
                //???????????????
                long monsterDeads = combatUnitList.stream().filter(p -> !p.getIsDead() && YseOrNoEnum.NO.getValue().equals(p.isPlayer)).count();
                 //???????????????
                long userDeads = combatUnitList.stream().filter(p ->  !p.getIsDead() && YseOrNoEnum.YES.getValue().equals(p.isPlayer)).count();
                if(monsterDeads == 0){
                    finishFlag = true;
                    battleOverType = OverTypeEnum.SL.getValue();
                    zhanDouGC.overType = battleOverType;
                } else if(userDeads == 0) {
                    finishFlag = true;
                    battleOverType =  OverTypeEnum.SB.getValue();
                    zhanDouGC.overType = battleOverType;
                } else {  //????????????
                    finishFlag = false;
                    battleOverType =  OverTypeEnum.JX.getValue();
                    zhanDouGC.overType = battleOverType;
                }
                zdgcList.add(zhanDouGC);
             } while (!finishFlag);
            if(finishFlag) {
                break;
            }
        }

        FightSceneVO responseVO = new FightSceneVO();
        responseVO.wfList = JsonUtil.ObjToJsonStr(userHeroList);
        responseVO.dfList = JsonUtil.ObjToJsonStr(monsterList);
        responseVO.zdgcList = JsonUtil.ObjToJsonStr(zdgcList);
        responseVO.battleOverType = battleOverType;

        //???????????? toto ?????????????????????????
        long dropExp = 0l;
        long dropMoney = 0l;
        long dropYuanBao = 0l;
        //  ======================================= ????????????===============================
        List<DropGroupDTO> dropGroupList = dropGroupMapper.selectDropItemList(requestVO.mapId);
        //????????????????????????,????????????
        for (DropGroupDTO dropGroup : dropGroupList) {
            //??????????????????
            if(!ProbabilityUtil.isWin(dropGroup.getRate())) {
                continue;
            }
            String resType = dropGroup.getResType();
            int dropAmount = RandomUtils.nextInt(dropGroup.getMinAmount(), dropGroup.getMaxAmount());
            if(ItemTypeEnum.EXP.getValue().equals(resType)) {
                dropExp += dropAmount;
            } else if(ItemTypeEnum.MONEY.getValue().equals(resType)) {
                dropMoney += dropAmount;
            } else if(ItemTypeEnum.YB.getValue().equals(resType)) {
                dropYuanBao += dropAmount;
            } else if(ItemTypeEnum.CONSUME.getValue().equals(resType)) {
                dropGroup.setId(PrimaryKeyGenerator.getInstance().nextId());
            } else if(ItemTypeEnum.ARM.getValue().equals(resType)) {
                dropGroup.setId(PrimaryKeyGenerator.getInstance().nextId());
            }
            dropGroup.setDropAmount(dropAmount);
         }
        //?????????????????????
        List<DropGroupDTO> dropItemList = dropGroupList.stream().filter(dropGroupDTO -> dropGroupDTO.getDropAmount() > 0).collect(Collectors.toList());
        //???????????????????????????????????????
        List<DropGroupDTO> dropItemConsumeList = dropItemList.stream().filter(dropGroupDTO -> ItemTypeEnum.CONSUME.getValue().equals(dropGroupDTO.getResType())).collect(Collectors.toList());
        //?????????????????????
        List<DropGroupDTO> dropItemArmList = dropItemList.stream().filter(dropGroupDTO -> ItemTypeEnum.ARM.getValue().equals(dropGroupDTO.getResType())).collect(Collectors.toList());
        responseVO.dropItemList = JsonUtil.ObjToJsonStr(dropItemList);

        //?????????????????? todo
        Long mapId = Long.valueOf(requestVO.mapId);
        MonsterMap monsterMap = monsterMapMapper.selectByPrimaryKey(mapId);
        if(monsterMap != null) {
             Long tempMapId = null;
            if("1".equals(monsterMap.getType()) && OverTypeEnum.SL.getValue().equals(battleOverType)) {//????????????, ??????????????????????????????
                tempMapId = mapId;
            }
            userPropertyMapper.updateExpAndMoney(userId, tempMapId, dropExp, dropMoney, dropYuanBao);
        }
        if(dropItemConsumeList.size() > 0) userItemConsumeMapper.insertBatchItemConsumeList(dropItemConsumeList, userId);
        if(dropItemArmList.size() > 0) userItemArmMapper.insertBatchItemArmList(dropItemArmList, userId);
        String responseStr = JsonUtil.ObjToJsonStr(responseVO);
        logger.info(responseStr);
        return responseStr;
    }

    @Override
    public String insertTest(String account, String password) {
        List<TestInsert> list = new ArrayList<>();
        for (int i =1;i<10000;i++) {
            TestInsert testInsert = new TestInsert();
            long id = PrimaryKeyGenerator.getInstance().nextId();
            testInsert.setId(Long.valueOf(i));
            testInsert.setName("??????"+id);
            list.add(testInsert);
        }
        long start =System.currentTimeMillis();
      /*  for (TestInsert testInsert: list) {
            testInsertMapper.insert(testInsert);
        }*/
        testInsertMapper.insertBatch(list);
        long end =System.currentTimeMillis();
        System.out.println("??????:"+(end-start));
        return "??????:"+(end-start);
    }

    //???????????????????????????
    private List<CombatUnitDTO> getCombatUnit(List<UserHeroDTO> userHeroList, List<Monster> monsterList) {
        List<CombatUnitDTO> combatUnitList = new ArrayList<>();
        for (UserHeroDTO userHeroDTO : userHeroList) {
            CombatUnitDTO combatUnitDTO = new CombatUnitDTO();
            BeanUtil.copyProperties(combatUnitDTO, userHeroDTO);
            combatUnitDTO.isPlayer = YesOrNoEnum.YES.getValue();
            combatUnitDTO.isDead = false;
            combatUnitList.add(combatUnitDTO);
        }
        for (Monster monster : monsterList) {
            CombatUnitDTO combatUnitDTO = new CombatUnitDTO();
            BeanUtil.copyProperties(combatUnitDTO, monster);
            combatUnitDTO.isPlayer = YesOrNoEnum.NO.getValue();
            combatUnitDTO.isDead = false;
            combatUnitList.add(combatUnitDTO);
        }
        return combatUnitList;
    }


    //?????????????????????????????????

    /**
     * ????????????????????????
     * @param user ????????????
     * @param monsterList ????????????
     * @return '1'????????????,'2'????????????,'3'????????????
     */
//    private char isAllDead(UserDTO user, List<MonsterDTO> monsterList) {
//        //?????????????????????????????????
//        Boolean monsterIsDead = true;
//        for (int i = 0; i < monsterList.size(); i++) {
//            if(!monsterList.get(i).isDead()) {
//                monsterIsDead = false;
//            }
//        }
//        if(monsterIsDead) {
//            logger.info("????????????!");
//            return '1';
//        } else {
//            Boolean myIsDead = true;
//            for (int i = 0; i < user.getPetList().size(); i++) {
//                if(!user.getPetList().get(i).isDead()) {
//                    myIsDead = false;
//                }
//            }
//            if(myIsDead && user.isDead()) {
//                logger.info("????????????!");
//                return '2';
//            }
//        }
//        return '3';
//    }

    private Object getSpeed(List<BaseDomain> list) {
        Collections.sort(list);
        for (BaseDomain o: list) {
            if(!o.isDead() && !o.getAction()) {
                return o;
            }
        }
        return null;
    }

    /**
     * ????????????
     * @param combatUnitList
     * @param userSkillList
     * @param count
     * @return
     */
    public List<FightSceneVO.ZhanDouHpChange> action(CombatUnitDTO combatUnitDTO, List<CombatUnitDTO> combatUnitList, int count) {
        //?????????
        combatUnitDTO.setAction(true);
        //1.??????buff/debuff??????????????????
        //2.?????????????????????????????????????????????
        //????????????
        UserHeroSkillDO userHeroSkillDO =  null; //todo //userSkillList.stream().filter(p -> p.getUserHeroId().equals(combatUnitDTO.getId()) && count == p.getUseSequence()).findAny().orElse(null);
        if(userHeroSkillDO == null) {
            userHeroSkillDO = new UserHeroSkillDO();
            userHeroSkillDO.setNeedZhenyuan(0L);
            userHeroSkillDO.setName("????????????");
            userHeroSkillDO.setType("1");
            userHeroSkillDO.setSkillId(0L);
            userHeroSkillDO.setTargetNum(1);
            userHeroSkillDO.setAttackRate(1.0);
        }
        List<FightSceneVO.ZhanDouHpChange> zhanDouHpChangeList = new ArrayList<>();
        //???????????????????????????
        if("1".equals(userHeroSkillDO.getType())) {//????????????->???????????????
            //????????????, ??????
            List<CombatUnitDTO> collect = combatUnitList.stream().filter(p -> !p.isPlayer.equals(combatUnitDTO.isPlayer) && !p.isDead).collect(Collectors.toList());
            Collections.shuffle(collect);//??????
            for (int i = 0; i < collect.size(); i++) {
                if(i == userHeroSkillDO.getTargetNum()) {//??????????????????
                    break;
                }
                String isBaoji = YseOrNoEnum.NO.getValue();//todo
                CombatUnitDTO changeCombatUnit = collect.get(i);

                long subHp = combatUnitDTO.getCurrentAttack() * userHeroSkillDO.getAttackRate().longValue() - changeCombatUnit.getCurrentDefense();
                if(YesOrNoEnum.YES.getValue().equals(isBaoji)) {//????????????*2
                    subHp = subHp * 2;
                }
                subHp = subHp < 1 ? 1 : subHp;//????????????1
                subHp = subHp > changeCombatUnit.getCurrentHp() ? changeCombatUnit.getCurrentHp() : subHp;

                //?????????????????????
                FightSceneVO.ZhanDouHpChange zhanDouHpChange = new FightSceneVO.ZhanDouHpChange();
                zhanDouHpChange.id = String.valueOf(changeCombatUnit.getId());
                zhanDouHpChange.isBaoJi = isBaoji;
                zhanDouHpChange.hpChange = "-" + String.valueOf(subHp);
                long shengyu = changeCombatUnit.getCurrentHp() - subHp;
                shengyu = shengyu < 0 ? 0 : shengyu;
                zhanDouHpChange.hp = String.valueOf(shengyu);
                zhanDouHpChange.sort =  String.valueOf(changeCombatUnit.getSort());
                changeCombatUnit.setHp(shengyu);
                if(shengyu<=0) {
                    changeCombatUnit.isDead = true;
                }
                zhanDouHpChangeList.add(zhanDouHpChange);

            }
        }
        return zhanDouHpChangeList;
    }


}
