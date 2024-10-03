package com.ecommerce_website.apigateway_service.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ecommerce_website.apigateway_service.entity.UserEntity;
import com.ecommerce_website.apigateway_service.service.UserService;

@RestController
@RequestMapping("/user")
public class UserController {
	@Autowired
	private UserService userService;
	
	@PostMapping("/save")
	public void saveAddress(@RequestBody UserEntity user) {
		userService.saveUser(user);
	}
	@GetMapping("/get")
	public String getUser() {
		return "User details";
	}

}
