package com.bitwise.pizzaShop.pizza;

import java.util.ArrayList;

import com.bitwise.pizzaShop.exception.PizzaShopException;

public class PizzaOrder {
	private ArrayList<Pizza> pizzasToOrder;
	private final double VAT = 0.1;
	private final double SERVICE_TAX = 0.15;
	
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
		
		double orderAmount = 0.0;
		
		for (int i=0; i< getPizzasToOrder().size(); i++){
			orderAmount = orderAmount + getPizzasToOrder().get(i).getPrice();
			if (getPizzasToOrder().get(i) == null)
				System.out.println("Pizza is  null");
			if (getPizzasToOrder().get(i).getCrust() == null)
				System.out.println("Crust is null");
			orderAmount = orderAmount + getPizzasToOrder().get(i).getCrust().getCrustPrice();
			
			for (int j=0; j< getPizzasToOrder().get(i).getAdditionalTopping().size(); j++){
				for (String topping : getPizzasToOrder().get(i).getAdditionalTopping().keySet()){
					orderAmount = orderAmount + getPizzasToOrder().get(i).getAdditionalTopping().get(topping).getPrice();
				}
			}
		}
		
		orderAmount = orderAmount + (orderAmount * VAT);
		orderAmount = orderAmount + (orderAmount * SERVICE_TAX);
		System.out.println("orderAmount :"+orderAmount);
		return orderAmount;
		
	}
	
	public void addPizza(Pizza p) {
		p.validPizza();
		getPizzasToOrder().add(p);
	}
}
