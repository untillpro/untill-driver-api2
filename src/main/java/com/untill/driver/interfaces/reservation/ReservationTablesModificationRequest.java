package com.untill.driver.interfaces.reservation;

import java.util.ArrayList;
import java.util.List;

public class ReservationTablesModificationRequest extends ReservationHandlerRequest {
	/**
	 * The table numbers list before modification
	 */
	private List<Integer> before = new ArrayList<>();
	/**
	 * The table numbers list after modification
	 */
	private List<Integer> after = new ArrayList<>();
	/**
	 * Reservation ID
	 */
	private Long reservationId;

	public List<Integer> getBefore() {
		return before;
	}

	public void setBefore(List<Integer> before) {
		this.before = before;
	}

	public List<Integer> getAfter() {
		return after;
	}

	public void setAfter(List<Integer> after) {
		this.after = after;
	}

	public Long getReservationId() {
		return reservationId;
	}

	public void setReservationId(Long reservationId) {
		this.reservationId = reservationId;
	}
}
