# API Basics
Untill Driver API2 is a Java library containing API of unTill(r) HoReCa software drivers. Below is a brief description of this API. This API is a part of [UntillSDK](/untill_sdk) which should be used for developing unTill(r) drivers and provides tools for driver building automation. More details on API classes can be found in Javadoc. 

# Drivers in General 
unTill(r) drivers are folders in **UNTILL_HOME/plugins/drivers** with at least one JAR-archive having `Main-Class` declared in MANIFEST.MF file pointing to a class which implements `IDriver` interface. Any other JARs in the same folder are automatically loaded and available to the driver classes. 

Note that if driver is developed with UntillSDK, MANIFEST.MF creation is automated, as well as building driver distributive package including any other 3rd party JARs.

## Driver Configuration Declaraion
Drivers are configured in unTill(r) Backoffice, in Hardware/Computers/Devices section. Each driver may need some configuration parameters, like URL, timeout values, or whatever. Developer declares parameters for driver using method `getParamsList()` which returns list of parameter definitions for this driver:

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

## Driver Interfaces
To provide certain functionality which can be used by unTill(r) POS, driver must declare that it supports one or more interfaces derived from `IDriverInterface`:
- [IEft](eft) - for handling EFT operations (payments by cards)
- `IBillsHandler` - handling bill operations (bill closed, bill re-opened, proforma printed, bill re-printed)
- `IFiscalPrinter` - fiscal printer operations
- `IHotelInterface` - connection to a hotel management systems
- `IHasPeriodicalTasks` - implement to support periodical background tasks
- `IConfigurationValidation` - implement if you need to additionally validate driver configuration before it is saved in backoffice.

Declaration of supported interfaces is made by `init` method which is called at driver initialization stage. Driver must return a map of supported interfaces:
```java
@Override
public Map<Class<? extends IDriverInterface>, IDriverInterface> init(
        IDriverContext context) {

    IHotelInterface hotel = new MyHotelInterface(context);
    IBillsHandler bills = new MyBillsHandler(context);

    return DriverInterfaces.map(IHotelInterface.class, hotel, 
            IBillsHandler.class, bills);
}
```

Depending on interfaces provided by driver, unTill(r) POS calls corresponding interface methods in appropriate cases.

### IEft
This interface allows handling card payment operations:
```java

```

### IHotelInterface
Handles interface to hotel management systems: reading guest information and charging "room"-payments. 

`getGuests` method can be called in two cases:
1. When waiter calls 'Get HC Client info' function in unTill(r) POS to identify guest.
2. When room-payment must be handled and guest is not identified yet. In this case unTill(r) POS calls this method automatically.

A guest is identified in requests by an instance of class derived from `GuestLookupCriteria`:
- `GuestLookupByRoom` - room number provided
- `GuestLookupByReservationId` - reservation Id provided 
- `GuestLookupCustom` - custom criteria provided (see below).
Returning empty array means no guests found for provided criteria. If `getGuests` method returns more than one `HotelGuest` objects, POS asks to choose one from the list of returned. Note that `HotelGuest` must have either `room` or `reservationId` filled, otherwise it is not possible to identify this client in POS and guest can not be charged.

`charge` method called only after client selected in POS. Either `GuestLookupByReservationId` or `GuestLookupByRoom` criteria passed to this method, depending if client has `reservationId` filled or not.

```java
public class MyDriver implements IDriver, IHotelInterface {}
    // ...
    @Override
    public HotelChargeResult charge(DriverConfiguration cfg, HotelChargeRequest request) throws EHotelGuestNotFound {
        String resvId = ((GuestLookupByReservationId)request.getCriteria()).
                getReservationId();
        MyServerConnection conn = getConnection(cfg);
        if (request.getRequestKind() < 0) // Reopen bill
            conn.refund(resvId, request.getData());
        else
            conn.charge(resvId, request.getData());
        return new HotelChargeResult(); // empty result
    }
}
```

