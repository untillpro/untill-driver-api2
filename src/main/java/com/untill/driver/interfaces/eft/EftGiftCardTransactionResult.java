package com.untill.driver.interfaces.eft;

import java.math.BigDecimal;

public class EftGiftCardTransactionResult extends EftGiftCardResult {
	
	private BigDecimal oldBalance;

	public BigDecimal getOldBalance() {
		return oldBalance;
	}

	public void setOldBalance(BigDecimal oldBalance) {
		this.oldBalance = oldBalance;
	}

}
