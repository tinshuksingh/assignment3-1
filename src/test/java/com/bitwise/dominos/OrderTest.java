package com.bitwise.dominos;

import static org.junit.Assert.*;

import org.junit.Test;

public class OrderTest {

	@Test
	public void shouldReturnMultiplePizzaPriceWithTax() throws InvalidOrderException, InvalidCrustException {
		Order order = new Order();
		order.setVat(10);
		order.setServiceTax(15);
		Pizza pizza = new Pizza("Chicken Maxicana",null,null);
		order.getPizzaList().add(pizza);
		pizza = new Pizza("Veggie Paradise", null, null);
		order.getPizzaList().add(pizza);
		pizza = new Pizza("Zesty Chicken", null, null);
		order.getPizzaList().add(pizza);
		
		float totalPrice=order.getTotalAmount();
		assertEquals(1012.5,totalPrice,2);
		
	}
	
	@Test
	public void shouldReturnMultiplePizzaPriceWithTaxAndAddExtraToppingAndCrust() throws InvalidOrderException, InvalidCrustException {
		Order order = new Order();
		order.setVat(10);
		order.setServiceTax(15);
		Pizza pizza = new Pizza("Hawaiian Delight Veg",null,"Pan Pizza");
		pizza.getExtraTopping().add("Cheese");
		pizza.getExtraTopping().add("Olives");
		order.getPizzaList().add(pizza);
		pizza = new Pizza("Hawaiian Delight NonVeg", null, "Cheese Burst");
		pizza.getExtraTopping().add("Barbeque Chicken");
		order.getPizzaList().add(pizza);
		
		
		float totalPrice=order.getTotalAmount();
		assertEquals(1068.75,totalPrice,2);
		
	}

	@Test(expected = InvalidOrderException.class)
	public void shouldThrowExceptionIfPizzaListIsNull() throws InvalidOrderException, InvalidCrustException
	{
		Order order = new Order();
		order.setPizzaList(null);
		order.getTotalAmount();
	}
	
	@Test(expected = InvalidOrderException.class)
	public void shouldThrowExceptionIfPizzaListIsEmpty() throws InvalidOrderException, InvalidCrustException
	{
		Order order = new Order();
		order.getTotalAmount();
	}

}
