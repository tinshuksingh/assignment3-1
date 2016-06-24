/**
 * 
 */
package com.pizzahut.pizza.order;

import java.io.Serializable;

/**
 * @author virendra
 *
 */
public class Topping implements Serializable {
	private static final long serialVersionUID = 1111331444996520512L;
	private String name;
	private double price;

	public Topping(String name, double price) {
		this.name = name;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

}
