package com.xx.scope.user.domain;


import com.xx.scope.base.domain.BaseDomain;

public class UserPetDTO extends UserPetDO {
    private Long nowHp;
    private Long nowGongji;
    private Long nowFangyu;
    private Boolean isAction;
    private int nowZhenyuan;
    {
        isAction = false;
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

    public Boolean getAction() {
        return isAction;
    }

    public void setAction(Boolean action) {
        isAction = action;
    }

    public int getNowZhenyuan() {
        return nowZhenyuan;
    }

    public void setNowZhenyuan(int nowZhenyuan) {
        this.nowZhenyuan = nowZhenyuan;
    }

    public String attack(BaseDomain m){
        //当前血量
        Long nowHp = m.getNowHp();
        //应扣血量
        Long subHp = this.getNowGongji()-m.getNowFangyu();
        long shengyu = nowHp - subHp;

        m.setNowHp(shengyu);
        if(shengyu<=0) {
            return "HP = 当前" + nowHp + " - " + subHp + "=" +shengyu+ "!"+m.getName()+"死亡!\r\n";
        }
        return "HP = 当前" + nowHp + " - " + subHp + "=" +shengyu+ "!\r\n";
    }
    public Boolean isDead() {
        if (this.getNowHp()<=0) {
            return true;
        }
        return false;
    }
}