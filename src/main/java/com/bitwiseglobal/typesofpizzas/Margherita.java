package com.bitwiseglobal.typesofpizzas;

import com.bitwiseglobal.pizza.Pizza;
import com.bitwiseglobal.pizza.SizeOfPizza;
import com.bitwiseglobal.pizza.Toppings;

public class Margherita extends Pizza {

	@SuppressWarnings("unused")
	private Margherita() {
	}

	public Margherita(SizeOfPizza size) {
		this.deafultToppings.add(Toppings.Tomato);
		this.addSizeofpizza(size);
		this.addCost();
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		String message = this.getClass().getSimpleName() + "\n";

		return message + super.toString();
	}

	private void addCost() {
		if (this.getSizeofpizza().equals(SizeOfPizza.Small)) {
			this.setCost(80);
		} else if (this.getSizeofpizza().equals(SizeOfPizza.Medium)) {
			this.setCost(150);
		} else if (this.getSizeofpizza().equals(SizeOfPizza.Large)) {
			this.setCost(300);
		} else {
			throw new RuntimeException("Please add valid pizza size");
		}

	}
}
