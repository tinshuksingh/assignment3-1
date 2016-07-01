package com.bitwise.dominos;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Pizza {

	String name;
	String price;
	String size;
	List<String> toppingList;
	String crust = "Regular";
	List<String> extraTopping = new ArrayList<String>();
	List<String> removedDefaultTopping = new ArrayList<String>();

	

	@Override
	public String toString() {
		return "Pizza [name=" + name + ", price=" + price + ", size=" + size + ", toppingList=" + toppingList
				+ ", crust=" + crust + ", extraTopping=" + extraTopping + ", removedDefaultTopping="
				+ removedDefaultTopping + "]";
	}

	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}

	public List<String> getRemovedDefaultTopping() {
		return removedDefaultTopping;
	}

	public void setRemovedDefaultTopping(List<String> removedDefaultTopping) {
		this.removedDefaultTopping = removedDefaultTopping;
	}

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

	public List<String> getToppingList() {
		return toppingList;
	}

	public void setToppingList(List<String> toppingList) {
		this.toppingList = toppingList;
	}

	public String getCrust() {
		return crust;
	}

	public void setCrust(String crust) {
		this.crust = crust;
	}


	public List<String> getExtraTopping() {
		return extraTopping;
	}

	public void setExtraTopping(List<String> extraTopping) {
		this.extraTopping = extraTopping;
	}

	static Map<String, Map<String, Integer>> pizzaMap = new HashMap<String, Map<String, Integer>>();
	static {
		// Margherita
		Map<String, Integer> marerita = new HashMap<String, Integer>();
		marerita.put("Small", 80);
		marerita.put("Medium", 150);
		marerita.put("Large", 300);

		// Hawaiian Delight Non Veg
		Map<String, Integer> hawaiNonVeg = new HashMap<String, Integer>();
		hawaiNonVeg.put("Small", 110);
		hawaiNonVeg.put("Medium", 220);
		hawaiNonVeg.put("Large", 440);

		// Hawaiian Delight Veg
		Map<String, Integer> hawaiVeg = new HashMap<String, Integer>();
		hawaiVeg.put("Small", 100);
		hawaiVeg.put("Medium", 200);
		hawaiVeg.put("Large", 400);

		// Veggie Paradise
		Map<String, Integer> vegPar = new HashMap<String, Integer>();
		vegPar.put("Small", 115);
		vegPar.put("Medium", 230);
		vegPar.put("Large", 460);
		// Peppy Paneer
		Map<String, Integer> pp = new HashMap<String, Integer>();
		pp.put("Small", 115);
		pp.put("Medium", 230);
		pp.put("Large", 460);
		// Zesty Chicken
		Map<String, Integer> chicZest = new HashMap<String, Integer>();
		chicZest.put("Small", 140);
		chicZest.put("Medium", 280);
		chicZest.put("Large", 560);
		// Chicken Maxicana
		Map<String, Integer> chicMaxi = new HashMap<String, Integer>();
		chicMaxi.put("Small", 150);
		chicMaxi.put("Medium", 300);
		chicMaxi.put("Large", 600);
		// Seventh Heaven
		Map<String, Integer> seven = new HashMap<String, Integer>();
		seven.put("Small", 125);
		seven.put("Medium", 250);
		seven.put("Large", 500);
		// Cloud9
		Map<String, Integer> cloud9 = new HashMap<String, Integer>();
		cloud9.put("Small", 120);
		cloud9.put("Medium", 240);
		cloud9.put("Large", 480);

		pizzaMap.put("Margherita", marerita);
		pizzaMap.put("Hawaiian Delight Veg", hawaiVeg);
		pizzaMap.put("Hawaiian Delight NonVeg", hawaiNonVeg);
		pizzaMap.put("Veggie Paradise", vegPar);
		pizzaMap.put("Peppy Paneer", pp);
		pizzaMap.put("Zesty Chicken", chicZest);
		pizzaMap.put("Chicken Maxicana", chicMaxi);
		pizzaMap.put("Seventh Heaven", seven);
		pizzaMap.put("Cloud9", cloud9);
	}

	public Pizza(String pizzaName) throws InvalidOrderException {
		this(pizzaName, null,null);
	}
	public Pizza(String pizzaName,String pizzaCrust) throws InvalidOrderException {
		this(pizzaName, pizzaCrust,null);
	}

	public Pizza(String pizzaName, String pizzaCrust,String size) throws InvalidOrderException {
		name = pizzaName;
		toppingList = Topping.getDefaultTopping(pizzaName);
		if (null != pizzaCrust)
			crust = pizzaCrust;
		else
			crust = "Regular";
		
		if (null != size)
			this.size = size;
		else
			this.size = "Medium";
		if(!"Medium".equals(this.size) && "Cheese Burst".equals(this.crust))
				throw new InvalidOrderException();
	}

	public int getPizzaPrice() {

		// int toppingPrice=getToppingPrice(name);

		return pizzaMap.get(name).get(size);
	}

	public int getTotalPrice() throws InvalidCrustException {
		int pizzaPrice = pizzaMap.get(name).get(size);
		int toppingPrice = 0;
		if (null != extraTopping) {
			Topping topping = new Topping();
			toppingPrice = topping.getToppingPrice(extraTopping);
		}
		int crustPrice = Crust.getCostOfCrust(getCrust());
		// System.out.println("crust: "+ getCrust()+ "price : "+ crustPrice);
		return pizzaPrice + toppingPrice + crustPrice;
	}

}
