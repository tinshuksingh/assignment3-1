package com.bitwise.dominos;

import static org.junit.Assert.*;

import org.junit.Test;

public class OrderTest {

	@Test
	public void shouldReturnMultiplePizzaPriceWithTax() throws InvalidOrderException {
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

	@Test(expected = InvalidOrderException.class)
	public void shouldThrowExceptionIfPizzaListIsNull() throws InvalidOrderException
	{
		Order order = new Order();
		order.setPizzaList(null);
		order.getTotalAmount();
	}
	
	@Test(expected = InvalidOrderException.class)
	public void shouldThrowExceptionIfPizzaListIsEmpty() throws InvalidOrderException
	{
		Order order = new Order();
		order.getTotalAmount();
	}

}
