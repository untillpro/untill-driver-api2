package com.untill.driver.interfaces.bills;

/**
 * Contain keys for {@link Bill#getExtra()}
 */

public abstract class BillExtra {
	/**
	 * Folio number of a guest linked to the bill. Guest is normally linked to "Hotel interface" in unTill
	 */
	public static final String GUEST_FOLIO_NUMBER = "GuestFolioNumber";
	public static final String EXTRA_1 = "extra1";
	public static final String EXTRA_2 = "extra2";
	public static final String EXTRA_3 = "extra3";
	public static final String EXTRA_4 = "extra4";
	public static final String EXTRA_5 = "extra5";
	public static final String EXTRA_6 = "extra6";
	public static final String EXTRA_7 = "extra7";
	public static final String EXTRA_8 = "extra8";
	public static final String EXTRA_9 = "extra9";
	public static final String EXTRA_10 = "extra10";
	/**
	 * When the value is set, it means that bill has deposit article with this ID. Deposit article is specified in the backoffice: Restaurant - Restaurant settings - Reservation - Deposit article
	 */
	public static final String DEPOSIT_ARTICLE_ID = "DepositArticleID";
	/**
	 * ID of the transaction that was transferred and closed
	 */
	public static final String TRANSFERRED_FROM_TRANSACTION_ID = "transfered_from_transaction_id";
	/**
	 * When <b>False</b> it means that all articles moved from source table to destination table and source transaction is closed.
	 * When <b>True</b> it means that some articles moved from source table to destination table and source transaction is opened
	 */
	public static final String PARTLY_TRANSFERRED = "partly_transferred";
}