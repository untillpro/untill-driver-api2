package com.untill.driver.params;

import com.untill.driver.untillapi.payments.IUntillPaymentsApi;
import com.untill.driver.untillapi.reasons.IUntillReasonsApi;

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
	@Deprecated PAYMENT_MODE("payment_mode"), TEXT("text"),
	/**
	 * @deprecated Use DISCOUNT_REASON_GUID instead
	 */
	@Deprecated DISCOUNT_REASON("discount_reason"),
	/**
	 * Identifies unTill payment mode. Use
	 * {@link IUntillPaymentsApi#getPaymentIdByGuid(String)} to obtain ID of
	 * payment
	 *
	 */
	PAYMENT_MODE_GUID("payment_mode_guid"),
	/**
	 * Identifies unTill discount reason. Use
	 * {@link IUntillReasonsApi#getReasonIdByGuid(String)} to obtain ID of
	 * discount reason
	 *
	 */
	DISCOUNT_REASON_GUID("discount_reason_guid"),
	FILE_PATH("file_path");

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
