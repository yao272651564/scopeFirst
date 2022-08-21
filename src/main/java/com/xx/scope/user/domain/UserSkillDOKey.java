package com.xx.scope.user.domain;

public class UserSkillDOKey {
    /**
     * 
     */
    private Long userId;

    /**
     * 
     */
    private Long skillId;

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
     *
     * @mbggenerated 2019-10-29
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", userId=").append(userId);
        sb.append(", skillId=").append(skillId);
        sb.append("]");
        return sb.toString();
    }
}