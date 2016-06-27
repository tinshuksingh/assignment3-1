package aniruddha.dominos.databases

import aniruddha.dominos.basic_ingredients.{Pizza, Topping}

import scala.collection.immutable.HashMap

/**
  * Created by AniruddhaS on 6/27/2016.
  */
class PizzaDatabase {
  val topping=new ToppingDatabase
  val t=topping.toppings
  val crusts=new CrustDatabase
  val pizzas:Map[String,Pizza]=
    HashMap("Margherita"->Pizza("Margherita",150,List(t("tomato"))),
    ("Hawaiian Delight Veg"->Pizza("Hawaiian Delight",200,List(t("Baby Corn"),t("Pineapple"),t("Jalapeno")))),
      ("Hawaiian Delight Non-Veg"->Pizza("Hawaiian Delight Non-Veg",220,List(t("Chicken Salami"),t("Pineapple"),t("Jalapeno")))),
      ("Veggie Paradise"->Pizza("Veggie Paradise",230,List(t("Baby Corn"),t("Olives"),t("Capsicum"),t("Paprika")))),
      ("Peppy Paneer"->Pizza("Peppy Paneer",230,List(t("Paneer"),t("Capsicum"),t("Paprika"))))
    )
}
