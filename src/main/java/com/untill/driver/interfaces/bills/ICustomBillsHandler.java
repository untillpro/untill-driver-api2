package com.untill.driver.interfaces.bills;

import com.untill.driver.interfaces.IDriverInterface;
import com.untill.driver.params.DriverConfiguration;

/**
 * Driver interface for working with custom bills e.g. {@link VoucherBillClosingRequest voucher bill}
 */
public interface ICustomBillsHandler extends IDriverInterface {

	/**
	 * Handles custom bill operation and returns result of this operation.
	 *
	 * @param cfg     driver instance configuration
	 * @param request request details
	 * @return operation result
	 */
	CustomBillsHandlerResult operation(DriverConfiguration cfg, CustomBillsHandlerRequest request);
}
