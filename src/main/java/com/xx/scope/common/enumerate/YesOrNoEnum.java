package com.xx.scope.common.enumerate;

/**
 * 是否标识 枚举
 * 公共枚举类
 */
public enum YesOrNoEnum {

	/**
	 * YES("1", "是"),
	 */
	YES("1", "是"),
	/**
	 * NO("0", "否")
	 */
	NO("0", "否"),
	/**
	 * NO2("2", "否")
	 */
	NO2("2", "否")
	;

	private String value;
	private String name;

	YesOrNoEnum(String value, String name) {
		this.value = value;
		this.name = name;
	}

	public String getValue() {
		return value;
	}

	public String getName() {
		return name;
	}

	/**
	 * 根据value获取name
	 * @param value 值
	 * @return 名称
	 */
	public static String getName(String value) {
		for (YesOrNoEnum e : YesOrNoEnum.values()) {
			if (e.getValue().equals(value)) {
				return e.name;
			}
		}
		return "";
	}
	
}
