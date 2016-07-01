package com.bitwiseglobal.typesofpizzas;

import com.bitwiseglobal.pizza.Pizza;
import com.bitwiseglobal.pizza.SizeOfPizza;
import com.bitwiseglobal.pizza.Toppings;

public class SeventhHeaven extends Pizza {

	@SuppressWarnings("unused")
	private SeventhHeaven() {
	}

	public SeventhHeaven(SizeOfPizza size) {
		// TODO Auto-generated constructor stub
		this.addSizeofpizza(size);
		this.addCost();
		this.deafultToppings.add(Toppings.Smoked_Chicken);
		this.deafultToppings.add(Toppings.Paprika);
		this.deafultToppings.add(Toppings.Jalapeno);

	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		String message = this.getClass().getSimpleName() + "\n";
		return message + super.toString();
	}

	private void addCost() {
		if (this.getSizeofpizza().equals(SizeOfPizza.Small)) {
			this.setCost(125);
		} else if (this.getSizeofpizza().equals(SizeOfPizza.Medium)) {
			this.setCost(250);
		} else if (this.getSizeofpizza().equals(SizeOfPizza.Large)) {
			this.setCost(500);
		} else {
			throw new RuntimeException("Please add valid pizza size");
		}

	}
}
