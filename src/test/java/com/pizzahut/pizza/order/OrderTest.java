/**
 * 
 */
package com.pizzahut.pizza.order;

import org.junit.Test;

import com.pizzahut.pizza.db.CrustDB;
import com.pizzahut.pizza.db.PizzaDB;
import com.pizzahut.pizza.db.ToppingDB;
import com.pizzahut.pizza.exception.EmptyCartException;
import com.pizzahut.pizza.exception.InvalidOrderException;
import com.pizzahut.pizza.manager.PizzaHutOnlineShop;

import junit.framework.Assert;

/**
 * @author virendra
 *
 */
public class OrderTest {
	
	@Test(expected=InvalidOrderException.class)
	public void shouldThrowExceptionIfOrderIsNotCreated() {
		PizzaHutOnlineShop pizzaHutOnlineShop = new PizzaHutOnlineShop();
		pizzaHutOnlineShop.placeOrder();
	}
	
	@Test(expected=EmptyCartException.class)
	public void shouldThrowExceptionIfCartIsEmpty() {
		PizzaHutOnlineShop pizzaHutOnlineShop = new PizzaHutOnlineShop();
		Order order = new Order(null);
		pizzaHutOnlineShop.setOrder(order);
		pizzaHutOnlineShop.placeOrder();
	}
	
	@Test
	public void shouldAbleAddMoreThanOnePizzaInCart() {
		PizzaHutOnlineShop pizzaHutOnlineShop = new PizzaHutOnlineShop();
		Cart cart = new Cart();
		Order order = new Order(cart);
		pizzaHutOnlineShop.setOrder(order);
		cart.addPizza(new Pizza(PizzaDB.ChickenMaxicana.getPizza())); 
		cart.addPizza(new Pizza(PizzaDB.Margherita.getPizza()));
	}
	
	@Test
	public void shouldGiveTotalCostAfterOrderPlcaed() {
		PizzaHutOnlineShop pizzaHutOnlineShop = new PizzaHutOnlineShop();
		Cart cart = new Cart();
		Order order = new Order(cart);
		pizzaHutOnlineShop.setOrder(order);
		cart.addPizza(new Pizza(PizzaDB.ChickenMaxicana.getPizza())); 
		cart.addPizza(new Pizza(PizzaDB.Margherita.getPizza()));
		double cost = pizzaHutOnlineShop.placeOrder();
		System.out.println("cost : " + cost);
		Assert.assertEquals(562.5, cost);
		
		pizzaHutOnlineShop = new PizzaHutOnlineShop();
		cart = new Cart();
		order = new Order(cart);
		pizzaHutOnlineShop.setOrder(order);
		Pizza pizza1 = new Pizza(PizzaDB.ChickenMaxicana.getPizza());
		pizza1.addAdditionalTopping(ToppingDB.Olives.getTopping());
		cart.addPizza(pizza1); 
		cart.addPizza(new Pizza(PizzaDB.Margherita.getPizza()));
		cost = pizzaHutOnlineShop.placeOrder();
		System.out.println("cost : " + cost);
		Assert.assertEquals(581.25, cost);
		
		pizzaHutOnlineShop = new PizzaHutOnlineShop();
		cart = new Cart();
		order = new Order(cart);
		pizzaHutOnlineShop.setOrder(order);
		pizza1 = new Pizza(PizzaDB.ChickenMaxicana.getPizza());
		pizza1.setCrust(CrustDB.CheeseBurst.getCrust());;
		cart.addPizza(pizza1); 
		cart.addPizza(new Pizza(PizzaDB.Margherita.getPizza()));
		cost = pizzaHutOnlineShop.placeOrder();
		System.out.println("cost : " + cost);
		Assert.assertEquals(812.5, cost);
		
		pizzaHutOnlineShop = new PizzaHutOnlineShop();
		cart = new Cart();
		order = new Order(cart);
		pizzaHutOnlineShop.setOrder(order);
		pizza1 = new Pizza(PizzaDB.VegHawaiianDelight.getPizza());
		pizza1.addAdditionalTopping(ToppingDB.Olives.getTopping());
		pizza1.addAdditionalTopping(ToppingDB.Cheese.getTopping());
		pizza1.setCrust(CrustDB.PanPizza.getCrust());;
		cart.addPizza(pizza1); 
		Pizza pizza2 = new Pizza(PizzaDB.NonVegHawaiianDelight.getPizza());
		pizza2.addAdditionalTopping(ToppingDB.BarbequeChicken.getTopping());
		pizza2.setCrust(CrustDB.CheeseBurst.getCrust());;
		cart.addPizza(pizza2); 
		cost = pizzaHutOnlineShop.placeOrder();
		System.out.println("cost : " + cost);
		Assert.assertEquals(1068.75, cost);
		
		pizzaHutOnlineShop = new PizzaHutOnlineShop();
		cart = new Cart();
		order = new Order(cart);
		pizzaHutOnlineShop.setOrder(order);
		cart.addPizza(new Pizza(PizzaDB.VeggieParadise.getPizza())); 
		cart.addPizza(new Pizza(PizzaDB.ZestyChicken.getPizza()));
		cart.addPizza(new Pizza(PizzaDB.ChickenMaxicana.getPizza()));
		cost = pizzaHutOnlineShop.placeOrder();
		System.out.println("cost : " + cost);
		Assert.assertEquals(1012.5, cost);
	}
	
	@Test
	public void shouldAbleToAddToppings() {
		PizzaHutOnlineShop pizzaHutOnlineShop = new PizzaHutOnlineShop();
		Cart cart = new Cart();
		Order order = new Order(cart);
		pizzaHutOnlineShop.setOrder(order);
		Pizza pizza1 = new Pizza(PizzaDB.ChickenMaxicana.getPizza());
		pizza1.addAdditionalTopping(ToppingDB.Olives.getTopping());
		cart.addPizza(pizza1); 
		cart.addPizza(new Pizza(PizzaDB.Margherita.getPizza()));
	}
	
	@Test
	public void shouldAbleToAddCrust() {
		PizzaHutOnlineShop pizzaHutOnlineShop = new PizzaHutOnlineShop();
		Cart cart = new Cart();
		Order order = new Order(cart);
		pizzaHutOnlineShop.setOrder(order);
		Pizza pizza1 = new Pizza(PizzaDB.ChickenMaxicana.getPizza());
		pizza1.setCrust(CrustDB.CheeseBurst.getCrust());;
		cart.addPizza(pizza1); 
		cart.addPizza(new Pizza(PizzaDB.Margherita.getPizza()));
	}
	
	
	
	

}
