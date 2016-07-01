package com.bitwise.pizzashop;

public class Topping extends Item {
	
	
	public Topping(String toppingName, double toppingPrice){
		super(toppingName,toppingPrice);
	}

	@Override
	public double getItemPrice() {
		
		return getPrice();
	}
	
	
	

}
