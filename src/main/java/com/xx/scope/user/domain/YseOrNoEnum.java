package com.xx.scope.user.domain;

/**
 * '职位 1-普通弟子 2-真传弟子 3-长老 9-掌门',
 * @author YAO
 */
public enum YseOrNoEnum {
	/**
	 * 	NO("0"," 否"),
	 */
	NO("0"," 否"),
	/**
	 * YES("1","是");
	 */
	YES("1","是");

	YseOrNoEnum(String value, String name) {
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
		for (YseOrNoEnum e : YseOrNoEnum.values()) {
			if (e.getValue().equals(value)) {
				return e.getName();
			}
		}
		return value == null ? "" : value;
	}
}
