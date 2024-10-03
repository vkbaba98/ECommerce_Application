package com.ecommerce_website.apigateway_service.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ecommerce_website.apigateway_service.entity.AddressEntity;
import com.ecommerce_website.apigateway_service.service.AddressService;

@RestController
@RequestMapping("/address")
public class AddressController {

	@Autowired
	private AddressService addressService;
	@PostMapping("/save")
	public void saveAddress(@RequestBody AddressEntity address) {
		addressService.saveAddress(address);
	}
	@GetMapping("/get")
	public String getAddress() {
		return "Get Address";
	}
}
