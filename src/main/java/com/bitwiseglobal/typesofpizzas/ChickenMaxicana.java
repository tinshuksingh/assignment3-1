package com.bitwiseglobal.typesofpizzas;

import com.bitwiseglobal.pizza.Pizza;
import com.bitwiseglobal.pizza.Toppings;

public class ChickenMaxicana extends Pizza {

	public ChickenMaxicana() {
		// TODO Auto-generated constructor stub
		this.deafultToppings.add(Toppings.Onion);
		this.deafultToppings.add(Toppings.Tomato);
		this.deafultToppings.add(Toppings.Spicy_Chicken);
		this.deafultToppings.add(Toppings.Paprika);
		this.setCost(300);
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		String message=this.getClass().getSimpleName()+"\n";
		return message+super.toString();
	}
}
