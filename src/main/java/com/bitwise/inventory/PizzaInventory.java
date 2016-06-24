package com.bitwise.inventory;

import java.util.HashMap;
import java.util.Map;

public class PizzaInventory {

	public static final Double VAT = 10.0;
	public static final Double SERVICETAX = 15.0;

	public static Map<String, Integer> pizzaDetails = new HashMap<String, Integer>() {
		{
			put("Margherita", 150);
			put("Hawaiian Delight Veg", 200);
			put("Hawaiian Delight Non-veg", 220);
			put("Veggie Paradise", 230);
			put("Peppy Paneer", 230);
			put("Zesty Chicken", 280);
			put("Chicken Maxicana", 300);
		}
	};
	public static Map<String, Integer> crustDetails = new HashMap<String, Integer>() {
		{
			put("Pan Pizza", 100);
			put("Thin Crust", 150);
			put("Regular", 0);
			put("Cheese Burst", 200);
		}
	};
	public static Map<String, Integer> toppingsDetails = new HashMap<String, Integer>() {
		{
			put("Tomato", 10);
			put("Baby Corn", 10);
			put("Pineapple", 20);
			put("Jalapeno", 15);
			put("Chicken Salami", 95);
			put("Olives", 15);
			put("Capsicum", 10);
			put("Cheese", 20);
			put("Barbeque Chicken", 100);
		}
	};
}
