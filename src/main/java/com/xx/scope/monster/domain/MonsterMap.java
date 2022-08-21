package com.xx.scope.monster.domain;

public class MonsterMap {
    /**
     * 
     */
    private Long id;

    /**
     * 名称
     */
    private String name;

    /**
     * 类型 1-练级地图
     */
    private String type;

    /**
     * 掉落经验
     */
    private Long dropExperience;

    /**
     * 掉落金钱
     */
    private Long dropMoney;

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
     * 类型 1-练级地图
     * @return type 类型 1-练级地图
     */
    public String getType() {
        return type;
    }

    /**
     * 类型 1-练级地图
     * @param type 类型 1-练级地图
     */
    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    /**
     * 掉落经验
     * @return drop_experience 掉落经验
     */
    public Long getDropExperience() {
        return dropExperience;
    }

    /**
     * 掉落经验
     * @param dropExperience 掉落经验
     */
    public void setDropExperience(Long dropExperience) {
        this.dropExperience = dropExperience;
    }

    /**
     * 掉落金钱
     * @return drop_money 掉落金钱
     */
    public Long getDropMoney() {
        return dropMoney;
    }

    /**
     * 掉落金钱
     * @param dropMoney 掉落金钱
     */
    public void setDropMoney(Long dropMoney) {
        this.dropMoney = dropMoney;
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
     * @mbggenerated 2022-02-16
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
        sb.append(", dropExperience=").append(dropExperience);
        sb.append(", dropMoney=").append(dropMoney);
        sb.append(", valid=").append(valid);
        sb.append("]");
        return sb.toString();
    }
}