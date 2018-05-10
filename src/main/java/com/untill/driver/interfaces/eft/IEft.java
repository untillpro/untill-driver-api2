package com.untill.driver.interfaces.eft;

import com.untill.driver.IDriver;
import com.untill.driver.interfaces.IDriverInterface;
import com.untill.driver.params.DriverConfiguration;

/**
 * EFT Driver Interface
 * @see IDriverInterface
 * @see IDriver
 */
public interface IEft extends IDriverInterface {

	/**
	 * Returns EFT-driver settings
	 * 
	 * @return operation result
	 * @see EftSettings
	 */
	EftSettings getEftSettings();

	/**
	 * Handles EFT operation and returns result of this operation. Operation is
	 * defined by a type of EftRequest object: {@link EftPaymentRequest},
	 * {@link EftReturnRequest}, {@link EftVoidSaleRequest}, etc}
	 * 
	 * @param cfg
	 *            Driver instance configuration
	 * @param request
	 *            request details
	 * 
	 * @return operation result
	 */
	EftResult operation(DriverConfiguration cfg, EftRequest request);

}
