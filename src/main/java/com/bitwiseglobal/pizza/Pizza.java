package com.bitwiseglobal.pizza;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public abstract class Pizza {
	protected ArrayList<Toppings> additonalToppings = new ArrayList<Toppings>();
	protected ArrayList<Toppings> deafultToppings = new ArrayList<Toppings>();

	public void removeDeafultToppings(Toppings removeToppings) {
		boolean isToppingPresent = false;
		Toppings myToppings = null;

		Iterator iterator = deafultToppings.iterator();
		while (iterator.hasNext()) {
			Toppings toppings = (Toppings) iterator.next();
			if (toppings.equals(removeToppings)) {
				isToppingPresent = true;
				myToppings = toppings;
			}
		}

		if (isToppingPresent) {
			deafultToppings.remove(myToppings);
		} else {
			throw new DefaultToppingNotPresentException();
		}

	}

	public void removeAllDeafultToppings() {
		deafultToppings.removeAll(deafultToppings);
	}

	private int orginalCost;
	Crust crust;
	int quantity;

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public Crust getCrust() {
		return crust;
	}

	public void addCrust(Crust crust) {
		this.crust = crust;
	}

	public int getCost() {
		return orginalCost;
	}

	public void setCost(int cost) {
		this.orginalCost = cost;
	}

	public void addToppings(Toppings Toppings) {
		// TODO Auto-generated method stub
		this.additonalToppings.add(Toppings);
	}

	public double getPrize() {
		// TODO Auto-generated method stub
		double totalPrize = 0;
		totalPrize += this.getCost();
		for (Toppings myToppings : additonalToppings) {
			totalPrize += myToppings.getPrize();
		}
		if (this.getCrust() != null)
			totalPrize += this.getCrust().getPrize();
		return totalPrize;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		String message = "deafult topings: ";
		for (Toppings toppings : deafultToppings) {
			message += toppings.name() + ", ";
		}
		message += "\n";
		for (Toppings toppings : additonalToppings) {
			message += "additinal topings :" + toppings.name() + ", ";
		}
		if (!additonalToppings.isEmpty())
			message += "\n";
		if (crust != null) {
			message += "Crust type :" + crust.name();
			message += "\n";
		}
		message += "\n";
		return message;
	}

	public class DefaultToppingNotPresentException extends RuntimeException {

	}
}
