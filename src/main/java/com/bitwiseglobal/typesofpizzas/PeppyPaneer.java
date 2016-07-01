package com.bitwiseglobal.typesofpizzas;

import com.bitwiseglobal.pizza.Pizza;
import com.bitwiseglobal.pizza.SizeOfPizza;
import com.bitwiseglobal.pizza.Toppings;

public class PeppyPaneer extends Pizza {

	@SuppressWarnings("unused")
	private PeppyPaneer() {
	}

	public PeppyPaneer(SizeOfPizza size) {
		this.addSizeofpizza(size);
		this.addCost();
		this.deafultToppings.add(Toppings.Panner);
		this.deafultToppings.add(Toppings.Capsicum);
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
			this.setCost(115);
		} else if (this.getSizeofpizza().equals(SizeOfPizza.Medium)) {
			this.setCost(230);
		} else if (this.getSizeofpizza().equals(SizeOfPizza.Large)) {
			this.setCost(460);
		} else {
			throw new RuntimeException("Please add valid pizza size");
		}

	}
}
