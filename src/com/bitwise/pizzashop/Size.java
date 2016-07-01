package com.bitwise.pizzashop;

public class Size extends Item{

	
	public Size(String pizzaName, double pizzaPrice,String size){
		super(pizzaName,pizzaPrice,size);
	}

	@Override
	public double getItemPrice() {
		
		return getPrice();
	}
}
