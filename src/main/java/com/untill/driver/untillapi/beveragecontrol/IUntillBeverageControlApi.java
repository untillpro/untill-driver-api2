package com.untill.driver.untillapi.beveragecontrol;

import com.untill.driver.IDriverContext;
import com.untill.driver.untillapi.IUntillApi;

import java.util.List;

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
	 * @deprecated This method works incorrectly. Please use {@link IUntillBeverageControlApi#registerPourings(RegisterPouringRequest)}
	 */
	@Deprecated
	Long registerPouring(RegisterPouringRequest registerPouringRequest);

	/**
	 * Adds records to <tt>VANDUIJNEN</tt> table
	 *
	 * @param registerPouringRequest registration data about beverage pouring
	 * @return list of entities ID
	 */
	List<Long> registerPourings(RegisterPouringRequest registerPouringRequest);
}
