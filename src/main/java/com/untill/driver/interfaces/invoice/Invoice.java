package com.untill.driver.interfaces.invoice;

import com.untill.driver.interfaces.bills.OrderItem;

import java.math.BigDecimal;
import java.util.List;

/**
 * Class contains data about invoice
 */
public class Invoice {

	private Integer number;
	private BigDecimal discountOnTotal;
	private List<OrderItem> orderItems;

	public Integer getNumber() {
		return number;
	}

	public void setNumber(Integer number) {
		this.number = number;
	}

	public BigDecimal getDiscountOnTotal() {
		return discountOnTotal;
	}

	public void setDiscountOnTotal(BigDecimal discountOnTotal) {
		this.discountOnTotal = discountOnTotal;
	}

	public List<OrderItem> getOrderItems() {
		return orderItems;
	}

	public void setOrderItems(List<OrderItem> orderItems) {
		this.orderItems = orderItems;
	}
}
