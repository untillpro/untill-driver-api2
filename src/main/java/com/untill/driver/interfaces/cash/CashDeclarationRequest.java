package com.untill.driver.interfaces.cash;

/**
 * A request for {@link ICashHandler} <tt>cash declaration(initialization)</tt> operation
 */
public class CashDeclarationRequest extends CashHandlerRequest {
	@Override
	public String toString() {
		return "CashDeclarationRequest{} " + super.toString();
	}
}
