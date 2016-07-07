/**
 * 
 */
package com.pizzahut.pizza.db;

import java.util.ArrayList;
import java.util.Arrays;

import com.pizzahut.pizza.order.Pizza;
import com.pizzahut.pizza.order.PizzaSize;
import com.pizzahut.pizza.order.Topping;

/**
 * @author virendra
 *
 */
public enum PizzaDB {
	Margherita_Small(new Pizza("Margherita Small", new ArrayList<Topping>(Arrays.asList(ToppingDB.Tomato.getTopping())), 80, PizzaSize.Small)),
	Margherita_Medium(new Pizza("Margherita Medium", new ArrayList<Topping>(Arrays.asList(ToppingDB.Tomato.getTopping())), 150, PizzaSize.Medium)),
	Margherita_Large(new Pizza("Margherita Large", new ArrayList<Topping>(Arrays.asList(ToppingDB.Tomato.getTopping())), 300, PizzaSize.Large)),
	
	VegHawaiianDelight_Small(new Pizza("Veg Hawaiian Delight Small", new ArrayList<Topping>(Arrays.asList(ToppingDB.BabyCorn.getTopping(), ToppingDB.Pineapple.getTopping(), ToppingDB.Jalapeno.getTopping())), 100, PizzaSize.Small)),
	VegHawaiianDelight_Medium(new Pizza("Veg Hawaiian Delight Medium", new ArrayList<Topping>(Arrays.asList(ToppingDB.BabyCorn.getTopping(), ToppingDB.Pineapple.getTopping(), ToppingDB.Jalapeno.getTopping())), 200, PizzaSize.Medium)),
	VegHawaiianDelight_Large(new Pizza("Veg Hawaiian Delight Large", new ArrayList<Topping>(Arrays.asList(ToppingDB.BabyCorn.getTopping(), ToppingDB.Pineapple.getTopping(), ToppingDB.Jalapeno.getTopping())), 400, PizzaSize.Large)),
	
	NonVegHawaiianDelight_Small(new Pizza("NonVeg Hawaiian Delight Small", new ArrayList<Topping>(Arrays.asList(ToppingDB.ChickenSalami.getTopping(), ToppingDB.Pineapple.getTopping(), ToppingDB.Jalapeno.getTopping())), 110, PizzaSize.Small)),
	NonVegHawaiianDelight_Medium(new Pizza("NonVeg Hawaiian Delight Medium", new ArrayList<Topping>(Arrays.asList(ToppingDB.ChickenSalami.getTopping(), ToppingDB.Pineapple.getTopping(), ToppingDB.Jalapeno.getTopping())), 220, PizzaSize.Medium)),
	NonVegHawaiianDelight_Large(new Pizza("NonVeg Hawaiian Delight Large", new ArrayList<Topping>(Arrays.asList(ToppingDB.ChickenSalami.getTopping(), ToppingDB.Pineapple.getTopping(), ToppingDB.Jalapeno.getTopping())), 440, PizzaSize.Large)),
	
	
	VeggieParadise_Small(new Pizza("Veggie Paradise Small", new ArrayList<Topping>(Arrays.asList(ToppingDB.BabyCorn.getTopping(), ToppingDB.Olives.getTopping(), ToppingDB.Capsicum.getTopping(), ToppingDB.Paprika.getTopping())), 115, PizzaSize.Small)),
	VeggieParadise_Medium(new Pizza("Veggie Paradise Medium", new ArrayList<Topping>(Arrays.asList(ToppingDB.BabyCorn.getTopping(), ToppingDB.Olives.getTopping(), ToppingDB.Capsicum.getTopping(), ToppingDB.Paprika.getTopping())), 230, PizzaSize.Medium)),
	VeggieParadise_Large(new Pizza("Veggie Paradise Large", new ArrayList<Topping>(Arrays.asList(ToppingDB.BabyCorn.getTopping(), ToppingDB.Olives.getTopping(), ToppingDB.Capsicum.getTopping(), ToppingDB.Paprika.getTopping())), 460, PizzaSize.Large)),
	
	
	PeppyPaneer_Small(new Pizza("Peppy Paneer Small", new ArrayList<Topping>(Arrays.asList(ToppingDB.Paneer.getTopping(), ToppingDB.Capsicum.getTopping(), ToppingDB.Paprika.getTopping())), 115, PizzaSize.Small)),
	PeppyPaneer_Medium(new Pizza("Peppy Paneer Medium", new ArrayList<Topping>(Arrays.asList(ToppingDB.Paneer.getTopping(), ToppingDB.Capsicum.getTopping(), ToppingDB.Paprika.getTopping())), 230, PizzaSize.Medium)),
	PeppyPaneer_Large(new Pizza("Peppy Paneer Large", new ArrayList<Topping>(Arrays.asList(ToppingDB.Paneer.getTopping(), ToppingDB.Capsicum.getTopping(), ToppingDB.Paprika.getTopping())), 460, PizzaSize.Large)),
	
	
	ZestyChicken_Small(new Pizza("Zesty Chicken Small", new ArrayList<Topping>(Arrays.asList(ToppingDB.ChickenSausage.getTopping(), ToppingDB.BarbequeChicken.getTopping(), ToppingDB.Capsicum.getTopping(), ToppingDB.Paprika.getTopping())), 140, PizzaSize.Small)),
	ZestyChicken_Medium(new Pizza("Zesty Chicken Medium", new ArrayList<Topping>(Arrays.asList(ToppingDB.ChickenSausage.getTopping(), ToppingDB.BarbequeChicken.getTopping(), ToppingDB.Capsicum.getTopping(), ToppingDB.Paprika.getTopping())), 280, PizzaSize.Medium)),
	ZestyChicken_Large(new Pizza("Zesty Chicken Large", new ArrayList<Topping>(Arrays.asList(ToppingDB.ChickenSausage.getTopping(), ToppingDB.BarbequeChicken.getTopping(), ToppingDB.Capsicum.getTopping(), ToppingDB.Paprika.getTopping())), 560, PizzaSize.Large)),
	
	
	ChickenMaxicana_Small(new Pizza("Chicken Maxicana Small", new ArrayList<Topping>(Arrays.asList(ToppingDB.Onion.getTopping(), ToppingDB.Tomato.getTopping(), ToppingDB.Paprika.getTopping(), ToppingDB.SpicyChicken.getTopping())), 150, PizzaSize.Small)),
	ChickenMaxicana_Medium(new Pizza("Chicken Maxicana Medium", new ArrayList<Topping>(Arrays.asList(ToppingDB.Onion.getTopping(), ToppingDB.Tomato.getTopping(), ToppingDB.Paprika.getTopping(), ToppingDB.SpicyChicken.getTopping())), 300, PizzaSize.Medium)),
	ChickenMaxicana_Large(new Pizza("Chicken Maxicana Large", new ArrayList<Topping>(Arrays.asList(ToppingDB.Onion.getTopping(), ToppingDB.Tomato.getTopping(), ToppingDB.Paprika.getTopping(), ToppingDB.SpicyChicken.getTopping())), 600, PizzaSize.Large)),
	
