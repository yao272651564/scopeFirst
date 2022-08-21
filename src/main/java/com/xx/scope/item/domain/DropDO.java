package com.xx.scope.item.domain;

public class DropDO {
    /**
     * 掉落来源ID
     */
    private Long srcId;

    /**
     * 掉落物品组id
     */
    private Long dropGroupId;

    /**
     * 可做显示或描述
     */
    private String name;

    /**
     * 需要随机出来的掉落组数量(0-random_group.szie)
     */
    private Integer randomGroupCount;

    /**
     * 条件掉落物品集合ID
     */
    private Long questGroupId;

    /**
     * 条件掉落类型
     */
    private String questType;

    /**
     * 条件ID
     */
    private Long questId;

    /**
     * 
     */
    private Integer dropMinMoney;

    /**
     * 
     */
    private Integer dropMaxMoney;

    /**
     * 是否有效1-有效 0-无效
     */
    private String valid;

    /**
     * 掉落来源ID
     * @return src_id 掉落来源ID
     */
    public Long getSrcId() {
        return srcId;
    }

    /**
     * 掉落来源ID
     * @param srcId 掉落来源ID
     */
    public void setSrcId(Long srcId) {
        this.srcId = srcId;
    }

    /**
     * 掉落物品组id
     * @return drop_group_id 掉落物品组id
     */
    public Long getDropGroupId() {
        return dropGroupId;
    }

    /**
     * 掉落物品组id
     * @param dropGroupId 掉落物品组id
     */
    public void setDropGroupId(Long dropGroupId) {
        this.dropGroupId = dropGroupId;
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
     * 需要随机出来的掉落组数量(0-random_group.szie)
     * @return random_group_count 需要随机出来的掉落组数量(0-random_group.szie)
     */
    public Integer getRandomGroupCount() {
        return randomGroupCount;
    }

    /**
     * 需要随机出来的掉落组数量(0-random_group.szie)
     * @param randomGroupCount 需要随机出来的掉落组数量(0-random_group.szie)
     */
    public void setRandomGroupCount(Integer randomGroupCount) {
        this.randomGroupCount = randomGroupCount;
    }

    /**
     * 条件掉落物品集合ID
     * @return quest_group_id 条件掉落物品集合ID
     */
    public Long getQuestGroupId() {
        return questGroupId;
    }

    /**
     * 条件掉落物品集合ID
     * @param questGroupId 条件掉落物品集合ID
     */
    public void setQuestGroupId(Long questGroupId) {
        this.questGroupId = questGroupId;
    }

    /**
     * 条件掉落类型
     * @return quest_type 条件掉落类型
     */
    public String getQuestType() {
        return questType;
    }

    /**
     * 条件掉落类型
     * @param questType 条件掉落类型
     */
    public void setQuestType(String questType) {
        this.questType = questType == null ? null : questType.trim();
    }

    /**
     * 条件ID
     * @return quest_id 条件ID
     */
    public Long getQuestId() {
        return questId;
    }

    /**
     * 条件ID
     * @param questId 条件ID
     */
    public void setQuestId(Long questId) {
        this.questId = questId;
    }

    /**
     * 
     * @return drop_min_money 
     */
    public Integer getDropMinMoney() {
        return dropMinMoney;
    }

    /**
     * 
     * @param dropMinMoney 
     */
    public void setDropMinMoney(Integer dropMinMoney) {
        this.dropMinMoney = dropMinMoney;
    }

    /**
     * 
     * @return drop_max_money 
     */
    public Integer getDropMaxMoney() {
        return dropMaxMoney;
    }

    /**
     * 
     * @param dropMaxMoney 
     */
    public void setDropMaxMoney(Integer dropMaxMoney) {
        this.dropMaxMoney = dropMaxMoney;
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
        sb.append(", srcId=").append(srcId);
        sb.append(", dropGroupId=").append(dropGroupId);
        sb.append(", name=").append(name);
        sb.append(", randomGroupCount=").append(randomGroupCount);
        sb.append(", questGroupId=").append(questGroupId);
        sb.append(", questType=").append(questType);
        sb.append(", questId=").append(questId);
        sb.append(", dropMinMoney=").append(dropMinMoney);
        sb.append(", dropMaxMoney=").append(dropMaxMoney);
        sb.append(", valid=").append(valid);
        sb.append("]");
        return sb.toString();
    }
}