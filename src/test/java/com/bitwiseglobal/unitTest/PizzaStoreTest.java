package com.bitwiseglobal.unitTest;

import org.junit.Assert;
import org.junit.Test;

import com.bitwiseglobal.order.OrderPizza;
import com.bitwiseglobal.pizza.Crust;
import com.bitwiseglobal.pizza.Pizza;
import com.bitwiseglobal.pizza.Toppings;
import com.bitwiseglobal.typesofpizzas.ChickenMaxicana;
import com.bitwiseglobal.typesofpizzas.Margherita;
import com.bitwiseglobal.typesofpizzas.NonVegHawaiianDelight;
import com.bitwiseglobal.typesofpizzas.PeppyPaneer;
import com.bitwiseglobal.typesofpizzas.VegHawaiianDelight;
import com.bitwiseglobal.typesofpizzas.VeggieParadise;
import com.bitwiseglobal.typesofpizzas.ZestyChicken;

/**
 * Created by priyankad on 6/23/2016.
 */
public class PizzaStoreTest {
	@Test
	public void orderMargheritaPizza() {
		// gien
		Margherita margherita = new Margherita();
		// when
		margherita.addToppings(Toppings.Tomato);
		// then
		Assert.assertEquals(160, margherita.getPrize(), 0);
	}

	@Test
	public void orderVegHawaiianDelightPizza() {
		// gien
		VegHawaiianDelight vegHawaiianDelight = new VegHawaiianDelight();
		// when
		vegHawaiianDelight.addToppings(Toppings.Capsicum);
		vegHawaiianDelight.addToppings(Toppings.Panner);
		// then
		Assert.assertEquals(290, vegHawaiianDelight.getPrize(), 0);
	}

	@Test
	public void orderNonVegHawaiianDelightPizza() {
		// gien
		NonVegHawaiianDelight nonVegHawaiianDelight = new NonVegHawaiianDelight();
		// when
		nonVegHawaiianDelight.addToppings(Toppings.Smoked_Chicken);
		nonVegHawaiianDelight.addCrust(Crust.Cheese_Burst);
		// then
		Assert.assertEquals(570, nonVegHawaiianDelight.getPrize(), 0);
	}

	@Test
	public void orderVeggieParadisePizza() {
		// gien
		VeggieParadise veggieParadise = new VeggieParadise();
		// when
		veggieParadise.addToppings(Toppings.Capsicum);
		veggieParadise.addCrust(Crust.Cheese_Burst);
		// then
		Assert.assertEquals(440, veggieParadise.getPrize(), 0);
	}

	@Test
	public void orderPeppyPaneerPizza() {
		// gien
		PeppyPaneer peppyPaneer = new PeppyPaneer();
		// when
		peppyPaneer.addToppings(Toppings.Capsicum);
		peppyPaneer.addCrust(Crust.Cheese_Burst);
		// then
		Assert.assertEquals(440, peppyPaneer.getPrize(), 0);
	}

	@Test
	public void orderZestyChickenPizza() {
		// gien
		ZestyChicken zestyChicken = new ZestyChicken();
		// when
		zestyChicken.addToppings(Toppings.Capsicum);
		zestyChicken.addCrust(Crust.Thin_Crust);
		// then
		Assert.assertEquals(440, zestyChicken.getPrize(), 0);
	}

	@Test
	public void orderChickenMaxicanaPizza() {
		// gien
		ChickenMaxicana chickenMaxicana = new ChickenMaxicana();
		// when
		chickenMaxicana.addToppings(Toppings.Capsicum);
		chickenMaxicana.addCrust(Crust.Regular);
		// then
		Assert.assertEquals(310, chickenMaxicana.getPrize(), 0);
	}

	@Test(expected = OrderPizza.NoPizzasToCalculate.class)
	public void CalculateWithNoPizza() {
		// gien
		OrderPizza orderPizza = new OrderPizza();
		// when
		orderPizza.calcaulateTotalCost();
		// then
	}

