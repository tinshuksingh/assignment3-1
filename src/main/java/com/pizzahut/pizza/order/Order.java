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
public class Order implements Serializable {
	private static final long serialVersionUID = -1369156245704654015L;
	private List<Pizza> pizzas;
	
	public Order() {
		pizzas = new ArrayList<Pizza>();
	}

	public List<Pizza> getPizas() {
		return pizzas;
	}

	public void addPizza(Pizza pizza) {
		pizzas.add(pizza);
	}
	

}
