package com.bitwiseglobal.pizza;

import java.util.ArrayList;
import java.util.Iterator;

public abstract class Pizza {
	protected ArrayList<Toppings> additonalToppings = new ArrayList<Toppings>();
	protected ArrayList<Toppings> deafultToppings = new ArrayList<Toppings>();

	public void removeDeafultToppings(Toppings removeToppings)
			throws CanNotRemoveDefaultToppingsFromSmallSizePizaaException {
		if (this.getSizeofpizza().equals(SizeOfPizza.Small)) {
			throw new CanNotRemoveDefaultToppingsFromSmallSizePizaaException();
		}
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
	SizeOfPizza sizeofpizza = SizeOfPizza.Medium;

	public SizeOfPizza getSizeofpizza() {
		return sizeofpizza;
	}

	public void addSizeofpizza(SizeOfPizza sizeofpizza) {
		this.sizeofpizza = sizeofpizza;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public Crust getCrust() {
		return crust;
	}

	public void addCrust(Crust crust) throws CheeseBurstNotAvailableException {
		if (!this.getSizeofpizza().equals(sizeofpizza.Small))
			this.crust = crust;
		else
			throw new RuntimeException("You can not add crust for small size pizza");
		if (this.getSizeofpizza().equals(sizeofpizza.Large) && this.getCrust().equals(crust.Cheese_Burst)) {
			throw new CheeseBurstNotAvailableException("Cheese burst is not available with small size pizza");
		}
	}

	public int getCost() {
		return orginalCost;
	}

	public void setCost(int cost) {
		this.orginalCost = cost;
	}

	public void addToppings(Toppings Toppings) throws CanNotAddToppingsException {
		// TODO Auto-generated method stub
		if (!this.getSizeofpizza().equals(sizeofpizza.Small))
			this.additonalToppings.add(Toppings);
		else
			throw new CanNotAddToppingsException("You can not add toppings for small size pizza");

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
		message += "Size of pizza is : " + sizeofpizza.name();
		message += "\n";
		return message;
	}

	public class DefaultToppingNotPresentException extends RuntimeException {

	}

	public class InvalidPizzaSizeException extends RuntimeException {

	}

	public class CanNotAddToppingsException extends Exception {

		public CanNotAddToppingsException(String msg) {

		}

	}

	public class CheeseBurstNotAvailableException extends Exception {

		public CheeseBurstNotAvailableException(String msg) {

		}
	}

	public class CanNotRemoveDefaultToppingsFromSmallSizePizaaException extends Exception {

	}

}
