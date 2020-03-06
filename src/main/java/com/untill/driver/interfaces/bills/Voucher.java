package com.untill.driver.interfaces.bills;

import java.math.BigDecimal;

public class Voucher {

	private String id;
	private BigDecimal amount;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public BigDecimal getAmount() {
		return amount;
	}

	public void setAmount(BigDecimal amount) {
		this.amount = amount;
	}

	@Override
	public String toString() {
		return "Voucher{"
				+ "id='" + id + '\''
				+ ", amount=" + amount
				+ '}';
	}
}
