package com.bitwise.pizzaShop.pizza;

public class Topping {
	private String topping;
	private int price;
	
	public Topping(String topping, int price){
		this.topping=topping;
		this.price=price;
	}
	
	public String getTopping() {
		return topping;
	}
	public void setTopping(String topping) {
		this.topping = topping;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
}
