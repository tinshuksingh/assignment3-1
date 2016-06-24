package com.bitwise.integrationTest;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import com.bitwise.VO.Pizza;
import com.bitwise.VO.PizzaOrder;
import com.bitwise.util.PizzaUtil;

public class PizzaUtilInteTest {

	@Test
	public void checkFor1VegAnd2NonVegPizza() {
		List<String> top = new ArrayList<String>();
		top.add("Tomato");
		top.add("Pineapple");

		Pizza pizza1 = new Pizza("Veggie Paradise", top, "");
		Pizza pizza2 = new Pizza("Zesty Chicken", top, "Pan Pizza");
		Pizza pizza3 = new Pizza("Chicken Maxicana", top, "Cheese Burst");

		List<Pizza> pizzaList = new ArrayList<Pizza>();
		pizzaList.add(pizza1);
		pizzaList.add(pizza2);
		pizzaList.add(pizza3);

		PizzaOrder order = new PizzaOrder(pizzaList);

		float total = PizzaUtil.calculateOrderAmount(order);
		assertEquals(1500.0, total, 0);
	}

	@Test
	public void checkFor1VegAnd1NonVegPizza() {

		List<String> top1 = new ArrayList<String>();
		top1.add("Olives");
		top1.add("Cheese");

		List<String> top2 = new ArrayList<String>();
		top2.add("Barbeque Chicken");

		Pizza pizza1 = new Pizza("Hawaiian Delight Veg", top1, "Pan Pizza");
		Pizza pizza2 = new Pizza("Hawaiian Delight Non-veg", top2, "Cheese Burst");

		List<Pizza> pizzaList = new ArrayList<Pizza>();
		pizzaList.add(pizza1);
		pizzaList.add(pizza2);

		PizzaOrder order = new PizzaOrder(pizzaList);

		float total = PizzaUtil.calculateOrderAmount(order);
		assertEquals(1068.75, total, 0);
	}
}
