package com.bitwise.dominos.basicingredients;

import com.bitwise.dominos.inventories.PizzaInventory;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

/**
 * Created by Aniruddha Sinha on 24-06-2016.
 */
public class PizzaTest {
    @Test(expected = Pizza.InvalidPizzaNameException.class)
    public void NoEmptyPizzaNameAllowed(){
        //given
        new Pizza("",190.02,new ArrayList<Topping>(){{new Topping("Tomato",10);}});
        //when
        //then
    }
    @Test(expected = Pizza.InvalidPriceException.class)
    public void pizzaPriceNoLessThanMinPrice(){
        //given
        new Pizza("Mergherita",99.00,new ArrayList<Topping>(){{new Topping("Tomato",10);}});
        //when
        //then
    }
    @Test(expected = Pizza.InvalidToppingListException.class)
    public void pizzaShouldNotBeDevoidOfToppings(){
        //given
        new Pizza("Mergherita",150.00,new ArrayList<Topping>());
        //when
        //then
    }
    @Test
    public void itShouldGiveTheTotalPriceOfThePizzaWithTheNewBasicIngredientAdded(){
        //given
        Pizza p=new Pizza(PizzaInventory.VeggieParadise.pizza().getName()
                ,PizzaInventory.VeggieParadise.pizza().getPrice(),
                PizzaInventory.VeggieParadise.pizza().getToppings());
        //when
        double price=p.getTotalPrice(p.getPrice());
        //then
        assertEquals(285,price,Math.ulp(0.02));
    }

}
