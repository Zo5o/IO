package com.io.com.io.testing_code;

import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.rules.ExpectedException;

@Category({ Customer.class})
public class CustomerTest {
	
	public Customer customer;
	
	@Before
	public void initCustomer() {
		
		customer = new Customer("login", "password");
	}
	
	@Rule
	public final ExpectedException exception = ExpectedException.none();
	
	@Test
	public void shouldAcceptValidPassword() {
		
		assertTrue(customer.setPassword("Abcdefgh1") != null && customer.getPassword().equals("Abcdefgh1"));
	}
	
	@Test
	public void shouldntAcceptTooShortPassword() {
		
		exception.expect(IllegalArgumentException.class);
		exception.expectMessage("Długość hasła jest nieprawidłowa");
		
		customer.setPassword("Abcdef1");
	}
	
	@Test
	public void shouldntAcceptTooLongPassword() {
		
		exception.expect(IllegalArgumentException.class);
		exception.expectMessage("Długość hasła jest nieprawidłowa");
		
		customer.setPassword("Abcdefdddddddddddddddddaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa1");
	}
	
	@Test
	public void shouldntAcceptPasswordWithoutUpperCase() {
		
		exception.expect(IllegalArgumentException.class);
		exception.expectMessage("Hasło musi posiadać przynajmniej jedną dużą literę");
		
		customer.setPassword("abcdeddadadadaf1");
	}
	
	@Test
	public void shouldntAcceptPasswordWithoutDigit() {
		
		exception.expect(IllegalArgumentException.class);
		exception.expectMessage("Hasło musi posiadać przynajmniej jedną liczbę");
		
		customer.setPassword("Abcdeddadadadaf");
	}

}
