package com.untill.driver.untillapi.db;

import com.untill.driver.IDriverContext;
import com.untill.driver.untillapi.IUntillApi;

/**
 * UntillAPI for working with Database
 *
 * @see IUntillApi
 * @see IDriverContext
 */
public interface IUntillDbApi extends IUntillApi {

	/**
	 * @return Generates and returns the next ID in current database
	 */
	Long getNextId();

	/**
	 * @return Returns GUID of the current database
	 */
	String getGuid();

	/**
	 * Returns name of the current database
	 *
	 * @return name of the current database
	 */
	String getName();
}
