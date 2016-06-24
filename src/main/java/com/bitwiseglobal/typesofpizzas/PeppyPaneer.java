package com.bitwiseglobal.typesofpizzas;

import com.bitwiseglobal.pizza.Pizza;
import com.bitwiseglobal.pizza.Toppings;

public class PeppyPaneer extends Pizza {

	public PeppyPaneer() {
		this.deafultToppings.add(Toppings.Panner);
		this.deafultToppings.add(Toppings.Capsicum);
		this.deafultToppings.add(Toppings.Paprika);
		this.setCost(230);
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		String message=this.getClass().getSimpleName()+"\n";
		
		return message+super.toString();
	}
}
