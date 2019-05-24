package com.untill.driver.interfaces.eft;

import java.math.BigDecimal;

public class EftGiftCardResult extends EftResult {
	
	private BigDecimal currentBalance;

	public BigDecimal getCurrentBalance() {
		return currentBalance;
	}

	public void setCurrentBalance(BigDecimal currentBalance) {
		this.currentBalance = currentBalance;
	}
	
}
