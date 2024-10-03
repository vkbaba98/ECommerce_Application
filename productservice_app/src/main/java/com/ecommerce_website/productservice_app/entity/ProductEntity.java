package com.ecommerce_website.productservice_app.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import jakarta.annotation.Generated;


@Document(collection="ProductCollection")
public class ProductEntity {

	@Id
	private int id;
	private String product_name;
	private double product_price;
	private String product_category;
	private int product_count;
	public ProductEntity() {
		super();
		// TODO Auto-generated constructor stub
	}
	public ProductEntity(int id, String product_name, double product_price, String product_category,
			int product_count) {
		super();
		this.id = id;
		this.product_name = product_name;
		this.product_price = product_price;
		this.product_category = product_category;
		this.product_count = product_count;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getProduct_name() {
		return product_name;
	}
	public void setProduct_name(String product_name) {
		this.product_name = product_name;
	}
	public double getProduct_price() {
		return product_price;
	}
	public void setProduct_price(double product_price) {
		this.product_price = product_price;
	}
	public String getProduct_category() {
		return product_category;
	}
	public void setProduct_category(String product_category) {
		this.product_category = product_category;
	}
	public int getProduct_count() {
		return product_count;
	}
	public void setProduct_count(int product_count) {
		this.product_count = product_count;
	}
	
	
}
