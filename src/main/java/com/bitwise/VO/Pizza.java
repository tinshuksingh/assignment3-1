package com.bitwise.VO;

import java.util.List;

import com.bitwise.util.PizzaUtil;

public class Pizza {

	private String Name;
	private List<String> toppings;
	private List<String> defaultToppings;
	private List<String> removedToppings;
	private String crust;

	public Pizza(String name, List<String> toppings, String crust) {
		super();
		Name = name;
		this.toppings = toppings;
		this.crust = crust;
		PizzaUtil.setDefaultToppings(this);
	}
	
	public Pizza(String name, List<String> toppings, String crust,List<String> removedToppings) {
		super();
		Name = name;
		this.toppings = toppings;
		this.crust = crust;
		PizzaUtil.setDefaultToppings(this);
			this.removedToppings=removedToppings;
		this.defaultToppings.removeAll(this.removedToppings);
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

	public List<String> getDefaultToppings() {
		return defaultToppings;
	}

	public void setDefaultToppings(List<String> defaultToppings) {
		this.defaultToppings = defaultToppings;
	}

	public List<String> getRemovedToppings() {
		return removedToppings;
	}

	public void setRemovedToppings(List<String> removedToppings) {
		this.removedToppings = removedToppings;
	}
}
