package com.untill.driver.interfaces.prepaidarticles;

import java.util.HashMap;
import java.util.Map;

import com.untill.driver.interfaces.DriverResult;

/**
 * Basic class for {@link IPrepaidArticles} results
 */
public abstract class PrepaidArticlesResult extends DriverResult {

	private Map<String, String> data = new HashMap<>();


	/**
	 * Map with some useful parameters accessible from unTill(r) POS
	 *
	 * @return map
	 */
	public Map<String, String> getData() {
		return data;
	}

	/**
	 * Set map with some useful parameters accessible from unTill(r) POS
	 *
	 * @param data map with parameters
	 */
	public void setData(Map<String, String> data) {
		this.data = data;
	}
}
