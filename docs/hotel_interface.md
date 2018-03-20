# Hotel Interface - IHotelInterface

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

## Hotel custom criterias
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

## Get Room Information
Driver may introduce `IHotelSupportsRoomInformation` interface which allows to handle "Get Room Information" operation.

## Support "End Of Day" 
Driver may introduce `IHotelSupportsEndOfDay` interface which allows to handle "End Of Day" request.
