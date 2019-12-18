package com.untill.driver.untillapi.beveragecontrol;

import java.math.BigDecimal;
import java.time.LocalDateTime;

/**
 * This class describes registration data about beverage pouring
 */
public class RegisterPouringRequest {
	/**
	 * Creation date time
	 */
	private LocalDateTime datetime;
	/**
	 * Waiter ID. (Users / Beverage Control / Waiter ID)
	 */
	private Integer waiterId;
	/**
	 * Price Look-Up code. PLU of the article (Articles / Beverage Control)
	 */
	private Integer plu;
	/**
	 * Table number. Optional
	 */
	private Integer tableNo;
	/**
	 * Quantity
	 */
	private Integer quantity;
	/**
	 * Logical Control Unit. Number which identifies device. Optional
	 */
	private Integer lcu;
	/**
	 * An ID of pouring in 3rd party system. Optional
	 */
	private Long externalId;
	/**
	 * Client card ID. Optional
	 */
	private String clientCard;
	/**
	 * A unique UID of pouring in 3rd party system. When non-empty, unTill only inserts pouring if no pouring with
	 * the same External UID already exists in database. Optional
	 */
	private String externalUid;
	/**
	 * Price of poured beverage
	 */
	private BigDecimal price;

	public LocalDateTime getDatetime() {
		return datetime;
	}

	public void setDatetime(LocalDateTime datetime) {
		this.datetime = datetime;
	}

	public Integer getWaiterId() {
		return waiterId;
	}

	public void setWaiterId(Integer waiterId) {
		this.waiterId = waiterId;
	}

	public Integer getPlu() {
		return plu;
	}

	public void setPlu(Integer plu) {
		this.plu = plu;
	}

	public Integer getTableNo() {
		return tableNo;
	}

	public void setTableNo(Integer tableNo) {
		this.tableNo = tableNo;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	public Integer getLcu() {
		return lcu;
	}

	public void setLcu(Integer lcu) {
		this.lcu = lcu;
	}

	public Long getExternalId() {
		return externalId;
	}

	public void setExternalId(Long externalId) {
		this.externalId = externalId;
	}

	public String getClientCard() {
		return clientCard;
	}

	public void setClientCard(String clientCard) {
		this.clientCard = clientCard;
	}

	public String getExternalUid() {
		return externalUid;
	}

	public void setExternalUid(String externalUid) {
		this.externalUid = externalUid;
	}

	public BigDecimal getPrice() {
		return price;
	}

	public void setPrice(BigDecimal price) {
		this.price = price;
	}
}