package com.untill.driver.interfaces.prepaidarticles;

import com.untill.driver.interfaces.bills.Bill;

/**
 * A request for {@link IPrepaidArticles} <tt>read</tt> operation
 */
public class ReadPrepaidArticlesRequest extends PrepaidArticlesRequest {
	private String code;
	/**
	 * The current transaction
	 */
	private Bill bill;

	/**
	 * Voucher code
	 *
	 * @return voucher code
	 */
	public String getCode() {
		return code;
	}

	/**
	 * Set voucher code
	 *
	 * @param code voucher code
	 */
	public void setCode(String code) {
		this.code = code;
	}

	public Bill getBill() {
		return bill;
	}

	public void setBill(Bill bill) {
		this.bill = bill;
	}

	@Override
	public String toString() {
		return "ReadPrepaidArticlesRequest{"
				+ "code='" + code + '\''
				+ ", bill=" + bill
				+ "} " + super.toString();
	}
}
