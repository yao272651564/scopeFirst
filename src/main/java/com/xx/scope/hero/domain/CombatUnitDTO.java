package com.xx.scope.hero.domain;

/**
 * 战斗单位类
 */
public class CombatUnitDTO {
    /**
     * 是否已出出手
     */
    public boolean isAction;
    /**
     * 是否死亡
     */
    public boolean isDead;
    /**
     * 是否是我方玩家
     */
    public String isPlayer;

    /**
     * 弟子编号
     */
    private Long id;

    /**
     * 弟子编号
     */
    private Long userId;

    /**
     *
     */
    private Long heroId;

    /**
     * 类型 1-人族 2-妖族 3-鬼
     */
    private String type;

    /**
     * 头像编号
     */
    private Long iconId;

    /**
     * 品质 1-红色 2-橙色 3-紫色
     */
    private String color;

    /**
     * 性别
     */
    private String sex;

    /**
     * 名称
     */
    private String name;

    /**
     * 描述
     */
    private String des;

    /**
     * 境界
     */
    private Integer grade;

    /**
     * 神识
     */
    private Long soul;

    /**
     * 攻击
     */
    private Long attack;

    /**
     * 防御
     */
    private Long defense;

    /**
     * 移动速度
     */
    private Integer speed;

    /**
     * 血量成长
     */
    private Long hp;

    /**
     * 真元(可恢复)
     */
    private Long mp;

    /**
     * 阅历,默认为0
     */
    private Long yueLi;

    /**
     * 天赋/体质id
     */
    private Long tianfuId;

    /**
     * 自带技能id
     */
    private Long skillId;

    /**
     * 攻击成长
     */
    private Integer attackUp;

    /**
     * 防御成长
     */
    private Integer defenseUp;

    /**
     * 血量成长
     */
    private Integer hpUp;

    /**
     * 灵力成长
     */
    private Integer mpUp;

    /**
     * 灵力成长
     */
    private Integer speedUp;

    /**
     * 攻击
     */
    private Long currentAttack;

    /**
     * 防御
     */
    private Long currentDefense;

    /**
     * 血量成长
     */
    private Long currentHp;

    /**
     * 真元(可恢复)
     */
    private Long currentMp;

    /**
     * 移动速度
     */
    private Integer currentSpeed;

    /**
     * 位置编号
     */
    private Integer sort;

    /**
     * 是否有效1-有效 0-无效
     */
    private String valid;

    /**
     * 判断是否死亡
     */
    public boolean getIsDead() {
        return isDead || getCurrentHp() <= 0;
    }



    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Long getHeroId() {
        return heroId;
    }

    public void setHeroId(Long heroId) {
        this.heroId = heroId;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Long getIconId() {
        return iconId;
    }

    public void setIconId(Long iconId) {
        this.iconId = iconId;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDes() {
        return des;
    }

    public void setDes(String des) {
        this.des = des;
    }

    public Integer getGrade() {
        return grade;
    }

    public void setGrade(Integer grade) {
        this.grade = grade;
    }

    public Long getSoul() {
        return soul;
    }

    public void setSoul(Long soul) {
        this.soul = soul;
    }

    public Long getAttack() {
        return attack;
    }

    public void setAttack(Long attack) {
        this.attack = attack;
    }

    public Long getDefense() {
        return defense;
    }

    public void setDefense(Long defense) {
        this.defense = defense;
    }

    public Integer getSpeed() {
        return speed;
    }

    public void setSpeed(Integer speed) {
        this.speed = speed;
    }

    public Long getHp() {
        return hp;
    }

    public void setHp(Long hp) {
        this.hp = hp;
    }

    public Long getMp() {
        return mp;
    }

    public void setMp(Long mp) {
        this.mp = mp;
    }

    public Long getYueLi() {
        return yueLi;
    }

    public void setYueLi(Long yueLi) {
        this.yueLi = yueLi;
    }

    public Long getTianfuId() {
        return tianfuId;
    }

    public void setTianfuId(Long tianfuId) {
        this.tianfuId = tianfuId;
    }

    public Long getSkillId() {
        return skillId;
    }

    public void setSkillId(Long skillId) {
        this.skillId = skillId;
    }

    public Integer getAttackUp() {
        return attackUp;
    }

    public void setAttackUp(Integer attackUp) {
        this.attackUp = attackUp;
    }

    public Integer getDefenseUp() {
        return defenseUp;
    }

    public void setDefenseUp(Integer defenseUp) {
        this.defenseUp = defenseUp;
    }

    public Integer getHpUp() {
        return hpUp;
    }

    public void setHpUp(Integer hpUp) {
        this.hpUp = hpUp;
    }

    public Integer getMpUp() {
        return mpUp;
    }

    public void setMpUp(Integer mpUp) {
        this.mpUp = mpUp;
    }

    public Integer getSpeedUp() {
        return speedUp;
    }

    public void setSpeedUp(Integer speedUp) {
        this.speedUp = speedUp;
    }

    public Long getCurrentAttack() {
        return currentAttack;
    }

    public void setCurrentAttack(Long currentAttack) {
        this.currentAttack = currentAttack;
    }

    public Long getCurrentDefense() {
        return currentDefense;
    }

    public void setCurrentDefense(Long currentDefense) {
        this.currentDefense = currentDefense;
    }

    public Long getCurrentHp() {
        return currentHp;
    }

    public void setCurrentHp(Long currentHp) {
        this.currentHp = currentHp;
    }

    public Long getCurrentMp() {
        return currentMp;
    }

    public void setCurrentMp(Long currentMp) {
        this.currentMp = currentMp;
    }

    public Integer getCurrentSpeed() {
        return currentSpeed;
    }

    public void setCurrentSpeed(Integer currentSpeed) {
        this.currentSpeed = currentSpeed;
    }

    public Integer getSort() {
        return sort;
    }

    public void setSort(Integer sort) {
        this.sort = sort;
    }

    public String getValid() {
        return valid;
    }

    public void setValid(String valid) {
        this.valid = valid;
    }

    public Boolean getAction() {
        return isAction;
    }

    public void setAction(Boolean action) {
        isAction = action;
    }

    public boolean isAction() {
        return isAction;
    }

    public void setAction(boolean action) {
        isAction = action;
    }

    public boolean isDead() {
        return isDead || getCurrentHp() <= 0;
    }

    public void setDead(boolean dead) {
        isDead = dead;
    }

    public String getIsPlayer() {
        return isPlayer;
    }

    public void setIsPlayer(String isPlayer) {
        this.isPlayer = isPlayer;
    }
}
