package com.xx.scope.base.domain;

/**
 * 主键标识
 * @author yaoxing
 * @date 2014年3月3日下午5:55:34
 */

/**
 * @author Administrator
 *
 */public class BaseDomain implements Comparable<BaseDomain> {

    private String name;

    private Long nowHp;
    private Long nowGongji;
    private Long nowFangyu;
    private Boolean isAction;

    private Long yueli;

    public Long getYueli() {
        return yueli;
    }

    public void setYueli(Long yueli) {
        this.yueli = yueli;
    }

    public Long getNowHp() {
        return this.nowHp;
    }

    public void setNowHp(Long nowHp) {
        this.nowHp = nowHp;
    }

    public Long getNowGongji() {
        return this.nowGongji;
    }

    public void setNowGongji(Long nowGongji) {
        this.nowGongji = nowGongji;
    }

    public Long getNowFangyu() {
        return this.nowFangyu;
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int compareTo(BaseDomain o) {
        return o.getYueli().compareTo(this.getYueli());
    }

    public Boolean isDead() {
        if (this.getNowHp()<=0) {
            return true;
        }
        return false;
    }
}

