package com.bitwise.pizzashop;

public abstract class Item {
	
	private String name;
	private double price;
	private String size;

	

	public Item(String name, double price) {
		this.name = name;
		this.price= price;
		
	}
	
	public Item(String name, double price,String size) {
		this.name = name;
		this.price= price;
		this.size= size;
		
	}


	public Item(String name) {
		// TODO Auto-generated constructor stub
		this.name = name;
	}
	

	public abstract double getItemPrice();
	//public abstract String getPizzaSize();


	public String getName() {
		return name;
		
	}


	public void setName(String name) {
		this.name = name;
	}


	public double getPrice() {
		return price;
	}


	public void setPrice(double price) {
		this.price = price;
	}

	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}

}
