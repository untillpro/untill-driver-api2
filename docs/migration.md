# Migration from API1 to API2

API2 provides more simple driver structure, and structure of the classes is  generally the same. However, the package names are now different and class names may also differ. Below is the brief overview and instruction for migration of your driver code to API2.
Note that API1 will be still supported in unTill, so if you don't need any new API2 features, you may continue using API1.

# Breaking changes

## Driver Interfaces

With API1 driver may implement one of driver interfaces: `IUntillEft`, `IUntillHotelInterface`, etc. With API2 driver must always implement `IDriver` interface. This interface declares method called `init` which returns all the interfaces supported by the driver:

```java

IHotelInterface hotel;
IEft eft;

@Override
public Map<Class<? extends IDriverInterface>, IDriverInterface> init(
        IDriverContext context) {

    hotel = new MyHotelInterface(context);
    eft = new MyEftHandler(context);

    return DriverInterfaces.map(IHotelInterface.class, hotel, 
            IEftHandler.class, eft);
}
```

So each driver may implement more than one interface. 

## No Transactions Anymore

In API2 there are no more driver transactions (ref. `IUntillTransactionDriver`). Due to improvements in unTill this approach is no more needed. This allows driver code to be more clean. If you had any code in `commitTransaction` and/or `rollbackTransaction`, you can move it directly in the driver method.

## Easier Parameters Declaration

API2 introduces some improvements for parameters declaration. Example:

```java
public class MyDriver implements IDriver {
    @Override
    public ArrayList<DriverParam> getParamsList() {
        return DriverParam.list(
                new DriverParam.Builder()
                        .key(MyDriverConst.PARAM_PLATFORM_ADDRESS)
                        .title("Platform Address")
                        .type(ParamType.STRING).mandatory(true).build(),
                new DriverParam.Builder()
                        .key(MyDriverConst.PARAM_ACCESS_TOKEN)
                        .title("Access Token")
                        .type(ParamType.STRING).mandatory(true).build());
    }
}
```

## Changes in Interfaces
Some interfaces are now changed to be more fiexible and extendable.

### IEft (ex. IUntillEft)

Instead of separate function for different operations: `eftSale`, `eftVoid`, etc the new interface provides only one function `operation` which handles all types of requests:

```java
  @Override
  public EftResult operation(DriverConfiguration cfg, EftRequest request) {
    if (request instanceof EftPaymentRequest) {
      return this.payment((EftPaymentRequest)request);
    } else if (request instanceof EftCustomCommandRequest) {
      EftCustomCommandRequest ccr = (EftCustomCommandRequest)request;
      if ("balance".equals(ccr.getCommand())) 
        return this.closeDay();
      else if ("repeatLastReceipt".equals(ccr.getCommand()))
        return this.repeatLastReceipt();
      else
        throw new RuntimeException("Unsupported command");
    }
    throw new RuntimeException("Request not supported");
  }
```

More details: [IBillsHandler](bills_handling.md)

### IBillsHandler (ex. IUntillBillsHandler)

The same change - one function called `operation` instead of separate ones: `billClosing`, `billreopening`, etc.

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

More details: [IEft](eft.md)

# How to Migrate

A simplified way to migrate your driver would be the following:

1. Setup a new driver project according to the instructions described in [Untill Driver DevKit](https://github.com/untillpro/untill-driver-devkit)
2. Add classes implementing your driver's interfaces (f.e. `IEft`)
3. For such interfaces like `IEft` and `IBillsHandler` construct `operation` method instead of using separate methods per operation (`eftSale`, etc)
4. Move the business logic code from your old driver source codes.
