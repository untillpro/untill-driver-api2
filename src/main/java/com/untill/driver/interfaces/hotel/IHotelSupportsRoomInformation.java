package com.untill.driver.interfaces.hotel;

import com.untill.driver.interfaces.IDriverInterface;
import com.untill.driver.params.DriverConfiguration;

/**
 * Interface for the interfaces which support "Get Room Information"
 *
 */
public interface IHotelSupportsRoomInformation extends IDriverInterface {

	/**
	 * Finds room which is associated to client, matching some criteria provided
	 * by {@link GuestLookupCriteria} descendant. This functionality is optional.
	 * 
	 * @param cfg
	 *            Driver configuration
	 * @param request
	 *            Get Hotel Room Request
	 * @return Returns room information found by given criteria, or null when no room found for provided request
	 * @see GetHotelRoomResult
	 * @see DriverConfiguration
	 */
	GetHotelRoomResult getHotelRoom(DriverConfiguration cfg, GetHotelRoomReqest request);

}
