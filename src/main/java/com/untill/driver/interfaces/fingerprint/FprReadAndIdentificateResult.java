package com.untill.driver.interfaces.fingerprint;

/**
 * {@link IFingerPrintReader} "Read and identificate" function result
 *
 */
public class FprReadAndIdentificateResult extends FprReaderResult {

	private Long userId;

	/**
	 * @return Returns ID of a user identified
	 */
	public Long getUserId() {
		return userId;
	}

	/**
	 * Sets ID of a user identified
	 * @param userId User Id
	 */
	public void setUserId(Long userId) {
		this.userId = userId;
	}

}
