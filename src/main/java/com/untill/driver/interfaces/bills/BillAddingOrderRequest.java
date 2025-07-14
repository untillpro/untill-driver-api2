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
	/**
	 * When the bill has associated reservation, this field is filled otherwise it is <tt>null</tt>
	 */
	private Long reservationId;

	public Order getOrder() {
		return order;
	}

	public void setOrder(Order order) {
		this.order = order;
	}

	public Long getReservationId() {
		return reservationId;
	}

	public void setReservationId(Long reservationId) {
		this.reservationId = reservationId;
	}

	@Override
	public String toString() {
		return "BillAddingOrderRequest{"
				+ "order=" + order
				+ ", reservationId=" + reservationId
				+ "} " + super.toString();
	}
}
