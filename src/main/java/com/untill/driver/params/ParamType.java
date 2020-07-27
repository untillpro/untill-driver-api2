package com.untill.driver.params;

/**
 * Describes all possible driver parameter types
 * 
 */
public enum ParamType {

	INT("int"), STRING("string"), BOOLEAN("boolean"), LIST("list"), REGASM("regasm"), REGSVR("regsvr32"), SYS32(
			"sys32"),

	/**
	 * @deprecated Use PAYMENT_MODE_GUID instead
	 */
	@Deprecated PAYMENT_MODE("payment_mode"), 
	TEXT("text"), 
	/**
	 * @deprecated Use DISCOUNT_REASON_GUID instead
	 */
	@Deprecated DISCOUNT_REASON("discount_reason"), 
	PAYMENT_MODE_GUID("payment_mode_guid"), 
	DISCOUNT_REASON_GUID("discount_reason_guid");

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
