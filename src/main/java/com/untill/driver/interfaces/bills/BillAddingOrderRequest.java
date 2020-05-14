package com.untill.driver.interfaces.bills;

/**
 * Class representing a request for "Add order" operation handled by {@link IBillsHandler}}
 *
 * @see IBillsHandler
 * @see BillsHandlerRequest
 */
public class BillAddingOrderRequest extends BillsHandlerRequest {

	/**
	 * Bill's order
	 */
	private Order order;

	public Order getOrder() {
		return order;
	}

	public void setOrder(Order order) {
		this.order = order;
	}

	@Override
	public String toString() {
		return "BillAddingOrderRequest{"
				+ "order=" + order
				+ "} " + super.toString();
	}
}
