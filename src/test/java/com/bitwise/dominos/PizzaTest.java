package com.bitwise.dominos;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class PizzaTest {

	@Test
	public void shouldBeAbleToReturnPizzaPrice() throws InvalidOrderException {
		Pizza pizza = new Pizza("Chicken Maxicana","Cheese Burst");
		int price=pizza.getPizzaPrice();
		assertEquals(300,price);
	}
	
	@Test
	public void shouldBeAbleToCalculatePizzaPriceWithTopping() throws InvalidCrustException, InvalidOrderException {
		Pizza pizza = new Pizza("Chicken Maxicana");
	
		List<String> extraTopping= new ArrayList<String>();
		extraTopping.add("Chicken Sausage");
		extraTopping.add("Chicken Salami");
		extraTopping.add("Tomato");
		
		pizza.setExtraTopping(extraTopping);
		
		int totalPrice=pizza.getTotalPrice();
		assertEquals(515,totalPrice);
		
	}
	
	@Test(expected = InvalidOrderException.class)
	public void shouldNotAcceptSmallCheeseBurst() throws InvalidOrderException {
		Pizza pizza = new Pizza("Chicken Maxicana","Cheese Burst","Small");
	}
	@Test(expected = InvalidOrderException.class)
	public void shouldNotAcceptLargeCheeseBurst() throws InvalidOrderException {
		Pizza pizza = new Pizza("Chicken Maxicana","Cheese Burst","Large");
	}

}
