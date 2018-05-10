package com.untill.driver.interfaces.paramsvalidation;

import com.untill.driver.interfaces.IDriverInterface;
import com.untill.driver.params.DriverConfiguration;

/**
 * Interface allows validating the driver configuration before it is saved to
 * the database from unTill(r) Backoffice.
 *
 */
public interface IConfigurationValidation extends IDriverInterface {

	/**
	 * Called just before driver configuration saved to the database
	 * 
	 * @param config
	 *            Driver Configuration to be saved
	 * @return Returns an instance of DriverConfiguration which will be saved to
	 *         the database
	 * @throws EConfigurationValidationFailed
	 *             Thrown when validation is failed
	 */
	DriverConfiguration validate(DriverConfiguration config) throws EConfigurationValidationFailed;
}
