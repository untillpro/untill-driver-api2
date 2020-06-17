package com.untill.driver.interfaces.cashmachine;

/**
 * Represents request for cash-machine <tt>Payment(Sale)</tt> operation
 */
public class CashMachinePaymentRequest extends CashMachineTransactionRequest {

	@Override
	public String toString() {
		return "CashMachinePaymentRequest{} " + super.toString();
	}
}
