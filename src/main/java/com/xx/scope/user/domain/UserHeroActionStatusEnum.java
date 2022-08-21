package com.xx.scope.user.domain;

/**
 * '职位 1-普通弟子 2-真传弟子 3-长老 9-掌门',
 * @author YAO
 */
public enum UserHeroActionStatusEnum {
	/**
	 * KX("1","空闲"),
	 */
	KX("1","空闲"),
	/**
	 * SZ("2","上阵")
	 */
	SZ("2","上阵");

	UserHeroActionStatusEnum(String value, String name) {
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
		for (UserHeroActionStatusEnum e : UserHeroActionStatusEnum.values()) {
			if (e.getValue().equals(value)) {
				return e.getName();
			}
		}
		return value == null ? "" : value;
	}
}
