package com.xx.scope.user.domain;

import java.math.BigDecimal;

public class UserProperty {
    /**
     * 
     */
    private Long userId;

    /**
     * 道德
     */
    private Integer daode;

    /**
     * 运气
     */
    private Long yunqi;

    /**
     * 阅历
     */
    private Long yueli;

    /**
     * 宗门
     */
    private Long orgId;

    /**
     * 称号
     */
    private String chenghao;

    /**
     * 
     */
    private String map;

    /**
     * 经验
     */
    private BigDecimal exp;

    /**
     * 横坐标
     */
    private BigDecimal x;

    /**
     * 纵坐标
     */
    private BigDecimal y;

    /**
     * 金币
     */
    private BigDecimal money;

    /**
     * 充值元宝(暂定为仙石)
     */
    private BigDecimal yuanBao;

    /**
     * 挂机地图Id
     */
    private Integer monsterMapId;

    /**
     * 
     * @return user_id 
     */
    public Long getUserId() {
        return userId;
    }

    /**
     * 
     * @param userId 
     */
    public void setUserId(Long userId) {
        this.userId = userId;
    }

    /**
     * 道德
     * @return daode 道德
     */
    public Integer getDaode() {
        return daode;
    }

    /**
     * 道德
     * @param daode 道德
     */
    public void setDaode(Integer daode) {
        this.daode = daode;
    }

    /**
     * 运气
     * @return yunqi 运气
     */
    public Long getYunqi() {
        return yunqi;
    }

    /**
     * 运气
     * @param yunqi 运气
     */
    public void setYunqi(Long yunqi) {
        this.yunqi = yunqi;
    }

    /**
     * 阅历
     * @return yueli 阅历
     */
    public Long getYueli() {
        return yueli;
    }

    /**
     * 阅历
     * @param yueli 阅历
     */
    public void setYueli(Long yueli) {
        this.yueli = yueli;
    }

    /**
     * 宗门
     * @return org_id 宗门
     */
    public Long getOrgId() {
        return orgId;
    }

    /**
     * 宗门
     * @param orgId 宗门
     */
    public void setOrgId(Long orgId) {
        this.orgId = orgId;
    }

    /**
     * 称号
     * @return chenghao 称号
     */
    public String getChenghao() {
        return chenghao;
    }

    /**
     * 称号
     * @param chenghao 称号
     */
    public void setChenghao(String chenghao) {
        this.chenghao = chenghao == null ? null : chenghao.trim();
    }

    /**
     * 
     * @return map 
     */
    public String getMap() {
        return map;
    }

    /**
     * 
     * @param map 
     */
    public void setMap(String map) {
        this.map = map == null ? null : map.trim();
    }

    /**
     * 经验
     * @return exp 经验
     */
    public BigDecimal getExp() {
        return exp;
    }

    /**
     * 经验
     * @param exp 经验
     */
    public void setExp(BigDecimal exp) {
        this.exp = exp;
    }

    /**
     * 横坐标
     * @return x 横坐标
     */
    public BigDecimal getX() {
        return x;
    }

    /**
     * 横坐标
     * @param x 横坐标
     */
    public void setX(BigDecimal x) {
        this.x = x;
    }

    /**
     * 纵坐标
     * @return y 纵坐标
     */
    public BigDecimal getY() {
        return y;
    }

    /**
     * 纵坐标
     * @param y 纵坐标
     */
    public void setY(BigDecimal y) {
        this.y = y;
    }

    /**
     * 金币
     * @return money 金币
     */
    public BigDecimal getMoney() {
        return money;
    }

    /**
     * 金币
     * @param money 金币
     */
    public void setMoney(BigDecimal money) {
        this.money = money;
    }

    /**
     * 充值元宝(暂定为仙石)
     * @return yuan_bao 充值元宝(暂定为仙石)
     */
    public BigDecimal getYuanBao() {
        return yuanBao;
    }

    /**
     * 充值元宝(暂定为仙石)
     * @param yuanBao 充值元宝(暂定为仙石)
     */
    public void setYuanBao(BigDecimal yuanBao) {
        this.yuanBao = yuanBao;
    }

    /**
     * 挂机地图Id
     * @return monster_map_id 挂机地图Id
     */
    public Integer getMonsterMapId() {
        return monsterMapId;
    }

    /**
     * 挂机地图Id
     * @param monsterMapId 挂机地图Id
     */
    public void setMonsterMapId(Integer monsterMapId) {
        this.monsterMapId = monsterMapId;
    }

    /**
     *
     * @mbggenerated 2022-08-21
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", userId=").append(userId);
        sb.append(", daode=").append(daode);
        sb.append(", yunqi=").append(yunqi);
        sb.append(", yueli=").append(yueli);
        sb.append(", orgId=").append(orgId);
        sb.append(", chenghao=").append(chenghao);
        sb.append(", map=").append(map);
        sb.append(", exp=").append(exp);
        sb.append(", x=").append(x);
        sb.append(", y=").append(y);
        sb.append(", money=").append(money);
        sb.append(", yuanBao=").append(yuanBao);
        sb.append(", monsterMapId=").append(monsterMapId);
        sb.append("]");
        return sb.toString();
    }
}