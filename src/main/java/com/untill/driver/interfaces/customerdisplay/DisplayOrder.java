package com.untill.driver.interfaces.customerdisplay;

import java.util.ArrayList;
import java.util.List;

public class DisplayOrder {
	/**
	 * List of order items
	 */
	private List<DisplayOrderItem> items = new ArrayList<>();

	public List<DisplayOrderItem> getItems() {
		return items;
	}

	public void setItems(List<DisplayOrderItem> items) {
		this.items = items;
	}
}
