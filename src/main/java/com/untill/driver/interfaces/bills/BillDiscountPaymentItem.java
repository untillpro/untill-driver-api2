package com.untill.driver.interfaces.bills;

import java.util.HashMap;
import java.util.Map;

public class BillDiscountPaymentItem extends BillDiscountItem {

	private Map<String, String> data = new HashMap<>();
	
	private long paymentId;

	public Map<String, String> getData() {
		return data;
	}

	public void setData(Map<String, String> data) {
		this.data = data;
	}

	public long getPaymentId() {
		return paymentId;
	}

	public void setPaymentId(long paymentId) {
		this.paymentId = paymentId;
	}
	


}
