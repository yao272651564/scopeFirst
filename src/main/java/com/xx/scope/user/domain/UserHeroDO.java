package com.xx.scope.user.domain;

public class UserHeroDO {
    /**
     * 弟子编号
     */
    private Long id;

    /**
     * 弟子编号
     */
    private Long userId;

    /**
     * 
     */
    private Long heroId;

    /**
     * 类型 1-人族 2-妖族 3-鬼
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
     * 性别
     */
    private String sex;

    /**
     * 名称
     */
    private String name;

    /**
     * 描述
     */
    private String des;

    /**
     * 境界
     */
    private Integer grade;

    /**
     * 神识
     */
    private Long soul;

    /**
     * 攻击
     */
    private Long attack;

    /**
     * 防御
     */
    private Long defense;

    /**
     * 移动速度
     */
    private Integer speed;

    /**
     * 血量成长
     */
    private Long hp;

    /**
     * 真元(可恢复)
     */
    private Long mp;

    /**
     * 阅历,默认为0
     */
    private Long yueLi;

    /**
     * 天赋/体质id
     */
    private Long tianfuId;

    /**
     * 自带技能id
     */
    private Long skillId;

    /**
     * 攻击成长
     */
    private Integer attackUp;

    /**
     * 防御成长
     */
    private Integer defenseUp;

    /**
     * 血量成长
     */
    private Integer hpUp;

    /**
     * 灵力成长
     */
    private Integer mpUp;

    /**
     * 灵力成长
     */
    private Integer speedUp;

    /**
     * 攻击
     */
    private Long currentAttack;

    /**
     * 防御
     */
    private Long currentDefense;

    /**
     * 血量成长
     */
    private Long currentHp;

    /**
     * 真元(可恢复)
     */
    private Long currentMp;

    /**
     * 移动速度
     */
    private Integer currentSpeed;

    /**
     * 位置编号
     */
    private Integer sort;

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
     * 弟子编号
     * @return user_id 弟子编号
     */
    public Long getUserId() {
        return userId;
    }

    /**
     * 弟子编号
     * @param userId 弟子编号
     */
    public void setUserId(Long userId) {
        this.userId = userId;
    }

    /**
     * 
     * @return hero_id 
     */
    public Long getHeroId() {
        return heroId;
    }

    /**
     * 
     * @param heroId 
     */
    public void setHeroId(Long heroId) {
        this.heroId = heroId;
    }

    /**
     * 类型 1-人族 2-妖族 3-鬼
     * @return type 类型 1-人族 2-妖族 3-鬼
     */
    public String getType() {
        return type;
    }

    /**
     * 类型 1-人族 2-妖族 3-鬼
     * @param type 类型 1-人族 2-妖族 3-鬼
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
     * 神识
     * @return soul 神识
     */
    public Long getSoul() {
        return soul;
    }

    /**
     * 神识
     * @param soul 神识
     */
    public void setSoul(Long soul) {
        this.soul = soul;
    }

    /**
     * 攻击
     * @return attack 攻击
     */
    public Long getAttack() {
        return attack;
    }

    /**
     * 攻击
     * @param attack 攻击
     */
    public void setAttack(Long attack) {
        this.attack = attack;
    }

    /**
     * 防御
     * @return defense 防御
     */
    public Long getDefense() {
        return defense;
    }

    /**
     * 防御
     * @param defense 防御
     */
    public void setDefense(Long defense) {
        this.defense = defense;
    }

    /**
     * 移动速度
     * @return speed 移动速度
     */
    public Integer getSpeed() {
        return speed;
    }

    /**
     * 移动速度
     * @param speed 移动速度
     */
    public void setSpeed(Integer speed) {
        this.speed = speed;
    }

    /**
     * 血量成长
     * @return hp 血量成长
     */
    public Long getHp() {
        return hp;
    }

    /**
     * 血量成长
     * @param hp 血量成长
     */
    public void setHp(Long hp) {
        this.hp = hp;
    }

    /**
     * 真元(可恢复)
     * @return mp 真元(可恢复)
     */
    public Long getMp() {
        return mp;
    }

    /**
     * 真元(可恢复)
     * @param mp 真元(可恢复)
     */
    public void setMp(Long mp) {
        this.mp = mp;
    }

    /**
     * 阅历,默认为0
     * @return yue_li 阅历,默认为0
     */
    public Long getYueLi() {
        return yueLi;
    }

