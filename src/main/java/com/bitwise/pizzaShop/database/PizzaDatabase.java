package com.bitwise.pizzaShop.database;

import java.util.ArrayList;
import java.util.HashMap;

import com.bitwise.pizzaShop.pizza.Crust;
import com.bitwise.pizzaShop.pizza.Pizza;
import com.bitwise.pizzaShop.pizza.Topping;

public class PizzaDatabase {
	private static HashMap<String, Pizza> availablePizzas;
	
	static{
		availablePizzas = new HashMap<String, Pizza>();
		
		Pizza piz = new Pizza();
		piz.setName("Margherita");
		piz.setPrice(150);
		ArrayList<Topping> topping = new ArrayList<Topping>();
		topping.add(ToppingDB.getPizzaToppings().get("Tomato"));
		piz.setDefaultToppipng(topping);
		piz.setCrust(new Crust("Regular", 0));
		availablePizzas.put("Margherita", piz);
		
		piz = new Pizza();
		piz.setName("Hawaiian Delight Veg");
		piz.setPrice(200);
		topping = new ArrayList<Topping>();
		topping.add(ToppingDB.getPizzaToppings().get("Baby Corn"));
		topping.add(ToppingDB.getPizzaToppings().get("Pineapple"));
		topping.add(ToppingDB.getPizzaToppings().get("Jalapeno"));
		piz.setDefaultToppipng(topping);
		piz.setCrust(new Crust("Regular", 0));
		availablePizzas.put("Hawaiian Delight Veg", piz);
		
		piz = new Pizza();
		piz.setName("Hawaiian Delight Veg");
		piz.setPrice(220);
		topping = new ArrayList<Topping>();
		topping.add(ToppingDB.getPizzaToppings().get("Chicken Salami"));
		topping.add(ToppingDB.getPizzaToppings().get("Pineapple"));
		topping.add(ToppingDB.getPizzaToppings().get("Jalapeno"));
		piz.setDefaultToppipng(topping);
		piz.setCrust(new Crust("Regular", 0));
		availablePizzas.put("Hawaiian Delight Non Veg", piz);
		
		piz = new Pizza();
		piz.setName("Veggie Paradise");
		piz.setPrice(230);
		topping = new ArrayList<Topping>();
		topping.add(ToppingDB.getPizzaToppings().get("Baby Corn"));
		topping.add(ToppingDB.getPizzaToppings().get("Olives"));
		topping.add(ToppingDB.getPizzaToppings().get("Capsicum"));
		topping.add(ToppingDB.getPizzaToppings().get("Paprika"));
		piz.setDefaultToppipng(topping);
		piz.setCrust(new Crust("Regular", 0));
		availablePizzas.put("Veggie Paradise", piz);
		
		piz = new Pizza();
		piz.setName("Peppy Paneer");
		piz.setPrice(230);
		topping = new ArrayList<Topping>();
		topping.add(ToppingDB.getPizzaToppings().get("Panner"));
		topping.add(ToppingDB.getPizzaToppings().get("Capsicum"));
		topping.add(ToppingDB.getPizzaToppings().get("Paprika"));
		piz.setDefaultToppipng(topping);
		piz.setCrust(new Crust("Regular", 0));
		availablePizzas.put("Peppy Paneer", piz);
		
		piz = new Pizza();
		piz.setName("Zesty Chicken");
		piz.setPrice(280);
		topping = new ArrayList<Topping>();
		topping.add(ToppingDB.getPizzaToppings().get("Chicken Sausage"));
		topping.add(ToppingDB.getPizzaToppings().get("Barbeque Chicken"));
		topping.add(ToppingDB.getPizzaToppings().get("Capsicum"));
		topping.add(ToppingDB.getPizzaToppings().get("Paprika"));
		piz.setDefaultToppipng(topping);
		piz.setCrust(new Crust("Regular", 0));
		availablePizzas.put("Zesty Chicken", piz);
		
		piz = new Pizza();
		piz.setName("Chicken Maxicana");
		piz.setPrice(300);
		topping = new ArrayList<Topping>();
		topping.add(ToppingDB.getPizzaToppings().get("Onion"));
		topping.add(ToppingDB.getPizzaToppings().get("Tomato"));
		topping.add(ToppingDB.getPizzaToppings().get("Paprika"));
		topping.add(ToppingDB.getPizzaToppings().get("Spicy Chicken"));
		piz.setDefaultToppipng(topping);
		piz.setCrust(new Crust("Regular", 0));
		availablePizzas.put("Chicken Maxicana", piz);
	}
	
	

	public static HashMap<String, Pizza> getAvailablePizzas() {
		return availablePizzas;
	}

	public static void setAvailablePizzas(HashMap<String, Pizza> availablePizzas) {
		PizzaDatabase.availablePizzas = availablePizzas;
	}
	
}
