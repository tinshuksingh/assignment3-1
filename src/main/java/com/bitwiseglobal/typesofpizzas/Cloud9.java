package com.bitwiseglobal.typesofpizzas;

import com.bitwiseglobal.pizza.Pizza;
import com.bitwiseglobal.pizza.SizeOfPizza;
import com.bitwiseglobal.pizza.Toppings;

public class Cloud9 extends Pizza {

	@SuppressWarnings("unused")
	private Cloud9() {
	}

	public Cloud9(SizeOfPizza size) {
		// TODO Auto-generated constructor stub
		this.addSizeofpizza(size);
		this.addCost();
		this.deafultToppings.add(Toppings.Onion);
		this.deafultToppings.add(Toppings.Tomato);
		this.deafultToppings.add(Toppings.Panner);
		this.deafultToppings.add(Toppings.Capsicum);
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
			this.setCost(120);
		} else if (this.getSizeofpizza().equals(SizeOfPizza.Medium)) {
			this.setCost(240);
		} else if (this.getSizeofpizza().equals(SizeOfPizza.Large)) {
			this.setCost(480);
		} else {
			throw new RuntimeException("Please add valid pizza size");
		}

	}
}
