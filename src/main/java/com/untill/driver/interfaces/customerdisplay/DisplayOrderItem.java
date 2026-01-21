package com.untill.driver.interfaces.customerdisplay;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class DisplayOrderItem {
	private int quantity;
	private BigDecimal singlePrice;
	private String name;
	/**
	 * Child items, optional
	 */
	private List<DisplayOrderItem> items = new ArrayList<>();

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public BigDecimal getSinglePrice() {
		return singlePrice;
	}

	public void setSinglePrice(BigDecimal singlePrice) {
		this.singlePrice = singlePrice;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<DisplayOrderItem> getItems() {
		return items;
	}

	public void setItems(List<DisplayOrderItem> items) {
		this.items = items;
	}
}
