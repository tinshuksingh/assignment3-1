package com.bitwise.pizzashop;

import java.util.HashMap;

public class PizzaMenu {
	
	
	
	private static HashMap<String,Pizza> pizzaMap = new HashMap<String,Pizza>();
	private static HashMap<String,Topping> toppingMap = new HashMap<String,Topping>();
	private static HashMap<String,Crust> crustMap = new HashMap<String,Crust>();
	private static HashMap<String,Size> sizeMap = new HashMap<String,Size>();
	
/*	private static HashMap<String,Double> smallMap = new HashMap<String,Double>();
	private static HashMap<String,Double> mediumMap = new HashMap<String,Double>();
	private static HashMap<String,Double> largeMap = new HashMap<String,Double>();
	
	private static HashMap<HashMap<String,Double>,Double> test = new HashMap<smallMap,Double>();*/
	
	
	
	public static void addPizzaToMenu(String pizzaName, Pizza pizza){
		if(pizza != null)
			pizzaMap.put(pizzaName, pizza);
		
			
	}
	
	public static Pizza getPizzaFromMenu(String pizzaName){
		if(pizzaName != null)
		{
			new SetPizzaPrice(pizzaName);
	
		}
		return pizzaMap.get(pizzaName);
	}
	
	public static void addToppingToMenu(String toppingName, Topping topping){
		if(topping != null)
			toppingMap.put(toppingName, topping);
		
			
	}
	
	public static Topping getToppingFromMenu(String toppingName){
		
			return toppingMap.get(toppingName);
				
	}
	
	public static void addCrustToMenu(String crustName, Crust crust){
		if(crust != null)
			crustMap.put(crustName, crust);
		
			
	}
	
	public static Crust getCrustFromMenu(String crustName){
		
			return crustMap.get(crustName);
				
	}
	
	public static void addPizzaSizePriceToMenu(String sizeOfPiz, Size size){
		if(size != null)
			sizeMap.put(sizeOfPiz, size);
		
			
	}
	
	public static Size getPizzaSizePriceFromMenu(String sizeOfPiz){

					
			return sizeMap.get(sizeOfPiz);
				
	}
	

}
