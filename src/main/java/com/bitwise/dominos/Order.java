package com.bitwise.dominos;

import java.util.ArrayList;
import java.util.List;

public class Order {

	List<Pizza> pizzaList = new ArrayList<Pizza>();
	float vat;
	float serviceTax;
	float totalAmount;
	public List<Pizza> getPizzaList() {
		return pizzaList;
	}
	public void setPizzaList(List<Pizza> pizzaList) {
		this.pizzaList = pizzaList;
	}
	public float getVat() {
		return vat;
	}
	public void setVat(float vat) {
		this.vat = vat;
	}
	public float getServiceTax() {
		return serviceTax;
	}
	public void setServiceTax(float serviceTax) {
		this.serviceTax = serviceTax;
	}
	public float getTotalAmount() throws InvalidOrderException {
		if(null!= pizzaList && !pizzaList.isEmpty())
		{
		for(Pizza p : pizzaList)
		{
			System.out.println("price : "+p.getTotalPrice());
			totalAmount=totalAmount+p.getTotalPrice();
		}
		System.out.println("totalpizza price : "+totalAmount);
		float vatPrice = (totalAmount/100) *vat;
		System.out.println("vat price : "+vatPrice);
		float serviceTaxPrice =  (totalAmount/100) *serviceTax;
		System.out.println("st price : "+serviceTaxPrice);
		totalAmount=totalAmount+vatPrice+serviceTaxPrice;
		System.out.println("total with tax price : "+totalAmount);
		return totalAmount;
		}
		else
		{
			throw new InvalidOrderException();
		}
	}
	public void setTotalAmount(float totalAmount) {
		this.totalAmount = totalAmount;
	}
	
	
}
