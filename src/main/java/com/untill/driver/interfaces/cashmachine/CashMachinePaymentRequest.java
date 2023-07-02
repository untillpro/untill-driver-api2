package com.untill.driver.interfaces.cashmachine;

import java.math.BigDecimal;

/**
 * Represents request for cash-machine <tt>Payment(Sale)</tt> operation
 */
public class CashMachinePaymentRequest extends CashMachineTransactionRequest {
	/**
	 * Indicates the part of total amount which will be returned to customer in Cash.
	 * Can be ignored when not supported by integration.
	 */
	private BigDecimal cashOut;

	public BigDecimal getCashOut() {
		return cashOut;
	}

	public void setCashOut(BigDecimal cashOut) {
		this.cashOut = cashOut;
	}

	@Override
	public String toString() {
		return "CashMachinePaymentRequest{"
				+ "cashOut=" + cashOut
				+ "} " + super.toString();
	}
}
