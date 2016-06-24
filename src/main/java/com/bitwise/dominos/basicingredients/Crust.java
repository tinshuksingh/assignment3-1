package com.bitwise.dominos.basicingredients;

/**
 * Created by Aniruddha Sinha on 24-06-2016.
 */
public class Crust {
    private String name;
    private double price;

    public Crust(String name, double price) {
        this.name = name;
        this.price = price;
        validateCrustName();
        validatePrice();
    }

    private void validatePrice() {
        if(this.price<0) throw new Crust.InvalidCrustPriceException();
    }

    private void validateCrustName() {
        if(this.name.isEmpty()) throw new Crust.EmptyCrustNameException();
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Crust crust = (Crust) o;

        if (Double.compare(crust.price, price) != 0) return false;
        return name.equals(crust.name);

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

    @Override
    public String toString() {
        return "Crust{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }

    public class EmptyCrustNameException extends RuntimeException{
    }

    public class InvalidCrustPriceException extends RuntimeException {
    }
}
