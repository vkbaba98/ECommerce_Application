package com.ecommerce_website.apigateway_service.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ecommerce_website.apigateway_service.entity.UserEntity;

public interface UserRepository extends JpaRepository<UserEntity, Integer>{

}
