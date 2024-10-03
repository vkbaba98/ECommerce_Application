package com.ecommerce_website.apigateway_service.entity;




import jakarta.annotation.Generated;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="address")
public class AddressEntity {
	
	@Id
	@GeneratedValue(strategy =  GenerationType.IDENTITY)
	private int id;
	private String add1;
	private String add2;
	private String addType;
	private String city;
	private String state;
	private int pincode;
	@ManyToOne
	private UserEntity user;
	public AddressEntity() {
		super();
		// TODO Auto-generated constructor stub
	}
	public AddressEntity(int id, String add1, String add2, String addType, String city, String state, int pincode,
			UserEntity user) {
		super();
		this.id = id;
		this.add1 = add1;
		this.add2 = add2;
		this.addType = addType;
		this.city = city;
		this.state = state;
		this.pincode = pincode;
		this.user = user;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getAdd1() {
		return add1;
	}
	public void setAdd1(String add1) {
		this.add1 = add1;
	}
	public String getAdd2() {
		return add2;
	}
	public void setAdd2(String add2) {
		this.add2 = add2;
	}
	public String getAddType() {
		return addType;
	}
	public void setAddType(String addType) {
		this.addType = addType;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public int getPincode() {
		return pincode;
	}
	public void setPincode(int pincode) {
		this.pincode = pincode;
	}
	public UserEntity getUser() {
		return user;
	}
	public void setUser(UserEntity user) {
		this.user = user;
	}
	

}
