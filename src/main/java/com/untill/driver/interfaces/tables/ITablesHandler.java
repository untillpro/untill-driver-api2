package com.untill.driver.interfaces.tables;

import com.untill.driver.IDriver;
import com.untill.driver.interfaces.IDriverInterface;
import com.untill.driver.params.DriverConfiguration;

/**
 * Tables handler driver interface
 *
 * @see IDriverInterface
 * @see IDriver
 */
public interface ITablesHandler extends IDriverInterface {
	/**
	 * Handles table operations
	 *
	 * @param cfg driver instance configuration
	 * @param req request details
	 */
	void operation(DriverConfiguration cfg, TableChangedRequest req);
}
