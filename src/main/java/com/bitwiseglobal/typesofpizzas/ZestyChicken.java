package com.bitwiseglobal.typesofpizzas;

import com.bitwiseglobal.pizza.Pizza;
import com.bitwiseglobal.pizza.Toppings;

public class ZestyChicken extends Pizza {

	public ZestyChicken() {
		// TODO Auto-generated constructor stub
		this.deafultToppings.add(Toppings.Chicken_Sausage);
		this.deafultToppings.add(Toppings.Barbeque_Chicken);
		this.deafultToppings.add(Toppings.Capsicum);
		this.deafultToppings.add(Toppings.Paprika);
		this.setCost(280);
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		String message=this.getClass().getSimpleName()+"\n";
		
		return message+super.toString();
	}
}
