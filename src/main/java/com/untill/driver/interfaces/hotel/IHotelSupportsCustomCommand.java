package com.untill.driver.interfaces.hotel;

import com.untill.driver.interfaces.IDriverInterface;
import com.untill.driver.params.DriverConfiguration;

/**
 * Interface for supporting "Custom command" operation of a hotel interface
 */
public interface IHotelSupportsCustomCommand extends IDriverInterface {
	/**
	 * Handles "Custom command" operation
	 * @param cfg driver instance configuration
	 * @param request request data
	 * @return result of "Custom command" operation
	 */
	HotelCustomCommandResult executeCustomCommand(DriverConfiguration cfg, HotelCustomCommandRequest request);
}
