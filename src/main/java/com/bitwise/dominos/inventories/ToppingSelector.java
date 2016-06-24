package com.bitwise.dominos.inventories;

import com.bitwise.dominos.basicingredients.Topping;

/**
 * Created by Aniruddha Sinha on 24-06-2016.
 */
@FunctionalInterface
public interface ToppingSelector {
    public Topping topping();
}
