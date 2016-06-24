/**
 * 
 */
package com.pizzahut.pizza.order;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import com.pizzahut.pizza.db.CrustDB;

/**
 * @author virendra
 *
 */
public class Pizza implements Serializable {
	private static final long serialVersionUID = -6773912711403991101L;
	private String name;
	private List<Topping> additionalToppings;
	private List<Topping> defaultToppings;
	private double basePrice;
	private Crust crust;
	
	public Pizza(Pizza pizza) {
		this(pizza.getName(),pizza.defaultToppings,pizza.basePrice);
	}
	
	public Pizza(String name, List<Topping> defaultTopings, double basePrice) {
		this.name = name;
		this.defaultToppings = defaultTopings;
		this.basePrice = basePrice;
		additionalToppings = new ArrayList<Topping>();
		this.crust = CrustDB.Regular.getCrust();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Topping> getAdditionalToppings() {
		return additionalToppings;
	}

	public void addAdditionalTopping(Topping additionalToping) {
		this.additionalToppings.add(additionalToping);
	}

	public List<Topping> getDefaultToppings() {
		return defaultToppings;
	}

	public double getBasePrice() {
		return basePrice;
	}

	public void setBasePrice(double basePrice) {
		this.basePrice = basePrice;
	}

	public Crust getCrust() {
		return crust;
	}

	public void setCrust(Crust crust) {
		this.crust = crust;
	}


}
