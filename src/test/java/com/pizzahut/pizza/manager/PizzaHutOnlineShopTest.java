package com.pizzahut.pizza.manager;

import static org.junit.Assert.*;

import org.junit.Test;

import com.pizzahut.pizza.db.PizzaDB;
import com.pizzahut.pizza.exception.InvalidOrderException;
import com.pizzahut.pizza.order.Crust;
import com.pizzahut.pizza.order.Order;
import com.pizzahut.pizza.order.Pizza;
import com.pizzahut.pizza.order.Topping;

import junit.framework.Assert;

public class PizzaHutOnlineShopTest {

	@Test(expected=InvalidOrderException.class)
	public void shouldThrowExceptionIfOrderIsNotCreated() {
		PizzaHutOnlineShop pizzaHutOnlineShop = new PizzaHutOnlineShop();
		pizzaHutOnlineShop.placeOrder();
	}
	
	@Test(expected=InvalidOrderException.class)
	public void shouldThrowExceptionIfOrderIsEmpty() {
		PizzaHutOnlineShop pizzaHutOnlineShop = new PizzaHutOnlineShop();
		Order order = new Order();
		pizzaHutOnlineShop.setOrder(order);
		pizzaHutOnlineShop.placeOrder();
	}
	
	@Test
	public void shouldGiveTotalCostAfterOrderPlcaed1() {
		PizzaHutOnlineShop pizzaHutOnlineShop = new PizzaHutOnlineShop();
		Order order = new Order();
		pizzaHutOnlineShop.setOrder(order);
		order.addPizza(new Pizza(PizzaDB.ChickenMaxicana_Medium.getPizza())); 
		order.addPizza(new Pizza(PizzaDB.Margherita_Medium.getPizza()));
		double cost = pizzaHutOnlineShop.placeOrder();
		Assert.assertEquals(562.5, cost);
	}
	
	@Test
	public void shouldGiveTotalCostAfterOrderPlcaed2() {
		PizzaHutOnlineShop pizzaHutOnlineShop;
		 ;
		Order order;
		double cost;
		pizzaHutOnlineShop = new PizzaHutOnlineShop();
		order = new Order();
		pizzaHutOnlineShop.setOrder(order);
		Pizza pizza1 = new Pizza(PizzaDB.ChickenMaxicana_Medium.getPizza());
		pizza1.addAdditionalTopping(Topping.Olives);
		order.addPizza(pizza1); 
		order.addPizza(new Pizza(PizzaDB.Margherita_Medium.getPizza()));
		cost = pizzaHutOnlineShop.placeOrder();
		Assert.assertEquals(581.25, cost);
	}
	
	@Test
	public void shouldGiveTotalCostAfterOrderPlcaed3() {
		PizzaHutOnlineShop pizzaHutOnlineShop;
		 ;
		Order order;
		double cost;
		Pizza pizza1;
		pizzaHutOnlineShop = new PizzaHutOnlineShop();
		order = new Order();
		pizzaHutOnlineShop.setOrder(order);
		pizza1 = new Pizza(PizzaDB.ChickenMaxicana_Medium.getPizza());
		pizza1.setCrust(Crust.CheeseBurst);;
		order.addPizza(pizza1); 
		order.addPizza(new Pizza(PizzaDB.Margherita_Medium.getPizza()));
		cost = pizzaHutOnlineShop.placeOrder();
		Assert.assertEquals(812.5, cost);
	}
	
	@Test
	public void shouldGiveTotalCostAfterOrderPlcaed4() {
		PizzaHutOnlineShop pizzaHutOnlineShop;
		 ;
		Order order;
		double cost;
		Pizza pizza1;
		pizzaHutOnlineShop = new PizzaHutOnlineShop();
		order = new Order();
		pizzaHutOnlineShop.setOrder(order);
		pizza1 = new Pizza(PizzaDB.VegHawaiianDelight_Medium.getPizza());
		pizza1.addAdditionalTopping(Topping.Olives);
		pizza1.addAdditionalTopping(Topping.Cheese);
		pizza1.setCrust(Crust.PanPizza);;
		order.addPizza(pizza1); 
		Pizza pizza2 = new Pizza(PizzaDB.NonVegHawaiianDelight_Medium.getPizza());
		pizza2.addAdditionalTopping(Topping.BarbequeChicken);
		pizza2.setCrust(Crust.CheeseBurst);;
		order.addPizza(pizza2); 
		cost = pizzaHutOnlineShop.placeOrder();
		Assert.assertEquals(1068.75, cost);
	}

	@Test
	public void shouldGiveTotalCostAfterOrderPlcaed5() {
		PizzaHutOnlineShop pizzaHutOnlineShop;
		 ;
		Order order;
		double cost;
		pizzaHutOnlineShop = new PizzaHutOnlineShop();
		order = new Order();
		pizzaHutOnlineShop.setOrder(order);
		order.addPizza(new Pizza(PizzaDB.VeggieParadise_Medium.getPizza())); 
		order.addPizza(new Pizza(PizzaDB.ZestyChicken_Medium.getPizza()));
		order.addPizza(new Pizza(PizzaDB.ChickenMaxicana_Medium.getPizza()));
		cost = pizzaHutOnlineShop.placeOrder();
		Assert.assertEquals(1012.5, cost);
	}

	

