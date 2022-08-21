package com.xx.scope.user.domain;

public class UserGongfaDO extends UserGongfaDOKey {
    /**
     * 
     */
    private Integer grade;

    /**
     * 
     */
    private Integer hpUp;

    /**
     * 
     */
    private Integer gongjiUp;

    /**
     * 
     */
    private Integer fangyuUp;

    /**
     * 
     */
    private Integer zhenyuanUp;

    /**
     * 
     */
    private Integer shenshiUp;

    /**
     * 
     */
    private Integer suduUp;

    /**
     * 
     */
    private Integer yueliUp;

    /**
     * 
     */
    private Long nowExp;

    /**
     * 
     */
    private Long nextLevelExp;

    /**
     * 
     * @return grade 
     */
    public Integer getGrade() {
        return grade;
    }

    /**
     * 
     * @param grade 
     */
    public void setGrade(Integer grade) {
        this.grade = grade;
    }

    /**
     * 
     * @return hp_up 
     */
    public Integer getHpUp() {
        return hpUp;
    }

    /**
     * 
     * @param hpUp 
     */
    public void setHpUp(Integer hpUp) {
        this.hpUp = hpUp;
    }

    /**
     * 
     * @return gongji_up 
     */
    public Integer getGongjiUp() {
        return gongjiUp;
    }

    /**
     * 
     * @param gongjiUp 
     */
    public void setGongjiUp(Integer gongjiUp) {
        this.gongjiUp = gongjiUp;
    }

    /**
     * 
     * @return fangyu_up 
     */
    public Integer getFangyuUp() {
        return fangyuUp;
    }

    /**
     * 
     * @param fangyuUp 
     */
    public void setFangyuUp(Integer fangyuUp) {
        this.fangyuUp = fangyuUp;
    }

    /**
     * 
     * @return zhenyuan_up 
     */
    public Integer getZhenyuanUp() {
        return zhenyuanUp;
    }

    /**
     * 
     * @param zhenyuanUp 
     */
    public void setZhenyuanUp(Integer zhenyuanUp) {
        this.zhenyuanUp = zhenyuanUp;
    }

    /**
     * 
     * @return shenshi_up 
     */
    public Integer getShenshiUp() {
        return shenshiUp;
    }

    /**
     * 
     * @param shenshiUp 
     */
    public void setShenshiUp(Integer shenshiUp) {
        this.shenshiUp = shenshiUp;
    }

    /**
     * 
     * @return sudu_up 
     */
    public Integer getSuduUp() {
        return suduUp;
    }

    /**
     * 
     * @param suduUp 
     */
    public void setSuduUp(Integer suduUp) {
        this.suduUp = suduUp;
    }

    /**
     * 
     * @return yueli_up 
     */
    public Integer getYueliUp() {
        return yueliUp;
    }

    /**
     * 
     * @param yueliUp 
     */
    public void setYueliUp(Integer yueliUp) {
        this.yueliUp = yueliUp;
    }

    /**
     * 
     * @return now_exp 
     */
    public Long getNowExp() {
        return nowExp;
    }

    /**
     * 
     * @param nowExp 
     */
    public void setNowExp(Long nowExp) {
        this.nowExp = nowExp;
    }

    /**
     * 
     * @return next_level_exp 
     */
    public Long getNextLevelExp() {
        return nextLevelExp;
    }

    /**
     * 
     * @param nextLevelExp 
     */
    public void setNextLevelExp(Long nextLevelExp) {
        this.nextLevelExp = nextLevelExp;
    }

    /**
     *
     * @mbggenerated 2019-11-01
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", grade=").append(grade);
        sb.append(", hpUp=").append(hpUp);
        sb.append(", gongjiUp=").append(gongjiUp);
        sb.append(", fangyuUp=").append(fangyuUp);
        sb.append(", zhenyuanUp=").append(zhenyuanUp);
        sb.append(", shenshiUp=").append(shenshiUp);
        sb.append(", suduUp=").append(suduUp);
        sb.append(", yueliUp=").append(yueliUp);
        sb.append(", nowExp=").append(nowExp);
        sb.append(", nextLevelExp=").append(nextLevelExp);
        sb.append("]");
        return sb.toString();
    }
}