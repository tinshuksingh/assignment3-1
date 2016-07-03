package com.bitwise.pizzaShop.exception;

/**
 * The exception class for Pizz shop application
 * 
 * @author Pravin
 *
 */
public class PizzaShopException extends RuntimeException{

	/**
	 * 
	 */
	private static final long serialVersionUID = -1328603340437589943L;
	
	public PizzaShopException(){
		super();
	}
	
	public PizzaShopException(String message){
		super(message);
		System.out.println("PizzaShopException:" + message);
	}

}
