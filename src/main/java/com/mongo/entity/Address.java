package com.mongo.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "address")
public class Address {
	@Id
	private Integer id;
	private String street;
	private String city;
	private String state;
	private String zip;

	// Constructors
	public Address() {
	}


	public Address(Integer id, String street, String city, String state, String zip) {
		super();
		this.id = id;
		this.street = street;
		this.city = city;
		this.state = state;
		this.zip = zip;
	}


	/**
	 * @return the id
	 */
	public Integer getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(Integer id) {
		this.id = id;
	}

	// Getters and Setters
	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
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

	public String getZip() {
		return zip;
	}

	public void setZip(String zip) {
		this.zip = zip;
	}

	// toString
	@Override
	public String toString() {
		return "Address{" + "street='" + street + '\'' + ", city='" + city + '\'' + ", state='" + state + '\''
				+ ", zip='" + zip + '\'' + '}';
	}
}
