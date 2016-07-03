package com.bitwise.util;

import java.util.ArrayList;
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
	
	public static void setDefaultToppings(Pizza pizza)
	{
		String pizzaName = pizza.getName();
		List<String> list=null;
		
		switch(pizzaName)
		{
		case "Margherita":
			list=new ArrayList<String>();
			list.add("Tomato");
			pizza.setDefaultToppings(list);
			break;
			
		case "Hawaiian Delight Veg":
			list=new ArrayList<String>();
			list.add("Baby Corn");
			list.add("Pineapple");
			list.add("Jalapeno");
			pizza.setDefaultToppings(list);
			break;
			
		case "Hawaiian Delight Non-veg":
			list=new ArrayList<String>();
			list.add("Chicken Salami");
			list.add("Pineapple");
			list.add("Jalapeno");
			pizza.setDefaultToppings(list);
			break;
			
		case "Veggie Paradise":
			list=new ArrayList<String>();
			list.add("Baby Corn");
			list.add("Olives");
			list.add("Capsicum");
			list.add("Paprika");
			pizza.setDefaultToppings(list);
			break;
			
		case "Peppy Paneer":
			list=new ArrayList<String>();
			list.add("Panner");
			list.add("Capsicum");
			list.add("Paprika");
			pizza.setDefaultToppings(list);
			break;
			
		case "Zesty Chicken":
			list=new ArrayList<String>();
			list.add("Chicken Sausage");
			list.add("Barbeque Chicken");
			list.add("Capsicum");
			list.add("Paprika");
			pizza.setDefaultToppings(list);
			break;
			
		case "Chicken Maxicana":
			list=new ArrayList<String>();
			list.add("Onion");
			list.add("Tomato");
			list.add("Paprika");
			list.add("Spicy Chicken");
			pizza.setDefaultToppings(list);
			break;
		}
	}
}
