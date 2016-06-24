package com.bitwise.dominos;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Pizza {

	String name;
	String price;
	String topping;
	String crust;
	List<String> extraTopping;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	public String getTopping() {
		return topping;
	}

	public void setTopping(String topping) {
		this.topping = topping;
	}

	public String getCrust() {
		return crust;
	}

	public void setCrust(String crust) {
		this.crust = crust;
	}

	public static Map<String, Integer> getPizzaMap() {
		return pizzaMap;
	}

	public static void setPizzaMap(Map<String, Integer> pizzaMap) {
		Pizza.pizzaMap = pizzaMap;
	}

	public List<String> getExtraTopping() {
		return extraTopping;
	}

	public void setExtraTopping(List<String> extraTopping) {
		this.extraTopping = extraTopping;
	}

	static Map<String,Integer> pizzaMap= new HashMap<String,Integer>();
	static{
		pizzaMap.put("Margherita",150);
		pizzaMap.put("Hawaiian Delight Veg",200);
		pizzaMap.put("Hawaiian Delight NonVeg",220);
		pizzaMap.put("Veggie Paradise",230);
		pizzaMap.put("Peppy Paneer",230);
		pizzaMap.put("Zesty Chicken",280);
		pizzaMap.put("Chicken Maxicana",300);
	}
	
	public Pizza(String pizzaName, String pizzaTopping, String pizzaCrust) {
		name=pizzaName;
		topping=pizzaTopping;
		crust=pizzaCrust;
	}

	public int getPizzaPrice() {
		
		//int toppingPrice=getToppingPrice(name);
		
		return pizzaMap.get(name);
	}

	public int getTotalPrice() {
		int pizzaPrice=pizzaMap.get(name);
		int toppingPrice=0;
		if(null != extraTopping)
		{
			Topping topping= new Topping();
			toppingPrice=topping.getToppingPrice(extraTopping);
		}
		return pizzaPrice+toppingPrice;
	}


}
