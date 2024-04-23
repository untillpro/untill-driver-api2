package com.untill.driver.untillapi.reservations;

import java.math.BigDecimal;
import java.util.Objects;

public class Reservation {
	private Long id;
	private String reference;
	private Integer tableNumber;
	private Long clientId;
	private Long startTime;
	private Long updateTime;
	private Long closeTime;
	private ReservationStatus status;
	private String note;
	private ReservationOrigin origin;
	private Integer persons;
	private Integer children;
	private String clientInfo;
	private String clientContact;
	private String extraData;
	private ReservationCancelReason cancelReason;
	private Long userId;
	private BigDecimal depositAmount;
	private String tags;
	private Long paidByUserId;
	private String phone;
	private Long billId;

	public Reservation() {
	}

	public Reservation(Reservation that) {
		this.id = that.id;
		this.reference = that.reference;
		this.tableNumber = that.tableNumber;
		this.clientId = that.clientId;
		this.startTime = that.startTime;
		this.updateTime = that.updateTime;
		this.closeTime = that.closeTime;
		this.status = that.status;
		this.note = that.note;
		this.origin = that.origin;
		this.persons = that.persons;
		this.children = that.children;
		this.clientInfo = that.clientInfo;
		this.clientContact = that.clientContact;
		this.extraData = that.extraData;
		this.cancelReason = that.cancelReason;
		this.userId = that.userId;
		this.depositAmount = that.depositAmount;
		this.tags = that.tags;
		this.paidByUserId = that.paidByUserId;
		this.phone = that.phone;
		this.billId = that.billId;
	}

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

	public String getTags() {
		return tags;
	}

	public void setTags(String tags) {
		this.tags = tags;
	}

	public Long getPaidByUserId() {
		return paidByUserId;
	}

	public void setPaidByUserId(Long paidByUserId) {
		this.paidByUserId = paidByUserId;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public Long getBillId() {
		return billId;
	}

	public void setBillId(Long billId) {
		this.billId = billId;
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
				&& Objects.equals(userId, that.userId)
				&& Objects.equals(depositAmount, that.depositAmount)
				&& Objects.equals(tags, that.tags)
				&& Objects.equals(paidByUserId, that.paidByUserId)
				&& Objects.equals(phone, that.phone)
				&& Objects.equals(billId, that.billId);
	}

	@Override
	public int hashCode() {
		return Objects.hash(id,
				reference,
				tableNumber,
				clientId,
				startTime,
				updateTime,
				closeTime,
				status,
				note,
				origin,
				persons,
				children,
				clientInfo,
				clientContact,
				extraData,
				cancelReason,
				userId,
				depositAmount,
				tags,
				paidByUserId,
				phone,
				billId
		);
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
				+ ", depositAmount=" + depositAmount
				+ ", tags='" + tags + '\''
				+ ", paidByUserId=" + paidByUserId
				+ ", phone='" + phone + '\''
				+ ", billId=" + billId
				+ '}';
	}
}
