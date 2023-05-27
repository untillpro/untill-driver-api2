package com.untill.driver.interfaces.task;

import com.untill.driver.interfaces.IDriverInterface;
import com.untill.driver.params.DriverConfiguration;

/**
 * Driver interface for working with exports
 */
public interface IExportHandler extends IDriverInterface {
	/**
	 * Method starts export with provided configurations.
	 * startExport shouldn't take long, it may initiate the export (f.e. using the periodical tasks approach) and return before export is finished.
	 * When export finished, driver calls {@link com.untill.driver.untillapi.export.IExportApi#exportCompleted(String, String)}
	 *
	 * @param cfg  driver instance configuration
	 * @param eCfg export configuration
	 */
	void startExport(DriverConfiguration cfg, ExportConfig eCfg);
}
