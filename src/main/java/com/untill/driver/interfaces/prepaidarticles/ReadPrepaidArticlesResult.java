package com.untill.driver.interfaces.prepaidarticles;

import java.util.ArrayList;
import java.util.List;

/**
 * A result of {@link IPrepaidArticles} <tt>read</tt> operation
 */
public class ReadPrepaidArticlesResult extends PrepaidArticlesResult {

	private List<PrepaidItem> prepaidItems = new ArrayList<>();

	/**
	 * Collection pre-paid articles accessible from unTill(r) POS
	 *
	 * @return list pre-paid articles
	 */
	public List<PrepaidItem> getPrepaidItems() {
		return prepaidItems;
	}

	/**
	 * Set collection pre-paid articles accessible from unTill(r) POS
	 *
	 * @param prepaidItems list pre-paid articles
	 */
	public void setPrepaidItems(List<PrepaidItem> prepaidItems) {
		this.prepaidItems = prepaidItems;
	}

	@Override
	public String toString() {
		return "ReadPrepaidArticlesResult{"
				+ "prepaidItems=" + prepaidItems
				+ "} " + super.toString();
	}
}
