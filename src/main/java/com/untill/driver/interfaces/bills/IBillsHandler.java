package com.untill.driver.interfaces.bills;

import com.untill.driver.IDriver;
import com.untill.driver.interfaces.IDriverInterface;
import com.untill.driver.params.DriverConfiguration;

import java.util.HashSet;
import java.util.Set;

/**
 * Bills handler driver interface
 *
 * @see IDriverInterface
 * @see IDriver
 */
public interface IBillsHandler extends IDriverInterface {

	/**
	 * Handles unTill bill operation. Operation is defined by
	 * a type of request argument: {@link BillClosingRequest}, {@link BillReOpeningRequest},
	 * {@link BillProformaRequest}, etc.
	 * Returning empty result or null means that operation succeed. Throwing exception shows POS error, preventing
	 * operation from completion in POS (table not closed or not re-opened, proforma not printed, etc)
	 *
	 * @param cfg     Driver instance configuration
	 * @param request Request, including bill
	 * @return Returns instance of BillsHandlerResult or null
	 * @see BillsHandlerRequest
	 */
	BillsHandlerResult operation(DriverConfiguration cfg, BillsHandlerRequest request);

	/**
	 * Returns set of supported requests. By default almost all requests are supported for backward compatibility.
	 * It is possible to change number of supported requests based on driver instance configuration
	 *
	 * @param cfg Driver instance configuration
	 * @return Set of supported requests
	 */
	default Set<Class<? extends BillsHandlerRequest>> supportedRequests(DriverConfiguration cfg) {
		Set<Class<? extends BillsHandlerRequest>> requests = new HashSet<>();
		requests.add(BillClosingRequest.class);
		requests.add(BillReOpeningRequest.class);
		requests.add(BillRePrintingRequest.class);
		requests.add(BillProformaRequest.class);
		requests.add(BillCancelArticlesRequest.class);
		requests.add(BillPaymentByCodeRequest.class);
		requests.add(BillPaymentCancelledRequest.class);
		return requests;
	}
	
	/**
	 * @return Returns the optional settings clarifying the driver behavior
	 * @see BillsHandlerSettings
	 */
	default BillsHandlerSettings getSettings() {
		return new BillsHandlerSettings();
	}
}