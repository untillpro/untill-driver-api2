package com.untill.driver.interfaces.tables;

import com.untill.driver.interfaces.IDriverInterface;
import com.untill.driver.params.DriverConfiguration;

/**
 * Tables handler driver interface
 */
public interface ITablesHandler extends IDriverInterface {
	/**
	 * Handles tables operations
	 *
	 * @param cfg driver configuration
	 * @param req request details
	 * @return instance of {@link TablesHandlerResult}
	 */
	TablesHandlerResult operation(DriverConfiguration cfg, TablesHandlerRequest req);
}
