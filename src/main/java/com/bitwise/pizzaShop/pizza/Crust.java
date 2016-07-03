package com.bitwise.pizzaShop.pizza;

import com.bitwise.pizzaShop.database.CrustDatabase;

public class Crust {
	
	private String crustType;
	private int crustPrice;
	
	public Crust(String crustType, int crustPrice){
		this.crustType = crustType;
		this.crustPrice = crustPrice;
	}
	
	public Crust(String crustType){
		this.crustType = crustType;
		this.crustPrice = CrustDatabase.getPizzaCrusts().get(crustType).getCrustPrice();
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
