/**
 * 
 */
package com.pizzahut.pizza.order;

import java.io.Serializable;

/**
 * @author virendra
 *
 */
public class Order implements Serializable {
	private static final long serialVersionUID = -1369156245704654015L;
	private Cart cart;
	
	public Order(Cart cart) {
		this.cart = cart;
	}

	public Cart getCart() {
		return cart;
	}

	public void setCart(Cart cart) {
		this.cart = cart;
	}

}
