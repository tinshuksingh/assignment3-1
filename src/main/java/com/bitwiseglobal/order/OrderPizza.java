package com.bitwiseglobal.order;

import java.util.ArrayList;

import com.bitwiseglobal.pizza.Pizza;

public class OrderPizza {
	ArrayList<Pizza> pizzas;
	int quantity;
	double VATTax = 10;
	double serviceTax = 15;
	double totalCost = 0;

	public OrderPizza() {
		pizzas = new ArrayList<Pizza>();
		quantity = 1;
	}

	public void addpizza(Pizza myPizza, int quantity) {
		myPizza.setQuantity(quantity);
		pizzas.add(myPizza);
	}

	public double calcaulateTotalCost() {
		validations();
		for (Pizza pizza : pizzas) {
			System.out.println("Cost : " + pizza.getPrize() + " Quantity :" + pizza.getQuantity());
			totalCost += pizza.getPrize() * pizza.getQuantity();
		}
		System.out.println("adding service Tax: " + serviceTax + "%");
		System.out.println("adding VAT : " + VATTax + "%");

		totalCost = totalCost + (totalCost * (serviceTax / 100)) + (totalCost * (VATTax / 100));

		return totalCost;
	}

	private void validations() {
		if (pizzas.isEmpty())
			throw new NoPizzasToCalculate();
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		String message = "Your Order is :\n";
		for (Pizza pizza : pizzas) {
			message += pizza;
		}
		return message;
	}

	public class NoPizzasToCalculate extends RuntimeException {

	}

}
