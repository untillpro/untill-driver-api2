package com.untill.driver.interfaces.eft;

/**
 * Contains operation result codes
 * @see EftResult
 *
 */
public abstract class EftTransactionResult {

	public static final int SUCCESS = 0;

	public static final int DECLINED = 1;

	public static final int CANCELLED = 2;

	public static final int RECOVERY = 3;

}
