package com.bitwise.pizzaShop.database;

import java.util.HashMap;

import com.bitwise.pizzaShop.pizza.Topping;

public class ToppingDB {
	private static HashMap<String, Topping> pizzaToppings;

	static{
		pizzaToppings = new HashMap<String, Topping>();
		pizzaToppings.put("Tomato", new Topping("Tomato", 10));
		pizzaToppings.put("Baby Corn", new Topping("Baby Corn", 10));
		pizzaToppings.put("Pineapple", new Topping("Pineapple", 20));
		pizzaToppings.put("Jalapeno", new Topping("Jalapeno", 15));
		pizzaToppings.put("Chicken Salami", new Topping("Chicken Salami", 95));
		pizzaToppings.put("Olives", new Topping("Olives", 15));
		pizzaToppings.put("Capsicum", new Topping("Capsicum", 10));
		pizzaToppings.put("Paprika", new Topping("Paprika", 30));
		pizzaToppings.put("Panner", new Topping("Panner", 80));
		pizzaToppings.put("Chicken Sausage", new Topping("Chicken Sausage", 110));
		pizzaToppings.put("Barbeque Chicken", new Topping("Barbeque Chicken", 100));
		pizzaToppings.put("Spicy Chicken", new Topping("Spicy Chicken", 90));
		pizzaToppings.put("Onion", new Topping("Onion", 10));
		pizzaToppings.put("Cheese", new Topping("Cheese", 20));
		pizzaToppings.put("Smoked Chicken", new Topping("Smoked Chicken", 150));
		
	}

	public static HashMap<String, Topping> getPizzaToppings() {
		return pizzaToppings;
	}

	public static void setPizzaToppings(HashMap<String, Topping> pizzaToppings) {
		ToppingDB.pizzaToppings = pizzaToppings;
	}
}
