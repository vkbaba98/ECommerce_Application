package com.ecommerce_website.apigateway_service.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecommerce_website.apigateway_service.entity.UserEntity;
import com.ecommerce_website.apigateway_service.repository.UserRepository;

@Service
public class UserService {
	
	@Autowired
	private UserRepository repo;
	
	public void saveUser(UserEntity user) {
		repo.save(user);
	}

}
