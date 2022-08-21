package com.xx.scope.user.domain;

public class BaseHeroDO {
    /**
     * 弟子编号
     */
    private Long id;

    /**
     * 类型 1-人族 2-妖族
     */
    private String type;

    /**
     * 头像编号
     */
    private Long iconId;

    /**
     * 品质 1-红色 2-橙色 3-紫色 
     */
    private String color;

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
     * 暗灵根
     */
    private Integer an;

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
    private Integer sudu;

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
     * 
     */
    private Long nowExp;

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
    private Long zongmen;

    /**
     * 横坐标
     */
    private Integer x;

    /**
     * 纵坐标
     */
    private Integer y;

    /**
     * 称号
     */
    private String chenghao;

    /**
     * 名称
     */
    private String name;

    /**
     * 描述
     */
    private String des;

    /**
     * 性别
     */
    private String sex;

    /**
     * 天赋/体质id
     */
    private Long tianfuId;

    /**
     * 自带功法id
     */
    private Long gongfaId;

    /**
     * 自带技能id
     */
    private Long skillId;

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
    private Integer wuxing;

    /**
     * 
     */
    private Integer xinzhi;

    /**
     * 
     */
    private Integer fuyuan;

    /**
     * 
     */
    private Integer zhenfa;

    /**
     * 
     */
    private Integer zhifu;

    /**
     * 
     */
    private Integer lianqi;

    /**
     * 
     */
    private Integer liandan;

    /**
     * 
     */
    private Integer zhongzhi;

    /**
     * 
     */
    private Integer kuilei;

    /**
     * 是否有效1-有效 0-无效
     */
    private String valid;

    /**
     * 弟子编号
     * @return id 弟子编号
     */
    public Long getId() {
        return id;
    }

    /**
     * 弟子编号
     * @param id 弟子编号
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * 类型 1-人族 2-妖族
     * @return type 类型 1-人族 2-妖族
     */
    public String getType() {
        return type;
    }

    /**
     * 类型 1-人族 2-妖族
     * @param type 类型 1-人族 2-妖族
     */
    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    /**
     * 头像编号
     * @return icon_id 头像编号
     */
    public Long getIconId() {
        return iconId;
    }

    /**
     * 头像编号
     * @param iconId 头像编号
     */
    public void setIconId(Long iconId) {
        this.iconId = iconId;
    }

    /**
     * 品质 1-红色 2-橙色 3-紫色 
     * @return color 品质 1-红色 2-橙色 3-紫色 
     */
    public String getColor() {
        return color;
    }

