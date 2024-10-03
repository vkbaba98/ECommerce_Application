package com.ecommerce_website.productservice_app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ecommerce_website.productservice_app.entity.ProductEntity;
import com.ecommerce_website.productservice_app.service.ProductService;

import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/product")
public class ProductController {
	@Autowired
	private ProductService prodService;
	
	@PostMapping("/save")
	public Mono<ProductEntity> saveProduct(@RequestBody ProductEntity product) {
		return prodService.saveProduct(product);
	}

}
