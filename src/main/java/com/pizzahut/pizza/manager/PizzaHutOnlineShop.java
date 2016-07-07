/**
 * 
 */
package com.pizzahut.pizza.manager;

import com.pizzahut.pizza.exception.InvalidOrderException;
import com.pizzahut.pizza.order.Order;
import com.pizzahut.pizza.order.Pizza;
import com.pizzahut.pizza.order.Topping;

/**
 * @author virendra
 *
 */
public class PizzaHutOnlineShop {
	private static final double VAT = 0.1;
	private static final double SERVICE_TAX = 0.15;

	private Order order;

	public double placeOrder() {
		if (order == null || order.getPizas() == null || order.getPizas().isEmpty()) {
			throw new InvalidOrderException();
		}

		return calculateTotal();
	}

	private double calculateTotal() {
		double price = 0;
		for(Pizza pizza : order.getPizas()) {
			price = price + pizza.getBasePrice() + pizza.getCrust().getPrice() + calculateAdditionalToppingsCost(pizza);
		}
		price = price + calculateVAT(price) + calculateServiceTax(price);
		return price;
	}

	private double calculateAdditionalToppingsCost(Pizza pizza) {
		double price = 0;
		if(pizza.getAdditionalToppings() != null && !pizza.getAdditionalToppings().isEmpty()) {
			for(Topping topping : pizza.getAdditionalToppings()) {
				price = price + topping.getPrice();
			}
		}
		return price;
	}

	private double calculateServiceTax(double price) {
		return price * SERVICE_TAX;
	}

	private double calculateVAT(double price) {
		return price * VAT;
	}

	public void setOrder(Order order) {
		this.order = order;

	}

}
