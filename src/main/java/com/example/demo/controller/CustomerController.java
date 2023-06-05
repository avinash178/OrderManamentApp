package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Customers;
import com.example.demo.service.CustomerService;


@RestController
@RequestMapping("/customer")
@CrossOrigin("https://webapp-order-frontend.azurewebsites.net")
public class CustomerController {

	@Autowired
	private CustomerService cus_service;

	@PostMapping("/save")
	public ResponseEntity<Customers> saveCustomer(@RequestBody Customers customer) {
		return new ResponseEntity<>(this.cus_service.saveCustomerDetails(customer), HttpStatus.OK);
	}

	@GetMapping("/getById")
	public ResponseEntity<Customers> getCustomerById(@RequestParam(value = "id") long id) {
		return new ResponseEntity<>(this.cus_service.getCustomerById(id).get(), HttpStatus.OK);
	}

	@DeleteMapping("/deleteById")
	public void deleteCustomerById(@RequestParam(value = "id") long id) {
		this.cus_service.deleteCustomer(id);
	}

	@PutMapping("/update")
	public ResponseEntity<Customers> updateCustomer(@RequestBody Customers customer) {
		return new ResponseEntity<>(this.cus_service.updateCustomerDetails(customer), HttpStatus.OK);
	}

	@GetMapping("/getAll")
	public ResponseEntity<List<Customers>> getAllCustomers() {
		return new ResponseEntity<>(this.cus_service.getAllCustomers(), HttpStatus.OK);
	}

}
