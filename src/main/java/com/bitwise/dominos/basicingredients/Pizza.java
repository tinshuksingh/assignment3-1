package com.bitwise.dominos.basicingredients;

import com.bitwise.dominos.inventories.PizzaInventory;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Aniruddha Sinha on 24-06-2016.
 */
public class Pizza {
    private String name;
    private double price;
    private List<Topping> toppings=new ArrayList<>();
    private Crust crust;
    public static final double VAT=0.1;
    public static final double SERVICE_TAX=0.15;
    public Pizza(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public Pizza(String name, double price, List<Topping> toppings) {
        this.name = name;
        this.price = price;
        this.toppings = toppings;
        validateName();
        validatePrice();
        validateToppings();
    }

    private void validatePrice() {
        if(this.price<=100.0) throw new Pizza.InvalidPriceException();
    }

    public void validateName(){if(this.name.isEmpty()/*||this.toppings.isEmpty()||this.price<150.0*/) throw new InvalidPizzaNameException();}

    public void validateToppings(){
        if(toppings.isEmpty()) throw new Pizza.InvalidToppingListException();
    }

    public Pizza(String name, double price, List<Topping> toppings, Crust crust) {
        this.name = name;
        this.price = price;
        this.toppings = toppings;
        this.crust = crust;
        validateName();
        validatePrice();
        validateToppings();
    }

    public Pizza defaultToppings(Topping...toppings){
        for(Topping T:toppings) addTopings(T);
        return this;
    }

    public void addCrust(Crust crust) {
        this.crust = crust;
    }

    public void addTopings(Topping t) {
        this.toppings.add(t);
    }


    public Crust getCrust() {
        return crust;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public List<Topping> getToppings() {
        return toppings;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Pizza pizza = (Pizza) o;

        if (Double.compare(pizza.price, price) != 0) return false;
        if (!name.equals(pizza.name)) return false;
        if (!toppings.equals(pizza.toppings)) return false;
        return crust.equals(pizza.crust);

    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = name.hashCode();
        temp = Double.doubleToLongBits(price);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + toppings.hashCode();
        result = 31 * result + crust.hashCode();
        return result;
    }

    @Override
    public String toString() {
        return "Pizza{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", toppings=" + toppings +
                ", crust=" + crust +
                '}';
    }

    public  double getTotalPrice(double price) {
        return Math.round(price+calculateVat(price)+calculateServiceTax(price));
    }
    public static Pizza pizzaWithNewPrice(Pizza pizza, double newPrice) {
        return new Pizza(pizza.getName(), newPrice,pizza.getToppings(),pizza.getCrust());
    }

    private double calculateServiceTax(double v1) {
        return v1*SERVICE_TAX;
    }

    private double calculateVat(double v) {
        /**VAT calculation formula for VAT exclusion is the following:
         * to calculate VAT having the gross amount you should divide the gross amount by
         * 1 + VAT percentage (i.e. if it is 15%, then you should divide by 1.15),
         * then
         * subtract the gross amount, multiply by -1 and round to the closest
         * value (including eurocents).*/
        return Math.abs(v-(v/(1+VAT)));
    }

    public void removeTopping(Pizza pizza,Topping topping) {
        if(pizza.toppings.contains(topping))
        this.toppings.remove(topping);
        else throw new Error("Faulty topping removed");
    }

    public class InvalidPizzaNameException extends RuntimeException {
    }

    public class InvalidPriceException extends RuntimeException {
    }

    public class InvalidToppingListException extends RuntimeException {
    }
}
