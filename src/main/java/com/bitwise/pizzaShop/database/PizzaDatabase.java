package com.bitwise.pizzaShop.database;

import java.util.ArrayList;
import java.util.HashMap;

import com.bitwise.pizzaShop.pizza.Crust;
import com.bitwise.pizzaShop.pizza.Pizza;
import com.bitwise.pizzaShop.pizza.Topping;

/**
 * 
 * This class holds the pizza database.
 * 
 * @author Pravin
 *
 */
public class PizzaDatabase {
	private static HashMap<String, Pizza> availablePizzas;
	
	static{
		availablePizzas = new HashMap<String, Pizza>();
		
		Pizza piz = new Pizza();
		HashMap<String, Integer> prizeMap = new HashMap<String, Integer>();
		prizeMap.put("Small", 80);
		prizeMap.put("Medium", 150);
		prizeMap.put("Large", 300);
		piz.setPrizeMap(prizeMap);
		piz.setPizzaSize("Medium");
		
		ArrayList<Topping> topping = new ArrayList<Topping>();
		topping.add(ToppingDB.getPizzaToppings().get("Tomato"));
		piz.setDefaultToppipng(topping);
		
		piz.setCrust(new Crust("Regular", 0));
		availablePizzas.put("Margherita", piz);
		
		piz = new Pizza();
		prizeMap = new HashMap<String, Integer>();
		prizeMap.put("Small", 100);
		prizeMap.put("Medium", 200);
		prizeMap.put("Large", 400);
		piz.setPrizeMap(prizeMap);
		piz.setPizzaSize("Medium");
		
		topping = new ArrayList<Topping>();
		topping.add(ToppingDB.getPizzaToppings().get("Baby Corn"));
		topping.add(ToppingDB.getPizzaToppings().get("Pineapple"));
		topping.add(ToppingDB.getPizzaToppings().get("Jalapeno"));
		piz.setDefaultToppipng(topping);
		
		piz.setCrust(new Crust("Regular", 0));
		availablePizzas.put("Hawaiian Delight Veg", piz);
		
		piz = new Pizza();
		prizeMap = new HashMap<String, Integer>();
		prizeMap.put("Small", 110);
		prizeMap.put("Medium", 220);
		prizeMap.put("Large", 440);
		piz.setPrizeMap(prizeMap);
		piz.setPizzaSize("Medium");
		
		topping = new ArrayList<Topping>();
		topping.add(ToppingDB.getPizzaToppings().get("Chicken Salami"));
		topping.add(ToppingDB.getPizzaToppings().get("Pineapple"));
		topping.add(ToppingDB.getPizzaToppings().get("Jalapeno"));
		piz.setDefaultToppipng(topping);
		
		piz.setCrust(new Crust("Regular", 0));
		availablePizzas.put("Hawaiian Delight Non Veg", piz);
		
		piz = new Pizza();
		prizeMap = new HashMap<String, Integer>();
		prizeMap.put("Small", 115);
		prizeMap.put("Medium", 230);
		prizeMap.put("Large", 460);
		piz.setPrizeMap(prizeMap);
		piz.setPizzaSize("Medium");
		
		topping = new ArrayList<Topping>();
		topping.add(ToppingDB.getPizzaToppings().get("Baby Corn"));
		topping.add(ToppingDB.getPizzaToppings().get("Olives"));
		topping.add(ToppingDB.getPizzaToppings().get("Capsicum"));
		topping.add(ToppingDB.getPizzaToppings().get("Paprika"));
		piz.setDefaultToppipng(topping);
		
		piz.setCrust(new Crust("Regular", 0));
		availablePizzas.put("Veggie Paradise", piz);
		
		piz = new Pizza();
		prizeMap = new HashMap<String, Integer>();
		prizeMap.put("Small", 115);
		prizeMap.put("Medium", 230);
		prizeMap.put("Large", 460);
		piz.setPrizeMap(prizeMap);
		piz.setPizzaSize("Medium");
		
		topping = new ArrayList<Topping>();
		topping.add(ToppingDB.getPizzaToppings().get("Panner"));
		topping.add(ToppingDB.getPizzaToppings().get("Capsicum"));
		topping.add(ToppingDB.getPizzaToppings().get("Paprika"));
		piz.setDefaultToppipng(topping);
		
		piz.setCrust(new Crust("Regular", 0));
		availablePizzas.put("Peppy Paneer", piz);
		
		piz = new Pizza();
		prizeMap = new HashMap<String, Integer>();
		prizeMap.put("Small", 140);
		prizeMap.put("Medium", 280);
		prizeMap.put("Large", 560);
		piz.setPrizeMap(prizeMap);
		piz.setPizzaSize("Medium");
		
		topping = new ArrayList<Topping>();
		topping.add(ToppingDB.getPizzaToppings().get("Chicken Sausage"));
		topping.add(ToppingDB.getPizzaToppings().get("Barbeque Chicken"));
		topping.add(ToppingDB.getPizzaToppings().get("Capsicum"));
		topping.add(ToppingDB.getPizzaToppings().get("Paprika"));
		piz.setDefaultToppipng(topping);
		
		piz.setCrust(new Crust("Regular", 0));
		availablePizzas.put("Zesty Chicken", piz);
		
		piz = new Pizza();
		prizeMap = new HashMap<String, Integer>();
		prizeMap.put("Small", 150);
		prizeMap.put("Medium", 300);
		prizeMap.put("Large", 600);
		piz.setPrizeMap(prizeMap);
		piz.setPizzaSize("Medium");
		
		topping = new ArrayList<Topping>();
		topping.add(ToppingDB.getPizzaToppings().get("Onion"));
		topping.add(ToppingDB.getPizzaToppings().get("Tomato"));
		topping.add(ToppingDB.getPizzaToppings().get("Paprika"));
		topping.add(ToppingDB.getPizzaToppings().get("Spicy Chicken"));
		piz.setDefaultToppipng(topping);
		
		piz.setCrust(new Crust("Regular", 0));
		availablePizzas.put("Chicken Maxicana", piz);
		
		piz = new Pizza();
		prizeMap = new HashMap<String, Integer>();
		prizeMap.put("Small", 125);
		prizeMap.put("Medium", 250);
		prizeMap.put("Large", 500);
		piz.setPrizeMap(prizeMap);
		piz.setPizzaSize("Medium");
		
		topping = new ArrayList<Topping>();
		topping.add(ToppingDB.getPizzaToppings().get("Smoked Chicken"));
		topping.add(ToppingDB.getPizzaToppings().get("Paprika"));
		topping.add(ToppingDB.getPizzaToppings().get("Jalapeno"));
		piz.setDefaultToppipng(topping);
		
		piz.setCrust(new Crust("Regular", 0));
		availablePizzas.put("Seventh Heaven", piz);
		
		piz = new Pizza();
		prizeMap = new HashMap<String, Integer>();
		prizeMap.put("Small", 120);
		prizeMap.put("Medium", 240);
		prizeMap.put("Large", 480);
		piz.setPrizeMap(prizeMap);
		piz.setPizzaSize("Medium");
		
		topping = new ArrayList<Topping>();
		topping.add(ToppingDB.getPizzaToppings().get("Onion"));
		topping.add(ToppingDB.getPizzaToppings().get("Tomato"));
		topping.add(ToppingDB.getPizzaToppings().get("Panner"));
		topping.add(ToppingDB.getPizzaToppings().get("Capsicum"));
		topping.add(ToppingDB.getPizzaToppings().get("Jalapeno"));
		piz.setDefaultToppipng(topping);
		
		piz.setCrust(new Crust("Regular", 0));
		availablePizzas.put("Cloud 9", piz);
	}
	
	public static HashMap<String, Pizza> getAvailablePizzas() {
		return availablePizzas;
	}

	public static void setAvailablePizzas(HashMap<String, Pizza> availablePizzas) {
		PizzaDatabase.availablePizzas = availablePizzas;
	}
	
}
