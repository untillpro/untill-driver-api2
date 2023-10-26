package com.untill.driver.interfaces.reservation;

import com.untill.driver.interfaces.IDriverInterface;
import com.untill.driver.params.DriverConfiguration;

/**
 * Reservation handler driver interface
 */
public interface IReservationHandler extends IDriverInterface {
	/**
	 * This method called when reservation updated
	 *
	 * @param cfg driver configuration
	 * @param id  updated reservation ID
	 */
	void reservationUpdated(DriverConfiguration cfg, Long id);
}
