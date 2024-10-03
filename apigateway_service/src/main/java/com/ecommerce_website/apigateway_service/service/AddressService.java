package com.ecommerce_website.apigateway_service.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecommerce_website.apigateway_service.entity.AddressEntity;
import com.ecommerce_website.apigateway_service.repository.AddressRepository;

@Service
public class AddressService {
	
	@Autowired
	private AddressRepository repo;
	
	public void saveAddress(AddressEntity address) {
		repo.save(address);
	}

}
