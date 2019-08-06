# API Basics
Untill Driver API2 is a Java library containing API of unTill(r) Hospitality software drivers. Below is a brief description of API. This API is a part of [Untill Driver DevKit](https://github.com/untillpro/untill-driver-devkit) which should be used for developing unTill(r) drivers and provides tools for driver building automation. More details on API classes can be found in Javadoc. 

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
- [IEft](docs/eft.md) - for handling EFT operations (payments by cards).
- [IBillsHandler](docs/bills_handling.md) - handling bill operations (bill closed, bill re-opened, proforma printed, bill re-printed).
- [IFiscalPrinter](docs/fiscal_printers.md) - fiscal printer operations.
- [IHotelInterface](docs/hotel_interface.md) - connection to a hotel management systems.
- [IFingerPrintReader](docs/finger_print_reader.md) - finger print reader interface.
- [IHasPeriodicalTasks](docs/periodical_tasks.md) - implement to support periodical background tasks.
- [IConfigurationValidation](docs/configuration_validation.md) - implement if you need to additionally validate driver configuration before it is saved in backoffice.
- [IPrepaidArticles](docs/prepaid_articles.md) - implement for handling pre-paid articles operations.
- [IGuestNotifier](docs/guest_notifier.md) - implement for handling guest notification

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

## Development 

### Lifecycle and Multithreading
unTill(r) POS loads and creates one instance of the driver, calling it's methods when POS needs to handle certain operation. It is possible that methods of your driver called from different threads, thus you must take care that your driver is thread safe, if needed:
```java
    @Override
    public EftResult operation(DriverConfiguration cfg, EftRequest request) {
        String comPort = cfg.getParams().getOrDefault(PARAM_COMPORT, "com1");
        return sendRequest(comPort, request);
    }
    
    private synchronized EftResult sendRequest(String comPort, 
            EftRequest request) {
        // TODO: thread-safe method body
    }
```

When developer expects some requests to be executed for a long time, [IDriverProgress](docs/progress.md) may be used for displaying execution progress and response to user "Cancel" action.

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

Driver may include JUnit tests which are executed automatically when driver is being built by SDK. 

Driver may also  support so called "emulation mode" which is enabled in unTill by putting a line in **UNTILL_HOME/untill.ini**:
```
[common]
EmulateDevices=1
```

When this mode enabled, driver should emulate activity and return some predefined dummy results. This mode may be useful for making some tests before going live:

```java
IDriverContext ctx;

public MyEft(IDriverContext ctx) {
    this.ctx = ctx;
}

@Override
public EftResult operation(DriverConfiguration cfg, EftRequest request) {
   
    if (request instanceof EftPaymentRequest) {         
        if (ctx.isEmulationModeEnabled())
            return getEmulatedPaymentResult();
        else
            return handlePayment((EftPaymentRequest)request);
    }
    //...
    throw new RuntimeException("Request not supported");
}
```

## unTill Properties
`IDriverContext` provides method for reading some unTill(r) configuration properties:
```java
String unTillVersion = context.getProperty(UntillProperties.UNTILL_VERSION);
String licenseUid = context.getProperty(UntillProperties.LICENSE_UID);
```

## Migration from API1
[Instruction](docs/migration.md)
