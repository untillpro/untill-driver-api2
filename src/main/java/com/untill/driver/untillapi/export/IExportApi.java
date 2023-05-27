package com.untill.driver.untillapi.export;

import com.untill.driver.IDriverContext;
import com.untill.driver.untillapi.IUntillApi;

/**
 * Use IExportAPI to report the result of the export
 *
 * @see IUntillApi
 * @see IDriverContext
 */
public interface IExportApi extends IUntillApi {
	/**
	 * Reports the result of the export.
	 * Null error indicates successful export
	 *
	 * @param dir directory for the report result
	 * @param error error message or <tt>null</tt>
	 */
	void exportCompleted(String dir, String error);
}
