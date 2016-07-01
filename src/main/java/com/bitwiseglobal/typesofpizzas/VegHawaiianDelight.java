package com.bitwiseglobal.typesofpizzas;

import com.bitwiseglobal.pizza.Pizza;
import com.bitwiseglobal.pizza.SizeOfPizza;
import com.bitwiseglobal.pizza.Toppings;

public class VegHawaiianDelight extends Pizza {

	@SuppressWarnings("unused")
	private VegHawaiianDelight() {
	}

	public VegHawaiianDelight(SizeOfPizza size) {
		this.addSizeofpizza(size);
		this.addCost();
		this.deafultToppings.add(Toppings.Baby_Corn);
		this.deafultToppings.add(Toppings.Pineapple);
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
			this.setCost(100);
		} else if (this.getSizeofpizza().equals(SizeOfPizza.Medium)) {
			this.setCost(200);
		} else if (this.getSizeofpizza().equals(SizeOfPizza.Large)) {
			this.setCost(400);
		} else {
			throw new RuntimeException("Please add valid pizza size");
		}

	}

}
