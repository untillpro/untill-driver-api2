package com.untill.driver.params;

import java.util.HashMap;
import java.util.Map;

/**
 * User defined backoffice settings of a driver instance
 * 
 */
public class DriverConfiguration {

	private Map<String, String> params = new HashMap<>();

	private String configurationGuid;

	/**
	 * @return Returns configuration parameters
	 */
	public Map<String, String> getParams() {
		return params;
	}

	public void setParams(Map<String, String> params) {
		this.params = params;
	}

	/**
	 * @return Returns unique configuraion UID
	 */
	public String getConfigurationGuid() {
		return configurationGuid;
	}

	/**
	 * Sets unique configuraion UID
	 * @param configurationGuid
	 */
	public void setConfigurationGuid(String configurationGuid) {
		this.configurationGuid = configurationGuid;
	}

	@Override
	public String toString() {
		StringBuilder str = new StringBuilder();
		str.append(String.format("DriverConfiguration: %s:\n", configurationGuid));
		for (Object key : params.keySet())
			str.append(key.toString() + ": " + params.get(key) + "\n");
		return str.toString();
	}

}