	SeventhHeaven_Small(new Pizza("Chicken Maxicana Small", new ArrayList<Topping>(Arrays.asList(ToppingDB.SmokedChicken.getTopping(), ToppingDB.Paprika.getTopping(), ToppingDB.Jalapeno.getTopping())), 150, PizzaSize.Small)),
	SeventhHeaven_Medium(new Pizza("Chicken Maxicana Medium", new ArrayList<Topping>(Arrays.asList(ToppingDB.SmokedChicken.getTopping(), ToppingDB.Paprika.getTopping(), ToppingDB.Jalapeno.getTopping())), 300, PizzaSize.Medium)),
	SeventhHeaven_Large(new Pizza("Chicken Maxicana Large", new ArrayList<Topping>(Arrays.asList(ToppingDB.SmokedChicken.getTopping(), ToppingDB.Paprika.getTopping(), ToppingDB.Jalapeno.getTopping())), 600, PizzaSize.Large)),
	
	Cloud9_Small(new Pizza("Chicken Maxicana Small", new ArrayList<Topping>(Arrays.asList(ToppingDB.Onion.getTopping(), ToppingDB.Tomato.getTopping(), ToppingDB.Paprika.getTopping(), ToppingDB.SpicyChicken.getTopping())), 150, PizzaSize.Small)),
	Cloud9_Medium(new Pizza("Chicken Maxicana Medium", new ArrayList<Topping>(Arrays.asList(ToppingDB.Onion.getTopping(), ToppingDB.Tomato.getTopping(), ToppingDB.Paprika.getTopping(), ToppingDB.SpicyChicken.getTopping())), 300, PizzaSize.Medium)),
	Cloud9_Large(new Pizza("Chicken Maxicana Large", new ArrayList<Topping>(Arrays.asList(ToppingDB.Onion.getTopping(), ToppingDB.Tomato.getTopping(), ToppingDB.Paneer.getTopping(), ToppingDB.Capsicum.getTopping(), ToppingDB.Jalapeno.getTopping())), 600, PizzaSize.Large)),
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
