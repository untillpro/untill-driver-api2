package com.untill.driver.untillapi.fingerprint;

import java.util.List;

import com.untill.driver.IDriver;
import com.untill.driver.IDriverContext;
import com.untill.driver.interfaces.fingerprint.IFingerPrintReader;
import com.untill.driver.untillapi.IUntillApi;

/**
 * Fingerprint API interface
 * @see IUntillApi
 * @see IDriverContext
 */
public interface IUntillFingerprintsApi extends IUntillApi {

	/**
	 * Returns the list of fingerprints registered in database
	 * @param driverClass A class of {@link IFingerPrintReader} driver. Only those fingerprints returned
	 * which has been created by this certain driver.
	 * @return List of {@link UntillFingerprint} objects
	 */
	List<UntillFingerprint> getAllFingerprints(Class<? extends IDriver> driverClass);

}
