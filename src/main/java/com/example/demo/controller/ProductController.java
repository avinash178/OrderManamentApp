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

import com.example.demo.entity.Products;
import com.example.demo.service.ProductService;

@RestController
@RequestMapping("/product")
public class ProductController{

	@Autowired 
	private ProductService product_service;
	
	
	@GetMapping("/getById")
	public ResponseEntity<Products> getProductById(@RequestParam(value = "id") long id){
		return new ResponseEntity<>(this.product_service.getProductById(id),HttpStatus.OK);
	}
	
	@GetMapping("/getAll")
	public ResponseEntity<List<Products>> getProducts(){
		return new ResponseEntity<>(this.product_service.getAllProducts(),HttpStatus.OK); 
	}
	
	
	@PostMapping("/save")
	public ResponseEntity<Products> saveProducts(@RequestBody Products product){
		return new ResponseEntity<>(this.product_service.addProduct(product),HttpStatus.OK);
	}
	
	
	@PutMapping("/update")
	public ResponseEntity<Products> update(@RequestBody Products product){
		return new ResponseEntity<>(this.product_service.updateProduct(product),HttpStatus.OK);
	}
	
	
	@DeleteMapping("/deleteById")
	public ResponseEntity<Void> deleteById(@RequestParam(value = "id")long id){
		this.product_service.deleteProduct(id);
		return new ResponseEntity<Void>(HttpStatus.OK);
	}
	
	
}
