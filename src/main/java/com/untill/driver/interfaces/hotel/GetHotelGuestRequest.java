package com.untill.driver.interfaces.hotel;

/**
 * A request for "Get Hotel Guest" {@link IHotelInterface} operation
 */
public class GetHotelGuestRequest extends HotelInterfaceRequest {

	private GuestLookupCriteria criteria;

	/**
	 * @return Returns lookup criteria
	 * @see GuestLookupCriteria
	 */
	public GuestLookupCriteria getCriteria() {
		return criteria;
	}

	/**
	 * Sets lookup criteria
	 *
	 * @param criteria A lookup criteria
	 * @see GuestLookupCriteria
	 */
	public void setCriteria(GuestLookupCriteria criteria) {
		this.criteria = criteria;
	}

	@Override
	public String toString() {
		return "GetHotelGuestRequest{"
				+ "criteria=" + criteria
				+ '}';
	}
}
