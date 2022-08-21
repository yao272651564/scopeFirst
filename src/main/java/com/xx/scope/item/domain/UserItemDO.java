package com.xx.scope.item.domain;

public class UserItemDO {
    /**
     * 
     */
    private Long id;

    /**
     * 
     */
    private Long itemId;

    /**
     * 
     */
    private Long userId;

    /**
     * 来源ID
     */
    private Long srcId;

    /**
     * 数量
     */
    private Integer itemCount;

    /**
     * 是否启用0-未启用 1-启用
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
     * @return item_id 
     */
    public Long getItemId() {
        return itemId;
    }

    /**
     * 
     * @param itemId 
     */
    public void setItemId(Long itemId) {
        this.itemId = itemId;
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
     * 来源ID
     * @return src_id 来源ID
     */
    public Long getSrcId() {
        return srcId;
    }

    /**
     * 来源ID
     * @param srcId 来源ID
     */
    public void setSrcId(Long srcId) {
        this.srcId = srcId;
    }

    /**
     * 数量
     * @return item_count 数量
     */
    public Integer getItemCount() {
        return itemCount;
    }

    /**
     * 数量
     * @param itemCount 数量
     */
    public void setItemCount(Integer itemCount) {
        this.itemCount = itemCount;
    }

    /**
     * 是否启用0-未启用 1-启用
     * @return valid 是否启用0-未启用 1-启用
     */
    public String getValid() {
        return valid;
    }

    /**
     * 是否启用0-未启用 1-启用
     * @param valid 是否启用0-未启用 1-启用
     */
    public void setValid(String valid) {
        this.valid = valid == null ? null : valid.trim();
    }

    /**
     *
     * @mbggenerated 2019-11-25
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", itemId=").append(itemId);
        sb.append(", userId=").append(userId);
        sb.append(", srcId=").append(srcId);
        sb.append(", itemCount=").append(itemCount);
        sb.append(", valid=").append(valid);
        sb.append("]");
        return sb.toString();
    }
}