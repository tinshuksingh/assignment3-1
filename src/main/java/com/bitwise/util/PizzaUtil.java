package com.bitwise.util;

import java.util.List;

import com.bitwise.VO.Pizza;
import com.bitwise.VO.PizzaOrder;
import com.bitwise.inventory.PizzaInventory;

public class PizzaUtil {

	public static float calculateOrderAmount(PizzaOrder order) {
		float total = 0;
		List<Pizza> pizzaList = order.getPizzaList();

		for (Pizza pizza : pizzaList) {

			if (pizza.getCrust() == null || pizza.getCrust().equals("")) {
				pizza.setCrust("Regular");
			}
			total += PizzaInventory.pizzaDetails.get(pizza.getName())
					+ PizzaInventory.crustDetails.get(pizza.getCrust());

			for (String toppings : pizza.getToppings()) {
				total += PizzaInventory.toppingsDetails.get(toppings);
			}

		}

		total += ((total * PizzaInventory.SERVICETAX) / 100) + ((total * PizzaInventory.VAT) / 100);
		return total;

	}
}
