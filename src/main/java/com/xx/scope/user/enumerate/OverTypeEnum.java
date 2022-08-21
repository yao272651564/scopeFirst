package com.xx.scope.user.enumerate;

public enum OverTypeEnum {
    SL("1", "胜利"),
    SB("2", "失败"),
    JX("3", "战斗中");

    private String value;
    private String name;

    OverTypeEnum(String value, String name) {
        this.value = value;
        this.name = name;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "OverTypeEnum{" +
                "value='" + value + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
