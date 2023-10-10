package com.untill.driver.interfaces.tables;

import java.util.ArrayList;
import java.util.List;

public class TablesTransferRequest extends TablesHandlerRequest {
	/**
	 * The table numbers list from which transfer occurs
	 */
	private List<Integer> from = new ArrayList<>();
	/**
	 * The table numbers list to which transfer occurs
	 */
	private List<Integer> to = new ArrayList<>();
	/**
	 * When tables have reservation this field contains reservation ID otherwise this field is <tt>null</tt>
	 */
	private Long reservationId;

	public List<Integer> getFrom() {
		return from;
	}

	public void setFrom(List<Integer> from) {
		this.from = from;
	}

	public List<Integer> getTo() {
		return to;
	}

	public void setTo(List<Integer> to) {
		this.to = to;
	}

	public Long getReservationId() {
		return reservationId;
	}

	public void setReservationId(Long reservationId) {
		this.reservationId = reservationId;
	}
}
