package com.untill.driver.untillapi.dbstorage;

public class StorageItem {
	/**
	 * Driver configuration GUID
	 */
	private String configurationGuid;
	/**
	 * Data bytes
	 */
	private byte[] data;

	public String getConfigurationGuid() {
		return configurationGuid;
	}

	public void setConfigurationGuid(String configurationGuid) {
		this.configurationGuid = configurationGuid;
	}

	public byte[] getData() {
		return data;
	}

	public void setData(byte[] data) {
		this.data = data;
	}
}
