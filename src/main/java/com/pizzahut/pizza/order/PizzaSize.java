/**
 * 
 */
package com.pizzahut.pizza.order;

/**
 * @author admin
 *
 */
public enum PizzaSize {
	Small("Small"), Medium("Medium"), Large("Large");

	PizzaSize(String size) {
		this.size = size;
	}

	String size;

	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}

}
