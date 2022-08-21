package com.xx.scope;

import com.xx.scope.common.enumerate.AvailableEnum;
import com.xx.scope.common.exception.ServiceException;
import com.xx.scope.common.utils.PrimaryKeyGenerator;
import com.xx.scope.common.utils.RandomUtil;
import com.xx.scope.item.domain.TestInsert;
import com.xx.scope.item.mapper.TestInsertMapper;
import com.xx.scope.user.domain.GradeDO;
import com.xx.scope.user.mapper.GradeDOMapper;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * main方法工具类
 */
public class MainUtils {
     static ApplicationContext context = new ClassPathXmlApplicationContext("spring/applicationContext-dao.xml");
//     static MonsterDOMapper monsterDOMapper = context.getBean(MonsterDOMapper.class);
     static TestInsertMapper testInsertMapper = context.getBean(TestInsertMapper.class);
//     static GradeDOMapper gradeDOMapper = context.getBean(GradeDOMapper.class);
//     static MonsterMapDOMapper monsterMapDOMapper = context.getBean(MonsterMapDOMapper.class);

    public static void main(String  args[]) {
        long start =System.currentTimeMillis();
        for (int i =1;i<10;i++) {
            TestInsert testInsert = new TestInsert();
            long id = PrimaryKeyGenerator.getInstance().nextId();
            testInsert.setId(id);
            testInsert.setName("名字"+id);
            testInsertMapper.insert(testInsert);
        }
        long end =System.currentTimeMillis();
        System.out.println("耗时:"+(end-start));


//        for(int i=1;i<=10;i++) {
//            //添加怪物
//            addMonster((long) i, i);
//        }

//        for(int i=2;i<=10;i++) {
//            //添加地图
//            addMonsterMap(i);
//        }
    }

    private static void addMonsterMap(Integer mapId) {
        int jin = 0;
        int mu = 0;
        int shui = 0;
        int huo = 0;
        int tu = 0;
        int ti = 0;
        String jmsht = "JMSHT";
        String randomStr = RandomUtil.getRandomString(jmsht, 5);
        char[] chars = randomStr.toCharArray();
        for(char a : chars) {
            switch(a){
                case 'J':
                    jin++;
                    break;
                case 'M':
                    mu++;
                    break;
                case 'S':
                    shui++;
                    break;
                case 'H':
                    huo++;
                    break;
                case 'T':
                    tu++;
                    break;
            }
        }
        int count = 0;
        if (jin>0)count++;
        if (mu>0)count++;
        if (shui>0)count++;
        if (huo>0)count++;
        if (tu>0)count++;
        ti = count;
//        MonsterMapDO monsterMapDO = new MonsterMapDO();
//        monsterMapDO.setId((long)mapId);
//        monsterMapDO.setBing(0);
//        monsterMapDO.setFeng(0);
//        monsterMapDO.setHuo(huo);
//        monsterMapDO.setJin(jin);
//        monsterMapDO.setLei(0);
//        monsterMapDO.setMu(mu);
//        monsterMapDO.setName(mapId+"");
//        monsterMapDO.setShui(shui);
//        monsterMapDO.setTi(ti);
//        monsterMapDO.setTu(tu);
//        monsterMapDO.setType("1");//1是练级地图
//        monsterMapDO.setValid(AvailableEnum.STARTUSING.getValue());
//        monsterMapDOMapper.insert(monsterMapDO);
    }

    //添加怪物
    private static void addMonster(Long mapId, Integer grade) {
        GradeDO gradeDO = null;// = gradeDOMapper.selectByPrimaryKey(grade);
        if(gradeDO == null) {
            throw new ServiceException("境界grade=" + grade + ", 没有找到对应的境界!");
        }
        Integer linggen;
        int jin = 0;
        int mu = 0;
        int shui = 0;
        int huo = 0;
        int tu = 0;
        int ti = 0;
        String jmsht = "JMSHT";
        String randomStr = RandomUtil.getRandomString(jmsht, 5);
        char[] chars = randomStr.toCharArray();
        for(char a : chars) {
            switch(a){
                case 'J':
                    jin++;
                    break;
                case 'M':
                    mu++;
                    break;
                case 'S':
                    shui++;
                    break;
                case 'H':
                    huo++;
                    break;
                case 'T':
                    tu++;
                    break;
            }
        }
        int count = 0;
        if (jin>0)count++;
        if (mu>0)count++;
        if (shui>0)count++;
        if (huo>0)count++;
        if (tu>0)count++;
        linggen = count;
        ti = count;
//        MonsterDO monsterDO = new MonsterDO();
//        monsterDO.setId(PrimaryKeyGenerator.getInstance().nextId());
//        monsterDO.setValid(AvailableEnum.STARTUSING.getValue());
//
//        monsterDO.setJin(jin);
//        monsterDO.setMu(mu);
//        monsterDO.setShui(shui);
//        monsterDO.setHuo(huo);
//        monsterDO.setTu(tu);
//        monsterDO.setFeng(0);
//        monsterDO.setLei(0);
//        monsterDO.setBing(0);
//        monsterDO.setShen(0);
//        monsterDO.setTi(ti);
//        monsterDO.setLinggen(linggen);
//
//        monsterDO.setChenghao("");
//        monsterDO.setDaode(0);
//        monsterDO.setMonsterMapId(mapId);
//        monsterDO.setName(grade+"级");
//
////        monsterDO.setX(1.1);
////        monsterDO.setY(10);
////        monsterDO.setYunqi(0);
//        monsterDO.setZhenyuan(gradeDO.getZhenyuanUp());
////        monsterDO.setZongmen();
//        monsterDO.setYueli(0L);
////----------------------------------
//        monsterDO.setYidongsudu(gradeDO.getSuduUp());
//        monsterDO.setShenshi(gradeDO.getShenshiUp());
//        monsterDO.setGrade(grade);
//        monsterDO.setHp(gradeDO.getHpUp());
//        monsterDO.setGongji(gradeDO.getGongjiUp());
//        monsterDO.setFangyu(gradeDO.getFangyuUp());
//        monsterDOMapper.insert(monsterDO);
    }


}
