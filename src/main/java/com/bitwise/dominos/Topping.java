package com.bitwise.dominos;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Topping {
	
	String name;
	
	@Override
	public String toString() {
		return "Topping [name=" + name + ", totalPrice=" + totalPrice + "]";
	}

	static Map<String,Integer> toppingList= new HashMap<String, Integer>();
	
	static{
		toppingList.put("Tomato", 10);
		toppingList.put("Baby Corn", 10);
		toppingList.put("Pineapple", 20);
		toppingList.put("Jalapeno", 15);
		toppingList.put("Chicken Salami", 95);
		toppingList.put("Capsicum", 10);
		toppingList.put("Panner", 80);
		toppingList.put("Chicken Sausage", 110);
		toppingList.put("Cheese", 20);
		toppingList.put("Olives", 15);
		toppingList.put("Barbeque Chicken", 100);
		toppingList.put("Paprika", 30);
		toppingList.put("SpicyChicken", 90);
		toppingList.put("Onion", 10);
		toppingList.put("Smoked Chicken", 150);
	}
	
	static Map<String,ArrayList<String>> defaultTopingList= new HashMap<String,ArrayList<String>>();
	static{
		ArrayList<String> defaultToppings = new ArrayList<String>();
		defaultToppings.add("tomato");
		defaultTopingList.put("Margherita",defaultToppings);
		defaultToppings = new ArrayList<String>();
		defaultToppings.add("Baby Corn");
		defaultToppings.add("Pineapple");
		defaultToppings.add("Jalapeno");
		defaultTopingList.put("Hawaiian Delight Veg",defaultToppings);
		defaultToppings = new ArrayList<String>();
		defaultToppings.add("Chicken Salami");
		defaultToppings.add("Pineapple");
		defaultToppings.add("Jalapeno");
		defaultTopingList.put("Hawaiian Delight NonVeg",defaultToppings);
		defaultToppings = new ArrayList<String>();
		defaultToppings.add("Baby Corn");
		defaultToppings.add("Capsicum");
		defaultToppings.add("Olives");
		defaultToppings.add("Paprika");
		defaultTopingList.put("Veggie Paradise",defaultToppings);
		defaultToppings = new ArrayList<String>();
		defaultToppings.add("Panner");
		defaultToppings.add("Capsicum");
		defaultToppings.add("Paprika");
		defaultTopingList.put("Peppy Paneer",defaultToppings);
		defaultToppings = new ArrayList<String>();
		defaultToppings.add("Chicken Sausage");
		defaultToppings.add("Barbeque Chicken");
		defaultToppings.add("Capsicum");
		defaultToppings.add("Paprika");
		defaultTopingList.put("Zesty Chicken",defaultToppings);
		defaultToppings = new ArrayList<String>();
		defaultToppings.add("SpicyChicken");
		defaultToppings.add("tomato");
		defaultToppings.add("Onion");
		defaultToppings.add("Paprika");
		defaultTopingList.put("Chicken Maxicana",defaultToppings);
		defaultToppings = new ArrayList<String>();
		defaultToppings.add("Smoked Chicken");
		defaultToppings.add("Jalapeno");
		defaultToppings.add("Paprika");
		defaultTopingList.put("Seventh Heaven",defaultToppings);
		defaultToppings = new ArrayList<String>();
		defaultToppings.add("Onion");
		defaultToppings.add("tomato");
		defaultToppings.add("Panner");
		defaultToppings.add("Capsicum");
		defaultToppings.add("Jalapeno");		
		defaultTopingList.put("Cloud9",defaultToppings);
	}
	
	public static ArrayList<String> getDefaultTopping(String pizzaName) throws InvalidOrderException
	{
		if(!defaultTopingList.containsKey(pizzaName))
		{
			throw new InvalidOrderException();
		}
		
		return defaultTopingList.get(pizzaName);
	}
	
	/*public Topping(String toppingName) {
		name=toppingName;	
	}*/

	int totalPrice;

	public int getToppingPrice(List<String> topList) {

		for(String topping:topList){
			totalPrice=totalPrice+toppingList.get(topping);
		}
		return totalPrice;
	}

}
