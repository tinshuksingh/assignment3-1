package com.pizzahut.pizza.order;

import static org.junit.Assert.*;

import org.junit.Test;

import com.pizzahut.pizza.db.PizzaDB;
import com.pizzahut.pizza.exception.InvalidCusumizationException;

import junit.framework.Assert;

public class PizzaTest {

	@Test
	public void shouldAbleToAddToppings() {
		Pizza pizza1 = new Pizza(PizzaDB.ChickenMaxicana_Medium.getPizza());
		pizza1.addAdditionalTopping(Topping.Olives);
	}
	
	@Test
	public void shouldAbleToAddCrust() {
		Pizza pizza1 = new Pizza(PizzaDB.ChickenMaxicana_Medium.getPizza());
		pizza1.setCrust(Crust.CheeseBurst);;
	}
	
	@Test
	public void shouldAbleToRemoveDefaultToppings() {
		Pizza pizza1 = new Pizza(PizzaDB.ChickenMaxicana_Medium.getPizza());
		pizza1.addAdditionalTopping(Topping.Olives);
		pizza1.removeDefaultTopping(Topping.Tomato);
		Assert.assertEquals(false, pizza1.getDefaultToppings().contains(Topping.Tomato));
	}
	
	@Test(expected=InvalidCusumizationException.class)
	public void shouldThrowExceptionIfTryToAddTopingsForSmallSizePizza() {
		Pizza pizza1 = new Pizza(PizzaDB.ChickenMaxicana_Small.getPizza());
		pizza1.addAdditionalTopping(Topping.Olives);
	}
	
	@Test(expected=InvalidCusumizationException.class)
	public void shouldThrowExceptionIfTryToRemoveDefaultTopingsForSmallSizePizza() {
		Pizza pizza1 = new Pizza(PizzaDB.ChickenMaxicana_Small.getPizza());
		pizza1.removeDefaultTopping(Topping.Tomato);
	}
	
	@Test(expected=InvalidCusumizationException.class)
	public void shouldThrowExceptionIfTryToAddCheeseBurstCrustToSmallPizza() {
		Pizza pizza1 = new Pizza(PizzaDB.ChickenMaxicana_Small.getPizza());
		pizza1.setCrust(Crust.CheeseBurst);;
	}
	
	@Test(expected=InvalidCusumizationException.class)
	public void shouldThrowExceptionIfTryToAddCheeseBurstCrustToLargePizza() {
		Pizza pizza1 = new Pizza(PizzaDB.ChickenMaxicana_Large.getPizza());
		pizza1.setCrust(Crust.CheeseBurst);;
	}

}
