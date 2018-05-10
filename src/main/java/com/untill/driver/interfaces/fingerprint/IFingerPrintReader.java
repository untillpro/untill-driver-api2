package com.untill.driver.interfaces.fingerprint;

import com.untill.driver.IDriver;
import com.untill.driver.interfaces.IDriverInterface;
import com.untill.driver.params.DriverConfiguration;
import com.untill.driver.untillapi.fingerprint.IUntillFingerprintsApi;

/**
 * Fingerprint reader driver interface
 * @see IDriverInterface
 * @see IDriver
 */
public interface IFingerPrintReader extends IDriverInterface {

	/**
	 * This method called in a loop when unTill(r) POS launched. A timeout
	 * passed in {@link FprReadAndIdentiticateRequest}, driver must keep waiting
	 * for a fingerprint during this timeout.
	 * <ul>
	 * <li>As soon as fingerprint read, driver uses
	 * {@link IUntillFingerprintsApi} API to read all fingerprints from
	 * database. Driver then compares fingerprint which is read with the list
	 * from database and if match found, it returns userId in
	 * {@link FprReadAndIdentificateResult}.</li>
	 * <li>If no match found or no fingerprint read during timeout, driver
	 * returns {@link FprReadAndIdentificateResult} with null as userId.</li>
	 * </ul>
	 * 
	 * @param cfg Driver Configuration
	 * @param request Read and identificate request
	 * @return An instance of {@link FprReadAndIdentificateResult}.
	 * UserId must be null if user is not identified during a timeout.
	 * @see FprReadAndIdentiticateRequest
	 * @see FprReadAndIdentificateResult
	 */
	FprReadAndIdentificateResult readAndIdentificate(DriverConfiguration cfg, FprReadAndIdentiticateRequest request);

	/**
	 * Called when operator adds a new fingerprint to certain user.
	 * Driver must handle fingerprint reading and return fingerprint data in {@link FprReadAndEnrollResult}.
	 * This data is then stored in unTill(r) database.
	 * In case when reading is interrupted by user, function returns empty data in {@link FprReadAndEnrollResult}.
	 * @param cfg Driver Configuration
	 * @param request Read and enroll request
	 * @return An instance of {@link FprReadAndEnrollResult}. Data must be non-empty if fingerprint read successfully.
	 * @see FprReadAndEnrollRequest
	 * @see FprReadAndEnrollResult
	 */
	FprReadAndEnrollResult readAndEnroll(DriverConfiguration cfg, FprReadAndEnrollRequest request);

}
