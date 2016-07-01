package com.bitwise.pizzashop;

import java.util.ArrayList;

public class Order {

	private static ArrayList<Item[] > orderList  = new ArrayList<Item[] > ();
	
	public Order(Item[] pizzOrder){
		if (pizzOrder == null)
		  throw new NullPointerException();
		
		orderList.add(pizzOrder);
	}
	

	public static  ArrayList<Item[] > getOrderList() {
		return orderList;
	}

	public void setOrderList(ArrayList<Item[] > orderList) {
		this.orderList = orderList;
	}
	
	

	
}
