package com.bitwise.pizzaShop.database;

import java.util.HashMap;

import com.bitwise.pizzaShop.pizza.Crust;

public class CrustDatabase {
	private static HashMap<String, Crust> pizzaCrusts;
	
	static{
		pizzaCrusts = new HashMap<String, Crust>();
		pizzaCrusts.put("Pan Pizza", new Crust("Pan Pizza", 100));
		pizzaCrusts.put("Thin Crust", new Crust("Thin Crust", 150));
		pizzaCrusts.put("Regular", new Crust("Regular", 0));
		pizzaCrusts.put("Cheese Burst", new Crust("Cheese Burst", 200));
	}

	public static HashMap<String, Crust> getPizzaCrusts() {
		return pizzaCrusts;
	}

	public static void setPizzaCrusts(HashMap<String, Crust> pizzaCrusts) {
		CrustDatabase.pizzaCrusts = pizzaCrusts;
	}
}
