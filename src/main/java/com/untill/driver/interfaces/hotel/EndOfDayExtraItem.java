package com.untill.driver.interfaces.hotel;

import java.math.BigDecimal;

/**
 * An extra item in a "End of Day" operation request handled by {@link IHotelSupportsEndOfDay}
 */
public class EndOfDayExtraItem {

	/**
	 * Item kind: "tip" means total tips over the period
	 *
	 * @see EndOfDayExtraItemKind#TIP
	 */
	private String itemType;

	private BigDecimal amount;

	private long salesAreaId;

	private int salesAreaNumber;

	private String salesAreaName;

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

	public String getSalesAreaName() {
		return salesAreaName;
	}

	public void setSalesAreaName(String salesAreaName) {
		this.salesAreaName = salesAreaName;
	}

	@Override
	public String toString() {
		return "EndOfDayExtraItem{"
				+ "itemType='" + itemType + '\''
				+ ", amount=" + amount
				+ ", salesAreaId=" + salesAreaId
				+ ", salesAreaNumber=" + salesAreaNumber
				+ ", salesAreaName='" + salesAreaName + '\''
				+ '}';
	}
}
