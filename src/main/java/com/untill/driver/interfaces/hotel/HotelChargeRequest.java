package com.untill.driver.interfaces.hotel;

/**
 * A request for {@link IHotelInterface} "charge" operation
 *
 */
public class HotelChargeRequest extends HotelInterfaceRequest {

	private HotelChargeData data;

	private GuestLookupCriteria criteria;

	private short requestKind;

	/**
	 * @return Returns 1 for normal sale, -1 when bill is re-opened (return)
	 */
	public short getRequestKind() {
		return requestKind;
	}

	public void setRequestKind(short requestKind) {
		this.requestKind = requestKind;
	}

	/**
	 * @return Returns guest lookup criteria. Either
	 *         {@link GuestLookupByReservationId} or {@link GuestLookupByRoom}
	 *         passed to this method, depending if client has reservationId
	 *         filled or not.
	 */
	public GuestLookupCriteria getCriteria() {
		return criteria;
	}

	public void setCriteria(GuestLookupCriteria criteria) {
		this.criteria = criteria;
	}

	/**
	 * @return Returns charge data
	 */
	public HotelChargeData getData() {
		return data;
	}

	public void setData(HotelChargeData data) {
		this.data = data;
	}

}
