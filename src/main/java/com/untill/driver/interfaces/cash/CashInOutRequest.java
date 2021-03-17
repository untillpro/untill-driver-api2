package com.untill.driver.interfaces.cash;

/**
 * A request for {@link ICashHandler} <tt>cash in(deposit) or cash out(withdraw)</tt> operation
 */
public class CashInOutRequest extends CashHandlerRequest {
	@Override
	public String toString() {
		return "CashInOutRequest{} " + super.toString();
	}
}
