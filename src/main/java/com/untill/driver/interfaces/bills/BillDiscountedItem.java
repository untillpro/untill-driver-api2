package com.untill.driver.interfaces.bills;

import java.math.BigDecimal;

public class BillDiscountedItem {
	
	private long articleId;

	private int quantity;
	
	private BigDecimal value;
	
	private boolean percentValue;
	
	private Long discountReasonId;

	public BigDecimal getValue() {
		return value;
	}

	public void setValue(BigDecimal value) {
		this.value = value;
	}

	public boolean isPercentValue() {
		return percentValue;
	}

	public void setPercentValue(boolean percentValue) {
		this.percentValue = percentValue;
	}

	public long getArticleId() {
		return articleId;
	}

	public void setArticleId(long articleId) {
		this.articleId = articleId;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public Long getDiscountReasonId() {
		return discountReasonId;
	}

	public void setDiscountReasonId(Long discountReasonId) {
		this.discountReasonId = discountReasonId;
	}
}
