package com.bitwise.dominos.pizzaChef;

import com.bitwise.dominos.basicingredients.Crust;
import com.bitwise.dominos.basicingredients.Pizza;
import com.bitwise.dominos.basicingredients.Topping;

import java.util.List;

/**
 * Created by Aniruddha Sinha on 24-06-2016.
 */
public class FinalPrep {
    public static Pizza addTopping(Pizza pizza,Topping topping){
        Pizza pizzaN = Pizza.pizzaWithNewPrice(pizza,pizza.getTotalPrice(pizza.getPrice()+topping.getPrice()));
        pizzaN.addTopings(topping);
        return pizzaN;
    }
    public static Pizza addCrust(Pizza pizza,Crust crust){
        Pizza p=Pizza.pizzaWithNewPrice(pizza,pizza.getTotalPrice(pizza.getPrice()+crust.getPrice()));
        p.addCrust(crust);
        return p;
    }
    public static Pizza removeTopping(Pizza pizza,Topping topping){
        Pizza newPizza = Pizza.pizzaWithNewPrice(pizza, pizza.getPrice());
        newPizza.removeTopping(pizza,topping);
        return newPizza;
    }

}
