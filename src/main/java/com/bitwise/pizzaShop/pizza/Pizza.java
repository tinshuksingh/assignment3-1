package com.bitwise.pizzaShop.pizza;

import java.util.ArrayList;
import java.util.HashMap;

import com.bitwise.pizzaShop.database.CrustDatabase;
import com.bitwise.pizzaShop.database.PizzaDatabase;
import com.bitwise.pizzaShop.database.ToppingDB;
import com.bitwise.pizzaShop.exception.PizzaShopException;

public class Pizza {
	private String name;
	private ArrayList<Topping> defaultToppipng;
	private HashMap<String, Topping> additionalTopping;
	private Crust crust;
	private int price;
	PizzaDatabase pizzaDatabase;
	
	public Pizza(){
		
	}
	public Pizza(String name, ArrayList<Topping> defaultToppipng, HashMap<String, Topping> additionalTopping, Crust crust,int price){
		this.name=name;
		this.defaultToppipng = defaultToppipng;
		this.additionalTopping= additionalTopping;
		this.crust= crust;
		this.price=price;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public ArrayList<Topping> getDefaultToppipng() {
		if (defaultToppipng == null)
			defaultToppipng = new ArrayList<Topping>();
		return defaultToppipng;
	}
	public void setDefaultToppipng(ArrayList<Topping> defaultToppipng) {
		this.defaultToppipng = defaultToppipng;
	}
	public HashMap<String, Topping> getAdditionalTopping() {
		if (additionalTopping == null)
			additionalTopping = new HashMap<String, Topping>();
		return additionalTopping;
	}
	public void setAdditionalTopping(HashMap<String, Topping> additionalTopping) {
		this.additionalTopping = additionalTopping;
	}
	public Crust getCrust() {
		return crust;
	}
	public void setCrust(Crust crust) {
		this.crust = crust;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	public void validPizza(){
		if (getName() == null || getName().trim().length() == 0){
			System.out.println("Please enter valid pizza name");
			throw new PizzaShopException();
		}
		if (PizzaDatabase.getAvailablePizzas().get(getName()) == null){
			System.out.println("Invalid pizza : " + getName());
			throw new PizzaShopException();
		}else{
			this.defaultToppipng = PizzaDatabase.getAvailablePizzas().get(name).getDefaultToppipng();
			this.crust = PizzaDatabase.getAvailablePizzas().get(name).getCrust();
			this.price = PizzaDatabase.getAvailablePizzas().get(name).getPrice();
		}
	}
	
	public void addTopping(String item){
		if (ToppingDB.getPizzaToppings().get(item) == null ){
			System.out.println("Invalid topping entered");
			throw new PizzaShopException();
		}
		
		getAdditionalTopping().put(item, ToppingDB.getPizzaToppings().get(item));
		System.out.println("Added topping: " + item);
	}
	
	public void removeTopping(String item){
		if (getAdditionalTopping().get(item) == null ){
			System.out.println("Topping: " + item + "has not added yet, so can't remove");
			throw new PizzaShopException();
		}
		getAdditionalTopping().remove(item);
		System.out.println("Removed topping: " + item);
	}
	
	public void ReplaceCrust(String item){
		if (CrustDatabase.getPizzaCrusts().get(item) == null ){
			System.out.println("Crust: " + item + "does not exist ");
			throw new PizzaShopException();
		}
		setCrust(new Crust(item, CrustDatabase.getPizzaCrusts().get(item).getCrustPrice()));
		System.out.println("Replaced crust with: " + item);
	}
}
