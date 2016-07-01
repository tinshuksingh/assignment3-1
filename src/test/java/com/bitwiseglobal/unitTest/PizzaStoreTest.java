package com.bitwiseglobal.unitTest;

import org.junit.Assert;
import org.junit.Test;

import com.bitwiseglobal.order.OrderPizza;
import com.bitwiseglobal.pizza.Crust;
import com.bitwiseglobal.pizza.Pizza;
import com.bitwiseglobal.pizza.Pizza.CanNotAddToppingsException;
import com.bitwiseglobal.pizza.Pizza.CanNotRemoveDefaultToppingsFromSmallSizePizaaException;
import com.bitwiseglobal.pizza.Pizza.CheeseBurstNotAvailableException;
import com.bitwiseglobal.pizza.SizeOfPizza;
import com.bitwiseglobal.pizza.Toppings;
import com.bitwiseglobal.typesofpizzas.ChickenMaxicana;
import com.bitwiseglobal.typesofpizzas.Cloud9;
import com.bitwiseglobal.typesofpizzas.Margherita;
import com.bitwiseglobal.typesofpizzas.NonVegHawaiianDelight;
import com.bitwiseglobal.typesofpizzas.PeppyPaneer;
import com.bitwiseglobal.typesofpizzas.SeventhHeaven;
import com.bitwiseglobal.typesofpizzas.VegHawaiianDelight;
import com.bitwiseglobal.typesofpizzas.VeggieParadise;
import com.bitwiseglobal.typesofpizzas.ZestyChicken;

public class PizzaStoreTest {
	@Test
	public void orderMargheritaPizza() throws CanNotAddToppingsException {
		// given
		Margherita margherita = new Margherita(SizeOfPizza.Medium);
		// when
		// margherita.addCost();
		margherita.addToppings(Toppings.Tomato);
		// then
		Assert.assertEquals(160, margherita.getPrize(), 0);
	}

	@Test
	public void orderVegHawaiianDelightPizza() throws CanNotAddToppingsException {
		// given
		VegHawaiianDelight vegHawaiianDelight = new VegHawaiianDelight(SizeOfPizza.Medium);
		// when
		vegHawaiianDelight.addToppings(Toppings.Capsicum);
		vegHawaiianDelight.addToppings(Toppings.Panner);
		// then
		Assert.assertEquals(290, vegHawaiianDelight.getPrize(), 0);
	}

	@Test
	public void orderNonVegHawaiianDelightPizza() throws CanNotAddToppingsException, CheeseBurstNotAvailableException {
		// given
		NonVegHawaiianDelight nonVegHawaiianDelight = new NonVegHawaiianDelight(SizeOfPizza.Medium);
		// when
		nonVegHawaiianDelight.addToppings(Toppings.Smoked_Chicken);
		nonVegHawaiianDelight.addCrust(Crust.Cheese_Burst);
		// then
		Assert.assertEquals(570, nonVegHawaiianDelight.getPrize(), 0);
	}

	@Test
	public void orderVeggieParadisePizza() throws CanNotAddToppingsException, CheeseBurstNotAvailableException {
		// given
		VeggieParadise veggieParadise = new VeggieParadise(SizeOfPizza.Medium);
		// when
		veggieParadise.addToppings(Toppings.Capsicum);
		veggieParadise.addCrust(Crust.Cheese_Burst);
		// then
		Assert.assertEquals(440, veggieParadise.getPrize(), 0);
	}

	@Test
	public void orderPeppyPaneerPizza() throws CanNotAddToppingsException, CheeseBurstNotAvailableException {
		// given
		PeppyPaneer peppyPaneer = new PeppyPaneer(SizeOfPizza.Medium);
		// when
		peppyPaneer.addToppings(Toppings.Capsicum);
		peppyPaneer.addCrust(Crust.Cheese_Burst);
		// then
		Assert.assertEquals(440, peppyPaneer.getPrize(), 0);
	}

