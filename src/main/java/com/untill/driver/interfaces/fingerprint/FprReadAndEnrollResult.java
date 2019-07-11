package com.untill.driver.interfaces.fingerprint;

/**
 * {@link IFingerPrintReader} "Read and enroll" function result
 *
 */
public class FprReadAndEnrollResult extends FprReaderResult {

	private byte[] data;

	/**
	 * @return Returns the binary data of a fingerprint
	 */
	public byte[] getData() {
		return data;
	}

	/**
	 * Sets the binary data of a fingerprint
	 * @param data Binary data
	 */
	public void setData(byte[] data) {
		this.data = data;
	}

}