	@Test
	public void CalculateTotalOrderCostForFewPizzas() {
		// gien
		OrderPizza orderPizza = new OrderPizza();
		ZestyChicken zestyChicken = new ZestyChicken();
		zestyChicken.addToppings(Toppings.Capsicum);
		// 580
		ChickenMaxicana chickenMaxicana = new ChickenMaxicana();
		chickenMaxicana.addCrust(Crust.Pan_Pizza);
		// 1200
		// when
		orderPizza.addpizza(zestyChicken, 2);
		orderPizza.addpizza(chickenMaxicana, 3);
		// then
		Assert.assertEquals(2225, orderPizza.calcaulateTotalCost(), 0);
	}

	@Test
	public void order1() {
		// gien
		OrderPizza orderPizza = new OrderPizza();
		VeggieParadise veggieParadise = new VeggieParadise();
		ZestyChicken zestyChicken = new ZestyChicken();
		ChickenMaxicana chickenMaxicana = new ChickenMaxicana();

		orderPizza.addpizza(veggieParadise, 1);
		orderPizza.addpizza(zestyChicken, 1);
		orderPizza.addpizza(chickenMaxicana, 1);
		// when
		Assert.assertEquals(1012, orderPizza.calcaulateTotalCost(), 0.5);

	}

	@Test
	public void order2() {
		// gien
		OrderPizza orderPizza = new OrderPizza();

		VegHawaiianDelight vegHawaiianDelight = new VegHawaiianDelight();

		vegHawaiianDelight.addToppings(Toppings.Olives);
		vegHawaiianDelight.addToppings(Toppings.Cheese);
		vegHawaiianDelight.addCrust(Crust.Pan_Pizza);

		NonVegHawaiianDelight nonVegHawaiianDelight = new NonVegHawaiianDelight();
		nonVegHawaiianDelight.addToppings(Toppings.Barbeque_Chicken);
		nonVegHawaiianDelight.addCrust(Crust.Cheese_Burst);
		// when
		orderPizza.addpizza(vegHawaiianDelight, 1);
		orderPizza.addpizza(nonVegHawaiianDelight, 1);
		// then
		Assert.assertEquals(1068, orderPizza.calcaulateTotalCost(), 1);
	}

	@Test
	public void order3() {
		// given
		OrderPizza orderPizza = new OrderPizza();
		PeppyPaneer peppyPaneer1 = new PeppyPaneer();
		peppyPaneer1.removeDeafultToppings(Toppings.Capsicum);
		peppyPaneer1.addToppings(Toppings.Olives);
		peppyPaneer1.addToppings(Toppings.Baby_Corn);
		peppyPaneer1.addCrust(Crust.Thin_Crust);

		PeppyPaneer peppyPaneer2 = new PeppyPaneer();
		peppyPaneer2.removeAllDeafultToppings();
		peppyPaneer2.addToppings(Toppings.Cheese);
		peppyPaneer2.addCrust(Crust.Thin_Crust);

		Margherita margherita = new Margherita();
		VegHawaiianDelight vegHawaiianDelight = new VegHawaiianDelight();

		ZestyChicken zestyChicken = new ZestyChicken();
		zestyChicken.removeDeafultToppings(Toppings.Paprika);
		zestyChicken.addCrust(Crust.Cheese_Burst);
		zestyChicken.addToppings(Toppings.Olives);
		zestyChicken.addToppings(Toppings.Onion);
		zestyChicken.addToppings(Toppings.Baby_Corn);
		// when
		orderPizza.addpizza(peppyPaneer1, 2);
		orderPizza.addpizza(peppyPaneer2, 2);
		orderPizza.addpizza(margherita, 1);
		orderPizza.addpizza(vegHawaiianDelight, 1);
		orderPizza.addpizza(zestyChicken, 1);
		// then
		Assert.assertEquals(3093, orderPizza.calcaulateTotalCost(), 1);

	}

	@Test(expected = Pizza.DefaultToppingNotPresentException.class)
	public void defaultPizzaNotAvaliableToRemove() {
		// given
		OrderPizza orderPizza = new OrderPizza();
		PeppyPaneer peppyPaneer = new PeppyPaneer();
		peppyPaneer.removeDeafultToppings(Toppings.Baby_Corn);
		//when
		//then
	}
}
