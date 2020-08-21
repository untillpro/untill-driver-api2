package com.untill.driver.interfaces.cashmachine;

/**
 * Provides result codes for {@link ICashMachine} operations:
 * <ul>
 * 	<li> {@link CashMachineTransactionResult#SUCCESS} indicates successful completion</li>
 * 	<li> {@link CashMachineTransactionResult#DECLINED} indicates that operation was declined</li>
 * 	<li> {@link CashMachineTransactionResult#CANCELLED} indicates that operation was cancelled by user</li>
 * </ul>
 *
 * @see CashMachineResult
 */
public final class CashMachineTransactionResult {
	private CashMachineTransactionResult() {
	}

	/**
	 * Indicates successful completion
	 */
	public static final int SUCCESS = 0;
	/**
	 * Indicates that operation was declined
	 */
	public static final int DECLINED = 1;
	/**
	 * Indicates that operation was cancelled by user
	 */
	public static final int CANCELLED = 2;
}