/**
 * 
 */
package com.pizzahut.pizza.order;

import org.junit.Test;

import com.pizzahut.pizza.db.PizzaDB;

/**
 * @author virendra
 *
 */
public class OrderTest {
	
	@Test
	public void shouldAbleAddMoreThanOnePizzaInOrder() {
		Order order = new Order();
		order.addPizza(new Pizza(PizzaDB.ChickenMaxicana_Medium.getPizza())); 
		order.addPizza(new Pizza(PizzaDB.Margherita_Medium.getPizza()));
	}
	
}
