package com.io.com.io.FitNesse;

public class Product {

	private Integer id;
	private String name;
	private float value;
	private Integer quantity;
	
	public Product(Integer id, String name, float value, Integer quantity) throws IllegalArgumentException{
		
		if(id <= 0) {
			
                    throw new IllegalArgumentException("Id musi byc wieksze od zera");
		}
		
		this.id = id;
		this.name = name;
		this.value = value;
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
	
	@Override
	public int hashCode() {
		
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		
		if (this == obj) {
			
			return true;
		}
		
		if (obj == null) {
			
			return false;
		}
		
		if (getClass() != obj.getClass()) {
			
			return false;
		}
		
		Product other = (Product) obj;
		
		if (id == null) {
			
			if (other.id != null) {
				
				return false;
			}
		} 
		else if (!id.equals(other.id)) {
			
			return false;
		}
			
		return true;
	}
	
}