    /**
     * 阅历,默认为0
     * @param yueLi 阅历,默认为0
     */
    public void setYueLi(Long yueLi) {
        this.yueLi = yueLi;
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
     * 攻击成长
     * @return attack_up 攻击成长
     */
    public Integer getAttackUp() {
        return attackUp;
    }

    /**
     * 攻击成长
     * @param attackUp 攻击成长
     */
    public void setAttackUp(Integer attackUp) {
        this.attackUp = attackUp;
    }

    /**
     * 防御成长
     * @return defense_up 防御成长
     */
    public Integer getDefenseUp() {
        return defenseUp;
    }

    /**
     * 防御成长
     * @param defenseUp 防御成长
     */
    public void setDefenseUp(Integer defenseUp) {
        this.defenseUp = defenseUp;
    }

    /**
     * 血量成长
     * @return hp_up 血量成长
     */
    public Integer getHpUp() {
        return hpUp;
    }

    /**
     * 血量成长
     * @param hpUp 血量成长
     */
    public void setHpUp(Integer hpUp) {
        this.hpUp = hpUp;
    }

    /**
     * 灵力成长
     * @return mp_up 灵力成长
     */
    public Integer getMpUp() {
        return mpUp;
    }

    /**
     * 灵力成长
     * @param mpUp 灵力成长
     */
    public void setMpUp(Integer mpUp) {
        this.mpUp = mpUp;
    }

    /**
     * 灵力成长
     * @return speed_up 灵力成长
     */
    public Integer getSpeedUp() {
        return speedUp;
    }

    /**
     * 灵力成长
     * @param speedUp 灵力成长
     */
    public void setSpeedUp(Integer speedUp) {
        this.speedUp = speedUp;
    }

    /**
     * 攻击
     * @return current_attack 攻击
     */
    public Long getCurrentAttack() {
        return currentAttack;
    }

    /**
     * 攻击
     * @param currentAttack 攻击
     */
    public void setCurrentAttack(Long currentAttack) {
        this.currentAttack = currentAttack;
    }

    /**
     * 防御
     * @return current_defense 防御
     */
    public Long getCurrentDefense() {
        return currentDefense;
    }

    /**
     * 防御
     * @param currentDefense 防御
     */
    public void setCurrentDefense(Long currentDefense) {
        this.currentDefense = currentDefense;
    }

    /**
     * 血量成长
     * @return current_hp 血量成长
     */
    public Long getCurrentHp() {
        return currentHp;
    }

    /**
     * 血量成长
     * @param currentHp 血量成长
     */
    public void setCurrentHp(Long currentHp) {
        this.currentHp = currentHp;
    }

    /**
     * 真元(可恢复)
     * @return current_mp 真元(可恢复)
     */
    public Long getCurrentMp() {
        return currentMp;
    }

    /**
     * 真元(可恢复)
     * @param currentMp 真元(可恢复)
     */
    public void setCurrentMp(Long currentMp) {
        this.currentMp = currentMp;
    }

    /**
     * 移动速度
     * @return current_speed 移动速度
     */
    public Integer getCurrentSpeed() {
        return currentSpeed;
    }

    /**
     * 移动速度
     * @param currentSpeed 移动速度
     */
    public void setCurrentSpeed(Integer currentSpeed) {
        this.currentSpeed = currentSpeed;
    }

    /**
     * 位置编号
     * @return sort 位置编号
     */
    public Integer getSort() {
        return sort;
    }

    /**
     * 位置编号
     * @param sort 位置编号
     */
    public void setSort(Integer sort) {
        this.sort = sort;
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
     * @mbggenerated 2022-01-10
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", userId=").append(userId);
        sb.append(", heroId=").append(heroId);
        sb.append(", type=").append(type);
        sb.append(", iconId=").append(iconId);
        sb.append(", color=").append(color);
        sb.append(", sex=").append(sex);
        sb.append(", name=").append(name);
        sb.append(", des=").append(des);
        sb.append(", grade=").append(grade);
        sb.append(", soul=").append(soul);
        sb.append(", attack=").append(attack);
        sb.append(", defense=").append(defense);
        sb.append(", speed=").append(speed);
        sb.append(", hp=").append(hp);
        sb.append(", mp=").append(mp);
        sb.append(", yueLi=").append(yueLi);
        sb.append(", tianfuId=").append(tianfuId);
        sb.append(", skillId=").append(skillId);
        sb.append(", attackUp=").append(attackUp);
        sb.append(", defenseUp=").append(defenseUp);
        sb.append(", hpUp=").append(hpUp);
        sb.append(", mpUp=").append(mpUp);
        sb.append(", speedUp=").append(speedUp);
        sb.append(", currentAttack=").append(currentAttack);
        sb.append(", currentDefense=").append(currentDefense);
        sb.append(", currentHp=").append(currentHp);
        sb.append(", currentMp=").append(currentMp);
        sb.append(", currentSpeed=").append(currentSpeed);
        sb.append(", sort=").append(sort);
        sb.append(", valid=").append(valid);
        sb.append("]");
        return sb.toString();
    }
}