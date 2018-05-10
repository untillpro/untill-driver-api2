package com.untill.driver.params;

/**
 * Describes all possible driver parameter types
 * 
 */
public enum ParamType {

	INT("int"), STRING("string"), BOOLEAN("boolean"), LIST("list"), REGASM("regasm"), REGSVR("regsvr32"), SYS32(
			"sys32"), PAYMENT_MODE("payment_mode"), TEXT("text");

	ParamType(String id) {
		this.id = id;
	}

	private String id;

	public String getId() {
		return id;
	}

	public static ParamType getByValue(String i) {
		for (ParamType type : ParamType.values()) {
			if (type.getId() == i) {
				return type;
			}
		}
		throw new IllegalArgumentException("There is no value = " + i + " in EnumDriverParamType");
	}

}