#### Hotel custom criterias
It is possible to declare also that your driver supports requesting clients by custom criterias, like name, phone, card number, etc. To allow this, driver must support IHotelSupportsCustomLookupCriterias interface:
```java
public class MyDriver implements IDriver, IHotelInterface,  
        IHotelSupportsCustomLookupCriterias {

    @Override
    public Map<Class<? extends IDriverInterface>, IDriverInterface> init(IDriverContext context) {
        return DriverInterfaces.map(
                IHotelInterface.class, this, IHotelSupportsCustomLookupCriterias.class, this);
    }

    @Override
    public CustomLookupCriterias getCustomLookupCriterias(DriverConfiguration cfg) {
        CustomLookupCriterias criterias = new CustomLookupCriterias();
        criterias.getItems().put(MyDriverConst.CRITERIA_NAME, "Name");
        criterias.getItems().put(MyDriverConst.CRITERIA_CARD, "CustomerCard");

        // We want this field to be filled automatically from MSR
        criterias.setHardwareInputCriteriaKey(MyDriverConst.CRITERIA_CARD); 
        return criterias;
    }    

    @Override
    public GetHotelGuestResult getGuests(DriverConfiguration cfg,
            GetHotelGuestRequest request) {
        if (request.getCriteria() instanceof GuestLookupCustom) {
            GuestLookupCustom c = (GuestLookupCustom)request.getCriteria();
            if (MyDriverConst.CRITERIA_CARD.equals(c.getKey())) {
                String card = c.getValue();
                // ...lookup by card...
            } else {
                String name = c.getValue();
                // ...lookup by name...
            }
        } else {
            // ...lookup by standard criterias...
        }
    }    

}
```

### Fiscal Printers

### Bills Handling

Bills handling driver gets called when one of the following events happens:
- Bill printed
- Bill re-opened
- Bill re-printed
- Proforma printed

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

### Periodical Tasks

### Parameters Validation

## Development 

### Lifecycle and Multithreading
unTill(r) POS loads and creates one instance of your driver, calling it's methods when POS needs to handle certain operation. It is possible that methods of your driver called from different threads, thus you must take care that your driver is thread safe, if required:
```java
    @Override
    public EftResult operation(DriverConfiguration cfg, EftRequest request) {
        String comPort = cfg.getParams().getOrDefault(PARAM_COMPORT, "com1");
        return sendRequest(comPort, request);
    }
    
    private synchronized EftResult sendRequest(String comPort, 
            EftRequest request) {
        ...
    }
```

### Driver finalization
Method `finit()` called just before driver is unloaded and unTill(r) JServer stopped. Put any code here to free allocated resources used by your driver, close opened connections, etc.

### Logging
Use instance of `IDriverLogger` for logging:
```java
package com.untill.drivers.mypackage;
public class MyDriver implements IDriver, IHotelInterface {

    private IDriverLogger log;

    @Override
    public Map<Class<? extends IDriverInterface>, IDriverInterface> init(
            IDriverContext context) {
        this.log = context.getLogger(MyDriver.class);
        return DriverInterfaces.map(IHotelInterface.class, this);
    }

    @Override
    public GetHotelGuestResult getGuests(DriverConfiguration cfg, GetHotelGuestRequest request) {
        log.trace("getGuests started");
        try {
            ...
        } finally {
            log.trace("getGuests finished");
        }
    }
}
```

To set up logging level, add line(s) in <UNTILL_HOME>/log4j.properties file:
```
log4j.logger.com.untill.drivers.mypackage=DEBUG
log4j.logger.com.untill.drivers.mypackage.MyDriver=TRACE
```

### Execution Progress
Some driver functions execution may take long time. There is a possibility to show progress status message, or interrupt execution from unTill(r) side (cancel operation by waiter). Use `IDriverProgress` interface which is available from `IDriverContext.getProgress()` and provides 2 methods:
- `isCancelRequested` - returns true when user pressed "Cancel" in POS progress dialog;
- `showProgressMessage` - shows text message in POS progress dialog
```java

```


### Timeouts
If unTill(r) doesn't receive answer from driver in 90 seconds, this call is cancelled and error shown in unTill. Driver developer should take care that functions doesn’t consume more time, and any communication from driver to external interface also finishes before timeout reached. Otherwise it may happen that unTill ends with timeout and starts new request, and driver is still busy with previous call.

### Access to driver's local directory
With `IDriverContext.getAbsolutePath` method you request full path to the file from your driver's directory:
```java
File keystore = new File(context.getAbsolutePath("keystore.jks"));
```

### Error handling
At any time driver may throw `java.lang.RuntimeException` to indicate that there was an processing error. A POS operation will be interrupted and error message from exception object will be shown in POS. 

## unTIll(r) APIs
unTill(r) API is an interface providing some additional predefined functionality. API can be obtained using `IDriverContext.getApi` method. Below is the list of APIs available to drivers:
- `IUntillTimeApi` requesting system timezone;
- `IUntillCurrencyApi` working with currency, getting main currency information;
- `IUntillProformasApi` working with proformas;
- `IUntillSystemNotificationsApi` sending POS notifications to unTill(r) users.

Example:
```java
// Default JVM timezone is UTC, so we use IUntillTimeApi to request system timezone
UntillTimeApi time = context.getApi(IUntillTimeApi.class);
TimeZone tz = time.getSystemTimeZone();
```

## Testing

### Emulation mode