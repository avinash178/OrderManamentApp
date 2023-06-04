package com.example.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Products {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long productId;
	
	private String productName;
	
	private String productCategories;

	public Products() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Products(long productId, String productName, String productCategories) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.productCategories = productCategories;
	}

	public long getProductId() {
		return productId;
	}

	public void setProductId(long productId) {
		this.productId = productId;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getProductCategories() {
		return productCategories;
	}

	public void setProductCategories(String productCategories) {
		this.productCategories = productCategories;
	}
	
	
	
	

}
