package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Customers;
import com.example.demo.repository.CustomersRepository;

@Service
public class CustomerService {
	
	@Autowired
	private CustomersRepository cus_repo;
	
	
	public Customers saveCustomerDetails(Customers customer) {
		return this.cus_repo.save(customer);
	}
	
	public Optional<Customers> getCustomerById(long id) {
		return this.cus_repo.findById(id); 
	}
	
	
	public Customers updateCustomerDetails(Customers customer) {
		Customers customerOld = this.getCustomerById(customer.getCustomerId()).get();
		customerOld.setAddress(customer.getAddress());
		customerOld.setPhoneNumber(customer.getPhoneNumber());
		customerOld.setEmail(customer.getEmail());
		customerOld.setCustomerName(customer.getCustomerName());
		this.cus_repo.save(customerOld);
		return customerOld;
	}
	
	public void deleteCustomer(long id) {
		this.cus_repo.deleteById(id);
	}
	
	public List<Customers> getAllCustomers(){
		return this.cus_repo.findAll();
	}

	
}
