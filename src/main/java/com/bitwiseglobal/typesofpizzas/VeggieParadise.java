package com.bitwiseglobal.typesofpizzas;

import com.bitwiseglobal.pizza.Pizza;
import com.bitwiseglobal.pizza.Toppings;

public class VeggieParadise extends Pizza {

	public VeggieParadise() {
		this.deafultToppings.add(Toppings.Baby_Corn);
		this.deafultToppings.add(Toppings.Olives);
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
