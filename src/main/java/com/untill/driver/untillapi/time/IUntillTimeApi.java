package com.untill.driver.untillapi.time;

import java.util.TimeZone;

import com.untill.driver.IDriverContext;
import com.untill.driver.untillapi.IUntillApi;

/**
 * UntillAPI for working with Time
 *
 * @see IUntillApi
 * @see IDriverContext
 */
public interface IUntillTimeApi extends IUntillApi {

	/**
	 * @return Returns the current TimeZone
	 */
	TimeZone getSystemTimeZone();

	/**
	 * Returns working hours
	 *
	 * @return {@link WorkingHours}
	 */
	WorkingHours getWorkingHours();
}
