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
	private String transactionId;

	public BigDecimal getAmount() {
		return amount;
	}

	public void setAmount(BigDecimal amount) {
		this.amount = amount;
	}

	public String getTransactionId() {
		return transactionId;
	}

	public void setTransactionId(String transactionId) {
		this.transactionId = transactionId;
	}

	@Override
	public String toString() {
		return "CashMachineTransactionRequest{"
				+ "amount=" + amount
				+ ", transactionId='" + transactionId + '\''
				+ "} " + super.toString();
	}
}
