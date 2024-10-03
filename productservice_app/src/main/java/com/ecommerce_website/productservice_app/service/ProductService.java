package com.ecommerce_website.productservice_app.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecommerce_website.productservice_app.entity.ProductEntity;
import com.ecommerce_website.productservice_app.repository.ProductRepository;

import reactor.core.publisher.Mono;

@Service
public class ProductService {
	@Autowired
	private ProductRepository repo;
	
	public Mono<ProductEntity> saveProduct(ProductEntity product) {
		System.out.println("product_name: "+product.getProduct_name());
		return repo.save(product);
	}

}
