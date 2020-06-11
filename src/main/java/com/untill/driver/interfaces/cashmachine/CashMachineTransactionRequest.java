package com.untill.driver.interfaces.cashmachine;

import java.math.BigDecimal;

/**
 * Basic class for {@link ICashMachine} transaction operations
 */
public abstract class CashMachineTransactionRequest extends CashMachineRequest {
	/**
	 * Money amount
	 */
	private BigDecimal amount;
	/**
	 * Transaction ID
	 */
	private long transactionId;

	public BigDecimal getAmount() {
		return amount;
	}

	public void setAmount(BigDecimal amount) {
		this.amount = amount;
	}

	public long getTransactionId() {
		return transactionId;
	}

	public void setTransactionId(long transactionId) {
		this.transactionId = transactionId;
	}
}
