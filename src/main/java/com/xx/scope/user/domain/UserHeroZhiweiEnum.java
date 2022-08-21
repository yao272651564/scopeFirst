package com.xx.scope.user.domain;

/**
 * 当前行动状态 1-空闲 2-外出历练
 * @author YAO
 */
public enum UserHeroZhiweiEnum {
	/**
	 * PT("1","普通弟子")
	 */
	PT("1","普通弟子"),
	/**
	 * ZC("2","真传弟子")
	 */
	ZC("2","真传弟子"),
	/**
	 * ZL("3","长老")
	 */
	ZL("3","长老"),
	/**
	 * ZM("9","掌门")
	 */
	ZM("9","掌门");

	UserHeroZhiweiEnum(String value, String name) {
		this.value = value;
		this.name = name;
	}
	
	private String value;
	
	private String name;
	
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
	
	/**
	 * 根据value获取name
	 * @param value
	 * @return
	 */
	public static String getName(String value) {
		for (UserHeroZhiweiEnum e : UserHeroZhiweiEnum.values()) {
			if (e.getValue().equals(value)) {
				return e.getName();
			}
		}
		return value == null ? "" : value;
	}
}
