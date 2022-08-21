package com.xx.scope.item.domain;

public class UserItemConsume {
    /**
     * 
     */
    private Long id;

    /**
     * 基础物品Id
     */
    private Long baseItemId;

    /**
     * 
     */
    private Long userId;

    /**
     * 
     */
    private String name;

    /**
     * 类型 1-材料 2-消耗品
     */
    private String type;

    /**
     * 描述
     */
    private String des;

    /**
     * 级别
     */
    private Integer grade;

    /**
     * 子类型 1-灵气 2-血量 3-攻击 4-防御 其他预留
     */
    private String subType;

    /**
     * 是否可交易
     */
    private String isTrade;

    /**
     * 品质 1-下品 2-中品 3-上品 4-极品
     */
    private String quality;

    /**
     * 数量
     */
    private Integer amount;

    /**
     * 
     */
    private Integer minValue;

    /**
     * 
     */
    private Integer maxValue;

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
     * 类型 1-材料 2-消耗品
     * @return type 类型 1-材料 2-消耗品
     */
    public String getType() {
        return type;
    }

    /**
     * 类型 1-材料 2-消耗品
     * @param type 类型 1-材料 2-消耗品
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
     * 子类型 1-灵气 2-血量 3-攻击 4-防御 其他预留
     * @return sub_type 子类型 1-灵气 2-血量 3-攻击 4-防御 其他预留
     */
    public String getSubType() {
        return subType;
    }

    /**
     * 子类型 1-灵气 2-血量 3-攻击 4-防御 其他预留
     * @param subType 子类型 1-灵气 2-血量 3-攻击 4-防御 其他预留
     */
    public void setSubType(String subType) {
        this.subType = subType == null ? null : subType.trim();
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
     * 数量
     * @return amount 数量
     */
    public Integer getAmount() {
        return amount;
    }

    /**
     * 数量
     * @param amount 数量
     */
    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    /**
     * 
     * @return min_value 
     */
    public Integer getMinValue() {
        return minValue;
    }

    /**
     * 
     * @param minValue 
     */
    public void setMinValue(Integer minValue) {
        this.minValue = minValue;
    }

    /**
     * 
     * @return max_value 
     */
    public Integer getMaxValue() {
        return maxValue;
    }

    /**
     * 
     * @param maxValue 
     */
    public void setMaxValue(Integer maxValue) {
        this.maxValue = maxValue;
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
        sb.append(", baseItemId=").append(baseItemId);
        sb.append(", userId=").append(userId);
        sb.append(", name=").append(name);
        sb.append(", type=").append(type);
        sb.append(", des=").append(des);
        sb.append(", grade=").append(grade);
        sb.append(", subType=").append(subType);
        sb.append(", isTrade=").append(isTrade);
        sb.append(", quality=").append(quality);
        sb.append(", amount=").append(amount);
        sb.append(", minValue=").append(minValue);
        sb.append(", maxValue=").append(maxValue);
        sb.append(", valid=").append(valid);
        sb.append("]");
        return sb.toString();
    }
}