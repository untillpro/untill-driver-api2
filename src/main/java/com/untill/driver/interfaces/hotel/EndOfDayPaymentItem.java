package com.untill.driver.interfaces.hotel;

import java.math.BigDecimal;

/**
 * A payment item in a "End of Day" operation request handled by {@link IHotelSupportsEndOfDay}
 *
 */
public class EndOfDayPaymentItem {

	private int paymentNumber;

	private String paymentName;

	private int paymentKind;

	private long salesAreaId;

	private int salesAreaNumber;

	private String salesAreaName;

	private BigDecimal totalAmount;

	private BigDecimal totalTipAmount;

	public int getPaymentNumber() {
		return paymentNumber;
	}

	public void setPaymentNumber(int paymentNumber) {
		this.paymentNumber = paymentNumber;
	}

	public String getPaymentName() {
		return paymentName;
	}

	public void setPaymentName(String paymentName) {
		this.paymentName = paymentName;
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

	public BigDecimal getTotalAmount() {
		return totalAmount;
	}

	public void setTotalAmount(BigDecimal totalAmount) {
		this.totalAmount = totalAmount;
	}

	/**
	 * @deprecated Use {@link EndOfDayExtraItem} with kind "tip"
	 */
	public BigDecimal getTotalTipAmount() {
		return totalTipAmount;
	}

	/**
	 * @deprecated Use {@link EndOfDayExtraItem} with kind "tip"
	 */
	public void setTotalTipAmount(BigDecimal totalTipAmount) {
		this.totalTipAmount = totalTipAmount;
	}

	public int getPaymentKind() {
		return paymentKind;
	}

	public void setPaymentKind(int paymentKind) {
		this.paymentKind = paymentKind;
	}

}
