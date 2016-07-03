package com.bitwise.pizzaShop.pizza.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.bitwise.pizzaShop.pizza.Crust;
import com.bitwise.pizzaShop.pizza.Pizza;
import com.bitwise.pizzaShop.pizza.PizzaOrder;

public class PizzaOrderTest {

	//@Test(expected = PizzaShopException.class)
	public void testInvalidOrder(){
		PizzaOrder order = new PizzaOrder();
		Pizza p = new Pizza();
		order.addPizza(p);
	}
	
	//@Test
	public void testValidOrder(){
		PizzaOrder order = new PizzaOrder();
		Pizza p = new Pizza("Hawaiian Delight Veg");
		order.addPizza(p);
		order.calculateOrderAmount();
	}
	
	//@Test
	public void testCalculateAmount(){
		PizzaOrder order = new PizzaOrder();
		Pizza p = new Pizza("Hawaiian Delight Veg");
		order.addPizza(p);
		p.removeAllDefaultTopping();
		Pizza p2 = new Pizza("Hawaiian Delight Non Veg");
		p2.setCrust(new Crust("Cheese Burst"));	
		
		p2.addTopping("Panner");
		
		order.addPizza(p2);
		order.showOrderDetails();
		assertEquals(253.00, order.calculateOrderAmount(), 0);
	}
	
	@Test
	public void order1Test(){
		PizzaOrder order = new PizzaOrder();
		Pizza pizza1 = new Pizza("Veggie Paradise");
		order.addPizza(pizza1);
		Pizza pizza2 = new Pizza("Zesty Chicken");
		order.addPizza(pizza2);
		Pizza pizza3 = new Pizza("Chicken Maxicana");
		order.addPizza(pizza3);
		
		assertEquals(1012.5, order.calculateOrderAmount(), 0.0);
	}
	
	@Test
	public void order2Test(){
		PizzaOrder order = new PizzaOrder();
		Pizza pizza1 = new Pizza("Hawaiian Delight Veg");
		pizza1.addTopping("Olives");
		pizza1.addTopping("Cheese");
		pizza1.ReplaceCrust("Pan Pizza");
		order.addPizza(pizza1);
		
		Pizza pizza2 = new Pizza("Hawaiian Delight Non Veg");
		pizza2.addTopping("Barbeque Chicken");
		pizza2.ReplaceCrust("Cheese Burst");
		order.addPizza(pizza2);
		
		order.showOrderDetails();
		assertEquals(1068.75, order.calculateOrderAmount(), 0.0);
	}
	
	@Test
	public void order3Test(){
		PizzaOrder order = new PizzaOrder();
		Pizza pizza1 = new Pizza("Peppy Paneer");
		pizza1.removeDefaultTopping("Capsicum");
		pizza1.addTopping("Olives");
		pizza1.addTopping("Baby Corn");
		pizza1.ReplaceCrust("Thin Crust");
		order.addPizza(pizza1);
		
		Pizza pizza2 = new Pizza("Peppy Paneer");
		pizza2.removeDefaultTopping("Capsicum");
		pizza2.addTopping("Olives");
		pizza2.addTopping("Baby Corn");
		pizza2.ReplaceCrust("Thin Crust");
		order.addPizza(pizza2);
		
		Pizza pizza3 = new Pizza("Peppy Paneer");
		pizza3.removeDefaultTopping("Capsicum");
		pizza3.removeAllDefaultTopping();
		pizza3.addTopping("Cheese");
		pizza3.ReplaceCrust("Thin Crust");
		order.addPizza(pizza3);
		
		Pizza pizza4 = new Pizza("Peppy Paneer");
		pizza4.removeDefaultTopping("Capsicum");
		pizza4.removeAllDefaultTopping();
		pizza4.addTopping("Cheese");
		pizza4.ReplaceCrust("Thin Crust");
		order.addPizza(pizza4);
		
		Pizza pizza5 = new Pizza("Margherita");
		order.addPizza(pizza5);
		
		Pizza pizza6 = new Pizza("Hawaiian Delight Veg");
		order.addPizza(pizza6);
		
		Pizza pizza7 = new Pizza("Zesty Chicken");
		pizza7.ReplaceCrust("Cheese Burst");
		pizza7.removeDefaultTopping("Paprika");
		pizza7.addTopping("Baby Corn");
		pizza7.addTopping("Olives");
		pizza7.addTopping("Onion");
		order.addPizza(pizza7);
		
		assertEquals(3093.75, order.calculateOrderAmount(), 0.0);
	}
	
	@Test
	public void order4Test(){
		PizzaOrder order = new PizzaOrder();
		Pizza pizza1 = new Pizza("Cloud 9");
		pizza1.ReplaceCrust("Thin Crust");
		pizza1.removeDefaultTopping("Capsicum");
		pizza1.addTopping("Olives");
		pizza1.addTopping("Baby Corn");
		order.addPizza(pizza1);
		
		Pizza pizza2 = new Pizza("Cloud 9");
		pizza2.ReplaceCrust("Thin Crust");
		pizza2.removeDefaultTopping("Capsicum");
		pizza2.addTopping("Olives");
		pizza2.addTopping("Baby Corn");
		order.addPizza(pizza2);
		
		Pizza pizza3 = new Pizza("Cloud 9");
		pizza3.setPizzaSize("Small");
		order.addPizza(pizza3);
		
		Pizza pizza4 = new Pizza("Cloud 9");
		pizza4.setPizzaSize("Large");
		pizza4.addTopping("Cheese");
		order.addPizza(pizza4);
		
		Pizza pizza5 = new Pizza("Seventh Heaven");
		pizza5.setPizzaSize("Large");
		pizza5.addTopping("Smoked Chicken");
		order.addPizza(pizza5);
		
		Pizza pizza6 = new Pizza("Hawaiian Delight Veg");
		pizza6.setPizzaSize("Small");
		order.addPizza(pizza6);
		
		Pizza pizza7 = new Pizza("Zesty Chicken");
		pizza7.setPizzaSize("Medium");
		pizza7.removeDefaultTopping("Paprika");
		pizza7.addTopping("Baby Corn");
		pizza7.addTopping("Olives");
		pizza7.addTopping("Onion");
		order.addPizza(pizza7);
		
		assertEquals(2875, order.calculateOrderAmount(), 0.0);
	}
}
