package com.untill.driver.interfaces.hotel;

import com.untill.driver.IDriver;
import com.untill.driver.interfaces.IDriverInterface;
import com.untill.driver.params.DriverConfiguration;

/**
 * Hotel Driver Interface
 * @see IDriverInterface
 * @see IDriver
 */
public interface IHotelInterface extends IDriverInterface {

	/**
	 * Finds all guests matching some criteria provided by
	 * {@link GuestLookupCriteria} descendant.
	 * 
	 * @param cfg
	 *            driver's backoffice configuration
	 * @param request
	 *            {@link GuestLookupCriteria} descendant, implementing certain
	 *            lookup method: can be either {@link GuestLookupByRoom},
	 *            {@link GuestLookupByReservationId} or {@link GuestLookupCustom}
	 * @return Returns lists of guests found by given criteria, or empty list if
	 *         no guests found.
	 * @see HotelGuest
	 * @see DriverConfiguration
	 */
	GetHotelGuestResult getGuests(DriverConfiguration cfg, GetHotelGuestRequest request);

	/**
	 * Charges items to a guest's account.
	 * 
	 * @param cfg
	 *            driver's backoffice configuration
	 * @param request
	 *            Charge request
	 * @throws EHotelGuestNotFound
	 *             when no guest found
	 * @see HotelChargeData
	 * 
	 */
	HotelChargeResult charge(DriverConfiguration cfg, HotelChargeRequest request) throws EHotelGuestNotFound;

}
