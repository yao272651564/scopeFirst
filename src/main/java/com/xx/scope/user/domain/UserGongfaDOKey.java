package com.xx.scope.user.domain;

public class UserGongfaDOKey {
    /**
     * 
     */
    private Long userId;

    /**
     * 
     */
    private Long gongfaId;

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
     * @return gongfa_id 
     */
    public Long getGongfaId() {
        return gongfaId;
    }

    /**
     * 
     * @param gongfaId 
     */
    public void setGongfaId(Long gongfaId) {
        this.gongfaId = gongfaId;
    }

    /**
     *
     * @mbggenerated 2019-11-01
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", userId=").append(userId);
        sb.append(", gongfaId=").append(gongfaId);
        sb.append("]");
        return sb.toString();
    }
}