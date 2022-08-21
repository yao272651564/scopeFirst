package com.xx.scope.item.domain;

public class UserItemArm {
    /**
     * 
     */
    private Long id;

    /**
     * 
     */
    private Long userId;

    /**
     * 基础物品Id
     */
    private Long baseItemId;

    /**
     * 
     */
    private Long heroId;

    /**
     * 装备位置
     */
    private Byte heroUseSort;

    /**
     * 
     */
    private String name;

    /**
     * 类型 1-法宝 2-灵宝
     */
    private String type;

    /**
     * 描述
     */
    private String des;

    /**
     * 是否可交易
     */
    private String isTrade;

    /**
     * 级别
     */
    private Integer grade;

    /**
     * 品质 1-下品 2-中品 3-上品 4-极品
     */
    private String quality;

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
     * 神识
     */
    private Long soul;

    /**
     * 强化级别
     */
    private Integer strengthenLevel;

    /**
     * 星级
     */
    private Integer starlevel;

    /**
     * 暴击
     */
    private Integer doubleAttack;

    /**
     * 破防
     */
    private Integer subtractDefense;

    /**
     * 是否装备
     */
    private String isUse;

    /**
     * 排序
     */
    private Integer sort;

    /**
     * 是否有效1-有效 0-无效
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
     * 基础物品Id
     * @return base_item_id 基础物品Id
     */
    public Long getBaseItemId() {
        return baseItemId;
    }

    /**
     * 基础物品Id
     * @param baseItemId 基础物品Id
     */
    public void setBaseItemId(Long baseItemId) {
        this.baseItemId = baseItemId;
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
     * 装备位置
     * @return hero_use_sort 装备位置
     */
    public Byte getHeroUseSort() {
        return heroUseSort;
    }

    /**
     * 装备位置
     * @param heroUseSort 装备位置
     */
    public void setHeroUseSort(Byte heroUseSort) {
        this.heroUseSort = heroUseSort;
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
     * 类型 1-法宝 2-灵宝
     * @return type 类型 1-法宝 2-灵宝
     */
    public String getType() {
        return type;
    }

    /**
     * 类型 1-法宝 2-灵宝
     * @param type 类型 1-法宝 2-灵宝
     */
    public void setType(String type) {
        this.type = type == null ? null : type.trim();
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
     * 是否可交易
     * @return is_trade 是否可交易
     */
    public String getIsTrade() {
        return isTrade;
    }

    /**
     * 是否可交易
     * @param isTrade 是否可交易
     */
    public void setIsTrade(String isTrade) {
        this.isTrade = isTrade == null ? null : isTrade.trim();
    }

    /**
     * 级别
     * @return grade 级别
     */
    public Integer getGrade() {
        return grade;
    }

    /**
     * 级别
     * @param grade 级别
     */
    public void setGrade(Integer grade) {
        this.grade = grade;
    }

    /**
     * 品质 1-下品 2-中品 3-上品 4-极品
     * @return quality 品质 1-下品 2-中品 3-上品 4-极品
     */
    public String getQuality() {
        return quality;
    }

    /**
     * 品质 1-下品 2-中品 3-上品 4-极品
     * @param quality 品质 1-下品 2-中品 3-上品 4-极品
     */
    public void setQuality(String quality) {
        this.quality = quality == null ? null : quality.trim();
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
     * 强化级别
     * @return strengthen_level 强化级别
     */
    public Integer getStrengthenLevel() {
        return strengthenLevel;
    }

    /**
     * 强化级别
     * @param strengthenLevel 强化级别
     */
    public void setStrengthenLevel(Integer strengthenLevel) {
        this.strengthenLevel = strengthenLevel;
    }

    /**
     * 星级
     * @return starlevel 星级
     */
    public Integer getStarlevel() {
        return starlevel;
    }

    /**
     * 星级
     * @param starlevel 星级
     */
    public void setStarlevel(Integer starlevel) {
        this.starlevel = starlevel;
    }

    /**
     * 暴击
     * @return double_attack 暴击
     */
    public Integer getDoubleAttack() {
        return doubleAttack;
    }

    /**
     * 暴击
     * @param doubleAttack 暴击
     */
    public void setDoubleAttack(Integer doubleAttack) {
        this.doubleAttack = doubleAttack;
    }

    /**
     * 破防
     * @return subtract_defense 破防
     */
    public Integer getSubtractDefense() {
        return subtractDefense;
    }

    /**
     * 破防
     * @param subtractDefense 破防
     */
    public void setSubtractDefense(Integer subtractDefense) {
        this.subtractDefense = subtractDefense;
    }

    /**
     * 是否装备
     * @return is_use 是否装备
     */
    public String getIsUse() {
        return isUse;
    }

    /**
     * 是否装备
     * @param isUse 是否装备
     */
    public void setIsUse(String isUse) {
        this.isUse = isUse == null ? null : isUse.trim();
    }

    /**
     * 排序
     * @return sort 排序
     */
    public Integer getSort() {
        return sort;
    }

    /**
     * 排序
     * @param sort 排序
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
     * @mbggenerated 2022-02-20
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", userId=").append(userId);
        sb.append(", baseItemId=").append(baseItemId);
        sb.append(", heroId=").append(heroId);
        sb.append(", heroUseSort=").append(heroUseSort);
        sb.append(", name=").append(name);
        sb.append(", type=").append(type);
        sb.append(", des=").append(des);
        sb.append(", isTrade=").append(isTrade);
        sb.append(", grade=").append(grade);
        sb.append(", quality=").append(quality);
        sb.append(", attack=").append(attack);
        sb.append(", defense=").append(defense);
        sb.append(", speed=").append(speed);
        sb.append(", hp=").append(hp);
        sb.append(", mp=").append(mp);
        sb.append(", soul=").append(soul);
        sb.append(", strengthenLevel=").append(strengthenLevel);
        sb.append(", starlevel=").append(starlevel);
        sb.append(", doubleAttack=").append(doubleAttack);
        sb.append(", subtractDefense=").append(subtractDefense);
        sb.append(", isUse=").append(isUse);
        sb.append(", sort=").append(sort);
        sb.append(", valid=").append(valid);
        sb.append("]");
        return sb.toString();
    }
}