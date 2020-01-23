package com.untill.driver.interfaces.invoice;

import com.untill.driver.interfaces.bills.PaymentItem;

import java.util.List;

/**
 * A request for {@link IInvoiceHandler} <tt>paying</tt> operation
 */
public class InvoicePayingRequest extends InvoiceHandlerRequest {

	private List<PaymentItem> payments;

	public List<PaymentItem> getPayments() {
		return payments;
	}

	public void setPayments(List<PaymentItem> payments) {
		this.payments = payments;
	}
}
