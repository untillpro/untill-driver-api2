package com.untill.driver.interfaces.bills;

import com.untill.driver.interfaces.DriverRequest;

import java.util.List;

/**
 * Basic class for {@link ICustomBillsHandler} request
 */
public abstract class CustomBillsHandlerRequest extends DriverRequest {

	private List<PaymentItem> payments;

	public List<PaymentItem> getPayments() {
		return payments;
	}

	public void setPayments(List<PaymentItem> payments) {
		this.payments = payments;
	}
}
