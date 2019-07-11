package com.untill.driver.interfaces.eft;

/**
 * Used for cancelling some transaction:
 * <ul>
 * <li>Gift Card Activation ({@link EftGiftCardActivateRequest})</li>
 * <li>Gift Card Deactivation ({@link EftGiftCardDeactivateRequest})</li>
 * <li>Gift Card Reload ({@link EftGiftCardReadRequest})</li>
 * <li>Gift Card Purchase ({@link EftGiftCardPaymentRequest}) when bill
 * re-opened and {@link EftSettings#getReopenPolicy()} is
 * {@link EftSettings#REOPEN_POLICY_VOID_SALE} or
 * {@link EftSettings#REOPEN_POLICY_VOID_WITHIN_SAME_DAY} and bill re-opened within the same day</li>
 * </ul>
 * Driver responds with {@link EftResult} or throws RuntimeException. 
 *
 */
public class EftGiftCardCancelRequest extends EftGiftCardModifyTransactionRequest {

}
