package com.xx.scope.user.vo;
public class UserAllInfoResponseVO {
    private String userHeroList;
    private String userItemArmList;
    private String userItemConsumeList;

    public String getUserHeroList() {
        return userHeroList;
    }

    public void setUserHeroList(String userHeroList) {
        this.userHeroList = userHeroList;
    }

    public String getUserItemArmList() {
        return userItemArmList;
    }

    public void setUserItemArmList(String userItemArmList) {
        this.userItemArmList = userItemArmList;
    }

    public String getUserItemConsumeList() {
        return userItemConsumeList;
    }

    public void setUserItemConsumeList(String userItemConsumeList) {
        this.userItemConsumeList = userItemConsumeList;
    }

    @Override
    public String toString() {
        return "UserAllInfoResponseVO{" +
                "userHeroList='" + userHeroList + '\'' +
                ", userItemArmList='" + userItemArmList + '\'' +
                ", userItemConsumeList='" + userItemConsumeList + '\'' +
                '}';
    }
}