	@Test
	public void orderZestyChickenPizza() throws CanNotAddToppingsException, CheeseBurstNotAvailableException {
		// given
		ZestyChicken zestyChicken = new ZestyChicken(SizeOfPizza.Medium);
		// when
		zestyChicken.addToppings(Toppings.Capsicum);
		zestyChicken.addCrust(Crust.Thin_Crust);
		// then
		Assert.assertEquals(440, zestyChicken.getPrize(), 0);
	}

	@Test
	public void orderChickenMaxicanaPizza() throws CanNotAddToppingsException, CheeseBurstNotAvailableException {
		// given
		ChickenMaxicana chickenMaxicana = new ChickenMaxicana(SizeOfPizza.Medium);
		// when
		chickenMaxicana.addToppings(Toppings.Capsicum);
		chickenMaxicana.addCrust(Crust.Regular);
		// then
		Assert.assertEquals(310, chickenMaxicana.getPrize(), 0);
	}

	@Test(expected = OrderPizza.NoPizzasToCalculate.class)
	public void CalculateWithNoPizza() {
		// given
		OrderPizza orderPizza = new OrderPizza();
		// when
		orderPizza.calcaulateTotalCost();
		// then
	}

	@Test
	public void CalculateTotalOrderCostForFewPizzas()
			throws CanNotAddToppingsException, CheeseBurstNotAvailableException {
		// given
		OrderPizza orderPizza = new OrderPizza();
		ZestyChicken zestyChicken = new ZestyChicken(SizeOfPizza.Medium);
		zestyChicken.addToppings(Toppings.Capsicum);
		// 580
		ChickenMaxicana chickenMaxicana = new ChickenMaxicana(SizeOfPizza.Medium);
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
		// given
		OrderPizza orderPizza = new OrderPizza();
		VeggieParadise veggieParadise = new VeggieParadise(SizeOfPizza.Medium);

		ZestyChicken zestyChicken = new ZestyChicken(SizeOfPizza.Medium);

		ChickenMaxicana chickenMaxicana = new ChickenMaxicana(SizeOfPizza.Medium);

		orderPizza.addpizza(veggieParadise, 1);
		orderPizza.addpizza(zestyChicken, 1);
		orderPizza.addpizza(chickenMaxicana, 1);
		// when
		Assert.assertEquals(1012, orderPizza.calcaulateTotalCost(), 0.5);

	}

	@Test
	public void order2() throws CanNotAddToppingsException, CheeseBurstNotAvailableException {
		// given
		OrderPizza orderPizza = new OrderPizza();

		VegHawaiianDelight vegHawaiianDelight = new VegHawaiianDelight(SizeOfPizza.Medium);
		vegHawaiianDelight.addToppings(Toppings.Olives);
		vegHawaiianDelight.addToppings(Toppings.Cheese);
		vegHawaiianDelight.addCrust(Crust.Pan_Pizza);

		NonVegHawaiianDelight nonVegHawaiianDelight = new NonVegHawaiianDelight(SizeOfPizza.Medium);
		nonVegHawaiianDelight.addToppings(Toppings.Barbeque_Chicken);
		nonVegHawaiianDelight.addCrust(Crust.Cheese_Burst);
		// when
		orderPizza.addpizza(vegHawaiianDelight, 1);
		orderPizza.addpizza(nonVegHawaiianDelight, 1);
		// then
		Assert.assertEquals(1068, orderPizza.calcaulateTotalCost(), 0.75);
	}

	@Test
	public void order3() throws CanNotAddToppingsException, CheeseBurstNotAvailableException,
			CanNotRemoveDefaultToppingsFromSmallSizePizaaException {
		// given
		OrderPizza orderPizza = new OrderPizza();
		PeppyPaneer peppyPaneer1 = new PeppyPaneer(SizeOfPizza.Medium);
		peppyPaneer1.removeDeafultToppings(Toppings.Capsicum);
		peppyPaneer1.addToppings(Toppings.Olives);
		peppyPaneer1.addToppings(Toppings.Baby_Corn);
		peppyPaneer1.addCrust(Crust.Thin_Crust);

		PeppyPaneer peppyPaneer2 = new PeppyPaneer(SizeOfPizza.Medium);
		peppyPaneer2.removeAllDeafultToppings();
		peppyPaneer2.addToppings(Toppings.Cheese);
		peppyPaneer2.addCrust(Crust.Thin_Crust);

		Margherita margherita = new Margherita(SizeOfPizza.Medium);

		VegHawaiianDelight vegHawaiianDelight = new VegHawaiianDelight(SizeOfPizza.Medium);

		ZestyChicken zestyChicken = new ZestyChicken(SizeOfPizza.Medium);
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
		Assert.assertEquals(3093, orderPizza.calcaulateTotalCost(), 0.75);

	}

