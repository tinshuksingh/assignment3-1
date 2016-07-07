/**
*
*/
package com.pizzahut.pizza.db;
import java.util.ArrayList;
import java.util.Arrays;
import com.pizzahut.pizza.order.Pizza;
import com.pizzahut.pizza.order.PizzaSize;
import com.pizzahut.pizza.order.Topping;
/**
* @author virendra
*
*/
public enum PizzaDB {
Margherita_Small(new Pizza("Margherita Small", new ArrayList<Topping>(Arrays.asList(Topping.Tomato)), 80, PizzaSize.Small)),
Margherita_Medium(new Pizza("Margherita Medium", new ArrayList<Topping>(Arrays.asList(Topping.Tomato)), 150, PizzaSize.Medium)),
Margherita_Large(new Pizza("Margherita Large", new ArrayList<Topping>(Arrays.asList(Topping.Tomato)), 300, PizzaSize.Large)),
VegHawaiianDelight_Small(new Pizza("Veg Hawaiian Delight Small", new ArrayList<Topping>(Arrays.asList(Topping.BabyCorn, Topping.Pineapple, Topping.Jalapeno)), 100, PizzaSize.Small)),
VegHawaiianDelight_Medium(new Pizza("Veg Hawaiian Delight Medium", new ArrayList<Topping>(Arrays.asList(Topping.BabyCorn, Topping.Pineapple, Topping.Jalapeno)), 200, PizzaSize.Medium)),
VegHawaiianDelight_Large(new Pizza("Veg Hawaiian Delight Large", new ArrayList<Topping>(Arrays.asList(Topping.BabyCorn, Topping.Pineapple, Topping.Jalapeno)), 400, PizzaSize.Large)),
NonVegHawaiianDelight_Small(new Pizza("NonVeg Hawaiian Delight Small", new ArrayList<Topping>(Arrays.asList(Topping.ChickenSalami, Topping.Pineapple, Topping.Jalapeno)), 110, PizzaSize.Small)),
NonVegHawaiianDelight_Medium(new Pizza("NonVeg Hawaiian Delight Medium", new ArrayList<Topping>(Arrays.asList(Topping.ChickenSalami, Topping.Pineapple, Topping.Jalapeno)), 220, PizzaSize.Medium)),
NonVegHawaiianDelight_Large(new Pizza("NonVeg Hawaiian Delight Large", new ArrayList<Topping>(Arrays.asList(Topping.ChickenSalami, Topping.Pineapple, Topping.Jalapeno)), 440, PizzaSize.Large)),
VeggieParadise_Small(new Pizza("Veggie Paradise Small", new ArrayList<Topping>(Arrays.asList(Topping.BabyCorn, Topping.Olives, Topping.Capsicum, Topping.Paprika)), 115, PizzaSize.Small)),
VeggieParadise_Medium(new Pizza("Veggie Paradise Medium", new ArrayList<Topping>(Arrays.asList(Topping.BabyCorn, Topping.Olives, Topping.Capsicum, Topping.Paprika)), 230, PizzaSize.Medium)),
VeggieParadise_Large(new Pizza("Veggie Paradise Large", new ArrayList<Topping>(Arrays.asList(Topping.BabyCorn, Topping.Olives, Topping.Capsicum, Topping.Paprika)), 460, PizzaSize.Large)),
PeppyPaneer_Small(new Pizza("Peppy Paneer Small", new ArrayList<Topping>(Arrays.asList(Topping.Paneer, Topping.Capsicum, Topping.Paprika)), 115, PizzaSize.Small)),
PeppyPaneer_Medium(new Pizza("Peppy Paneer Medium", new ArrayList<Topping>(Arrays.asList(Topping.Paneer, Topping.Capsicum, Topping.Paprika)), 230, PizzaSize.Medium)),
PeppyPaneer_Large(new Pizza("Peppy Paneer Large", new ArrayList<Topping>(Arrays.asList(Topping.Paneer, Topping.Capsicum, Topping.Paprika)), 460, PizzaSize.Large)),
ZestyChicken_Small(new Pizza("Zesty Chicken Small", new ArrayList<Topping>(Arrays.asList(Topping.ChickenSausage, Topping.BarbequeChicken, Topping.Capsicum, Topping.Paprika)), 140, PizzaSize.Small)),
ZestyChicken_Medium(new Pizza("Zesty Chicken Medium", new ArrayList<Topping>(Arrays.asList(Topping.ChickenSausage, Topping.BarbequeChicken, Topping.Capsicum, Topping.Paprika)), 280, PizzaSize.Medium)),
ZestyChicken_Large(new Pizza("Zesty Chicken Large", new ArrayList<Topping>(Arrays.asList(Topping.ChickenSausage, Topping.BarbequeChicken, Topping.Capsicum, Topping.Paprika)), 560, PizzaSize.Large)),
ChickenMaxicana_Small(new Pizza("Chicken Maxicana Small", new ArrayList<Topping>(Arrays.asList(Topping.Onion, Topping.Tomato, Topping.Paprika, Topping.SpicyChicken)), 150, PizzaSize.Small)),
ChickenMaxicana_Medium(new Pizza("Chicken Maxicana Medium", new ArrayList<Topping>(Arrays.asList(Topping.Onion, Topping.Tomato, Topping.Paprika, Topping.SpicyChicken)), 300, PizzaSize.Medium)),
ChickenMaxicana_Large(new Pizza("Chicken Maxicana Large", new ArrayList<Topping>(Arrays.asList(Topping.Onion, Topping.Tomato, Topping.Paprika, Topping.SpicyChicken)), 600, PizzaSize.Large)),
SeventhHeaven_Small(new Pizza("Chicken Maxicana Small", new ArrayList<Topping>(Arrays.asList(Topping.SmokedChicken, Topping.Paprika, Topping.Jalapeno)), 150, PizzaSize.Small)),
SeventhHeaven_Medium(new Pizza("Chicken Maxicana Medium", new ArrayList<Topping>(Arrays.asList(Topping.SmokedChicken, Topping.Paprika, Topping.Jalapeno)), 300, PizzaSize.Medium)),
SeventhHeaven_Large(new Pizza("Chicken Maxicana Large", new ArrayList<Topping>(Arrays.asList(Topping.SmokedChicken, Topping.Paprika, Topping.Jalapeno)), 600, PizzaSize.Large)),
Cloud9_Small(new Pizza("Chicken Maxicana Small", new ArrayList<Topping>(Arrays.asList(Topping.Onion, Topping.Tomato, Topping.Paprika, Topping.SpicyChicken)), 150, PizzaSize.Small)),
Cloud9_Medium(new Pizza("Chicken Maxicana Medium", new ArrayList<Topping>(Arrays.asList(Topping.Onion, Topping.Tomato, Topping.Paprika, Topping.SpicyChicken)), 300, PizzaSize.Medium)),
Cloud9_Large(new Pizza("Chicken Maxicana Large", new ArrayList<Topping>(Arrays.asList(Topping.Onion, Topping.Tomato, Topping.Paneer, Topping.Capsicum, Topping.Jalapeno)), 600, PizzaSize.Large)),
;
PizzaDB(Pizza pizza) {
this.pizza = pizza;
}
private Pizza pizza;
public Pizza getPizza() {
return pizza;
}

}
