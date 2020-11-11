package com.untill.driver;

/**
 * Declares progress query kinds
 * 
 * @see IDriverProgress#showQuery
 * 
 */
public enum ProgressQueryType {

	/**
	 * A text query with two buttons: YES or NO.
	 * {@link IDriverProgress#getQueryResult} returns "yes" or "no"
	 */
	YES_NO(1),

	/**
	 * A general-purpose query which is used for request-response communication between driver and POS terminal.
	 * The title isn't displayed by POS terminal and used by terminal which executes some action(s) and send response which 
	 * is obtained with {@link IDriverProgress#getQueryResult}
	 */
	CUSTOM(2);

	ProgressQueryType(int type) {
		this.type = type;
	}

	private int type;

	public int getType() {
		return type;
	}

	public static ProgressQueryType getByValue(int i) {
		for (ProgressQueryType type : ProgressQueryType.values()) {
			if (type.getType() == i) {
				return type;
			}
		}
		throw new IllegalArgumentException("There is no value = " + i + " in ProgressQueryType");
	}

}
