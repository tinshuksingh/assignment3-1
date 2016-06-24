package com.bitwise.dominos.basicingredients;

import org.junit.Test;



/**
 * Created by Aniruddha Sinha on 24-06-2016.
 */
public class CrustTest {
    @Test(expected = Crust.EmptyCrustNameException.class)
    public void CrustShouldHaveAName(){
        //given
        new Crust("",100.00);
        //when
        //then
    }
    @Test(expected = Crust.InvalidCrustPriceException.class)
    public void CrustPriceShouldNotBeLessThanMinPrice(){
        //given
        new Crust("Pan Pizza",-133);
        //when
        //then
    }
}
