package com.untill.driver.interfaces.cashmachine;

import com.untill.driver.interfaces.IDriverInterface;
import com.untill.driver.params.DriverConfiguration;

/**
 * Driver interface for handling cash operations with cash-machines
 */
public interface ICashMachine extends IDriverInterface {
	/**
	 * Returns cash-machine driver settings
	 *
	 * @return driver settings
	 */
	CashMachineSettings getSettings();

	/**
	 * Handles cash-machine operation and returns result of this operation
	 *
	 * @param cfg driver instance configuration
	 * @param req request details
	 * @return operation result
	 */
	CashMachineResult operation(DriverConfiguration cfg, CashMachineRequest req);
}