package com.untill.driver.interfaces.hotel;

/**
 * Criteria for requesting guest by reservation Id
 * @see GuestLookupCriteria
 */
public class GuestLookupByReservationId extends GuestLookupCriteria {

	private String reservationId;

	/**
	 * @return Returns reservation Id which is used for searching guest
	 */
	public String getReservationId() {
		return reservationId;
	}

	/**
	 * Sets reservation Id for searching guest
	 * 
	 * @param reservationId
	 *            Reservation Id for searching guest
	 */
	public void setReservationId(String reservationId) {
		this.reservationId = reservationId;
	}

}
