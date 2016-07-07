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

	/*@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		long temp;
		temp = Double.doubleToLongBits(price);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}*/

	@Override
	public boolean equals(Object obj) {
		if(obj == null) {
			return false;
		}
		if (getClass() != obj.getClass()) {
			return false;
		}
		Topping other = (Topping) obj;
		if(this.getName().equals(other.getName())) {
			return true;
		}
		return false;
	}

	@Override
	public String toString() {
		return "Topping [name=" + name + ", price=" + price + "]";
	}
	
}
