/**
 * 
 */
package com.pizzahut.pizza.manager;

import com.pizzahut.pizza.exception.EmptyCartException;
import com.pizzahut.pizza.exception.InvalidOrderException;
import com.pizzahut.pizza.order.Order;
import com.pizzahut.pizza.order.Pizza;
import com.pizzahut.pizza.order.Topping;

/**
 * @author virendra
 *
 */
public class PizzaHutOnlineShop {
	public static final double VAT = 0.1;
	public static final double SERVICE_TAX = 0.15;

	private Order order;

	public double placeOrder() {
		if (order == null) {
			throw new InvalidOrderException();
		}
		if (order.getCart() == null || order.getCart().getPizas() == null || order.getCart().getPizas().isEmpty()) {
			throw new EmptyCartException();
		}

		return calculateTotal();
	}

	private double calculateTotal() {
		double price = 0;
		for(Pizza pizza : order.getCart().getPizas()) {
			price = price + pizza.getBasePrice() + pizza.getCrust().getPrice() + calculateAdditionalToppingsCost(pizza);
		}
		price = price + calculateVAT(price) + calculateServiceTax(price);
		return price;
	}

	public double calculateAdditionalToppingsCost(Pizza pizza) {
		double price = 0;
		if(pizza.getAdditionalToppings() != null && !pizza.getAdditionalToppings().isEmpty()) {
			for(Topping topping : pizza.getAdditionalToppings()) {
				price = price + topping.getPrice();
			}
		}
		return price;
	}

	public double calculateServiceTax(double price) {
		return price * SERVICE_TAX;
	}

	public double calculateVAT(double price) {
		double vat = price * VAT;
		return vat;
	}

	public void setOrder(Order order) {
		this.order = order;

	}

}
