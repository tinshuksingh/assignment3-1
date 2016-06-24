/**
 * 
 */
package com.pizzahut.pizza.order;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * @author virendra
 *
 */
public class Cart implements Serializable {
	private static final long serialVersionUID = 3229986838093302290L;
	private List<Pizza> pizzas;
	
	public Cart() {
		pizzas = new ArrayList<Pizza>();
	}

	public List<Pizza> getPizas() {
		return pizzas;
	}

	public void addPizza(Pizza pizza) {
		pizzas.add(pizza);
	}
	
	

}
