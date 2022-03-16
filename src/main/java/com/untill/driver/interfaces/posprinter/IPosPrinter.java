package com.untill.driver.interfaces.posprinter;

import com.untill.driver.interfaces.IDriverInterface;
import com.untill.driver.params.DriverConfiguration;

/**
 * POS printer interface
 */
public interface IPosPrinter extends IDriverInterface {

	/**
	 * Handles <tt>POS printer</tt> operation
	 *
	 * @param cfg     driver configuration
	 * @param request request details
	 * @return operation result
	 */
	PosPrinterResult operation(DriverConfiguration cfg, PosPrinterRequest request);
}
