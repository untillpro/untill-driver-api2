package com.untill.driver.interfaces.prepaidarticles;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * A request for {@link IPrepaidArticles} <tt>charge</tt> operation
 */
public class ChargePrepaidArticlesRequest extends PrepaidArticlesRequest {

	private String code;

	private Map<String, String> data = new HashMap<>();

	private List<PrepaidItem> prepaidItems = new ArrayList<>();

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

	/**
	 * Map with some useful parameters accessible from driver
	 *
	 * @return map with parameters
	 */
	public Map<String, String> getData() {
		return data;
	}

	/**
	 * Set map with some useful parameters accessible from driver
	 *
	 * @param data map with parameters
	 */
	public void setData(Map<String, String> data) {
		this.data = data;
	}

	/**
	 * Collection pre-paid articles
	 *
	 * @return list with pre-paid articles
	 */
	public List<PrepaidItem> getPrepaidItems() {
		return prepaidItems;
	}

	/**
	 * Set collection pre-paid articles
	 *
	 * @param prepaidItems list with pre-paid articles
	 */
	public void setPrepaidItems(List<PrepaidItem> prepaidItems) {
		this.prepaidItems = prepaidItems;
	}

	@Override
	public String toString() {
		return "ChargePrepaidArticlesRequest{"
				+ "code='" + code + '\''
				+ ", data=" + data
				+ ", prepaidItems=" + prepaidItems
				+ "} " + super.toString();
	}
}