    /**
     * 品质 1-红色 2-橙色 3-紫色 
     * @param color 品质 1-红色 2-橙色 3-紫色 
     */
    public void setColor(String color) {
        this.color = color == null ? null : color.trim();
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
     * 暗灵根
     * @return an 暗灵根
     */
    public Integer getAn() {
        return an;
    }

    /**
     * 暗灵根
     * @param an 暗灵根
     */
    public void setAn(Integer an) {
        this.an = an;
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
     * @return sudu 移动速度
     */
    public Integer getSudu() {
        return sudu;
    }

    /**
     * 移动速度
     * @param sudu 移动速度
     */
    public void setSudu(Integer sudu) {
        this.sudu = sudu;
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
     * @return zongmen 宗门
     */
    public Long getZongmen() {
        return zongmen;
    }

    /**
     * 宗门
     * @param zongmen 宗门
     */
    public void setZongmen(Long zongmen) {
        this.zongmen = zongmen;
    }

    /**
     * 横坐标
     * @return x 横坐标
     */
    public Integer getX() {
        return x;
    }

    /**
     * 横坐标
     * @param x 横坐标
     */
    public void setX(Integer x) {
        this.x = x;
    }

    /**
     * 纵坐标
     * @return y 纵坐标
     */
    public Integer getY() {
        return y;
    }

    /**
     * 纵坐标
     * @param y 纵坐标
     */
    public void setY(Integer y) {
        this.y = y;
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
     * 性别
     * @return sex 性别
     */
    public String getSex() {
        return sex;
    }

    /**
     * 性别
     * @param sex 性别
     */
    public void setSex(String sex) {
        this.sex = sex == null ? null : sex.trim();
    }

    /**
     * 天赋/体质id
     * @return tianfu_id 天赋/体质id
     */
    public Long getTianfuId() {
        return tianfuId;
    }

    /**
     * 天赋/体质id
     * @param tianfuId 天赋/体质id
     */
    public void setTianfuId(Long tianfuId) {
        this.tianfuId = tianfuId;
    }

    /**
     * 自带功法id
     * @return gongfa_id 自带功法id
     */
    public Long getGongfaId() {
        return gongfaId;
    }

    /**
     * 自带功法id
     * @param gongfaId 自带功法id
     */
    public void setGongfaId(Long gongfaId) {
        this.gongfaId = gongfaId;
    }

    /**
     * 自带技能id
     * @return skill_id 自带技能id
     */
    public Long getSkillId() {
        return skillId;
    }

    /**
     * 自带技能id
     * @param skillId 自带技能id
     */
    public void setSkillId(Long skillId) {
        this.skillId = skillId;
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
     * @return wuxing 
     */
    public Integer getWuxing() {
        return wuxing;
    }

    /**
     * 
     * @param wuxing 
     */
    public void setWuxing(Integer wuxing) {
        this.wuxing = wuxing;
    }

    /**
     * 
     * @return xinzhi 
     */
    public Integer getXinzhi() {
        return xinzhi;
    }

    /**
     * 
     * @param xinzhi 
     */
    public void setXinzhi(Integer xinzhi) {
        this.xinzhi = xinzhi;
    }

    /**
     * 
     * @return fuyuan 
     */
    public Integer getFuyuan() {
        return fuyuan;
    }

    /**
     * 
     * @param fuyuan 
     */
    public void setFuyuan(Integer fuyuan) {
        this.fuyuan = fuyuan;
    }

    /**
     * 
     * @return zhenfa 
     */
    public Integer getZhenfa() {
        return zhenfa;
    }

    /**
     * 
     * @param zhenfa 
     */
    public void setZhenfa(Integer zhenfa) {
        this.zhenfa = zhenfa;
    }

    /**
     * 
     * @return zhifu 
     */
    public Integer getZhifu() {
        return zhifu;
    }

    /**
     * 
     * @param zhifu 
     */
    public void setZhifu(Integer zhifu) {
        this.zhifu = zhifu;
    }

    /**
     * 
     * @return lianqi 
     */
    public Integer getLianqi() {
        return lianqi;
    }

    /**
     * 
     * @param lianqi 
     */
    public void setLianqi(Integer lianqi) {
        this.lianqi = lianqi;
    }

    /**
     * 
     * @return liandan 
     */
    public Integer getLiandan() {
        return liandan;
    }

    /**
     * 
     * @param liandan 
     */
    public void setLiandan(Integer liandan) {
        this.liandan = liandan;
    }

    /**
     * 
     * @return zhongzhi 
     */
    public Integer getZhongzhi() {
        return zhongzhi;
    }

    /**
     * 
     * @param zhongzhi 
     */
    public void setZhongzhi(Integer zhongzhi) {
        this.zhongzhi = zhongzhi;
    }

    /**
     * 
     * @return kuilei 
     */
    public Integer getKuilei() {
        return kuilei;
    }

    /**
     * 
     * @param kuilei 
     */
    public void setKuilei(Integer kuilei) {
        this.kuilei = kuilei;
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
     * @mbggenerated 2019-12-12
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", type=").append(type);
        sb.append(", iconId=").append(iconId);
        sb.append(", color=").append(color);
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
        sb.append(", an=").append(an);
        sb.append(", gongji=").append(gongji);
        sb.append(", fangyu=").append(fangyu);
        sb.append(", sudu=").append(sudu);
        sb.append(", grade=").append(grade);
        sb.append(", hp=").append(hp);
        sb.append(", shenshi=").append(shenshi);
        sb.append(", zhenyuan=").append(zhenyuan);
        sb.append(", nowExp=").append(nowExp);
        sb.append(", daode=").append(daode);
        sb.append(", yunqi=").append(yunqi);
        sb.append(", yueli=").append(yueli);
        sb.append(", zongmen=").append(zongmen);
        sb.append(", x=").append(x);
        sb.append(", y=").append(y);
        sb.append(", chenghao=").append(chenghao);
        sb.append(", name=").append(name);
        sb.append(", des=").append(des);
        sb.append(", sex=").append(sex);
        sb.append(", tianfuId=").append(tianfuId);
        sb.append(", gongfaId=").append(gongfaId);
        sb.append(", skillId=").append(skillId);
        sb.append(", hpUp=").append(hpUp);
        sb.append(", gongjiUp=").append(gongjiUp);
        sb.append(", fangyuUp=").append(fangyuUp);
        sb.append(", zhenyuanUp=").append(zhenyuanUp);
        sb.append(", shenshiUp=").append(shenshiUp);
        sb.append(", suduUp=").append(suduUp);
        sb.append(", wuxing=").append(wuxing);
        sb.append(", xinzhi=").append(xinzhi);
        sb.append(", fuyuan=").append(fuyuan);
        sb.append(", zhenfa=").append(zhenfa);
        sb.append(", zhifu=").append(zhifu);
        sb.append(", lianqi=").append(lianqi);
        sb.append(", liandan=").append(liandan);
        sb.append(", zhongzhi=").append(zhongzhi);
        sb.append(", kuilei=").append(kuilei);
        sb.append(", valid=").append(valid);
        sb.append("]");
        return sb.toString();
    }
}