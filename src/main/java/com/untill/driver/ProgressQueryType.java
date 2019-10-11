package com.untill.driver;

/**
 * Declares progress query kinds
 * @see IDriverProgress#showQuery
 * 
 */
public enum ProgressQueryType {

	/**
	 * A text query with two buttons: YES or NO.  {@link IDriverProgress#getQueryResult} returns "y" or "n"
	 */
	YES_NO(1);

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
