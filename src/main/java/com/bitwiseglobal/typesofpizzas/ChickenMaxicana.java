package com.bitwiseglobal.typesofpizzas;

import com.bitwiseglobal.pizza.Pizza;
import com.bitwiseglobal.pizza.SizeOfPizza;
import com.bitwiseglobal.pizza.Toppings;

public class ChickenMaxicana extends Pizza {

	@SuppressWarnings("unused")
	private ChickenMaxicana() {
		// do nothing}
	}

	public ChickenMaxicana(SizeOfPizza size) {
		// TODO Auto-generated constructor stub
		this.addSizeofpizza(size);
		this.addCost();
		this.deafultToppings.add(Toppings.Onion);
		this.deafultToppings.add(Toppings.Tomato);
		this.deafultToppings.add(Toppings.Spicy_Chicken);
		this.deafultToppings.add(Toppings.Paprika);

	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		String message = this.getClass().getSimpleName() + "\n";
		return message + super.toString();
	}

	private void addCost() {
		if (this.getSizeofpizza().equals(SizeOfPizza.Small)) {
			this.setCost(150);
		} else if (this.getSizeofpizza().equals(SizeOfPizza.Medium)) {
			this.setCost(300);
		} else if (this.getSizeofpizza().equals(SizeOfPizza.Large)) {
			this.setCost(600);
		} else {
			throw new RuntimeException("Please add valid pizza size");
		}

	}
}
