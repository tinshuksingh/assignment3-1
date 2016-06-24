package com.bitwise.pizzaShop.pizza.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.bitwise.pizzaShop.exception.PizzaShopException;
import com.bitwise.pizzaShop.pizza.Pizza;
import com.bitwise.pizzaShop.pizza.PizzaOrder;

public class PizzaOrderTest {

	@Test(expected = PizzaShopException.class)
	public void testInvalidOrder(){
		PizzaOrder order = new PizzaOrder();
		Pizza p = new Pizza();
		order.addPizza(p);
	}
	
	@Test
	public void testValidOrder(){
		PizzaOrder order = new PizzaOrder();
		Pizza p = new Pizza();
		p.setName("Hawaiian Delight Veg");
		order.addPizza(p);
		order.calculateOrderAmount();
	}
	
	@Test
	public void testCalculateAmount(){
		PizzaOrder order = new PizzaOrder();
		Pizza p = new Pizza();
		p.setName("Hawaiian Delight Veg");
		order.addPizza(p);
		assertEquals(253.00, order.calculateOrderAmount(), 0);
	}
}
