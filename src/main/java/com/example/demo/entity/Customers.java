package com.example.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Customers {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long customerId;
	private String customerName;
	private String email;
	private long phoneNumber;
	private String address;

	public Customers() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Customers(long customerId, String customerName, String email, long phoneNumber, String address) {
		super();
		this.customerId = customerId;
		this.customerName = customerName;
		this.email = email;
		this.phoneNumber = phoneNumber;
		this.address = address;
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

}
