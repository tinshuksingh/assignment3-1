/**
 * 
 */
package com.pizzahut.pizza.order;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import com.pizzahut.pizza.exception.InvalidCusumizationException;

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
	private PizzaSize pizzaSize;

	public Pizza(Pizza pizza) {
		this(pizza.getName(),pizza.defaultToppings,pizza.basePrice, pizza.getPizzaSize());
	}
	
	public Pizza(String name, List<Topping> defaultTopings, double basePrice, PizzaSize pizzaSize) {
		this.name = name;
		this.defaultToppings = defaultTopings;
		this.basePrice = basePrice;
		additionalToppings = new ArrayList<Topping>();
		this.crust = Crust.Regular;
		this.pizzaSize = pizzaSize;
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
		if(this.getPizzaSize().equals(PizzaSize.Small)) {
			throw new InvalidCusumizationException();
		}
		this.additionalToppings.add(additionalToping);
	}

	public List<Topping> getDefaultToppings() {
		return defaultToppings;
	}
	
	public void removeDefaultTopping(Topping topping) {
		if(this.getPizzaSize().equals(PizzaSize.Small)) {
			throw new InvalidCusumizationException();
		}
		defaultToppings.remove(topping);
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
		if(!this.getPizzaSize().equals(PizzaSize.Medium)) {
			throw new InvalidCusumizationException();
		}
		this.crust = crust;
	}

	public PizzaSize getPizzaSize() {
		return pizzaSize;
	}

	public void setPizzaSize(PizzaSize pizzaSize) {
		this.pizzaSize = pizzaSize;
	}
}
