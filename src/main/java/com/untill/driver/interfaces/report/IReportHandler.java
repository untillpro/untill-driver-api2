package com.untill.driver.interfaces.report;

import com.untill.driver.interfaces.IDriverInterface;
import com.untill.driver.params.DriverConfiguration;

/**
 * Driver interface for working with reports
 */
public interface IReportHandler extends IDriverInterface {

	/**
	 * Handles report operation and returns result of this operation.
	 *
	 * @param cfg     driver instance configuration
	 * @param request request details
	 * @return operation result
	 */
	ReportHandlerResult operation(DriverConfiguration cfg, ReportHandlerRequest request);
}
