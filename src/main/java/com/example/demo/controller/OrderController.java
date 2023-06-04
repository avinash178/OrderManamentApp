package com.example.demo.controller;

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

import com.example.demo.entity.CustomersOrders;
import com.example.demo.service.OrderService;

@RestController
@RequestMapping("/order")
public class OrderController {
	
	@Autowired
	private OrderService order_service;
	
	
	@GetMapping("/getById")
	public ResponseEntity<CustomersOrders> getOrderById(@RequestParam(value = "id") long id){
		return new ResponseEntity<>(this.order_service.getOrderById(id),HttpStatus.OK);
	}
	
	@PostMapping("/save")
	public ResponseEntity<CustomersOrders> saveOrder(@RequestBody CustomersOrders order){
		return new ResponseEntity<>(this.order_service.addNewOrder(order),HttpStatus.OK);
	}
	
	
	@DeleteMapping("/deleteById")
	public ResponseEntity<Void> deleteOrder(@RequestParam(value = "id") long id){
		 this.order_service.deleteOrder(id);
		 return new ResponseEntity<>(HttpStatus.OK);
	}
	
	
	@PutMapping("/update")
	public ResponseEntity<CustomersOrders> updateOrders(@RequestBody CustomersOrders order){
		return new ResponseEntity<>(this.order_service.updateOrder(order),HttpStatus.OK);
	}
	

}
