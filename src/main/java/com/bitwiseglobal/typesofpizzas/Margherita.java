package com.bitwiseglobal.typesofpizzas;

import java.util.ArrayList;

import com.bitwiseglobal.pizza.Pizza;
import com.bitwiseglobal.pizza.Toppings;

public class Margherita extends Pizza {

	public Margherita() {
		this.deafultToppings.add(Toppings.Tomato);
		this.setCost(150);
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		String message=this.getClass().getSimpleName()+"\n";
		
		return message+super.toString();
	}
}
