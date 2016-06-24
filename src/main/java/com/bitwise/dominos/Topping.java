package com.bitwise.dominos;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Topping {
	
	String name;
	
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
