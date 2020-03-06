package com.untill.driver.interfaces.bills;

import java.util.List;

/**
 * A request for {@link ICustomBillsHandler} <tt>purchase vouchers</tt> operation
 */
public class VoucherBillClosingRequest extends CustomBillsHandlerRequest {

	private List<Voucher> vouchers;

	public List<Voucher> getVouchers() {
		return vouchers;
	}

	public void setVouchers(List<Voucher> vouchers) {
		this.vouchers = vouchers;
	}

	@Override
	public String toString() {
		return "VoucherBillClosingRequest{"
				+ "vouchers=" + vouchers
				+ "} " + super.toString();
	}
}