# Bills Handler - IBillsHandler

Interface implements single method `operation` which gets called with an instance of a class derived from `BillsHandlerRequest`, depending on the POS event: 

- `BillClosingRequest` when bill is closed (printed);
- `BillReOpeningRequest` when bill is re-opened;
- `BillRePrintingRequest` when bill is re-printed;
- `BillProformaRequest` when proforma is printed.

Every request contains bill structure: items, payments, etc. For any of operations above method should return instance of `BillsHandlerResult`, or null.

Bills handling drivers support asynchronous error handling, for the cases 
when operation in case of failure should not block POS flow. To handle error asynchronously, Bills Handling driver may throw one of two exceptions:
- `EBillErrorAsyncResolution` - when this error thrown, POS continues normal flow, in one minute the same driver method is called again with the same arguments, in case of same failure error show in in POS allowing user to choose what to do:
  - Retry - another attempt of the same operation
  - Ignore - cancel this job, do not make more attempts of this operation
- `EBillErrorAsyncRetry` - POS continues normal flow, in one minute the same driver method is called again with the same arguments.

```java
public class MyBillsHandler implements IBillsHandler {    
    // ...
    @Override
    public BillsHandlerResult operation(DriverConfiguration cfg, BillsHandlerRequest request) {
        if (request instanceof BillClosingRequest) {
            try {
                getConnection(cfg).sendStatistics(request.getBill());
                return new BillsHandlerResult(); // Return empty result
            } catch (IOException e) {
                log.error("Error sending statistics", e);
                throw new EBillErrorAsyncResolution(e); 
            }
        }
        return null;
    }
}
```

## Integrations with loyalty systems

There are also two operations which may be useful for creating integrations with loyalty systems:

### BillPaymentByCodeRequest
By implementing this operation your driver, depending on the receipt structure, may register unTill payment and/or apply discounts. Normally this operation is used for using with customer and loyalty cards, vouchers, coupons etc. 

This request sent when unTill(r) action `Request Payment by Code` executes in POS Payment Screen and user types or scans some code in popup window. In addition to the bill structure request provides a typed code. A result of this operation is an instance of `BillPaymentByCodeResult`, or exception. 

`BillPaymentByCodeResult` structure:

- paymentId - ID of unTill(r) payment mode to register payment. When not specified, result is ignored. Normally the payment ID may be configured as a parameter in [(Driver Configuration Declaraion](../README.md#driver-configuration-declaraion);
- data - transaction data, key/value map to store transaction details for further usage and/or display on bill receipt ticket (e.g. unique transaction id, etc);
- amount - paid amount, may be less then the receipt total (partial payment). May be zero if no payment is done;
- discountItems - list of discounts to be applied in current receipt (see below);
- displayText - text message to show in POS (optional).

Note that even when payment amount is zero, a payment will be registered in unTill with zero amount, because the transaction data is linked to payment. 

#### Returning Discounts
Your driver may add discounts to be applied in current receipt. This may be achieved by adding instances of a classes derived from `BillDiscountItem` to discountItems collection in `BillPaymentByCodeResult` object:
- `BillDiscountByVatItem` - adds discount per VAT%. unTill display one line per VAT% in receipt, in "Articles" section. This way is useful when you don't know to which exactly item in receipt it is applied. An instance of this class provides:
  - `vatPercent` - VAT%, (e.g. "20.00") to which discount is applied;
  - `vatSign` (optional)
  - `discountKey` - this is a key for the discount item, e.g. "DiscountVat20%". Must be uniquer per VAT%.
  - `discountTitle` - title to display discount item in receipt. Note that when you use the discount for the first time, unTill(r) creates an special article for this discount. A name in backoffice will be set to `discountKey` and article's "alias" set to `discountTitle`. This alias is used on receipts can be changed in backoffice.
  - `discountDescription` (optional)
- `BillDiscountOnOrderItem` - adds discount per top-level item in receipt. Driver receives receipt in `BillPaymentByCodeRequest.bill.orderItems` collection. For every item there is a `signature` field which is unique per receipt. All items with non-empty signature are top-level items. If any top-level item has modifiers, they are listed in the same collection after the top-level item with empty signature. It is important to understand that `BillDiscountOnOrderItem` represents a discount per top-level item. It means that if driver returns `BillDiscountOnOrderItem` with some amount, this discount amount will be applied in unTill to a top-level item and it's modifiers. An instance of this class provides:
  - `orderItemSignature` - a signature of top-level receipt line;
  - `discountReason` - a discount reason, may be configured as a parameter in [(Driver Configuration Declaraion](../README.md#driver-configuration-declaraion)
  - `discountDescription` (optional)

### BillPaymentCancelledRequest
This request sent when a payment process has been cancelled and there were added payments for this receipt already. If your driver has added any payment with `BillPaymentByCodeResult`, it has to revert them when this request received. A result is an instance of `BillsHandlerResult`:
```java
@Override
public BillsHandlerResult operation(DriverConfiguration cfg, BillsHandlerRequest r) {
    if (request instanceof BillPaymentByCodeRequest) {
        return request(cfg, (BillPaymentByCodeRequest)r);
    } else if (request instanceof BillPaymentCancelledRequest 
            || request instanceof BillReOpeningRequest) {
        return cancel(cfg, r.getBill().getPaymentItems());
    }
    return null;
}

private void cancel(DriverConfiguration cfg, List<PaymentItem> paymentItems) {
    Long myPaymentModeId = new Long(cfg.getParams().get(MyConst.PARAM_PAYMENT_MODE_ID));
    for (PaymentItem pi : paymentItems)
        if (myPaymentModeId.longValue == pi.getPaymentId()) 
            revertTransaction(cfg, pi.getData().get(MyConst.DATA_TRX_ID));
    return new BillsHandlerResult();
}

private void revertTransaction(DriverConfiguration cfg, String trxId) {
    if (trxId != null && !"".equals(trxId)) {
        // TODO: implement reverting transaction
    }
}
```

### Important Notes
If your driver has added any payment with `BillPaymentByCodeResult`, it is important to decide what your driver does when such bill is re-opened. In case of successful re-open unTill discards all payments and driver discounts (discounts added by `BillPaymentByCodeResult`). Normally there are three possible approaches to handle `BillReOpeningRequest`:
1. Return null or instance of `BillsHandlerResult`. In this case driver does simply nothing, and bill successfully re-opened in POS.
1. Revert every payment of the bill which seems to be "your" payment, e.g. added by your driver. This is shown in example above. In this case original transaction(s) will be reverted, which is the most correct way to handle this operation. 
1. Throw an exception. This may be useful if you don't allow re-opening bills with payments registered by your driver. It would be wise in this case to check if bill actually contains "your" payments before throwing exception. 