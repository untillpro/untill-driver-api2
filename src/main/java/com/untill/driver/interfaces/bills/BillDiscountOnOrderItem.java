package com.untill.driver.interfaces.bills;

public class BillDiscountOnOrderItem extends BillDiscountItem {
	
	private String orderItemSignature;

	private String discountDescription;

	public String getOrderItemSignature() {
		return orderItemSignature;
	}

	public void setOrderItemSignature(String orderItemSignature) {
		this.orderItemSignature = orderItemSignature;
	}

	public String getDiscountDescription() {
		return discountDescription;
	}

	public void setDiscountDescription(String discountDescription) {
		this.discountDescription = discountDescription;
	}	
}
