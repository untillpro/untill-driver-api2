package com.untill.driver.interfaces.prepaidarticles;

/**
 * A request for {@link IPrepaidArticles} <tt>read</tt> operation
 */
public class ReadPrepaidArticlesRequest extends PrepaidArticlesRequest {

	private String code;

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
}
