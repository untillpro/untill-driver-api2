package com.untill.driver.interfaces.eft;

/**
 * EFT data keys for using in {@link EftResult}.data
 * @see EftResult
 */

public abstract class EftResultFields {

	public static final String ACCOUNT_TYPE = "account_type";
	public static final String ACQUIER_CODE = "acquier_code";
	public static final String AUTHORIZATION_NUMBER = "auth_number";
	public static final String CARD_TYPE = "cardname";
	public static final String CONTROL_NO = "controlno";
	public static final String EXPIRE_DATE = "expire";
	public static final String MASKED_CARD_NUMBER = "masked_pan";
	public static final String TERMINAL_ID = "terminalid";

	public static final String MERCHANT_ID = "merchant_id";
	public static final String CASHBACK_AMOUNT = "cashback_amount";
	public static final String AID = "aid";
	public static final String TSI = "tsi";
	public static final String TVR = "tvr";
	public static final String EXTRA_FIELD_1 = "field1";
	public static final String EXTRA_FIELD_2 = "field2";
	public static final String EXTRA_FIELD_3 = "field3";
	public static final String EXTRA_FIELD_4 = "field4";
	public static final String EXTRA_FIELD_5 = "field5";
	public static final String EXTRA_FIELD_6 = "field6";
	public static final String EXTRA_FIELD_7 = "field7";
	public static final String EXTRA_FIELD_8 = "field8";
	public static final String EXTRA_FIELD_9 = "field9";
	public static final String EXTRA_FIELD_10 = "field10";
	public static final String EXTRA_FIELD_11 = "field11";
	public static final String EXTRA_FIELD_12 = "field12";
	public static final String EXTRA_FIELD_13 = "field13";
	public static final String EXTRA_FIELD_14 = "field14";
	public static final String EXTRA_FIELD_15 = "field15";

	public static final String CURRENT_BALANCE = "balance";
	public static final String OLD_BALANCE = "old_balance";

	/**
	 * Some terminals allows entering tips during sale operation. In this case, this field
	 * must return tips amount in cents (integer value)
	 */
	public static final String EFT_ADDED_TIPS = "eft_added_tips";

}
