package com.bitwise.pizzashop;

public class Pizza extends Item {
	
	//private String size;
	private Topping[] defaultToppings;
	private Crust defaultCrust;
	
	
	public Pizza(String name, Topping[] defaultToppings,Crust defaultCrust) {
		super(name);
		
        //this.size= size;
		this.defaultCrust=defaultCrust;
		this.defaultToppings=defaultToppings;

	}
	
	
/*	public String getSize() {
		return size;
	}
	public void setSize(String size) {
		this.size = size;
	}*/
	
	public Crust getDefaultCrust() {
		return defaultCrust;
	}
	public void setDefaultCrust(Crust defaultCrust) {
		this.defaultCrust = defaultCrust;
	}

	public Topping[] getDefaultToppings() {
		return defaultToppings;
	}

	public void setDefaultToppings(Topping[] defaultToppings) {
		this.defaultToppings = defaultToppings;
	}




	@Override
	public double getItemPrice() {
		return getPrice();
	}
	


}
