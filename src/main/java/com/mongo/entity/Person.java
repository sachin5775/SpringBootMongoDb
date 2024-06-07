package com.mongo.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="person")
public class Person {
	@Id
	private Integer id;
	private String name;
	private int age;
	//private Address address;

	/**
	 * @return the id
	 */
	public Integer getId() {
		return id;
	}

	public Person(Integer id, String name, int age) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
	}

	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param id the id to set
	 */
	public void setId(Integer id) {
		this.id = id;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the age
	 */
	public int getAge() {
		return age;
	}

	/**
	 * @param age the age to set
	 */
	public void setAge(int age) {
		this.age = age;
	}

	
}
