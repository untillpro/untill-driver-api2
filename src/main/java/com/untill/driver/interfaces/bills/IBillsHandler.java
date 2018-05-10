package com.untill.driver.interfaces.bills;

import com.untill.driver.IDriver;
import com.untill.driver.interfaces.IDriverInterface;
import com.untill.driver.params.DriverConfiguration;

/**
 * Bills handler driver interface
 * @see IDriverInterface
 * @see IDriver
 * 
 */
public interface IBillsHandler extends IDriverInterface {

	/**
	 * Handles unTill bill operation. Operation is defined by
	 * a type of request argument: {@link BillClosingRequest}, {@link BillReOpeningRequest},
	 * {@link BillProformaRequest}, etc.
	 * Returning empty result or null means that operation succeed. Throwing exception shows POS error, preventing
	 * operation from completion in POS (table not closed or not re-opened, proforma not printed, etc)
	 * 
	 * @param cfg			Driver instance configuration
	 * @param request       Request, including bill
	 * @see BillsHandlerRequest
	 * 
	 */
	BillsHandlerResult operation(DriverConfiguration cfg, BillsHandlerRequest request);

}
