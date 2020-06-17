package com.untill.driver.interfaces.cashmachine;

/**
 * Represents request for cash-machine <tt>Return(Refund)</tt> operation
 */
public class CashMachineReturnRequest extends CashMachineTransactionRequest {

	@Override
	public String toString() {
		return "CashMachineReturnRequest{} " + super.toString();
	}
}
