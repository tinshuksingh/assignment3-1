package com.bitwiseglobal.typesofpizzas;

import com.bitwiseglobal.pizza.Pizza;
import com.bitwiseglobal.pizza.Toppings;

public class VegHawaiianDelight extends Pizza {

	public VegHawaiianDelight() {
		this.deafultToppings.add(Toppings.Baby_Corn);
		this.deafultToppings.add(Toppings.Pineapple);
		this.deafultToppings.add(Toppings.Jalapeno);
		this.setCost(200);
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		String message=this.getClass().getSimpleName()+"\n";
		
		return message+super.toString();
	}

}
