package com.untill.driver.interfaces.prepaidarticles;

/**
 * This class describes a pre-paid articles
 */
public class PrepaidItem {
	private String groupId;
	private int valueType;
	private int value;
	/**
	 * A 3rd party article ID in unTill, must be specified when {@link PrepaidItem#value} = {@link PrepaidItemValueType#ARTICLE_CREDITS}
	 */
	private String article3rdPartyId;
	/**
	 * A text to display on a button in POS
	 */
	private String displayInfo;
	/**
	 * An additional text to print on a ticket
	 */
	private String printInfo;
	/**
	 * An ID of the prepaid item, can be optionally specified when {@link PrepaidItem#value} = {@link PrepaidItemValueType#ARTICLE_CREDITS}
	 */
	private String itemId;

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

	public String getArticle3rdPartyId() {
		return article3rdPartyId;
	}

	public void setArticle3rdPartyId(String article3rdPartyId) {
		this.article3rdPartyId = article3rdPartyId;
	}

	public String getDisplayInfo() {
		return displayInfo;
	}

	public void setDisplayInfo(String displayInfo) {
		this.displayInfo = displayInfo;
	}

	public String getPrintInfo() {
		return printInfo;
	}

	public void setPrintInfo(String printInfo) {
		this.printInfo = printInfo;
	}

	public String getItemId() {
		return itemId;
	}

	public void setItemId(String itemId) {
		this.itemId = itemId;
	}

	@Override
	public String toString() {
		return "PrepaidItem{"
				+ "groupId='" + groupId + '\''
				+ ", valueType=" + valueType
				+ ", value=" + value
				+ ", article3rdPartyId='" + article3rdPartyId + '\''
				+ ", displayInfo='" + displayInfo + '\''
				+ ", printInfo='" + printInfo + '\''
				+ ", itemId='" + itemId + '\''
				+ '}';
	}
}
