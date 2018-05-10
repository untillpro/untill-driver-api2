package com.untill.driver.interfaces.hotel;

/**
 * A request for "Get Hotel Room" {@link IHotelSupportsRoomInformation} operation
 *
 */
public class GetHotelRoomReqest extends HotelInterfaceRequest {

	private GuestLookupCriteria criteria;

	/**
	 * @return Returns lookup criteria
	 */
	public GuestLookupCriteria getCriteria() {
		return criteria;
	}

	public void setCriteria(GuestLookupCriteria criteria) {
		this.criteria = criteria;
	}

}