	@Test(expected = Pizza.DefaultToppingNotPresentException.class)
	public void defaultPizzaNotAvaliableToRemove() throws CanNotRemoveDefaultToppingsFromSmallSizePizaaException {
		// given
		OrderPizza orderPizza = new OrderPizza();
		PeppyPaneer peppyPaneer = new PeppyPaneer(SizeOfPizza.Medium);
		peppyPaneer.removeDeafultToppings(Toppings.Baby_Corn);
		orderPizza.addpizza(peppyPaneer, 1);
		// when
		// then
	}

	@Test(expected = Pizza.CanNotAddToppingsException.class)
	public void itShouldGiveExceptionIfWeAddToppingsForSmallSizePizza()
			throws CanNotAddToppingsException, CheeseBurstNotAvailableException {
		// given
		ZestyChicken zestyChicken = new ZestyChicken(SizeOfPizza.Small);
		// when
		zestyChicken.addToppings(Toppings.Capsicum);
		zestyChicken.addCrust(Crust.Thin_Crust);
		// then

	}

	@Test(expected = Pizza.CheeseBurstNotAvailableException.class)
	public void itShouldGiveExceptionIfWeAddCheeseBurstForSmallSizePizza() throws CheeseBurstNotAvailableException {
		// given
		ZestyChicken zestyChicken = new ZestyChicken(SizeOfPizza.Large);
		// when
		zestyChicken.addCrust(Crust.Cheese_Burst);
		// then

	}

	@Test(expected = Pizza.CanNotAddToppingsException.class)
	public void order4() throws CanNotAddToppingsException, CheeseBurstNotAvailableException,
			CanNotRemoveDefaultToppingsFromSmallSizePizaaException {
		// given
		OrderPizza orderPizza = new OrderPizza();
		Cloud9 cloud91 = new Cloud9(SizeOfPizza.Medium);
		cloud91.removeDeafultToppings(Toppings.Capsicum);
		cloud91.addCrust(Crust.Thin_Crust);
		cloud91.addToppings(Toppings.Olives);
		cloud91.addToppings(Toppings.Baby_Corn);

		Cloud9 cloud93 = new Cloud9(SizeOfPizza.Small);
		cloud93.removeAllDeafultToppings();
		cloud93.addToppings(Toppings.Cheese);

		Cloud9 cloud94 = new Cloud9(SizeOfPizza.Large);
		cloud94.removeAllDeafultToppings();
		cloud94.addToppings(Toppings.Cheese);

		SeventhHeaven heaven = new SeventhHeaven(SizeOfPizza.Large);
		heaven.addToppings(Toppings.Smoked_Chicken);
		heaven.addToppings(Toppings.Cheese);

		VegHawaiianDelight vegHawaiianDelight = new VegHawaiianDelight(SizeOfPizza.Medium);

		ZestyChicken zestyChicken = new ZestyChicken(SizeOfPizza.Medium);
		zestyChicken.addCrust(Crust.Cheese_Burst);
		zestyChicken.removeDeafultToppings(Toppings.Paprika);
		zestyChicken.addToppings(Toppings.Baby_Corn);
		zestyChicken.addToppings(Toppings.Olives);
		zestyChicken.addToppings(Toppings.Onion);
		orderPizza.addpizza(cloud91, 2);
		orderPizza.addpizza(cloud93, 1);
		orderPizza.addpizza(cloud94, 1);
		orderPizza.addpizza(heaven, 1);
		orderPizza.addpizza(vegHawaiianDelight, 1);
		orderPizza.addpizza(zestyChicken, 1);
		// then
	}
}
