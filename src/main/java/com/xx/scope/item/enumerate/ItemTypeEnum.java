package com.xx.scope.item.enumerate;

/**
 * 物品的类型(1-经验 2-金钱 3-元宝 4-材料 5-装备 6-其他(宠物,卡牌等))',
 */
public enum ItemTypeEnum {
    EXP("1","经验"),
    MONEY("2","金钱"),
    YB("3","元宝"),
    CONSUME("4","材料/消耗品"),
    ARM("5","装备");

     private final String value;
     private final String name;
    ItemTypeEnum(String value, String name) {
        this.value = value;
        this.name = name;
    }

    public String getValue() {
        return value;
    }

    public String getName() {
        return name;
    }
}
