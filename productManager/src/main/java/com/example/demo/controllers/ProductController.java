package com.example.demo.controllers;

import java.util.List;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Product;

@RestController
public class ProductController {
	
	@Autowired
	List<Product> productList;
	
	@GetMapping("/products")
	public List<Product> getProduct(){
		return productList;
		
	}
	
	
	@GetMapping("/products/{id}")
	public Product findProductById(@PathVariable("id") long pid) {
		
		return this.productList.stream().filter(eachProduct -> eachProduct.getProductId()==pid).findFirst().orElse(null);
		
	}
	
	@PostMapping(value="/products", consumes="application/json", produces="application/json")
	public Product addProduct(@RequestBody Product product) {
		this.productList.add(product);
		return product;
	}
}
