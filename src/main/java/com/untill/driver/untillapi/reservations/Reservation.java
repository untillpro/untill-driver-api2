package com.untill.driver.untillapi.reservations;

import java.util.Objects;

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

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		Reservation that = (Reservation) o;
		return Objects.equals(id, that.id)
				&& Objects.equals(reference, that.reference)
				&& Objects.equals(tableNumber, that.tableNumber)
				&& Objects.equals(clientId, that.clientId)
				&& Objects.equals(startTime, that.startTime)
				&& Objects.equals(updateTime, that.updateTime)
				&& Objects.equals(closeTime, that.closeTime)
				&& status == that.status
				&& Objects.equals(note, that.note)
				&& origin == that.origin
				&& Objects.equals(persons, that.persons)
				&& Objects.equals(children, that.children)
				&& Objects.equals(clientInfo, that.clientInfo)
				&& Objects.equals(clientContact, that.clientContact)
				&& Objects.equals(extraData, that.extraData)
				&& cancelReason == that.cancelReason
				&& Objects.equals(userId, that.userId);
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, reference, tableNumber, clientId, startTime, updateTime, closeTime, status, note, origin, persons, children, clientInfo, clientContact, extraData, cancelReason, userId);
	}

	@Override
	public String toString() {
		return "Reservation{"
				+ "id=" + id
				+ ", reference='" + reference + '\''
				+ ", tableNumber=" + tableNumber
				+ ", clientId=" + clientId
				+ ", startTime=" + startTime
				+ ", updateTime=" + updateTime
				+ ", closeTime=" + closeTime
				+ ", status=" + status
				+ ", note='" + note + '\''
				+ ", origin=" + origin
				+ ", persons=" + persons
				+ ", children=" + children
				+ ", clientInfo='" + clientInfo + '\''
				+ ", clientContact='" + clientContact + '\''
				+ ", extraData='" + extraData + '\''
				+ ", cancelReason=" + cancelReason
				+ ", userId=" + userId
				+ '}';
	}
}
