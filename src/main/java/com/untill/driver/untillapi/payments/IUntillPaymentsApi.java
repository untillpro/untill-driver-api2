package com.untill.driver.untillapi.payments;

import com.untill.driver.IDriverContext;
import com.untill.driver.untillapi.IUntillApi;

/**
 * UntillAPI for working with payments
 * @see IUntillApi
 * @see IDriverContext
 */
public interface IUntillPaymentsApi {
	
	/**
	 * @param guid Payment GUID
	 * @return Returns ID of payment or null when payment not found by GUID
	 */
	Long getPaymentIdByGuid(String guid);

}
