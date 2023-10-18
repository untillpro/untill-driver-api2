package com.untill.driver.interfaces.reservation;

import com.untill.driver.interfaces.IDriverInterface;
import com.untill.driver.params.DriverConfiguration;

/**
 * Reservation handler driver interface
 */
public interface IReservationHandler extends IDriverInterface {
	/**
	 * Handles reservation operations
	 *
	 * @param cfg driver configuration
	 * @param req request details
	 * @return instance of {@link ReservationHandlerResult}
	 */
	ReservationHandlerResult operation(DriverConfiguration cfg, ReservationHandlerRequest req);
}
