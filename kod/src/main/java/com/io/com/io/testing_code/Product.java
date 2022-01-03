package com.io.com.io.testing_code;


public class Product {

	private Integer id;
	private String name;
	private float value;
	private Integer quantity;
	
	public Product(Integer id, String name, Integer quantity) {
		
		this.id = id;
		this.name = name;
		this.quantity = quantity;
	}

	public Integer getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getValue() {
		return value;
	}

	public void setValue(float value) {
		this.value = value;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}
	
	
	
}
