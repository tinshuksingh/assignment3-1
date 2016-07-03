package com.bitwise.pizzaShop.pizza;

import java.util.ArrayList;

import com.bitwise.pizzaShop.exception.PizzaShopException;

public class PizzaOrder {
	private ArrayList<Pizza> pizzasToOrder;
	private final double VAT = 0.1;
	private final double SERVICE_TAX = 0.15;
	private double orderAmount;
	
	public double getVAT() {
		return VAT;
	}
	public double getSERVICE_TAX() {
		return SERVICE_TAX;
	}
	
	public ArrayList<Pizza> getPizzasToOrder() {
		if (pizzasToOrder == null)
			pizzasToOrder = new ArrayList<Pizza>();
		return pizzasToOrder;
	}
	
	public void setPizzasToOrder(ArrayList<Pizza> pizzasToOrder) {
		this.pizzasToOrder = pizzasToOrder;
	}
	
	public double getOrderAmount() {
		return orderAmount;
	}
	public void setOrderAmount(double orderAmount) {
		this.orderAmount = orderAmount;
	}
	
	public void removePizza(String name){
		if (name == null || name.trim().length() == 0){
			System.out.println("Please enter pizza name to remove from order");
			throw new PizzaShopException();
		}
		
		for (int i=0; i< getPizzasToOrder().size(); i++){
			if (getPizzasToOrder().get(i).getName().equals(name)){
				getPizzasToOrder().remove(i);
				System.out.println("Pizza: " + name + "succesfully removed from order..");
			}
		}
		System.out.println("Pizza: " + name + " does not exist in cart.. Please check");
	}
	
	private void validateOrder() {
		if (getPizzasToOrder() == null || getPizzasToOrder().size() < 1 ){
			System.out.println("You have not added any pizza in cart");
			throw new PizzaShopException();
		}
		
		for (int i=0; i< getPizzasToOrder().size(); i++){
			if (getPizzasToOrder().get(i).getName() == null || getPizzasToOrder().get(i).getName().trim().length() == 0){
				System.out.println("The entered pizza name is blank. Invalid pizza added.");
				throw new PizzaShopException();
			}
		}
	}
	
	public double calculateOrderAmount(){
		validateOrder();
		
		orderAmount = 0.0;
		
		for (int i=0; i< getPizzasToOrder().size(); i++){
			Pizza pizza = getPizzasToOrder().get(i);
			orderAmount = orderAmount + pizza.getPrizeMap().get(pizza.getPizzaSize());
			orderAmount = orderAmount + pizza.getCrust().getCrustPrice();
			
			for (String topping : pizza.getAdditionalTopping().keySet()){
				orderAmount = orderAmount + pizza.getAdditionalTopping().get(topping).getPrice();
			}
		}
		
		orderAmount = orderAmount + (orderAmount * VAT) + (orderAmount * SERVICE_TAX);

		return orderAmount;
		
	}
	
	public void addPizza(Pizza p) {
		p.validPizza();
		getPizzasToOrder().add(p);
	}
	
	public void showOrderDetails(){
		System.out.println("----------Your Pizza Order Details---------");
		
		for (int i=0; i< getPizzasToOrder().size(); i++){
			Pizza pizza = getPizzasToOrder().get(i);
			System.out.println(i + ". " + pizza.getName());
			System.out.println(" Prize:"  + pizza.getPrizeMap().get(pizza.getPizzaSize()));
			System.out.println(" - Crust	          : " + pizza.getCrust().getCrustType());
			System.out.println(" - Crust Prize        : " + pizza.getCrust().getCrustPrice());
			System.out.println(" - Default Topping    :");
			for (int j=0; j<pizza.getDefaultToppipng().size(); j++){
				System.out.println("    * " + pizza.getDefaultToppipng().get(j).getTopping());
			}
			System.out.println(" - Additional Topping & Prize:");
			for (String addTopping: pizza.getAdditionalTopping().keySet()){
				System.out.println("    * " + pizza.getAdditionalTopping().get(addTopping).getTopping() + " : " + pizza.getAdditionalTopping().get(addTopping).getPrice());
			}
			
		}
		System.out.println("**** Final Amount : " + getOrderAmount());
		System.out.println("-------------------------------------------");
	}
	
}
