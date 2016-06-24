/**
 * 
 */
package com.pizzahut.pizza.db;

import com.pizzahut.pizza.order.Topping;

/**
 * @author virendra
 *
 */
public enum ToppingDB {
	Tomato(new Topping("Tomato", 10)),
	BabyCorn(new Topping("Baby Corn", 10)),
	Jalapeno(new Topping("Jalapeno", 15)),
	ChickenSalami(new Topping("Chicken Salami", 95)),
	Olives(new Topping("Olives", 15)),
	Capsicum(new Topping("Capsicum", 10)),
	Paprika(new Topping("Paprika", 30)),
	Paneer(new Topping("Paneer", 80)),
	ChickenSausage(new Topping("Chicken Sausage", 110)),
	BarbequeChicken(new Topping("Barbeque Chicken", 100)),
	SpicyChicken(new Topping("Spicy Chicken", 90)),
	Onion(new Topping("Onion", 10)),
	Cheese(new Topping("Cheese", 20)),
	SmokedChicken(new Topping("Smoked Chicken", 150)),
	Pineapple(new Topping("Pineapple", 20));
	
	ToppingDB(Topping topping) {
		this.topping = topping;
	}
	private Topping topping;

	public Topping getTopping() {
		return topping;
	}

	public void setTopping(Topping topping) {
		this.topping = topping;
	}
	
	
}
