package com.untill.driver.untillapi.reasons;

import com.untill.driver.IDriverContext;
import com.untill.driver.untillapi.IUntillApi;

/**
 * UntillAPI for working with reasons
 *
 * @see IUntillApi
 * @see IDriverContext
 */
public interface IUntillReasonsApi extends IUntillApi {

	/**
	 * @param guid void-reason or discount-reason GUID
	 * @return Returns ID of reason or null when reason not found by GUID
	 */
	Long getReasonIdByGuid(String guid);

	/**
	 * Returns void-reason or discount-reason by GUID if reason not found returns null
	 *
	 * @param guid void-reason or discount-reason GUID
	 * @return {@link Reason}
	 */
	Reason getReasonByGuid(String guid);
}
