package com.bitwise.dominos.basicingredients;

import org.junit.Test;

/**
 * Created by Aniruddha Sinha on 24-06-2016.
 */
public class ToppingTest {
    @Test(expected = Topping.InvalidToppingNameException.class)
    public void ToppingMustHaveAName(){
        //given
        new Topping("",100.0);
        //when
        //then
    }
    @Test(expected = Topping.InvalidToppingPriceException.class)
    public void ToppingMustHaveAPrice(){
        //given
        new Topping("Pan Pizza",2.2);
        //when
        //then
    }
}
