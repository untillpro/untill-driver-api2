package com.untill.driver.interfaces.prepaidarticles;

/**
 * This class describes a pre-paid articles
 */
public class PrepaidItem {

	private String groupId;
	private int valueType;
	private int value;
	private String article3rdPartyId;

	/**
	 * Group ID pre-paid articles accessible
	 *
	 * @return group ID
	 */
	public String getGroupId() {
		return groupId;
	}

	/**
	 * Set group ID pre-paid articles accessible
	 *
	 * @param groupId group ID
	 */
	public void setGroupId(String groupId) {
		this.groupId = groupId;
	}

	/**
	 * This type describes the measure units. Supported types {@link PrepaidItemValueType}
	 *
	 * @return value type
	 */
	public int getValueType() {
		return valueType;
	}

	/**
	 * Set type measure
	 *
	 * @param valueType type measure {@link #getValueType() getValueType}
	 */
	public void setValueType(int valueType) {
		this.valueType = valueType;
	}

	/**
	 * Available pieces or price without decimal point (in cents)
	 *
	 * @return available pieces or total price without decimal point (in cents)
	 */
	public int getValue() {
		return value;
	}

	/**
	 * Set available pieces or total price without decimal point (in cents)
	 *
	 * @param value available pieces or total price without decimal point (in cents)
	 */
	public void setValue(int value) {
		this.value = value;
	}

	/**
	 * Get article third party ID
	 *
	 * @return article third party ID
	 */
	public String getArticle3rdPartyId() {
		return article3rdPartyId;
	}

	/**
	 * Set article third party ID
	 *
	 * @param article3rdPartyId article third party ID
	 */
	public void setArticle3rdPartyId(String article3rdPartyId) {
		this.article3rdPartyId = article3rdPartyId;
	}

	@Override
	public String toString() {
		return "PrepaidItem{"
				+ "groupId='" + groupId + '\''
				+ ", valueType=" + valueType
				+ ", value=" + value
				+ ", article3rdPartyId='" + article3rdPartyId + '\''
				+ '}';
	}
}
