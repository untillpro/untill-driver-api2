package com.untill.driver.interfaces.cash;

import com.untill.driver.interfaces.DriverRequest;

import java.math.BigDecimal;

/**
 * Basic class for {@link ICashHandler} request
 */
public abstract class CashHandlerRequest extends DriverRequest {

	/**
	 * Cash amount
	 */
	private BigDecimal amount;

	public BigDecimal getAmount() {
		return amount;
	}

	public void setAmount(BigDecimal amount) {
		this.amount = amount;
	}
}
