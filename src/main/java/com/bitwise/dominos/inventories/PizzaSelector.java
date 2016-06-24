package com.bitwise.dominos.inventories;

import com.bitwise.dominos.basicingredients.Pizza;

/**
 * Created by Aniruddha Sinha on 24-06-2016.
 */
@FunctionalInterface
public interface PizzaSelector {
    public Pizza pizza();
}
