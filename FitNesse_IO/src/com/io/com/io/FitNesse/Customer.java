package com.io.com.io.FitNesse;

public class Customer {

	private Integer id;
	private Cart cart;
	private String username;
	private String password;
	
	public Customer(String username, String password) {
		
		this.username = username;
		this.password = password;
		cart = new Cart();
	}

	public Integer getId() {
		return id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public String setPassword(String password) throws IllegalArgumentException{
		
		if(password.length() < 8 || password.length() > 25) {
			
			throw new IllegalArgumentException("Długość hasła jest nieprawidłowa");
		}
		
		boolean upperCaseFlag = false;
		boolean digitFlag = false;
		
		for(char c : password.toCharArray()) {
			
			if(Character.isUpperCase(c)) {
				
				upperCaseFlag = true;
			}
			
			if(Character.isDigit(c)) {
				
				digitFlag = true;
				
				if(upperCaseFlag) {
					
					break;
				}
			}
		}
		
		if(!upperCaseFlag) {
			
			throw new IllegalArgumentException("Hasło musi posiadać przynajmniej jedną dużą literę");
		}
		
		if(!digitFlag) {
			
			throw new IllegalArgumentException("Hasło musi posiadać przynajmniej jedną cyfrę");
		}
			
		this.password = password;
		
		return password;
	}

	public Cart getCart() {
		return cart;
	}
	
}
