package com.bitwise.pizzashop;

public class Crust extends Item{
	
	
	public Crust(String crustName, double crustPrice) {
		super(crustName,crustPrice);
	}

	@Override
	public double getItemPrice() {
		
		return this.getPrice();
	}
	
	

}
