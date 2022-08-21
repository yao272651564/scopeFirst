package com.xx.scope.item.domain;

public class DropGroup {
    /**
     * 
     */
    private Long id;

    /**
     * 来源(组/地图)Id
     */
    private Long srcId;

    /**
     * 掉落物品ID
     */
    private Long itemId;

    /**
     * 物品的类型(1-经验 2-金钱 3-元宝 4-材料 5-装备 6-其他(宠物,卡牌等))
     */
    private String resType;

    /**
     * 可做显示或描述
     */
    private String name;

    /**
     * 掉落类型 1-固定掉落 2-随机掉落 3-条件掉落
     */
    private String type;

    /**
     * 排序
     */
    private Integer sort;

    /**
     * 最小掉落数量
     */
    private Integer minAmount;

    /**
     * 最大掉落数量
     */
    private Integer maxAmount;

    /**
     * 概率最大为10000
     */
    private Integer rate;

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
     * 来源(组/地图)Id
     * @return src_id 来源(组/地图)Id
     */
    public Long getSrcId() {
        return srcId;
    }

    /**
     * 来源(组/地图)Id
     * @param srcId 来源(组/地图)Id
     */
    public void setSrcId(Long srcId) {
        this.srcId = srcId;
    }

    /**
     * 掉落物品ID
     * @return item_id 掉落物品ID
     */
    public Long getItemId() {
        return itemId;
    }

    /**
     * 掉落物品ID
     * @param itemId 掉落物品ID
     */
    public void setItemId(Long itemId) {
        this.itemId = itemId;
    }

    /**
     * 物品的类型(1-经验 2-金钱 3-元宝 4-材料 5-装备 6-其他(宠物,卡牌等))
     * @return res_type 物品的类型(1-经验 2-金钱 3-元宝 4-材料 5-装备 6-其他(宠物,卡牌等))
     */
    public String getResType() {
        return resType;
    }

    /**
     * 物品的类型(1-经验 2-金钱 3-元宝 4-材料 5-装备 6-其他(宠物,卡牌等))
     * @param resType 物品的类型(1-经验 2-金钱 3-元宝 4-材料 5-装备 6-其他(宠物,卡牌等))
     */
    public void setResType(String resType) {
        this.resType = resType == null ? null : resType.trim();
    }

    /**
     * 可做显示或描述
     * @return name 可做显示或描述
     */
    public String getName() {
        return name;
    }

    /**
     * 可做显示或描述
     * @param name 可做显示或描述
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * 掉落类型 1-固定掉落 2-随机掉落 3-条件掉落
     * @return type 掉落类型 1-固定掉落 2-随机掉落 3-条件掉落
     */
    public String getType() {
        return type;
    }

    /**
     * 掉落类型 1-固定掉落 2-随机掉落 3-条件掉落
     * @param type 掉落类型 1-固定掉落 2-随机掉落 3-条件掉落
     */
    public void setType(String type) {
        this.type = type == null ? null : type.trim();
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
     * 最小掉落数量
     * @return min_amount 最小掉落数量
     */
    public Integer getMinAmount() {
        return minAmount;
    }

    /**
     * 最小掉落数量
     * @param minAmount 最小掉落数量
     */
    public void setMinAmount(Integer minAmount) {
        this.minAmount = minAmount;
    }

    /**
     * 最大掉落数量
     * @return max_amount 最大掉落数量
     */
    public Integer getMaxAmount() {
        return maxAmount;
    }

    /**
     * 最大掉落数量
     * @param maxAmount 最大掉落数量
     */
    public void setMaxAmount(Integer maxAmount) {
        this.maxAmount = maxAmount;
    }

    /**
     * 概率最大为10000
     * @return rate 概率最大为10000
     */
    public Integer getRate() {
        return rate;
    }

    /**
     * 概率最大为10000
     * @param rate 概率最大为10000
     */
    public void setRate(Integer rate) {
        this.rate = rate;
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
     * @mbggenerated 2022-02-18
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", srcId=").append(srcId);
        sb.append(", itemId=").append(itemId);
        sb.append(", resType=").append(resType);
        sb.append(", name=").append(name);
        sb.append(", type=").append(type);
        sb.append(", sort=").append(sort);
        sb.append(", minAmount=").append(minAmount);
        sb.append(", maxAmount=").append(maxAmount);
        sb.append(", rate=").append(rate);
        sb.append(", valid=").append(valid);
        sb.append("]");
        return sb.toString();
    }
}