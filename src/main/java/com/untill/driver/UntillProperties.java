package com.untill.driver;

/**
 * Declares available property names
 *
 */
public abstract class UntillProperties {

	public static final String UNTILL_VERSION = "untill.version";

	/**
	 * Returns "1" when database is configured as VAT-exclusive
	 */
	public static final String VAT_TYPE = "restaurant.vatType";

	/**
	 * Returns the license Uid, or null when no license loaded
	 */
	public static final String LICENSE_UID = "untill.licenseUid";

	/**
	 * Returns the TP-API port number
	 */
	public static final String TPAPI_PORT = "tpapi.port";
}
