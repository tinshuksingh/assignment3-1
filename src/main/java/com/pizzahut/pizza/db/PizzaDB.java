/**
 * 
 */
package com.pizzahut.pizza.db;

import java.util.ArrayList;
import java.util.Arrays;

import com.pizzahut.pizza.order.Pizza;
import com.pizzahut.pizza.order.Topping;

/**
 * @author virendra
 *
 */
public enum PizzaDB {
	Margherita(new Pizza("Margherita", new ArrayList<Topping>(Arrays.asList(ToppingDB.Tomato.getTopping())), 150)),
	VegHawaiianDelight(new Pizza("Veg Hawaiian Delight", new ArrayList<Topping>(Arrays.asList(ToppingDB.BabyCorn.getTopping(), ToppingDB.Pineapple.getTopping(), ToppingDB.Jalapeno.getTopping())), 200)),
	NonVegHawaiianDelight(new Pizza("NonVeg Hawaiian Delight", new ArrayList<Topping>(Arrays.asList(ToppingDB.ChickenSalami.getTopping(), ToppingDB.Pineapple.getTopping(), ToppingDB.Jalapeno.getTopping())), 220)),
	VeggieParadise(new Pizza("Veggie Paradise", new ArrayList<Topping>(Arrays.asList(ToppingDB.BabyCorn.getTopping(), ToppingDB.Olives.getTopping(), ToppingDB.Capsicum.getTopping(), ToppingDB.Paprika.getTopping())), 230)),
	PeppyPaneer(new Pizza("Peppy Paneer", new ArrayList<Topping>(Arrays.asList(ToppingDB.Paneer.getTopping(), ToppingDB.Capsicum.getTopping(), ToppingDB.Paprika.getTopping())), 230)),
	ZestyChicken(new Pizza("Zesty Chicken", new ArrayList<Topping>(Arrays.asList(ToppingDB.ChickenSausage.getTopping(), ToppingDB.BarbequeChicken.getTopping(), ToppingDB.Capsicum.getTopping(), ToppingDB.Paprika.getTopping())), 280)),
	ChickenMaxicana(new Pizza("Chicken Maxicana", new ArrayList<Topping>(Arrays.asList(ToppingDB.Onion.getTopping(), ToppingDB.Tomato.getTopping(), ToppingDB.Paprika.getTopping(), ToppingDB.SpicyChicken.getTopping())), 300)),
	;
	
	PizzaDB(Pizza pizza) {
		this.pizza = pizza;
	}
	
	private Pizza pizza;

	public Pizza getPizza() {
		return pizza;
	}

	public void setPizza(Pizza pizza) {
		this.pizza = pizza;
	}
}
