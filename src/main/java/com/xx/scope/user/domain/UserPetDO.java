package com.xx.scope.user.domain;

import com.xx.scope.base.domain.BaseDomain;

import java.math.BigDecimal;

public class UserPetDO extends BaseDomain {
    /**
     * 
     */
    private Long id;

    /**
     * 
     */
    private Long userId;

    /**
     * 类型 1- 宠物
     */
    private String type;

    /**
     * 是否装备1-是 0-否
     */
    private String isUse;

    /**
     * 名称
     */
    private String name;

    /**
     * 灵根id
     */
    private Integer linggen;

    /**
     * 金灵根
     */
    private Integer jin;

    /**
     * 木灵根
     */
    private Integer mu;

    /**
     * 水灵根
     */
    private Integer shui;

    /**
     * 火灵根
     */
    private Integer huo;

    /**
     * 土灵根
     */
    private Integer tu;

    /**
     * 风灵根
     */
    private Integer feng;

    /**
     * 雷灵根
     */
    private Integer lei;

    /**
     * 冰灵根
     */
    private Integer bing;

    /**
     * 体灵根(炼体)
     */
    private Integer ti;

    /**
     * 神识资质
     */
    private Integer shen;

    /**
     * 攻击
     */
    private Long gongji;

    /**
     * 防御
     */
    private Long fangyu;

    /**
     * 移动速度
     */
    private Integer yidongsudu;

    /**
     * 境界
     */
    private Integer grade;

    /**
     * 
     */
    private Long hp;

    /**
     * 神识
     */
    private Long shenshi;

    /**
     * 真元(可恢复)
     */
    private Long zhenyuan;

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
     * 横坐标
     */
    private BigDecimal x;

    /**
     * 纵坐标
     */
    private BigDecimal y;

    /**
     * 是否有效 1-有效 0-删除
     */
    private String valid;

    /**
     * 
     * @return id 
     */
    public Long getId() {
        return id;
    }

    /**
     * 
     * @param id 
     */
    public void setId(Long id) {
        this.id = id;
    }

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
     * 类型 1- 宠物
     * @return type 类型 1- 宠物
     */
    public String getType() {
        return type;
    }

    /**
     * 类型 1- 宠物
     * @param type 类型 1- 宠物
     */
    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    /**
     * 是否装备1-是 0-否
     * @return is_use 是否装备1-是 0-否
     */
    public String getIsUse() {
        return isUse;
    }

    /**
     * 是否装备1-是 0-否
     * @param isUse 是否装备1-是 0-否
     */
    public void setIsUse(String isUse) {
        this.isUse = isUse == null ? null : isUse.trim();
    }

    /**
     * 名称
     * @return name 名称
     */
    public String getName() {
        return name;
    }

    /**
     * 名称
     * @param name 名称
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * 灵根id
     * @return linggen 灵根id
     */
    public Integer getLinggen() {
        return linggen;
    }

    /**
     * 灵根id
     * @param linggen 灵根id
     */
    public void setLinggen(Integer linggen) {
        this.linggen = linggen;
    }

    /**
     * 金灵根
     * @return jin 金灵根
     */
    public Integer getJin() {
        return jin;
    }

    /**
     * 金灵根
     * @param jin 金灵根
     */
    public void setJin(Integer jin) {
        this.jin = jin;
    }

    /**
     * 木灵根
     * @return mu 木灵根
     */
    public Integer getMu() {
        return mu;
    }

    /**
     * 木灵根
     * @param mu 木灵根
     */
    public void setMu(Integer mu) {
        this.mu = mu;
    }

    /**
     * 水灵根
     * @return shui 水灵根
     */
    public Integer getShui() {
        return shui;
    }

    /**
     * 水灵根
     * @param shui 水灵根
     */
    public void setShui(Integer shui) {
        this.shui = shui;
    }

    /**
     * 火灵根
     * @return huo 火灵根
     */
    public Integer getHuo() {
        return huo;
    }

    /**
     * 火灵根
     * @param huo 火灵根
     */
    public void setHuo(Integer huo) {
        this.huo = huo;
    }

    /**
     * 土灵根
     * @return tu 土灵根
     */
    public Integer getTu() {
        return tu;
    }

    /**
     * 土灵根
     * @param tu 土灵根
     */
    public void setTu(Integer tu) {
        this.tu = tu;
    }

    /**
     * 风灵根
     * @return feng 风灵根
     */
    public Integer getFeng() {
        return feng;
    }

    /**
     * 风灵根
     * @param feng 风灵根
     */
    public void setFeng(Integer feng) {
        this.feng = feng;
    }

    /**
     * 雷灵根
     * @return lei 雷灵根
     */
    public Integer getLei() {
        return lei;
    }

