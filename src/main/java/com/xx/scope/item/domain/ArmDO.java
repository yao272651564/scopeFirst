package com.xx.scope.item.domain;

public class ArmDO {
    /**
     * 
     */
    private Integer id;

    /**
     * 
     */
    private String name;

    /**
     * 类型 1-法宝
     */
    private String type;

    /**
     * 
     */
    private String status;

    /**
     * 描述
     */
    private String des;

    /**
     * 备用字段
     */
    private Long linggen;

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
     * 最小级别
     */
    private Integer useLevel;

    /**
     * 附带技能ID
     */
    private Long skillId;

    /**
     * 
     */
    private Integer hp;

    /**
     * 
     */
    private Integer gongji;

    /**
     * 
     */
    private Integer fangyu;

    /**
     * 
     */
    private Integer zhenyuan;

    /**
     * 
     */
    private Integer shenshi;

    /**
     * 
     */
    private Integer sudu;

    /**
     * 
     */
    private Integer yueli;

    /**
     * 
     */
    private Integer baoji;

    /**
     * 
     */
    private Integer pofang;

    /**
     * 
     */
    private Integer fanji;

    /**
     * 
     */
    private Integer fanzhen;

    /**
     * 
     */
    private Integer lianji;

    /**
     * 
     */
    private Integer xixue;

    /**
     * 
     */
    private Integer xilan;

    /**
     * 
     */
    private Integer shanbi;

    /**
     * 
     */
    private Integer mingzhong;

    /**
     * 是否有效1-有效 0-无效
     */
    private String valid;

    /**
     * 
     * @return id 
     */
    public Integer getId() {
        return id;
    }

    /**
     * 
     * @param id 
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 
     * @return name 
     */
    public String getName() {
        return name;
    }

    /**
     * 
     * @param name 
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * 类型 1-法宝
     * @return type 类型 1-法宝
     */
    public String getType() {
        return type;
    }

    /**
     * 类型 1-法宝
     * @param type 类型 1-法宝
     */
    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    /**
     * 
     * @return status 
     */
    public String getStatus() {
        return status;
    }

    /**
     * 
     * @param status 
     */
    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    /**
     * 描述
     * @return des 描述
     */
    public String getDes() {
        return des;
    }

    /**
     * 描述
     * @param des 描述
     */
    public void setDes(String des) {
        this.des = des == null ? null : des.trim();
    }

    /**
     * 备用字段
     * @return linggen 备用字段
     */
    public Long getLinggen() {
        return linggen;
    }

