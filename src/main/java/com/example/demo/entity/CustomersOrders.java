package com.example.demo.entity;

import java.sql.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

@Entity
public class CustomersOrders {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long orderId;

	@OneToOne
	private Customers customerId;

	@OneToOne
	private Products productId;

	private Date orderDate;

	private Date deliveryDate;

	private int amount;

	private boolean isPaid;

	public CustomersOrders(long orderId, Customers customerId, Products productId, Date orderDate, Date deliveryDate,
			int amount, boolean isPaid) {
		super();
		this.orderId = orderId;
		this.customerId = customerId;
		this.productId = productId;
		this.orderDate = orderDate;
		this.deliveryDate = deliveryDate;
		this.amount = amount;
		this.isPaid = isPaid;
	}

	public CustomersOrders() {
		super();
		// TODO Auto-generated constructor stub
	}

	public long getOrderId() {
		return orderId;
	}

	public void setOrderId(long orderId) {
		this.orderId = orderId;
	}

	public Customers getCustomerId() {
		return customerId;
	}

	public void setCustomerId(Customers customerId) {
		this.customerId = customerId;
	}

	public Products getProductId() {
		return productId;
	}

	public void setProductId(Products productId) {
		this.productId = productId;
	}

	public Date getOrderDate() {
		return orderDate;
	}

	public void setOrderDate(Date orderDate) {
		this.orderDate = orderDate;
	}

	public Date getDeliveryDate() {
		return deliveryDate;
	}

	public void setDeliveryDate(Date deliveryDate) {
		this.deliveryDate = deliveryDate;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

	public boolean isPaid() {
		return isPaid;
	}

	public void setPaid(boolean isPaid) {
		this.isPaid = isPaid;
	}

}
