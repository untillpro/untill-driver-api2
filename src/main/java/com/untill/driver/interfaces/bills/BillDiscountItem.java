package com.untill.driver.interfaces.bills;

import java.math.BigDecimal;

public abstract class BillDiscountItem {
	
	private BigDecimal amount;
	
	public BigDecimal getAmount() {
		return amount;
	}

	public void setAmount(BigDecimal amount) {
		this.amount = amount;
	}

}
