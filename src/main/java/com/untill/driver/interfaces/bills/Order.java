package com.untill.driver.interfaces.bills;

import java.util.Date;
import java.util.List;

/**
 * Order data
 */
public class Order {

	/**
	 * Order items {@link OrderItem}
	 */
	private List<OrderItem> items;
	/**
	 * Order number
	 */
	private String orderNumber;
	/**
	 * Timestamp when order was created
	 */
	private Date timestamp;
	/**
	 * Waiter name
	 */
	private String waiterName;
	/**
	 * Waiter "operator ID" which is unique per waiter
	 */
	private String waiterOperatorId;

	public List<OrderItem> getItems() {
		return items;
	}

	public void setItems(List<OrderItem> items) {
		this.items = items;
	}

	public String getOrderNumber() {
		return orderNumber;
	}

	public void setOrderNumber(String orderNumber) {
		this.orderNumber = orderNumber;
	}

	public Date getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(Date timestamp) {
		this.timestamp = timestamp;
	}

	public String getWaiterName() {
		return waiterName;
	}

	public void setWaiterName(String waiterName) {
		this.waiterName = waiterName;
	}

	public String getWaiterOperatorId() {
		return waiterOperatorId;
	}

	public void setWaiterOperatorId(String waiterOperatorId) {
		this.waiterOperatorId = waiterOperatorId;
	}

	@Override
	public String toString() {
		return "Order{"
				+ "items=" + items
				+ ", orderNumber='" + orderNumber + '\''
				+ ", timestamp=" + timestamp
				+ ", waiterName='" + waiterName + '\''
				+ ", waiterOperatorId='" + waiterOperatorId + '\''
				+ '}';
	}
}