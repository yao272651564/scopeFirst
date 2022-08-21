package com.xx.scope.user.vo;

/**
 * 战斗过程返回参数vo
 * 第1回合
 *      过程
 *         影响
 * 第2回合
 *       过程
 *          影响
 * 我方(对方)胜利
 *
 * 掉落列表
 */
public class FightSceneVO {

    public String wfList;
    public String dfList;
    public String zdgcList;
    //掉落列表
    public String dropItemList;
    //1-胜利 2-失败 3-未分胜负
    public String battleOverType;


    public static class ZhanDouHpChange {
        //掉血对象ID
        public String id;
        /**
         * 是否暴击0-否 1-是
         */
        public String isBaoJi;
        public String hpChange;//HP变动
        public String spChange;//SP变动
        public String hp;//剩余血量
        public String sp;//剩余SP
        public String sort;

        public ZhanDouHpChange(String id)
        {
            this.id = id;
        }
        public ZhanDouHpChange() {

        }
    }


    public static class ZhanDouGC {
        //动手对象id
        public String id;
        public String killId;//技能
        // public String name;
        //  public String hp;
        // public String sp;
        // public String level;
        public String isPlayer;
        public String huiHe;//回合数
        public String overType;//结束类型 1-胜利 2-失败 3-战斗中

        //敌方增减益演示
        public String hpChangeList;

        public ZhanDouGC(){}
        public ZhanDouGC(String id, String killId, String isPlayer, String huiHe, String hpChangeList) {
            this.id = id;
            this.killId = killId;
            this.isPlayer = isPlayer;
            this.huiHe = huiHe;
            this.hpChangeList = hpChangeList;
        }
    }

/*    public static class DropItem {
        public String name;
        public String amount;
    }*/




   /* public static class FightHpVO {
        *//**
         * 对方id
         *//*
        public String childId;
        *//**
         * 是否暴击0-否 1-是
         *//*
        public String baoji;
        *//**
         * 血量影响
         *//*
        public String subHp;
        */

    public String getWfList() {
        return wfList;
    }

    public void setWfList(String wfList) {
        this.wfList = wfList;
    }

    public String getDfList() {
        return dfList;
    }

    public void setDfList(String dfList) {
        this.dfList = dfList;
    }

    public String getZdgcList() {
        return zdgcList;
    }

    public void setZdgcList(String zdgcList) {
        this.zdgcList = zdgcList;
    }

    public String getDropItemList() {
        return dropItemList;
    }

    public void setDropItemList(String dropItemList) {
        this.dropItemList = dropItemList;
    }

    public String getBattleOverType() {
        return battleOverType;
    }

    public void setBattleOverType(String battleOverType) {
        this.battleOverType = battleOverType;
    }
    /**
         *  剩余HP
         *//*
        public String nowHp;
        //1-减益 2-增益
        public String type;
    }
*/

}
