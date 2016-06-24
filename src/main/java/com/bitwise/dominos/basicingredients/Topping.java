package com.bitwise.dominos.basicingredients;

/**
 * Created by Aniruddha Sinha on 24-06-2016.
 */
public class Topping {
    private String name;
    private double price;
    public Topping(String n,double p){
        this.name=n;
        this.price=p;
        validateName();
        validatePrice();
    }

    private void validatePrice() {
        if(this.price<10.0) throw new Topping.InvalidToppingPriceException();
    }
    public void validateName(){
        if(this.name.isEmpty()) throw new Topping.InvalidToppingNameException();
    }



    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Topping topping = (Topping) o;

        if (Double.compare(topping.price, price) != 0) return false;
        return name.equals(topping.name);

    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = name.hashCode();
        temp = Double.doubleToLongBits(price);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    public double getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Topping{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }

    public class InvalidToppingPriceException extends RuntimeException {
    }

    public class InvalidToppingNameException extends RuntimeException {
    }
}
