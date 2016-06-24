package com.bitwise.dominos;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class PizzaTest {

	@Test
	public void shouldBeAbleToReturnPizzaPrice() {
		Pizza pizza = new Pizza("Chicken Maxicana","Cheese Chicken Sauce","Cheese Burst");
		int price=pizza.getPizzaPrice();
		assertEquals(300,price);
	}
	
	@Test
	public void shouldBeAbleToCalculatePizzaPriceWithTopping() throws InvalidCrustException {
		Pizza pizza = new Pizza("Chicken Maxicana","Cheese Chicken Sauce","Cheese Burst");
	
		List<String> extraTopping= new ArrayList<String>();
		extraTopping.add("Chicken Sausage");
		extraTopping.add("Chicken Salami");
		extraTopping.add("Tomato");
		
		pizza.setExtraTopping(extraTopping);
		
		int totalPrice=pizza.getTotalPrice();
		assertEquals(515,totalPrice);
		
	}

}
