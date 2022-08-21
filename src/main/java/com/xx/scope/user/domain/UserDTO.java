package com.xx.scope.user.domain;

import com.xx.scope.base.domain.BaseDomain;
import com.xx.scope.common.utils.RandomUtil;

import java.util.List;

public class UserDTO extends UserDO {
    /**
     * 宠物列表
     */
    private List<UserPetDTO> petList;
    /**
     * 技能列表(按装备的顺序排列)
     */
    private List<UserSkillDO> skillList;

    private String name;
    private Long nowHp;
    private Long nowGongji;
    private Long nowFangyu;
    private Boolean isAction;
    private int nowZhenyuan;
    {
        isAction = false;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getNowHp() {
        return nowHp;
    }

    public void setNowHp(Long nowHp) {
        this.nowHp = nowHp;
    }

    public Long getNowGongji() {
        return nowGongji;
    }

    public void setNowGongji(Long nowGongji) {
        this.nowGongji = nowGongji;
    }

    public Long getNowFangyu() {
        return nowFangyu;
    }

    public void setNowFangyu(Long nowFangyu) {
        this.nowFangyu = nowFangyu;
    }

    public int getNowZhenyuan() {
        return this.nowZhenyuan;
    }

    public void setNowZhenyuan(int nowZhenyuan) {
        this.nowZhenyuan = nowZhenyuan;
    }

    public Boolean getAction() {
        return isAction;
    }

    public void setAction(Boolean action) {
        isAction = action;
    }

//1.计算buff/debuff对属性的影响
    //2.计算当前回合技能加成后的攻击力

    //回合数
    //敌人列表
    public String useSkill(List<MonsterDTO> list, int count) {
        String message = "";
        //检查该回合使用的技能
        if (count > skillList.size() || skillList.get(count-1).getNeedZhenyuan().intValue() > this.nowZhenyuan) {
            //技能用完或真元不够,使用普通攻击
            while (true){
                MonsterDTO monsterDTO = list.get(RandomUtil.getRandomInt(list.size()));
                if(!monsterDTO.isDead()) {
                    String m = attack(monsterDTO);
                    //消息
                    message += this.getName() + "攻击" + monsterDTO.getName() + m + "!\r\n";
                    break;
                }
            }
        } else {
            UserSkillDO userSkillDO = skillList.get(count-1);
            if ("1".equals(userSkillDO.getType())) {
                //如果是主动攻击技能
                //按技能影响数, 找出目标
                int targetNum = userSkillDO.getTargetNum();
                //已攻击数量
                int count1 = 0;
                for (int i = 0; i < list.size(); i++) {
                    //此处应改成 获取未死亡的怪物
                    MonsterDTO monsterDTO = list.get(i);
                    if (!monsterDTO.isDead()) {

                        Long nowHp = monsterDTO.getNowHp();
                        Double subHp = this.getGongji() * userSkillDO.getAttackRate()-monsterDTO.getNowFangyu();
                        Double shengyu = nowHp - subHp;
                        monsterDTO.setNowHp(shengyu.longValue());
                        if(shengyu<=0) {
                            message += this.getName() + "使用技能" + userSkillDO.getName() + "," + monsterDTO.getName() + "HP - " + subHp + "HP 剩余 " + shengyu+"!"+monsterDTO.getName()+"死亡!\r\n";
                        } else {
                            message += this.getName() + "使用技能" + userSkillDO.getName() + "," + monsterDTO.getName() + "HP - " + subHp + "HP 剩余 " + shengyu+"!\r\n";
                        }
                        count1++;
                    }
                    if(count1==targetNum) {
                        break;
                    }
                }
            } else {
                System.out.println("使用了非主动技能\r\n");
                message+= "使用了非主动技能\r\n";
            }
        }
        return message;
    }

    private Double getGongji() {
        return Double.valueOf(11);
    }


    public List<UserPetDTO> getPetList() {
        return petList;
    }

    public void setPetList(List<UserPetDTO> petList) {
        this.petList = petList;
    }

    public List<UserSkillDO> getSkillList() {
        return skillList;
    }

    public void setSkillList(List<UserSkillDO> skillList) {
        this.skillList = skillList;
    }

    @Override
    public String toString() {
        return "UserDTO{" +
                "petList=" + petList +
                ", skillList=" + skillList +
                ", name='" + name + '\'' +
                ", nowHp=" + nowHp +
                ", nowGongji=" + nowGongji +
                ", nowFangyu=" + nowFangyu +
                ", isAction=" + isAction +
                ", nowZhenyuan=" + nowZhenyuan +
                '}';
    }

    public String attack(BaseDomain m){
        Long nowHp = m.getNowHp();
        long subHp = this.getNowGongji() - m.getNowFangyu();
        long shengyu = nowHp - subHp;
        m.setNowHp(shengyu);
        if(shengyu<=0) {
            return "HP = 当前" + nowHp + " - " + subHp + "=" +shengyu+ "!"+m.getName()+"死亡!";
        }
        return "HP = 当前" + nowHp + " - " + subHp + "=" +shengyu+ "!";
    }
    public Boolean isDead() {
        if (this.getNowHp()<=0) {
            return true;
        }
        return false;
    }

}