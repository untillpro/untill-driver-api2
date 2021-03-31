package com.untill.driver.interfaces;

/**
 * Basic class for all driver requests
 */
public class DriverRequest {

	private String guid;

	private String posId;

	/**
	 * @return Returns POS Id (e.g. "POS:PC1", "HHT:192.168.1.21",
	 * "Orderman:12987")
	 */
	public String getPosId() {
		return posId;
	}

	/**
	 * Sets Pos Id
	 *
	 * @param posId PosId to set
	 */
	public void setPosId(String posId) {
		this.posId = posId;
	}

	/**
	 * @return Returns unique request UID
	 */
	public String getGuid() {
		return guid;
	}

	/**
	 * @param guid Guid to set
	 */
	public void setGuid(String guid) {
		this.guid = guid;
	}

	@Override
	public String toString() {
		return "DriverRequest{"
				+ "guid='" + guid + '\''
				+ ", posId='" + posId + '\''
				+ '}';
	}
}
