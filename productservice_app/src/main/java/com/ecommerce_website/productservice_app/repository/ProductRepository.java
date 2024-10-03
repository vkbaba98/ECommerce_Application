package com.ecommerce_website.productservice_app.repository;

import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

import com.ecommerce_website.productservice_app.entity.ProductEntity;

public interface ProductRepository extends ReactiveMongoRepository<ProductEntity, Integer> {

}
