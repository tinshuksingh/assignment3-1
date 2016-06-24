package com.bitwise.pizzaShop.pizza.test;

import org.junit.Test;

import com.bitwise.pizzaShop.exception.PizzaShopException;
import com.bitwise.pizzaShop.pizza.Pizza;

public class PizzaTest {

	@Test(expected = PizzaShopException.class)
	public void emptyPizzaName(){
		Pizza p1 = new Pizza();
		p1.validPizza();
	}
	
	@Test(expected = PizzaShopException.class)
	public void testInvalidPizzaName(){
		Pizza p1 = new Pizza();
		p1.setName("Bitwise");
		p1.validPizza();
	}
	
	@Test
	public void testValidPizza(){
		Pizza piz = new Pizza();
		piz.setName("Margherita");
		piz.validPizza();
	}
	
	@Test(expected = PizzaShopException.class)
	public void addInvalidTopping(){
		Pizza piz = new Pizza();
		piz.setName("Margherita");
		piz.addTopping("Banana");
		piz.validPizza();
	}
	
	@Test
	public void addValidTopping(){
		Pizza piz = new Pizza();
		piz.setName("Margherita");
		piz.addTopping("Onion");
		piz.validPizza();
	}
	
	@Test(expected = PizzaShopException.class)
	public void addInvalidCrust(){
		Pizza piz = new Pizza();
		piz.setName("Margherita");
		piz.addTopping("XYZ");
		piz.validPizza();
	}
	
	@Test
	public void addValidCrust(){
		Pizza piz = new Pizza();
		piz.setName("Margherita");
		piz.ReplaceCrust("Cheese Burst");
		piz.validPizza();
	}
	
	
}
