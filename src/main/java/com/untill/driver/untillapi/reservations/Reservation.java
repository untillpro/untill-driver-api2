package com.untill.driver.untillapi.reservations;

public class Reservation {
	
	Long id;
	
	String reference;
		
	Integer tableNumber;
	
	Long clientId;
	
	Long startTime;
	
	Long updateTime;
	
	Long closeTime;
	
	ReservationStatus status;
	
	String note;
	
	ReservationOrigin origin;
	
	Integer persons;
	
	Integer children;
	
	String clientInfo;
	
	String clientContact;
	
	String extraData;

}
