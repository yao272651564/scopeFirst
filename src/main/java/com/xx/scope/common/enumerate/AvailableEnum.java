package com.xx.scope.common.enumerate;

/**
 * 删除逻辑标识
 * @author yao
 *
 */
public enum AvailableEnum {
	
	/**
	 * STARTUSING("1", "启用")
	 */
	STARTUSING("1", "启用"), 
	/**
	 *DELETE("0", "删除")
	 */
	DELETE("0", "删除");
	
	private String value;
	private String name;

	AvailableEnum(String value, String name) {
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
		for (AvailableEnum e : AvailableEnum.values()) {
			if (e.getValue().equals(value)) {
				return e.name;
			}
		}
		return "";
	}
	
}
