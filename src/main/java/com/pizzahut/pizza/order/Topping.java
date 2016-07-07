/**
 * 
 */
package com.pizzahut.pizza.order;

/**
 * @author virendra
 *
 */
public enum Topping {
	
	Tomato("Tomato", 10),
	BabyCorn("Baby Corn", 10),
	Jalapeno("Jalapeno", 15),
	ChickenSalami("Chicken Salami", 95),
	Olives("Olives", 15),
	Capsicum("Capsicum", 10),
	Paprika("Paprika", 30),
	Paneer("Paneer", 80),
	ChickenSausage("Chicken Sausage", 110),
	BarbequeChicken("Barbeque Chicken", 100),
	SpicyChicken("Spicy Chicken", 90),
	Onion("Onion", 10),
	Cheese("Cheese", 20),
	SmokedChicken("Smoked Chicken", 150),
	Pineapple("Pineapple", 20);
	
	private String name;
	private double price;

	private Topping(String name, double price) {
		this.name = name;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public double getPrice() {
		return price;
	}

}
