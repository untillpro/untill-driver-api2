package com.untill.driver.untillapi.fingerprint;

/**
 * Represents data related to a fingerprint registered in database.
 * @see IUntillFingerprintsApi
 */
public class UntillFingerprint {

	private Long id;

	private String name;

	private Long userId;

	private byte[] data;

	/**
	 * @return Retutns ID of fingerprint
	 */
	public Long getId() {
		return id;
	}

	/**
	 * Sets fingerprint ID
	 * @param id Fingerprint ID
	 */
	public void setId(Long id) {
		this.id = id;
	}

	/**
	 * @return Returns fingerprint name
	 */
	public String getName() {
		return name;
	}

	/**
	 * Sets fingerprint name
	 * @param name Fingerprint name
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return Returns ID of a user this fingerprint linked to
	 */
	public Long getUserId() {
		return userId;
	}

	/**
	 * Sets ID of a user this fingerprint is linked to
	 * @param userId ID of a user
	 */
	public void setUserId(Long userId) {
		this.userId = userId;
	}

	/**
	 * @return Returns fingerprint data
	 */
	public byte[] getData() {
		return data;
	}

	/**
	 * Sets fingerprint data
	 * @param data Fingerprint data
	 */
	public void setData(byte[] data) {
		this.data = data;
	}

}
