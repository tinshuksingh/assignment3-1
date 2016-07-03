package com.bitwise.pizzaShop.pizza;

import java.util.ArrayList;
import java.util.HashMap;

import com.bitwise.pizzaShop.database.CrustDatabase;
import com.bitwise.pizzaShop.database.PizzaDatabase;
import com.bitwise.pizzaShop.database.ToppingDB;
import com.bitwise.pizzaShop.exception.PizzaShopException;

public class Pizza {
	private String name;
	private Crust crust;
	private String pizzaSize;
	private ArrayList<Topping> defaultToppipng;
	private HashMap<String, Topping> additionalTopping;
	private HashMap<String, Integer> prizeMap;
	
	public Pizza(){
	}
	
	public Pizza(String name){
		this.name = name;
		setDefaultPizzaProperties(name);
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	@SuppressWarnings("unchecked")
	public void setDefaultPizzaProperties(String name){
		this.crust = CrustDatabase.getPizzaCrusts().get("Regular");
		this.prizeMap = PizzaDatabase.getAvailablePizzas().get(name).getPrizeMap();
		this.defaultToppipng = (ArrayList<Topping>) PizzaDatabase.getAvailablePizzas().get(name).getDefaultToppipng().clone();
		this.pizzaSize = "Medium";
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
	public String getPizzaSize() {
		return pizzaSize;
	}

	public void setPizzaSize(String pizzaSize) {
		this.pizzaSize = pizzaSize;
	}
	public HashMap<String, Integer> getPrizeMap() {
		return prizeMap;
	}

	public void setPrizeMap(HashMap<String, Integer> prizeMap) {
		this.prizeMap = prizeMap;
	}
	public void validPizza(){
		if (getName() == null || getName().trim().length() == 0){
			throw new PizzaShopException("Please enter valid pizza name");
		}
		if (PizzaDatabase.getAvailablePizzas().get(getName()) == null){
			throw new PizzaShopException("Invalid pizza : " + getName());
		}
	}
	
	public void addTopping(String item){
		if (getPizzaSize().equals("Small")){
			throw new PizzaShopException("Customization is not allowed for Small size pizza");
		}
		if (ToppingDB.getPizzaToppings().get(item) == null ){
			throw new PizzaShopException("Invalid topping entered");
		}
		
		
		getAdditionalTopping().put(item, ToppingDB.getPizzaToppings().get(item));
	}
	
	public void removeTopping(String item){
		if (getPizzaSize().equals("Small")){
			throw new PizzaShopException("Customization is not allowed for Small size pizza");
		}
		if (getAdditionalTopping().get(item) == null ){
			throw new PizzaShopException("Topping: " + item + "has not added yet, so can't remove");
		}
		getAdditionalTopping().remove(item);
	}
	
	public void ReplaceCrust(String item){
		if (getPizzaSize().equals("Small")){
			throw new PizzaShopException("Customization is not allowed for Small size pizza");
		}
		if (! getPizzaSize().equals("Medium")){
			throw new PizzaShopException("Crust: " + item + " is available with Medium size pizza only");
		}
		if (CrustDatabase.getPizzaCrusts().get(item) == null ){
			throw new PizzaShopException("Crust: " + item + "does not exist ");
		}
		
		setCrust(new Crust(item, CrustDatabase.getPizzaCrusts().get(item).getCrustPrice()));
	}
	
	public void removeAllDefaultTopping(){
		getDefaultToppipng().clear();
	}
	
	public void removeDefaultTopping(String topping){
		if (getPizzaSize().equals("Small")){
			throw new PizzaShopException("Customization is not allowed for Small size pizza");
		}
		for(int i=0; i<getDefaultToppipng().size(); i++){
			if(topping.equals(getDefaultToppipng().get(i).getTopping())){
				getDefaultToppipng().remove(i);
				return;
			}
		}
		throw new PizzaShopException("The toppping: " + topping + " is not default topping for selected pizza");
	}
}
