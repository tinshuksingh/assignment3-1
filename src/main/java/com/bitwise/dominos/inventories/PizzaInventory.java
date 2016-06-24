package com.bitwise.dominos.inventories;

import com.bitwise.dominos.basicingredients.Pizza;

/**
 * Created by Aniruddha Sinha on 24-06-2016.
 */
public enum PizzaInventory implements PizzaSelector{
    Margherita(()->new Pizza("Margherita",150).defaultToppings(ToppingInventory.Tomato.topping())),
    VegHawaiianDelight(()->new Pizza("Veg. Hawaiian Delight",200)
            .defaultToppings(ToppingInventory.BabyCorn.topping(),
                    ToppingInventory.Pineapple.topping(),
                    ToppingInventory.Jalapeno.topping())),
    NonVegHawaiianDelight(()->new Pizza("Non Veg Hawaiian Delight",220)
            .defaultToppings(ToppingInventory.ChickenSalami.topping(),
                    ToppingInventory.Pineapple.topping(),
                    ToppingInventory.Jalapeno.topping())),
    VeggieParadise(()->new Pizza("Veggie Paradise",230)
            .defaultToppings(ToppingInventory.BabyCorn.topping(),
                    ToppingInventory.Olive.topping(),
                    ToppingInventory.Capsicum.topping(),
                    ToppingInventory.Paprika.topping())),
    PeppyPaneer(()->new Pizza("Peppy Paneer",230)
            .defaultToppings(ToppingInventory.Paneer.topping(),
                    ToppingInventory.Capsicum.topping(),
                    ToppingInventory.Paprika.topping())),
    ZestyChicken(()->new Pizza("Zesty Chicken",280)
            .defaultToppings(ToppingInventory.ChickenSausage.topping(),
                    ToppingInventory.BarbequeChicken.topping(),
                    ToppingInventory.Capsicum.topping(),
                    ToppingInventory.Paprika.topping())),
    ChickenMexicana(()->new Pizza("Chicken  Mexicana",300)
            .defaultToppings(ToppingInventory.Onion.topping(),
                    ToppingInventory.Tomato.topping(),
                    ToppingInventory.Paprika.topping(),
                    ToppingInventory.SpicyChicken.topping()));


    private PizzaSelector pizzaSelected;
    PizzaInventory(PizzaSelector pizza){
        this.pizzaSelected=pizza;
    }
    @Override
    public Pizza pizza() {
        return this.pizzaSelected.pizza();
    }
}
