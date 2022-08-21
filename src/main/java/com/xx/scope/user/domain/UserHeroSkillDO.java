package com.xx.scope.user.domain;

public class UserHeroSkillDO {
    /**
     * 
     */
    private Long id;

    /**
     * from t_user_hero.id
     */
    private Long userHeroId;

    /**
     * 
     */
    private Long userId;

    /**
     * 
     */
    private Long skillId;

    /**
     * 是否装备1-是 0-否
     */
    private String isUse;

    /**
     * 使用顺序
     */
    private Integer useSequence;

    /**
     * 名称
     */
    private String name;

    /**
     * 描述
     */
    private String depiction;

    /**
     * 图标
     */
    private String icon;

    /**
     * 类型1-主动 2-被动 3-辅助 4-生活? 5-其他?
     */
    private String type;

    /**
     * 目标数
     */
    private Integer targetNum;

    /**
     * 影响目标1、自已2、敌方3、队友4、任意单位
     */
    private String aimTarget;

    /**
     * 效果类型:1-固定伤害 2-回血 3-持续伤害 4-buff/debuff
     */
    private String affectType;

    /**
     * 状态
     */
    private String status;

    /**
     * 需要真元
     */
    private Long needZhenyuan;

    /**
     * cd
     */
    private Integer cd;

    /**
     * 攻击的倍数或者真元的比率?真元加成?
     */
    private Double attackRate;

    /**
     * 持续次数
     */
    private Integer cont;

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
     * from t_user_hero.id
     * @return user_hero_id from t_user_hero.id
     */
    public Long getUserHeroId() {
        return userHeroId;
    }

    /**
     * from t_user_hero.id
     * @param userHeroId from t_user_hero.id
     */
    public void setUserHeroId(Long userHeroId) {
        this.userHeroId = userHeroId;
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
     * 
     * @return skill_id 
     */
    public Long getSkillId() {
        return skillId;
    }

    /**
     * 
     * @param skillId 
     */
    public void setSkillId(Long skillId) {
        this.skillId = skillId;
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
     * 使用顺序
     * @return use_sequence 使用顺序
     */
    public Integer getUseSequence() {
        return useSequence;
    }

    /**
     * 使用顺序
     * @param useSequence 使用顺序
     */
    public void setUseSequence(Integer useSequence) {
        this.useSequence = useSequence;
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
     * @return depiction 描述
     */
    public String getDepiction() {
        return depiction;
    }

    /**
     * 描述
     * @param depiction 描述
     */
    public void setDepiction(String depiction) {
        this.depiction = depiction == null ? null : depiction.trim();
    }

    /**
     * 图标
     * @return icon 图标
     */
    public String getIcon() {
        return icon;
    }

    /**
     * 图标
     * @param icon 图标
     */
    public void setIcon(String icon) {
        this.icon = icon == null ? null : icon.trim();
    }

    /**
     * 类型1-主动 2-被动 3-辅助 4-生活? 5-其他?
     * @return type 类型1-主动 2-被动 3-辅助 4-生活? 5-其他?
     */
    public String getType() {
        return type;
    }

    /**
     * 类型1-主动 2-被动 3-辅助 4-生活? 5-其他?
     * @param type 类型1-主动 2-被动 3-辅助 4-生活? 5-其他?
     */
    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    /**
     * 目标数
     * @return target_num 目标数
     */
    public Integer getTargetNum() {
        return targetNum;
    }

    /**
     * 目标数
     * @param targetNum 目标数
     */
    public void setTargetNum(Integer targetNum) {
        this.targetNum = targetNum;
    }

    /**
     * 影响目标1、自已2、敌方3、队友4、任意单位
     * @return aim_target 影响目标1、自已2、敌方3、队友4、任意单位
     */
    public String getAimTarget() {
        return aimTarget;
    }

    /**
     * 影响目标1、自已2、敌方3、队友4、任意单位
     * @param aimTarget 影响目标1、自已2、敌方3、队友4、任意单位
     */
    public void setAimTarget(String aimTarget) {
        this.aimTarget = aimTarget == null ? null : aimTarget.trim();
    }

    /**
     * 效果类型:1-固定伤害 2-回血 3-持续伤害 4-buff/debuff
     * @return affect_type 效果类型:1-固定伤害 2-回血 3-持续伤害 4-buff/debuff
     */
    public String getAffectType() {
        return affectType;
    }

    /**
     * 效果类型:1-固定伤害 2-回血 3-持续伤害 4-buff/debuff
     * @param affectType 效果类型:1-固定伤害 2-回血 3-持续伤害 4-buff/debuff
     */
    public void setAffectType(String affectType) {
        this.affectType = affectType == null ? null : affectType.trim();
    }

    /**
     * 状态
     * @return status 状态
     */
    public String getStatus() {
        return status;
    }

    /**
     * 状态
     * @param status 状态
     */
    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    /**
     * 需要真元
     * @return need_zhenyuan 需要真元
     */
    public Long getNeedZhenyuan() {
        return needZhenyuan;
    }

    /**
     * 需要真元
     * @param needZhenyuan 需要真元
     */
    public void setNeedZhenyuan(Long needZhenyuan) {
        this.needZhenyuan = needZhenyuan;
    }

    /**
     * cd
     * @return cd cd
     */
    public Integer getCd() {
        return cd;
    }

    /**
     * cd
     * @param cd cd
     */
    public void setCd(Integer cd) {
        this.cd = cd;
    }

    /**
     * 攻击的倍数或者真元的比率?真元加成?
     * @return attack_rate 攻击的倍数或者真元的比率?真元加成?
     */
    public Double getAttackRate() {
        return attackRate;
    }

    /**
     * 攻击的倍数或者真元的比率?真元加成?
     * @param attackRate 攻击的倍数或者真元的比率?真元加成?
     */
    public void setAttackRate(Double attackRate) {
        this.attackRate = attackRate;
    }

    /**
     * 持续次数
     * @return cont 持续次数
     */
    public Integer getCont() {
        return cont;
    }

    /**
     * 持续次数
     * @param cont 持续次数
     */
    public void setCont(Integer cont) {
        this.cont = cont;
    }

    /**
     *
     * @mbggenerated 2019-12-18
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", userHeroId=").append(userHeroId);
        sb.append(", userId=").append(userId);
        sb.append(", skillId=").append(skillId);
        sb.append(", isUse=").append(isUse);
        sb.append(", useSequence=").append(useSequence);
        sb.append(", name=").append(name);
        sb.append(", depiction=").append(depiction);
        sb.append(", icon=").append(icon);
        sb.append(", type=").append(type);
        sb.append(", targetNum=").append(targetNum);
        sb.append(", aimTarget=").append(aimTarget);
        sb.append(", affectType=").append(affectType);
        sb.append(", status=").append(status);
        sb.append(", needZhenyuan=").append(needZhenyuan);
        sb.append(", cd=").append(cd);
        sb.append(", attackRate=").append(attackRate);
        sb.append(", cont=").append(cont);
        sb.append("]");
        return sb.toString();
    }
}