package com.xx.scope.user.domain;

public class GradeDO {
    /**
     * 
     */
    private Integer levelNum;

    /**
     * 级别对应名称
     */
    private String name;

    /**
     * 
     */
    private Long needExp;

    /**
     * 
     */
    private Long gongjiUp;

    /**
     * 
     */
    private Long fangyuUp;

    /**
     * 
     */
    private Long hpUp;

    /**
     * 
     */
    private Long zhenyuanUp;

    /**
     * 
     */
    private Long shenshiUp;

    /**
     * 
     */
    private Integer suduUp;

    /**
     * 突破几率
     */
    private Double upRat;

    /**
     * 
     * @return level_num 
     */
    public Integer getLevelNum() {
        return levelNum;
    }

    /**
     * 
     * @param levelNum 
     */
    public void setLevelNum(Integer levelNum) {
        this.levelNum = levelNum;
    }

    /**
     * 级别对应名称
     * @return name 级别对应名称
     */
    public String getName() {
        return name;
    }

    /**
     * 级别对应名称
     * @param name 级别对应名称
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * 
     * @return need_exp 
     */
    public Long getNeedExp() {
        return needExp;
    }

    /**
     * 
     * @param needExp 
     */
    public void setNeedExp(Long needExp) {
        this.needExp = needExp;
    }

    /**
     * 
     * @return gongji_up 
     */
    public Long getGongjiUp() {
        return gongjiUp;
    }

    /**
     * 
     * @param gongjiUp 
     */
    public void setGongjiUp(Long gongjiUp) {
        this.gongjiUp = gongjiUp;
    }

    /**
     * 
     * @return fangyu_up 
     */
    public Long getFangyuUp() {
        return fangyuUp;
    }

    /**
     * 
     * @param fangyuUp 
     */
    public void setFangyuUp(Long fangyuUp) {
        this.fangyuUp = fangyuUp;
    }

    /**
     * 
     * @return hp_up 
     */
    public Long getHpUp() {
        return hpUp;
    }

    /**
     * 
     * @param hpUp 
     */
    public void setHpUp(Long hpUp) {
        this.hpUp = hpUp;
    }

    /**
     * 
     * @return zhenyuan_up 
     */
    public Long getZhenyuanUp() {
        return zhenyuanUp;
    }

    /**
     * 
     * @param zhenyuanUp 
     */
    public void setZhenyuanUp(Long zhenyuanUp) {
        this.zhenyuanUp = zhenyuanUp;
    }

    /**
     * 
     * @return shenshi_up 
     */
    public Long getShenshiUp() {
        return shenshiUp;
    }

    /**
     * 
     * @param shenshiUp 
     */
    public void setShenshiUp(Long shenshiUp) {
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
     * 突破几率
     * @return up_rat 突破几率
     */
    public Double getUpRat() {
        return upRat;
    }

    /**
     * 突破几率
     * @param upRat 突破几率
     */
    public void setUpRat(Double upRat) {
        this.upRat = upRat;
    }

    /**
     *
     * @mbggenerated 2019-10-31
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", levelNum=").append(levelNum);
        sb.append(", name=").append(name);
        sb.append(", needExp=").append(needExp);
        sb.append(", gongjiUp=").append(gongjiUp);
        sb.append(", fangyuUp=").append(fangyuUp);
        sb.append(", hpUp=").append(hpUp);
        sb.append(", zhenyuanUp=").append(zhenyuanUp);
        sb.append(", shenshiUp=").append(shenshiUp);
        sb.append(", suduUp=").append(suduUp);
        sb.append(", upRat=").append(upRat);
        sb.append("]");
        return sb.toString();
    }
}