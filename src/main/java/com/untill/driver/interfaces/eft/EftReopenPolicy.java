package com.untill.driver.interfaces.eft;

public enum EftReopenPolicy {
	
	/**
	 * Always return funds when bill re-opened: {@link EftReturnRequest} or {@link EftGiftCardReloadRequest} (for gift cards) 
	 */
	RETURN_FUNDS, 
	/**
	 * Always use VoidSale when bill re-opened: {@link EftVoidSaleRequest} or {@link EftGiftCardCancelRequest} (for gift cards)
	 */
	VOID_SALE,
	/**
	 * VOID must be used instead of RETURN when
	 * re-opening in the timerange of the same working day
	 */
	VOID_WITHIN_SAME_DAY

}
