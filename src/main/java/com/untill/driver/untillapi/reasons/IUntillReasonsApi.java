package com.untill.driver.untillapi.reasons;

import com.untill.driver.IDriverContext;
import com.untill.driver.untillapi.IUntillApi;

/**
 * UntillAPI for working with reasons
 * @see IUntillApi
 * @see IDriverContext
 */
public interface IUntillReasonsApi {

	/**
	 * @param guid void-reason or discount-reason GUID
	 * @return Returns ID of reason or null when reason not found by GUID
	 */
	Long getReasonIdByGuid(String guid);

}