    /**
     * 雷灵根
     * @param lei 雷灵根
     */
    public void setLei(Integer lei) {
        this.lei = lei;
    }

    /**
     * 冰灵根
     * @return bing 冰灵根
     */
    public Integer getBing() {
        return bing;
    }

    /**
     * 冰灵根
     * @param bing 冰灵根
     */
    public void setBing(Integer bing) {
        this.bing = bing;
    }

    /**
     * 体灵根(炼体)
     * @return ti 体灵根(炼体)
     */
    public Integer getTi() {
        return ti;
    }

    /**
     * 体灵根(炼体)
     * @param ti 体灵根(炼体)
     */
    public void setTi(Integer ti) {
        this.ti = ti;
    }

    /**
     * 神识资质
     * @return shen 神识资质
     */
    public Integer getShen() {
        return shen;
    }

    /**
     * 神识资质
     * @param shen 神识资质
     */
    public void setShen(Integer shen) {
        this.shen = shen;
    }

    /**
     * 攻击
     * @return gongji 攻击
     */
    public Long getGongji() {
        return gongji;
    }

    /**
     * 攻击
     * @param gongji 攻击
     */
    public void setGongji(Long gongji) {
        this.gongji = gongji;
    }

    /**
     * 防御
     * @return fangyu 防御
     */
    public Long getFangyu() {
        return fangyu;
    }

    /**
     * 防御
     * @param fangyu 防御
     */
    public void setFangyu(Long fangyu) {
        this.fangyu = fangyu;
    }

    /**
     * 移动速度
     * @return yidongsudu 移动速度
     */
    public Integer getYidongsudu() {
        return yidongsudu;
    }

    /**
     * 移动速度
     * @param yidongsudu 移动速度
     */
    public void setYidongsudu(Integer yidongsudu) {
        this.yidongsudu = yidongsudu;
    }

    /**
     * 境界
     * @return grade 境界
     */
    public Integer getGrade() {
        return grade;
    }

    /**
     * 境界
     * @param grade 境界
     */
    public void setGrade(Integer grade) {
        this.grade = grade;
    }

    /**
     * 
     * @return hp 
     */
    public Long getHp() {
        return hp;
    }

    /**
     * 
     * @param hp 
     */
    public void setHp(Long hp) {
        this.hp = hp;
    }

    /**
     * 神识
     * @return shenshi 神识
     */
    public Long getShenshi() {
        return shenshi;
    }

    /**
     * 神识
     * @param shenshi 神识
     */
    public void setShenshi(Long shenshi) {
        this.shenshi = shenshi;
    }

    /**
     * 真元(可恢复)
     * @return zhenyuan 真元(可恢复)
     */
    public Long getZhenyuan() {
        return zhenyuan;
    }

    /**
     * 真元(可恢复)
     * @param zhenyuan 真元(可恢复)
     */
    public void setZhenyuan(Long zhenyuan) {
        this.zhenyuan = zhenyuan;
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
     * 是否有效 1-有效 0-删除
     * @return valid 是否有效 1-有效 0-删除
     */
    public String getValid() {
        return valid;
    }

    /**
     * 是否有效 1-有效 0-删除
     * @param valid 是否有效 1-有效 0-删除
     */
    public void setValid(String valid) {
        this.valid = valid == null ? null : valid.trim();
    }

    /**
     *
     * @mbggenerated 2019-10-29
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", userId=").append(userId);
        sb.append(", type=").append(type);
        sb.append(", isUse=").append(isUse);
        sb.append(", name=").append(name);
        sb.append(", linggen=").append(linggen);
        sb.append(", jin=").append(jin);
        sb.append(", mu=").append(mu);
        sb.append(", shui=").append(shui);
        sb.append(", huo=").append(huo);
        sb.append(", tu=").append(tu);
        sb.append(", feng=").append(feng);
        sb.append(", lei=").append(lei);
        sb.append(", bing=").append(bing);
        sb.append(", ti=").append(ti);
        sb.append(", shen=").append(shen);
        sb.append(", gongji=").append(gongji);
        sb.append(", fangyu=").append(fangyu);
        sb.append(", yidongsudu=").append(yidongsudu);
        sb.append(", grade=").append(grade);
        sb.append(", hp=").append(hp);
        sb.append(", shenshi=").append(shenshi);
        sb.append(", zhenyuan=").append(zhenyuan);
        sb.append(", daode=").append(daode);
        sb.append(", yunqi=").append(yunqi);
        sb.append(", yueli=").append(yueli);
        sb.append(", x=").append(x);
        sb.append(", y=").append(y);
        sb.append(", valid=").append(valid);
        sb.append("]");
        return sb.toString();
    }
}