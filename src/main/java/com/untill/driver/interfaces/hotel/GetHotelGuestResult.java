package com.untill.driver.interfaces.hotel;

import java.util.ArrayList;
import java.util.List;

/**
 * A result of "Get Hotel Guest" {@link IHotelInterface} operation
 *
 */
public class GetHotelGuestResult extends HotelInterfaceResult {

	private List<HotelGuest> guests = new ArrayList<HotelGuest>();

	/**
	 * @return Returns the list of guests matched to the criteria, or empty list
	 *         when no guest found
	 */
	public List<HotelGuest> getGuests() {
		return guests;
	}

	public void setGuests(List<HotelGuest> guests) {
		this.guests = guests;
	}

}
