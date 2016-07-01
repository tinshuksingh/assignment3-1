package com.bitwise.pizzashop;

import java.util.ArrayList;

public class PizzaShop {


	private static final Exception IllegalArgumentException = null;
	private static final Exception NullPointerException = null;
	double totalCost = 0.0;
	int numberOfPizzas=0;
	int perOrder =0;
	private double vatCollected;
	private double serviceTaxCollected;
	

	//pizza name topping crust
	public void addCurrentToOrderList(Item[] thisOrder){
		new Order (thisOrder);
		
	}
	
	

	public double calculate(ArrayList<Item[]> orderList)  {
		// TODO Auto-generated method stub
		numberOfPizzas=orderList.size();
		
		
		if(numberOfPizzas > 0) {
		for(int i = 0 ; i < numberOfPizzas ; i++){
			int perOrder =  Order.getOrderList().get(i).length;
			
			for(int j = 0 ; j < perOrder ; j++){
				
				totalCost = totalCost + Order.getOrderList().get(i)[j].getItemPrice();
				
			}
			
		}
		
		vatCollected =  totalCost*TaxConstants.VAT/100;
		serviceTaxCollected= (totalCost )*TaxConstants.SERVICE_TAX/100;
		
		
		orderList.clear();

		}
		else{
			
				System.out.println("No items selected");

		}
		
		return totalCost + vatCollected + serviceTaxCollected;
		

	}




	public void validate(ArrayList<Item[]> orderList) throws Throwable  {
		// TODO Auto-generated method stub
		
		if (orderList.size()==0)
			throw IllegalArgumentException;
		else{
		for(int i = 0 ; i < numberOfPizzas ; i++){
			int perOrder =  Order.getOrderList().get(i).length;
			

			
			System.out.println("Pizza shop order  " + i + ": "+ perOrder);
			
			
			
			for(int j = 0 ; j < perOrder ; j++){
				
			//	if("small".equals(Order.getOrderList().get(i)[j].getSize()))
		
				totalCost = totalCost + Order.getOrderList().get(i)[j].getItemPrice();
				
				System.out.println("Pizza shop j " + totalCost);
			}
			
		}
		
	}
	
	}


}