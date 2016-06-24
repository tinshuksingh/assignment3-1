package com.bitwise.dominos.pizzaChef;

import com.bitwise.dominos.basicingredients.Pizza;
import com.bitwise.dominos.basicingredients.Topping;
import com.bitwise.dominos.inventories.PizzaInventory;
import com.bitwise.dominos.inventories.ToppingInventory;
import org.junit.Test;
import org.testng.Assert;

import java.util.ArrayList;

/**
 * Created by Aniruddha Sinha on 24-06-2016.
 */
public class FinalPrepTest {
    @Test
    public void itShouldAddToppingAnReturnCorrectPrice(){
        //given
        FinalPrep fp=new FinalPrep();
        Pizza p=FinalPrep.addTopping(PizzaInventory.ChickenMexicana.pizza(), ToppingInventory.SpicyChicken.topping());

        //when

        //then
        Assert.assertEquals(601.0,p.getTotalPrice(p.getPrice()));
    }
    @Test
    public void itShouldRemoveToppingAnReturnCorrectPrice(){
        //given
        FinalPrep fp=new FinalPrep();
        Pizza p=FinalPrep.removeTopping(PizzaInventory.ChickenMexicana.pizza(), ToppingInventory.SpicyChicken.topping()
        );

        //when

        //then
        Assert.assertEquals(372.0,p.getTotalPrice(p.getPrice()));
    }
}
