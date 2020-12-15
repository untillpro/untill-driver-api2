package com.untill.driver.untillapi.takeaway;

import com.untill.driver.IDriverContext;
import com.untill.driver.untillapi.IUntillApi;

/**
 * UntillAPI for working with Take-away Orders
 * @see IUntillApi
 * @see IDriverContext
 *
 */
public interface IUntillTakeawayOrders extends IUntillApi {
	
	/**
	 * Returns take-away status for the order specified by externalId 
	 * @param externalId An external Id of the order
	 * @return Returns take-away status of the order
	 * @throws ETakeawayOrderNotFound when order by given externalId is not found
	 */
	TakeawayOrderStatus getOrderStatus(String externalId) throws ETakeawayOrderNotFound;

}
