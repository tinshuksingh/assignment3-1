package com.bitwise.unitTest;

import static org.junit.Assert.*;

import java.util.List;
import java.util.ArrayList;

import org.junit.Test;

import com.bitwise.VO.Pizza;
import com.bitwise.VO.PizzaOrder;
import com.bitwise.util.PizzaUtil;

public class PizzaUtilTest {

	@Test
	public void checkBasicOrder() {
		List<String> top = new ArrayList<String>();
		top.add("Tomato");
		top.add("Pineapple");

		Pizza pizza = new Pizza("Margherita", top, "Pan Pizza");

		List<Pizza> pizzaList = new ArrayList<Pizza>();
		pizzaList.add(pizza);

		PizzaOrder order = new PizzaOrder(pizzaList);

		float total = PizzaUtil.calculateOrderAmount(order);
		assertEquals(350.0, total, 0);

	}

	@Test
	public void checkOrderWith0Pizza() {

		List<Pizza> pizzaList = new ArrayList<Pizza>() {
			{

			}
		};

		PizzaOrder order = new PizzaOrder(pizzaList);

		float total = PizzaUtil.calculateOrderAmount(order);
		assertEquals(0, total, 0);

	}

	@Test
	public void checkPizzaWithoutToppings() {
		List<String> top = new ArrayList<String>() {
			{

			}
		};

		Pizza pizza = new Pizza("Margherita", top, "Pan Pizza");

		List<Pizza> pizzaList = new ArrayList<Pizza>();
		pizzaList.add(pizza);

		PizzaOrder order = new PizzaOrder(pizzaList);

		float total = PizzaUtil.calculateOrderAmount(order);
		assertEquals(312.5, total, 0);
	}

	@Test
	public void checkPizzaWithoutToppingsandCrust() {
		List<String> top = new ArrayList<String>() {
			{

			}
		};

		Pizza pizza = new Pizza("Margherita", top, "");

		List<Pizza> pizzaList = new ArrayList<Pizza>();
		pizzaList.add(pizza);

		PizzaOrder order = new PizzaOrder(pizzaList);

		float total = PizzaUtil.calculateOrderAmount(order);
		assertEquals(187.5, total, 0);
	}
	
	/**
	 * Order #3 Tests
	 */
	@Test
	public void checkWhetherAskedToppingPresent(){
		List<String> top = new ArrayList<String>() ;
				top.add("Tomato");
				top.add("Pineapple");
				
		List<String> toppingsToRemove=new ArrayList<String>();
		
		toppingsToRemove.add("Baby Corn");
		toppingsToRemove.add("Pineapple");
		toppingsToRemove.add("Olives");
		Pizza pizza = new Pizza("Hawaiian Delight Veg", top, "Regular",toppingsToRemove);
		List<Pizza> pizzaList = new ArrayList<Pizza>();
		pizzaList.add(pizza);
		
		PizzaOrder order = new PizzaOrder(pizzaList);

		float total = PizzaUtil.calculateOrderAmount(order);
		
		assertEquals(287.5, total, 0);
		
	}
	
	@Test
	public void removeTest(){
		List<String> top = new ArrayList<String>() ;
				top.add("Baby Corn");
				top.add("Pineapple");
				
		List<String> top1 = new ArrayList<String>() ;
				top1.add("Cheese");

		List<String> top2 = new ArrayList<String>() ;
		
		List<String> top3 = new ArrayList<String>() ;
		top3.add("Baby Corn");
		top3.add("Olives");
		top3.add("Onion");
	
		List<String> toppingsToRemove1=new ArrayList<String>();
		
		toppingsToRemove1.add("Capsicum");
		List<String> toppingsToRemove=new ArrayList<String>();
		List<String> toppingsToRemove2=new ArrayList<String>();
		
		toppingsToRemove2.add("Paprika");
		
		Pizza pizza1 = new Pizza("Peppy Paneer", top, "Thin Crust",toppingsToRemove1);
		Pizza pizza2 = new Pizza("Peppy Paneer", top, "Thin Crust",toppingsToRemove1);
		Pizza pizza3 = new Pizza("Peppy Paneer", top1, "Thin Crust",toppingsToRemove);
		Pizza pizza4 = new Pizza("Peppy Paneer", top1, "Thin Crust",toppingsToRemove);
		Pizza pizza5 = new Pizza("Hawaiian Delight Veg", top2, "",toppingsToRemove);
		Pizza pizza6 = new Pizza("Margherita", top2, "",toppingsToRemove);
		Pizza pizza7 = new Pizza("Zesty Chicken", top3, "Cheese Burst",toppingsToRemove2);
		
		List<Pizza> pizzaList = new ArrayList<Pizza>();
		pizzaList.add(pizza1);
		pizzaList.add(pizza2);
		pizzaList.add(pizza3);
		pizzaList.add(pizza4);
		pizzaList.add(pizza5);
		pizzaList.add(pizza6);
		pizzaList.add(pizza7);
		PizzaOrder order = new PizzaOrder(pizzaList);

		float total = PizzaUtil.calculateOrderAmount(order);
		
		assertEquals(3106.25, total, 0);
		
	}
}
