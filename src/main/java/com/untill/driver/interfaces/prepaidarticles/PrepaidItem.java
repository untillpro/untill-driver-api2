package com.untill.driver.interfaces.prepaidarticles;

/**
 * This class describes a pre-paid articles
 */
public class PrepaidItem {

	private String groupId;
	private int valueType;
	private int value;

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
	 * This type describes a measure pre-paid articles <br>
	 * <b>0</b> - pieces <br>
	 * <b>1</b> - price <br>
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
}
