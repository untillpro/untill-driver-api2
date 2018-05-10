package com.untill.driver.interfaces.hotel;

import com.untill.driver.interfaces.IDriverInterface;
import com.untill.driver.params.DriverConfiguration;

/**
 * Interface for supporting "End of Day" operation of a hotel interface
 */
public interface IHotelSupportsEndOfDay extends IDriverInterface {

	/**
	 * @param cfg Driver Configuration
	 * @return An instanceo of {@link EndOfDayConfiguration}
	 */
	EndOfDayConfiguration getConfiguration(DriverConfiguration cfg);

	/**
	 * Handles "End of Day" operation of a hotel interface
	 * @param cfg Driver Configuration
	 * @param request "End of day" data
	 * @return An instance of {@link HotelEndOfDayResult}
	 */
	HotelEndOfDayResult endOfDay(DriverConfiguration cfg, HotelEndOfDayRequest request);

}
