package com.bitwise.dominos.inventories;

import com.bitwise.dominos.basicingredients.Topping;

/**
 * Created by Aniruddha Sinha on 24-06-2016.
 * to implement anon fun in java we need to create a functional interface with the same name as the annotation
 * and implement the same in the class
 */
public enum ToppingInventory implements ToppingSelector{
    Olive(()->new Topping("Olives",15)),
    Jalapeno(()->new Topping("Jalapeno",15)),
    Cheese(()->new Topping("Cheese",20)),
    BarbequeChicken(()->new Topping("Barbeque Chicken",100)),
    Tomato(()->new Topping("Tomato",10)),
    BabyCorn(()->new Topping("Baby Corn",10)),
    Pineapple(()->new Topping("Pineapple",20)),
    ChickenSalami(()->new Topping("Chicken Salami",95)),
    Capsicum(()->new Topping("Capsicum",10)),
    Paprika(()->new Topping("Paprika",30)),
    Paneer(()->new Topping("Paneer",80)),
    ChickenSausage(()->new Topping("Chicken Sausage",110)),
    SpicyChicken(()->new Topping("Spicy Chicken",90)),
    Onion(()->new Topping("Onion",10)),
    SmokedChicken(()->new Topping("Smoked Chicken",150));


    private ToppingSelector toppingSelected;
    ToppingInventory(ToppingSelector toppingSelected)
    {
        this.toppingSelected=toppingSelected;
    }
    @Override
    public Topping topping() {
        return this.toppingSelected.topping();
    }
}
