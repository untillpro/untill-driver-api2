package com.untill.driver.interfaces.cash;

import com.untill.driver.interfaces.IDriverInterface;
import com.untill.driver.params.DriverConfiguration;

/**
 * Driver interface for working with cash
 */
public interface ICashHandler extends IDriverInterface {

	/**
	 * Handles cash operation and returns result of this operation.
	 *
	 * @param cfg     driver instance configuration
	 * @param request request details
	 * @return operation result
	 */
	CashHandlerResult operation(DriverConfiguration cfg, CashHandlerRequest request);
}
