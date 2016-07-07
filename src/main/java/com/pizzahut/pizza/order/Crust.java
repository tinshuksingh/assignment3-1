/**
 * 
 */
package com.pizzahut.pizza.order;

/**
 * @author virendra
 *
 */
public enum Crust {
	PanPizza("Pan Pizza", 100),
	ThinCrust("Thin Crust", 150),
	Regular("Regular", 0),
	CheeseBurst("Cheese Burst", 200);
	
	private String name;
	private double price;
	
	Crust(String name, double price) {
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
