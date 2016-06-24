package com.bitwise.VO;

import java.util.List;

public class Pizza {

	private String Name;
	private List<String> toppings;
	private String crust;

	public Pizza(String name, List<String> toppings, String crust) {
		super();
		Name = name;
		this.toppings = toppings;
		this.crust = crust;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public List<String> getToppings() {
		return toppings;
	}

	public void setToppings(List<String> toppings) {
		this.toppings = toppings;
	}

	public String getCrust() {
		return crust;
	}

	public void setCrust(String crust) {
		this.crust = crust;
	}
}
