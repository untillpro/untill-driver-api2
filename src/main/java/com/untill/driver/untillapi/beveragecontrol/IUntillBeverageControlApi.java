package com.untill.driver.untillapi.beveragecontrol;

import com.untill.driver.IDriverContext;
import com.untill.driver.untillapi.IUntillApi;

/**
 * UntillAPI for working with Beverage Control
 *
 * @see IUntillApi
 * @see IDriverContext
 */
public interface IUntillBeverageControlApi extends IUntillApi {

	/**
	 * Adds record to <tt>VANDUIJNEN</tt> table
	 *
	 * @param registerPouringRequest registration data about beverage pouring
	 * @return entity ID
	 */
	Long registerPouring(RegisterPouringRequest registerPouringRequest);
}
