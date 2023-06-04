package com.example.demo.dto;

import java.util.List;

import com.example.demo.entity.CustomersOrders;

public class CustomerDto {

	private long customerId;
	private String customerName;
	private String email;
	private long phoneNumber;
	private String address;
	private List<CustomersOrders> orders;

	public CustomerDto() {
		super();
		// TODO Auto-generated constructor stub
	}

	public CustomerDto(long customerId, String customerName, String email, long phoneNumber, String address,
			List<CustomersOrders> orders) {
		super();
		this.customerId = customerId;
		this.customerName = customerName;
		this.email = email;
		this.phoneNumber = phoneNumber;
		this.address = address;
		this.orders = orders;
	}

	public long getCustomerId() {
		return customerId;
	}

	public void setCustomerId(long customerId) {
		this.customerId = customerId;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public long getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public List<CustomersOrders> getOrders() {
		return orders;
	}

	public void setOrders(List<CustomersOrders> orders) {
		this.orders = orders;
	}

}
