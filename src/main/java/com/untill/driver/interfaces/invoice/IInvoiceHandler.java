package com.untill.driver.interfaces.invoice;

import com.untill.driver.interfaces.IDriverInterface;
import com.untill.driver.params.DriverConfiguration;

/**
 * Driver interface for working with invoices
 */
public interface IInvoiceHandler extends IDriverInterface {

	/**
	 * Handles invoice operation and returns result of this operation.
	 *
	 * @param cfg     driver instance configuration
	 * @param request request details
	 * @return operation result
	 */
	InvoiceHandlerResult operation(DriverConfiguration cfg, InvoiceHandlerRequest request);
}
