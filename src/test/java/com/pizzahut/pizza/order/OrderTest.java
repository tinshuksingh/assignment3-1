/**
 * 
 */
package com.pizzahut.pizza.order;

import org.junit.Test;

import com.pizzahut.pizza.db.CrustDB;
import com.pizzahut.pizza.db.PizzaDB;
import com.pizzahut.pizza.db.ToppingDB;
import com.pizzahut.pizza.exception.EmptyCartException;
import com.pizzahut.pizza.exception.InvalidCusumizationException;
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
		cart.addPizza(new Pizza(PizzaDB.ChickenMaxicana_Medium.getPizza())); 
		cart.addPizza(new Pizza(PizzaDB.Margherita_Medium.getPizza()));
	}
	
	@Test
	public void shouldGiveTotalCostAfterOrderPlcaed() {
		PizzaHutOnlineShop pizzaHutOnlineShop = new PizzaHutOnlineShop();
		Cart cart = new Cart();
		Order order = new Order(cart);
		pizzaHutOnlineShop.setOrder(order);
		cart.addPizza(new Pizza(PizzaDB.ChickenMaxicana_Medium.getPizza())); 
		cart.addPizza(new Pizza(PizzaDB.Margherita_Medium.getPizza()));
		double cost = pizzaHutOnlineShop.placeOrder();
		Assert.assertEquals(562.5, cost);
	}

	@Test
	public void shouldGiveTotalCostAfterOrderPlcaed7() {
		PizzaHutOnlineShop pizzaHutOnlineShop;
		Cart cart;
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
		cart = new Cart();
		order = new Order(cart);
		pizzaHutOnlineShop.setOrder(order);
		pizza1 = new Pizza(PizzaDB.Cloud9_Medium.getPizza());
		pizza2 = new Pizza(PizzaDB.Cloud9_Medium.getPizza());
		pizza3 = new Pizza(PizzaDB.Cloud9_Small.getPizza());
		pizza4 = new Pizza(PizzaDB.Cloud9_Large.getPizza());
		
		pizza1.setCrust(CrustDB.ThinCrust.getCrust());;
		pizza2.setCrust(CrustDB.ThinCrust.getCrust());;
		
		pizza1.removeDefaultTopping(ToppingDB.Capsicum.getTopping());
		pizza2.removeDefaultTopping(ToppingDB.Capsicum.getTopping());
		
		pizza1.addAdditionalTopping(ToppingDB.Olives.getTopping());
		pizza2.addAdditionalTopping(ToppingDB.Olives.getTopping());
		
		pizza1.addAdditionalTopping(ToppingDB.BabyCorn.getTopping());
		pizza2.addAdditionalTopping(ToppingDB.BabyCorn.getTopping());
		
		
		pizza4.addAdditionalTopping(ToppingDB.Cheese.getTopping());
		
		
		pizza5 = new Pizza(PizzaDB.SeventhHeaven_Large.getPizza());
		pizza5.addAdditionalTopping(ToppingDB.SmokedChicken.getTopping());
		pizza5.addAdditionalTopping(ToppingDB.Cheese.getTopping());
		
		pizza6 = new Pizza(PizzaDB.VegHawaiianDelight_Small.getPizza());
		
		pizza7 = new Pizza(PizzaDB.ZestyChicken_Medium.getPizza());
		
		pizza7.setCrust(CrustDB.CheeseBurst.getCrust());;
		
		pizza7.removeDefaultTopping(ToppingDB.Paprika.getTopping());
		
		pizza7.addAdditionalTopping(ToppingDB.BabyCorn.getTopping());
		pizza7.addAdditionalTopping(ToppingDB.Olives.getTopping());
		pizza7.addAdditionalTopping(ToppingDB.Onion.getTopping());
		
		cart.addPizza(pizza1);
		cart.addPizza(pizza2);
		cart.addPizza(pizza3);
		cart.addPizza(pizza4);
		cart.addPizza(pizza5);
		cart.addPizza(pizza6);
		cart.addPizza(pizza7);
		cost = pizzaHutOnlineShop.placeOrder();
		Assert.assertEquals(3881.25, cost);
	}

	@Test
	public void shouldGiveTotalCostAfterOrderPlcaed6() {
		PizzaHutOnlineShop pizzaHutOnlineShop;
		Cart cart;
		Order order;
		double cost;
		Pizza pizza1;
		Pizza pizza2;
		pizzaHutOnlineShop = new PizzaHutOnlineShop();
		cart = new Cart();
		order = new Order(cart);
		pizzaHutOnlineShop.setOrder(order);
		pizza1 = new Pizza(PizzaDB.PeppyPaneer_Medium.getPizza());
		pizza2 = new Pizza(PizzaDB.PeppyPaneer_Medium.getPizza());
		Pizza pizza3 = new Pizza(PizzaDB.PeppyPaneer_Medium.getPizza());
		Pizza pizza4 = new Pizza(PizzaDB.PeppyPaneer_Medium.getPizza());
		pizza1.removeDefaultTopping(ToppingDB.Capsicum.getTopping());
		pizza2.removeDefaultTopping(ToppingDB.Capsicum.getTopping());
		
		pizza1.addAdditionalTopping(ToppingDB.Olives.getTopping());
		pizza2.addAdditionalTopping(ToppingDB.Olives.getTopping());
		
		pizza1.addAdditionalTopping(ToppingDB.BabyCorn.getTopping());
		pizza2.addAdditionalTopping(ToppingDB.BabyCorn.getTopping());
		
		pizza3.addAdditionalTopping(ToppingDB.Cheese.getTopping());
		pizza4.addAdditionalTopping(ToppingDB.Cheese.getTopping());
		
		pizza1.setCrust(CrustDB.ThinCrust.getCrust());;
		pizza2.setCrust(CrustDB.ThinCrust.getCrust());;
		pizza3.setCrust(CrustDB.ThinCrust.getCrust());;
		pizza4.setCrust(CrustDB.ThinCrust.getCrust());;
		
		Pizza pizza5 = new Pizza(PizzaDB.Margherita_Medium.getPizza());
		Pizza pizza6 = new Pizza(PizzaDB.VegHawaiianDelight_Medium.getPizza());
		
		Pizza pizza7 = new Pizza(PizzaDB.ZestyChicken_Medium.getPizza());
		
		pizza7.setCrust(CrustDB.CheeseBurst.getCrust());;
		
		pizza7.removeDefaultTopping(ToppingDB.Paprika.getTopping());
		
		pizza7.addAdditionalTopping(ToppingDB.BabyCorn.getTopping());
		pizza7.addAdditionalTopping(ToppingDB.Olives.getTopping());
		pizza7.addAdditionalTopping(ToppingDB.Onion.getTopping());
		
		cart.addPizza(pizza1);
		cart.addPizza(pizza2);
		cart.addPizza(pizza3);
		cart.addPizza(pizza4);
		cart.addPizza(pizza5);
		cart.addPizza(pizza6);
		cart.addPizza(pizza7);
		cost = pizzaHutOnlineShop.placeOrder();
		Assert.assertEquals(3093.75, cost);
	}

	@Test
	public void shouldGiveTotalCostAfterOrderPlcaed5() {
		PizzaHutOnlineShop pizzaHutOnlineShop;
		Cart cart;
		Order order;
		double cost;
		pizzaHutOnlineShop = new PizzaHutOnlineShop();
		cart = new Cart();
		order = new Order(cart);
		pizzaHutOnlineShop.setOrder(order);
		cart.addPizza(new Pizza(PizzaDB.VeggieParadise_Medium.getPizza())); 
		cart.addPizza(new Pizza(PizzaDB.ZestyChicken_Medium.getPizza()));
		cart.addPizza(new Pizza(PizzaDB.ChickenMaxicana_Medium.getPizza()));
		cost = pizzaHutOnlineShop.placeOrder();
		Assert.assertEquals(1012.5, cost);
	}
	
	@Test
	public void shouldGiveTotalCostAfterOrderPlcaed4() {
		PizzaHutOnlineShop pizzaHutOnlineShop;
		Cart cart;
		Order order;
		double cost;
		Pizza pizza1;
		pizzaHutOnlineShop = new PizzaHutOnlineShop();
		cart = new Cart();
		order = new Order(cart);
		pizzaHutOnlineShop.setOrder(order);
		pizza1 = new Pizza(PizzaDB.VegHawaiianDelight_Medium.getPizza());
		pizza1.addAdditionalTopping(ToppingDB.Olives.getTopping());
		pizza1.addAdditionalTopping(ToppingDB.Cheese.getTopping());
		pizza1.setCrust(CrustDB.PanPizza.getCrust());;
		cart.addPizza(pizza1); 
		Pizza pizza2 = new Pizza(PizzaDB.NonVegHawaiianDelight_Medium.getPizza());
		pizza2.addAdditionalTopping(ToppingDB.BarbequeChicken.getTopping());
		pizza2.setCrust(CrustDB.CheeseBurst.getCrust());;
		cart.addPizza(pizza2); 
		cost = pizzaHutOnlineShop.placeOrder();
		Assert.assertEquals(1068.75, cost);
	}

	@Test
	public void shouldGiveTotalCostAfterOrderPlcaed3() {
		PizzaHutOnlineShop pizzaHutOnlineShop;
		Cart cart;
		Order order;
		double cost;
		Pizza pizza1;
		pizzaHutOnlineShop = new PizzaHutOnlineShop();
		cart = new Cart();
		order = new Order(cart);
		pizzaHutOnlineShop.setOrder(order);
		pizza1 = new Pizza(PizzaDB.ChickenMaxicana_Medium.getPizza());
		pizza1.setCrust(CrustDB.CheeseBurst.getCrust());;
		cart.addPizza(pizza1); 
		cart.addPizza(new Pizza(PizzaDB.Margherita_Medium.getPizza()));
		cost = pizzaHutOnlineShop.placeOrder();
		Assert.assertEquals(812.5, cost);
	}

	@Test
	public void shouldGiveTotalCostAfterOrderPlcaed2() {
		PizzaHutOnlineShop pizzaHutOnlineShop;
		Cart cart;
		Order order;
		double cost;
		pizzaHutOnlineShop = new PizzaHutOnlineShop();
		cart = new Cart();
		order = new Order(cart);
		pizzaHutOnlineShop.setOrder(order);
		Pizza pizza1 = new Pizza(PizzaDB.ChickenMaxicana_Medium.getPizza());
		pizza1.addAdditionalTopping(ToppingDB.Olives.getTopping());
		cart.addPizza(pizza1); 
		cart.addPizza(new Pizza(PizzaDB.Margherita_Medium.getPizza()));
		cost = pizzaHutOnlineShop.placeOrder();
		Assert.assertEquals(581.25, cost);
	}
	
	@Test
	public void shouldAbleToAddToppings() {
		PizzaHutOnlineShop pizzaHutOnlineShop = new PizzaHutOnlineShop();
		Cart cart = new Cart();
		Order order = new Order(cart);
		pizzaHutOnlineShop.setOrder(order);
		Pizza pizza1 = new Pizza(PizzaDB.ChickenMaxicana_Medium.getPizza());
		pizza1.addAdditionalTopping(ToppingDB.Olives.getTopping());
		cart.addPizza(pizza1); 
		cart.addPizza(new Pizza(PizzaDB.Margherita_Medium.getPizza()));
	}
	
	@Test
	public void shouldAbleToAddCrust() {
		PizzaHutOnlineShop pizzaHutOnlineShop = new PizzaHutOnlineShop();
		Cart cart = new Cart();
		Order order = new Order(cart);
		pizzaHutOnlineShop.setOrder(order);
		Pizza pizza1 = new Pizza(PizzaDB.ChickenMaxicana_Medium.getPizza());
		pizza1.setCrust(CrustDB.CheeseBurst.getCrust());;
		cart.addPizza(pizza1); 
		cart.addPizza(new Pizza(PizzaDB.Margherita_Medium.getPizza()));
	}
	
	@Test
	public void shouldAbleToRemoveDefaultToppings() {
		PizzaHutOnlineShop pizzaHutOnlineShop = new PizzaHutOnlineShop();
		Cart cart = new Cart();
		Order order = new Order(cart);
		pizzaHutOnlineShop.setOrder(order);
		Pizza pizza1 = new Pizza(PizzaDB.ChickenMaxicana_Medium.getPizza());
		pizza1.addAdditionalTopping(ToppingDB.Olives.getTopping());
		pizza1.removeDefaultTopping(ToppingDB.Tomato.getTopping());
		Assert.assertEquals(false, pizza1.getDefaultToppings().contains(ToppingDB.Tomato.getTopping()));
		//cart.addPizza(pizza1); 
		//cart.addPizza(new Pizza(PizzaDB.Margherita.getPizza()));
	}
	
	@Test(expected=InvalidCusumizationException.class)
	public void shouldThrowExceptionIfTryToAddTopingsForSmallSizePizza() {
		Pizza pizza1 = new Pizza(PizzaDB.ChickenMaxicana_Small.getPizza());
		pizza1.addAdditionalTopping(ToppingDB.Olives.getTopping());
	}
	
	@Test(expected=InvalidCusumizationException.class)
	public void shouldThrowExceptionIfTryToRemoveDefaultTopingsForSmallSizePizza() {
		Pizza pizza1 = new Pizza(PizzaDB.ChickenMaxicana_Small.getPizza());
		pizza1.removeDefaultTopping(ToppingDB.Tomato.getTopping());
	}
	
	@Test(expected=InvalidCusumizationException.class)
	public void shouldThrowExceptionIfTryToAddCheeseBurstCrustToSmallPizza() {
		Pizza pizza1 = new Pizza(PizzaDB.ChickenMaxicana_Small.getPizza());
		pizza1.setCrust(CrustDB.CheeseBurst.getCrust());;
	}
	
	@Test(expected=InvalidCusumizationException.class)
	public void shouldThrowExceptionIfTryToAddCheeseBurstCrustToLargePizza() {
		Pizza pizza1 = new Pizza(PizzaDB.ChickenMaxicana_Large.getPizza());
		pizza1.setCrust(CrustDB.CheeseBurst.getCrust());;
	}

}
