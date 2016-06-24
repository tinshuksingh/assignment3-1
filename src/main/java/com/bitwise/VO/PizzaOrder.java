package com.bitwise.VO;

import java.util.List;

public class PizzaOrder {
	private List<Pizza> pizzaList;

	public PizzaOrder(List<Pizza> pizzaList) {
		super();
		this.pizzaList = pizzaList;

	}

	public List<Pizza> getPizzaList() {
		return pizzaList;
	}

	public void setPizzaList(List<Pizza> pizzaList) {
		this.pizzaList = pizzaList;
	}

}
