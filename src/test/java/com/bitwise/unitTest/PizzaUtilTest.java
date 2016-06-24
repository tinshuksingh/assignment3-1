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
}
