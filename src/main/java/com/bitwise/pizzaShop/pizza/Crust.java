package com.bitwise.pizzaShop.pizza;

public class Crust {
	
	private String crustType;
	private int crustPrice;
	
	public Crust(String crustType, int crustPrice){
		this.crustType = crustType;
		this.crustPrice = crustPrice;
	}
	
	public String getCrustType() {
		return crustType;
	}
	public void setCrustType(String crustType) {
		this.crustType = crustType;
	}
	public int getCrustPrice() {
		return crustPrice;
	}
	public void setCrustPrice(int crustPrice) {
		this.crustPrice = crustPrice;
	}
}
