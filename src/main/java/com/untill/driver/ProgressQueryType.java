package com.untill.driver;

/**
 * Declares progress query kinds
 *
 * @see IDriverProgress#showQuery
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
	CUSTOM(2),
	/**
	 * A query that prompt the user to enter text on POS screen.
	 * {@link IDriverProgress#getQueryResult} returns entered text
	 */
	TEXT(3),
	/**
	 * User have to provide his signature within 45 seconds. The signature is returned as a string containing Base64-encoded image.
	 * {@link IDriverProgress#getQueryResult} returns signature as a string containing Base64-encoded image
	 */
	SIGNATURE_MANDATORY(4),
	/**
	 * User can provide his signature or press <b>"Cancel"</b> which returns empty string. The signature is returned as a string containing Base64-encoded image.
	 * {@link IDriverProgress#getQueryResult} returns signature as a string containing Base64-encoded image
	 */
	SIGNATURE_OPTIONAL(5);

	ProgressQueryType(int type) {
		this.type = type;
	}

	private final int type;

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
