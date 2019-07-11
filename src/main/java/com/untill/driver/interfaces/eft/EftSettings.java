package com.untill.driver.interfaces.eft;

import com.untill.driver.IDriverProgress;

/**
 * An instance of this class returned by {@link IEft}.getEftSettings to specify some details of driver behavior. 
 *
 * @see IEft
 */
public class EftSettings {

	protected static final int DEFAULT_WAIT_TIMEOUT = 90000;

	private boolean tipsReplaced = false;

	private boolean tipsIncludedInReturn = true;

	@Deprecated
	private boolean voidWhenSameDay = false;

	private boolean cancellingByWaiterSupported = false;

	private int waitTimeout = DEFAULT_WAIT_TIMEOUT;
	
	/**
	 * Always return funds when bill re-opened: {@link EftReturnRequest} or {@link EftGiftCardReloadRequest} (for gift cards) 
	 */
	public static final String REOPEN_POLICY_RETURN_FUNDS = "return-funds"; 
	/**
	 * Always use VoidSale when bill re-opened: {@link EftVoidSaleRequest} or {@link EftGiftCardCancelRequest} (for gift cards)
	 */
	public static final String REOPEN_POLICY_VOID_SALE = "void-sale";
	/**
	 * VOID must be used instead of RETURN when
	 * re-opening in the timerange of the same working day
	 */
	public static final String REOPEN_POLICY_VOID_WITHIN_SAME_DAY = "void-within-same-day";

	private String reopenPolicy = null;
	
	/**
	 * Defines which operation must be made when bill is re-opened
	 * @return Re-open policy
	 * @see EftSettings#REOPEN_POLICY_RETURN_FUNDS
	 * @see EftSettings#REOPEN_POLICY_VOID_SALE
	 * @see EftSettings#REOPEN_POLICY_VOID_WITHIN_SAME_DAY
	 */
	public String getReopenPolicy() {
		return reopenPolicy;
	}

	/**
	 * Defines which operation must be made when bill is re-opened. 
	 * When not defined, unTill returns funds using {@link EftReturnRequest} or {@link EftGiftCardReloadRequest} (for gift cards).
	 * AvailablePolicies are: <ul>
	 * 	<li>{@link #REOPEN_POLICY_RETURN_FUNDS}</li>
	 * 	<li>{@link #REOPEN_POLICY_VOID_SALE}</li>
	 * 	<li>{@link #REOPEN_POLICY_VOID_WITHIN_SAME_DAY}</li>
	 * </ul>
	 * @param reopenPolicy Reopen Policy 
	 */
	public void setReopenPolicy(String reopenPolicy) {
		this.reopenPolicy = reopenPolicy;
	}

	/**
	 * @return Returns timeout in milliseconds telling how long unTill waits for
	 *         an answer from driver before it shows "Timeout" error. Default timeout
	 *         is 90000.
	 */
	public int getWaitTimeout() {
		return waitTimeout;
	}

	/**
	 * Sets timeout telling how long unTill waits for an answer
	 * from driver before it shows "Timeout" error
	 * @param waitTimeout Timeout, in milliseconds
	 */
	public void setWaitTimeout(int waitTimeout) {
		this.waitTimeout = waitTimeout;
	}

	/**
	 * @return Returns true if EFT driver supports cancelling operation by
	 *         waiter (at ECR side).
	 * @see IDriverProgress
	 */
	public boolean isCancellingByWaiterSupported() {
		return cancellingByWaiterSupported;
	}

	/**
	 * Allows specifying if EFT driver supports cancelling operation by waiter (at
	 * ECR side). When true, unTill(r) POS shows "Cancel" button on a progress dialog. 
	 * Driver must request {@link IDriverProgress#isCancelRequested(String)} to see if "Cancel" pressed by operator. 
	 * 
	 * @param cancellingByWaiterSupported True if cancelling by waiter is supported by driver
	 */
	public void setCancellingByWaiterSupported(boolean cancellingByWaiterSupported) {
		this.cancellingByWaiterSupported = cancellingByWaiterSupported;
	}

	public EftSettings() {
	}

	/**
	 * @return Returns true if each {@link EftTipsRequest} operation replaces
	 *         previous tips amount for the transaction, false if it adds new
	 *         amount
	 */
	public boolean isTipsReplaced() {
		return tipsReplaced;
	}

	/**
	 * Indicates if each {@link EftTipsRequest} operation replaces previous tips
	 * amount for the transaction (true) or adds amount (false)
	 * 
	 * @param tipsReplaced True if tips are replaced, false if tips are added
	 */
	public void setTipsReplaced(boolean tipsReplaced) {
		this.tipsReplaced = tipsReplaced;
	}

	/**
	 * @return Returns true when tips amount included (if exists) in RETURN or
	 *         VOID request
	 */
	public boolean isTipsIncludedInReturn() {
		return tipsIncludedInReturn;
	}

	/**
	 * Indicates if tip amount must be included (if exists) in the amount of Return request
	 * 
	 * @param tipsIncludedInReturn True when tip amount must be addedto the payment amount in Return request
	 */
	public void setTipsIncludedInReturn(boolean tipsIncludedInReturn) {
		this.tipsIncludedInReturn = tipsIncludedInReturn;
	}

	/**
	 * @deprecated Use {@link EftSettings}.REOPEN_POLICY
	 * @return Returns true when VOID must be used instead of RETURN when
	 *         re-opening in the timerange of the same working day
	 */
	@Deprecated 
	public boolean isVoidWhenSameDay() {
		return voidWhenSameDay;
	}

	/**
	 * indicates if "void" operation must be used instead of "return" when
	 * re-opening bill within the same working hours (true). Otherwise (false)
	 * "return" operation executed
	 * 
	 * @param voidWhenSameDay
	 * @deprecated Use {@link EftSettings}.REOPEN_POLICY
	 */
	@Deprecated
	public void setVoidWhenSameDay(boolean voidWhenSameDay) {
		this.voidWhenSameDay = voidWhenSameDay;
	}

	public static class Builder {
		private EftSettings s = new EftSettings();

		public Builder() {
		}

		public Builder setVoidWhenSameDay(boolean voidWhenSameDay) {
			s.setVoidWhenSameDay(voidWhenSameDay);
			return this;
		}

		public Builder setTipsIncludedInReturn(boolean tipsIncludedInReturn) {
			s.setTipsIncludedInReturn(tipsIncludedInReturn);
			return this;
		}

		public Builder setTipsReplaced(boolean tipsReplaced) {
			s.setTipsReplaced(tipsReplaced);
			return this;
		}

		public Builder setCancellingByWaiterSupported(boolean cancellingByWaiterSupported) {
			s.setCancellingByWaiterSupported(cancellingByWaiterSupported);
			return this;
		}

		public Builder setWaitTimeout(int waitTimeout) {
			s.setWaitTimeout(waitTimeout);
			return this;
		}

		public EftSettings build() {
			return s;
		}
	}
}