    /**
     * 备用字段
     * @param linggen 备用字段
     */
    public void setLinggen(Long linggen) {
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
     * 最小级别
     * @return use_level 最小级别
     */
    public Integer getUseLevel() {
        return useLevel;
    }

    /**
     * 最小级别
     * @param useLevel 最小级别
     */
    public void setUseLevel(Integer useLevel) {
        this.useLevel = useLevel;
    }

    /**
     * 附带技能ID
     * @return skill_id 附带技能ID
     */
    public Long getSkillId() {
        return skillId;
    }

    /**
     * 附带技能ID
     * @param skillId 附带技能ID
     */
    public void setSkillId(Long skillId) {
        this.skillId = skillId;
    }

    /**
     * 
     * @return hp 
     */
    public Integer getHp() {
        return hp;
    }

    /**
     * 
     * @param hp 
     */
    public void setHp(Integer hp) {
        this.hp = hp;
    }

    /**
     * 
     * @return gongji 
     */
    public Integer getGongji() {
        return gongji;
    }

    /**
     * 
     * @param gongji 
     */
    public void setGongji(Integer gongji) {
        this.gongji = gongji;
    }

    /**
     * 
     * @return fangyu 
     */
    public Integer getFangyu() {
        return fangyu;
    }

    /**
     * 
     * @param fangyu 
     */
    public void setFangyu(Integer fangyu) {
        this.fangyu = fangyu;
    }

    /**
     * 
     * @return zhenyuan 
     */
    public Integer getZhenyuan() {
        return zhenyuan;
    }

    /**
     * 
     * @param zhenyuan 
     */
    public void setZhenyuan(Integer zhenyuan) {
        this.zhenyuan = zhenyuan;
    }

    /**
     * 
     * @return shenshi 
     */
    public Integer getShenshi() {
        return shenshi;
    }

    /**
     * 
     * @param shenshi 
     */
    public void setShenshi(Integer shenshi) {
        this.shenshi = shenshi;
    }

    /**
     * 
     * @return sudu 
     */
    public Integer getSudu() {
        return sudu;
    }

    /**
     * 
     * @param sudu 
     */
    public void setSudu(Integer sudu) {
        this.sudu = sudu;
    }

    /**
     * 
     * @return yueli 
     */
    public Integer getYueli() {
        return yueli;
    }

    /**
     * 
     * @param yueli 
     */
    public void setYueli(Integer yueli) {
        this.yueli = yueli;
    }

    /**
     * 
     * @return baoji 
     */
    public Integer getBaoji() {
        return baoji;
    }

    /**
     * 
     * @param baoji 
     */
    public void setBaoji(Integer baoji) {
        this.baoji = baoji;
    }

    /**
     * 
     * @return pofang 
     */
    public Integer getPofang() {
        return pofang;
    }

    /**
     * 
     * @param pofang 
     */
    public void setPofang(Integer pofang) {
        this.pofang = pofang;
    }

    /**
     * 
     * @return fanji 
     */
    public Integer getFanji() {
        return fanji;
    }

    /**
     * 
     * @param fanji 
     */
    public void setFanji(Integer fanji) {
        this.fanji = fanji;
    }

    /**
     * 
     * @return fanzhen 
     */
    public Integer getFanzhen() {
        return fanzhen;
    }

    /**
     * 
     * @param fanzhen 
     */
    public void setFanzhen(Integer fanzhen) {
        this.fanzhen = fanzhen;
    }

    /**
     * 
     * @return lianji 
     */
    public Integer getLianji() {
        return lianji;
    }

    /**
     * 
     * @param lianji 
     */
    public void setLianji(Integer lianji) {
        this.lianji = lianji;
    }

    /**
     * 
     * @return xixue 
     */
    public Integer getXixue() {
        return xixue;
    }

    /**
     * 
     * @param xixue 
     */
    public void setXixue(Integer xixue) {
        this.xixue = xixue;
    }

    /**
     * 
     * @return xilan 
     */
    public Integer getXilan() {
        return xilan;
    }

    /**
     * 
     * @param xilan 
     */
    public void setXilan(Integer xilan) {
        this.xilan = xilan;
    }

    /**
     * 
     * @return shanbi 
     */
    public Integer getShanbi() {
        return shanbi;
    }

    /**
     * 
     * @param shanbi 
     */
    public void setShanbi(Integer shanbi) {
        this.shanbi = shanbi;
    }

    /**
     * 
     * @return mingzhong 
     */
    public Integer getMingzhong() {
        return mingzhong;
    }

    /**
     * 
     * @param mingzhong 
     */
    public void setMingzhong(Integer mingzhong) {
        this.mingzhong = mingzhong;
    }

    /**
     * 是否有效1-有效 0-无效
     * @return valid 是否有效1-有效 0-无效
     */
    public String getValid() {
        return valid;
    }

    /**
     * 是否有效1-有效 0-无效
     * @param valid 是否有效1-有效 0-无效
     */
    public void setValid(String valid) {
        this.valid = valid == null ? null : valid.trim();
    }

    /**
     *
     * @mbggenerated 2019-11-14
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", name=").append(name);
        sb.append(", type=").append(type);
        sb.append(", status=").append(status);
        sb.append(", des=").append(des);
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
        sb.append(", useLevel=").append(useLevel);
        sb.append(", skillId=").append(skillId);
        sb.append(", hp=").append(hp);
        sb.append(", gongji=").append(gongji);
        sb.append(", fangyu=").append(fangyu);
        sb.append(", zhenyuan=").append(zhenyuan);
        sb.append(", shenshi=").append(shenshi);
        sb.append(", sudu=").append(sudu);
        sb.append(", yueli=").append(yueli);
        sb.append(", baoji=").append(baoji);
        sb.append(", pofang=").append(pofang);
        sb.append(", fanji=").append(fanji);
        sb.append(", fanzhen=").append(fanzhen);
        sb.append(", lianji=").append(lianji);
        sb.append(", xixue=").append(xixue);
        sb.append(", xilan=").append(xilan);
        sb.append(", shanbi=").append(shanbi);
        sb.append(", mingzhong=").append(mingzhong);
        sb.append(", valid=").append(valid);
        sb.append("]");
        return sb.toString();
    }
}