package com.untill.driver.interfaces.timeattendance;

import com.untill.driver.interfaces.IDriverInterface;
import com.untill.driver.params.DriverConfiguration;

/**
 * Driver interface for working with <tt>TA</tt> (Time and attendance)
 */
public interface ITimeAttendance extends IDriverInterface {

	/**
	 * Handles <tt>TA</tt> operation and returns result of this operation
	 *
	 * @param cfg     driver instance configuration
	 * @param request request details
	 * @return operation result
	 */
	TAResult operation(DriverConfiguration cfg, TARequest request);
}
