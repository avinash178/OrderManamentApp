package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Products;
import com.example.demo.repository.ProductsRepository;

@Service
public class ProductService {
	
	@Autowired
	private ProductsRepository prodcut_repo;
	
	public Products addProduct(Products product) {
		return this.prodcut_repo.save(product);
	}
	
	public void deleteProduct(long id) {
		this.prodcut_repo.deleteById(id);
	}
	
	public Products updateProduct(Products newProduct) {
		Products oldProduct = this.prodcut_repo.findById(newProduct.getProductId()).get();
		oldProduct.setProductName(newProduct.getProductName());
		oldProduct.setProductCategories(newProduct.getProductCategories());
		return  this.prodcut_repo.save(oldProduct);
	}
	
	public Products getProductById(long id) {
		return this.prodcut_repo.findById(id).get();
	}
	
	public List<Products> getAllProducts(){
		return this.prodcut_repo.findAll();
	}
	
	

}
