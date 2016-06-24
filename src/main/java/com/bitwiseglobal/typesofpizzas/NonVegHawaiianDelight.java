package com.bitwiseglobal.typesofpizzas;

import com.bitwiseglobal.pizza.Pizza;
import com.bitwiseglobal.pizza.Toppings;

public class NonVegHawaiianDelight extends Pizza {

	public NonVegHawaiianDelight() {
		this.deafultToppings.add(Toppings.Chicken_Salami);
		this.deafultToppings.add(Toppings.Pineapple);
		this.deafultToppings.add(Toppings.Jalapeno);
		this.setCost(220);
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		String message=this.getClass().getSimpleName()+"\n";
		
		return message+super.toString();
	}
}
