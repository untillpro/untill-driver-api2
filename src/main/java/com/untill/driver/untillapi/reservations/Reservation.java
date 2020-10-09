package com.untill.driver.untillapi.reservations;

import java.math.BigDecimal;

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
	
	ReservationCancelReason cancelReason;
	
	Long userId;
	
	BigDecimal depositAmount;

	public BigDecimal getDepositAmount() {
		return depositAmount;
	}

	public void setDepositAmount(BigDecimal depositAmount) {
		this.depositAmount = depositAmount;
	}

	public ReservationCancelReason getCancelReason() {
		return cancelReason;
	}

	public void setCancelReason(ReservationCancelReason cancelReason) {
		this.cancelReason = cancelReason;
	}

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getReference() {
		return reference;
	}

	public void setReference(String reference) {
		this.reference = reference;
	}

	public Integer getTableNumber() {
		return tableNumber;
	}

	public void setTableNumber(Integer tableNumber) {
		this.tableNumber = tableNumber;
	}

	public Long getClientId() {
		return clientId;
	}

	public void setClientId(Long clientId) {
		this.clientId = clientId;
	}

	public Long getStartTime() {
		return startTime;
	}

	public void setStartTime(Long startTime) {
		this.startTime = startTime;
	}

	public Long getUpdateTime() {
		return updateTime;
	}

	public void setUpdateTime(Long updateTime) {
		this.updateTime = updateTime;
	}

	public Long getCloseTime() {
		return closeTime;
	}

	public void setCloseTime(Long closeTime) {
		this.closeTime = closeTime;
	}

	public ReservationStatus getStatus() {
		return status;
	}

	public void setStatus(ReservationStatus status) {
		this.status = status;
	}

	public String getNote() {
		return note;
	}

	public void setNote(String note) {
		this.note = note;
	}

	public ReservationOrigin getOrigin() {
		return origin;
	}

	public void setOrigin(ReservationOrigin origin) {
		this.origin = origin;
	}

	public Integer getPersons() {
		return persons;
	}

	public void setPersons(Integer persons) {
		this.persons = persons;
	}

	public Integer getChildren() {
		return children;
	}

	public void setChildren(Integer children) {
		this.children = children;
	}

	public String getClientInfo() {
		return clientInfo;
	}

	public void setClientInfo(String clientInfo) {
		this.clientInfo = clientInfo;
	}

	public String getClientContact() {
		return clientContact;
	}

	public void setClientContact(String clientContact) {
		this.clientContact = clientContact;
	}

	public String getExtraData() {
		return extraData;
	}

	public void setExtraData(String extraData) {
		this.extraData = extraData;
	}

}
