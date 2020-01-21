package com.untill.driver.interfaces.bills;

import java.util.List;

/**
 * A request for {@link ICustomBillsHandler} <tt>purchase vouchers</tt> operation
 */
public class VoucherBillClosingRequest extends CustomBillsHandlerRequest {

	private List<Voucher> vouchers;
	private List<PaymentItem> payments;

	public List<Voucher> getVouchers() {
		return vouchers;
	}

	public void setVouchers(List<Voucher> vouchers) {
		this.vouchers = vouchers;
	}

	public List<PaymentItem> getPayments() {
		return payments;
	}

	public void setPayments(List<PaymentItem> payments) {
		this.payments = payments;
	}
}
