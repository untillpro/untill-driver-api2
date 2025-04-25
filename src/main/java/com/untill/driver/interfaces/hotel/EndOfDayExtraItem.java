package com.untill.driver.interfaces.hotel;

import java.math.BigDecimal;

/**
 * An extra item in a "End of Day" operation request handled by {@link IHotelSupportsEndOfDay}
 */
public class EndOfDayExtraItem {
	/**
	 * <ul>
	 * <li>{@link EndOfDayExtraItemKind#TIP Tips}</li>
	 * <li>{@link EndOfDayExtraItemKind#EFT_ADDED_TIPS EFT added tips}</li>
	 * </ul>
	 *
	 * @see EndOfDayExtraItemKind
	 */
	private String itemType;

	private BigDecimal amount;

	private long salesAreaId;

	private int salesAreaNumber;

	private String salesAreaName;
	private String salesAreaThirdPartyId;

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

	public String getSalesAreaThirdPartyId() {
		return salesAreaThirdPartyId;
	}

	public void setSalesAreaThirdPartyId(String salesAreaThirdPartyId) {
		this.salesAreaThirdPartyId = salesAreaThirdPartyId;
	}

	@Override
	public String toString() {
		return "EndOfDayExtraItem{"
				+ "itemType='" + itemType + '\''
				+ ", amount=" + amount
				+ ", salesAreaId=" + salesAreaId
				+ ", salesAreaNumber=" + salesAreaNumber
				+ ", salesAreaName='" + salesAreaName + '\''
				+ ", salesAreaThirdPartyId='" + salesAreaThirdPartyId + '\''
				+ '}';
	}
}