	@Test
	public void shouldGiveTotalCostAfterOrderPlcaed6() {
		PizzaHutOnlineShop pizzaHutOnlineShop;
		 ;
		Order order;
		double cost;
		Pizza pizza1;
		Pizza pizza2;
		pizzaHutOnlineShop = new PizzaHutOnlineShop();
		order = new Order();
		pizzaHutOnlineShop.setOrder(order);
		pizza1 = new Pizza(PizzaDB.PeppyPaneer_Medium.getPizza());
		pizza2 = new Pizza(PizzaDB.PeppyPaneer_Medium.getPizza());
		Pizza pizza3 = new Pizza(PizzaDB.PeppyPaneer_Medium.getPizza());
		Pizza pizza4 = new Pizza(PizzaDB.PeppyPaneer_Medium.getPizza());
		pizza1.removeDefaultTopping(Topping.Capsicum);
		pizza2.removeDefaultTopping(Topping.Capsicum);
		
		pizza1.addAdditionalTopping(Topping.Olives);
		pizza2.addAdditionalTopping(Topping.Olives);
		
		pizza1.addAdditionalTopping(Topping.BabyCorn);
		pizza2.addAdditionalTopping(Topping.BabyCorn);
		
		pizza3.addAdditionalTopping(Topping.Cheese);
		pizza4.addAdditionalTopping(Topping.Cheese);
		
		pizza1.setCrust(Crust.ThinCrust);;
		pizza2.setCrust(Crust.ThinCrust);;
		pizza3.setCrust(Crust.ThinCrust);;
		pizza4.setCrust(Crust.ThinCrust);;
		
		Pizza pizza5 = new Pizza(PizzaDB.Margherita_Medium.getPizza());
		Pizza pizza6 = new Pizza(PizzaDB.VegHawaiianDelight_Medium.getPizza());
		
		Pizza pizza7 = new Pizza(PizzaDB.ZestyChicken_Medium.getPizza());
		
		pizza7.setCrust(Crust.CheeseBurst);;
		
		pizza7.removeDefaultTopping(Topping.Paprika);
		
		pizza7.addAdditionalTopping(Topping.BabyCorn);
		pizza7.addAdditionalTopping(Topping.Olives);
		pizza7.addAdditionalTopping(Topping.Onion);
		
		order.addPizza(pizza1);
		order.addPizza(pizza2);
		order.addPizza(pizza3);
		order.addPizza(pizza4);
		order.addPizza(pizza5);
		order.addPizza(pizza6);
		order.addPizza(pizza7);
		cost = pizzaHutOnlineShop.placeOrder();
		Assert.assertEquals(3093.75, cost);
	}
	
	@Test
	public void shouldGiveTotalCostAfterOrderPlcaed7() {
		PizzaHutOnlineShop pizzaHutOnlineShop;
		 ;
		Order order;
		double cost;
		Pizza pizza1;
		Pizza pizza2;
		Pizza pizza3;
		Pizza pizza4;
		Pizza pizza5;
		Pizza pizza6;
		Pizza pizza7;
		pizzaHutOnlineShop = new PizzaHutOnlineShop();
		order = new Order();
		pizzaHutOnlineShop.setOrder(order);
		pizza1 = new Pizza(PizzaDB.Cloud9_Medium.getPizza());
		pizza2 = new Pizza(PizzaDB.Cloud9_Medium.getPizza());
		pizza3 = new Pizza(PizzaDB.Cloud9_Small.getPizza());
		pizza4 = new Pizza(PizzaDB.Cloud9_Large.getPizza());
		
		pizza1.setCrust(Crust.ThinCrust);;
		pizza2.setCrust(Crust.ThinCrust);;
		
		pizza1.removeDefaultTopping(Topping.Capsicum);
		pizza2.removeDefaultTopping(Topping.Capsicum);
		
		pizza1.addAdditionalTopping(Topping.Olives);
		pizza2.addAdditionalTopping(Topping.Olives);
		
		pizza1.addAdditionalTopping(Topping.BabyCorn);
		pizza2.addAdditionalTopping(Topping.BabyCorn);
		
		
		pizza4.addAdditionalTopping(Topping.Cheese);
		
		
		pizza5 = new Pizza(PizzaDB.SeventhHeaven_Large.getPizza());
		pizza5.addAdditionalTopping(Topping.SmokedChicken);
		pizza5.addAdditionalTopping(Topping.Cheese);
		
		pizza6 = new Pizza(PizzaDB.VegHawaiianDelight_Small.getPizza());
		
		pizza7 = new Pizza(PizzaDB.ZestyChicken_Medium.getPizza());
		
		pizza7.setCrust(Crust.CheeseBurst);;
		
		pizza7.removeDefaultTopping(Topping.Paprika);
		
		pizza7.addAdditionalTopping(Topping.BabyCorn);
		pizza7.addAdditionalTopping(Topping.Olives);
		pizza7.addAdditionalTopping(Topping.Onion);
		
		order.addPizza(pizza1);
		order.addPizza(pizza2);
		order.addPizza(pizza3);
		order.addPizza(pizza4);
		order.addPizza(pizza5);
		order.addPizza(pizza6);
		order.addPizza(pizza7);
		cost = pizzaHutOnlineShop.placeOrder();
		Assert.assertEquals(3881.25, cost);
	}

}
