package com.bitwiseglobal.main;

import com.bitwiseglobal.order.OrderPizza;
import com.bitwiseglobal.pizza.Crust;
import com.bitwiseglobal.pizza.Toppings;
import com.bitwiseglobal.typesofpizzas.Margherita;
import com.bitwiseglobal.typesofpizzas.PeppyPaneer;
import com.bitwiseglobal.typesofpizzas.VegHawaiianDelight;
import com.bitwiseglobal.typesofpizzas.ZestyChicken;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
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

		System.out.println(orderPizza);

		System.out.println("Total Cost is :" + orderPizza.calcaulateTotalCost());
	}

}
