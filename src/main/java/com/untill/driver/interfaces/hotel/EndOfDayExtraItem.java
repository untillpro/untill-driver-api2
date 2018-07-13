package com.untill.driver.interfaces.hotel;

import java.math.BigDecimal;

/**
 * An extra item in a "End of Day" operation request handled by {@link IHotelSupportsEndOfDay}
 *
 */
public class EndOfDayExtraItem {
	
	private String itemType;
	
	private BigDecimal amount;
	
	private long salesAreaId;

	private int salesAreaNumber;

	/**
	 * @return Returns item kind: "tip" means total tips over the period
	 */
	public String getItemType() {
		return itemType;
	}

	public void setItemType(String itemType) {
		this.itemType = itemType;
	}

	public BigDecimal getAmount() {
		return amount;
	}

	public void setAmount(BigDecimal amount) {
		this.amount = amount;
	}

	public long getSalesAreaId() {
		return salesAreaId;
	}

	public void setSalesAreaId(long salesAreaId) {
		this.salesAreaId = salesAreaId;
	}

	public int getSalesAreaNumber() {
		return salesAreaNumber;
	}

	public void setSalesAreaNumber(int salesAreaNumber) {
		this.salesAreaNumber = salesAreaNumber;
	}

}
