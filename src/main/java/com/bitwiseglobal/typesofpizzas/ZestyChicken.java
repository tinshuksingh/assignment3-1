package com.bitwiseglobal.typesofpizzas;

import com.bitwiseglobal.pizza.Pizza;
import com.bitwiseglobal.pizza.SizeOfPizza;
import com.bitwiseglobal.pizza.Toppings;

public class ZestyChicken extends Pizza {
	@SuppressWarnings("unused")
	private ZestyChicken() {
	}

	public ZestyChicken(SizeOfPizza size) {
		// TODO Auto-generated constructor stub
		this.addSizeofpizza(size);
		this.addCost();
		this.deafultToppings.add(Toppings.Chicken_Sausage);
		this.deafultToppings.add(Toppings.Barbeque_Chicken);
		this.deafultToppings.add(Toppings.Capsicum);
		this.deafultToppings.add(Toppings.Paprika);
		this.setCost(280);
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		String message = this.getClass().getSimpleName() + "\n";

		return message + super.toString();
	}

	private void addCost() {
		if (this.getSizeofpizza().equals(SizeOfPizza.Small)) {
			this.setCost(140);
		} else if (this.getSizeofpizza().equals(SizeOfPizza.Medium)) {
			this.setCost(280);
		} else if (this.getSizeofpizza().equals(SizeOfPizza.Large)) {
			this.setCost(560);
		} else {
			throw new RuntimeException("Please add valid pizza size");
		}

	}
}
