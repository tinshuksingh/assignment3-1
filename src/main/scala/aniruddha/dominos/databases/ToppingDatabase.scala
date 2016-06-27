package aniruddha.dominos.databases

import aniruddha.dominos.basic_ingredients.Topping

import scala.collection.immutable.HashMap

/**
  * Created by AniruddhaS on 6/27/2016.
  */
class ToppingDatabase {
  val toppings:Map[String,Topping]=
    HashMap("Olives"->Topping("Olives",15),
      ("Jalapeno"->Topping("Jalapeno",15)),
      ("Cheese"->Topping("Cheese",20)),
      ("Barbecue Chicken"->Topping("Barbecue Chicken",100)),
      ("Tomato"->Topping("Tomato",10)),
      ("Baby Corn"->Topping("Baby Corn",10)),
      ("Pineapple"->Topping("Pineapple",20)),
      ("Chicken Salami"->Topping("Chicken Salami",95)),
      ("Capsicum"->Topping("Capsicum",10)),
      ("Paprika"->Topping("Paprika",30)),
      ("Paneer"->Topping("Paneer",80)),
      ("Chicken Sausage"->Topping("Chicken Sausage",110)),
      ("Spicy Chicken"->Topping("Spicy Chicken",90)),
      ("Onion"->Topping("Onion",10)),
      ("Smoked Chicken"->Topping("Smoked Chicken",150))
    )
  def getPrice(s:String):Double={
    return toppings(s).getPrice
  }
  def canEqual(other: Any): Boolean = other.isInstanceOf[ToppingDatabase]

  override def equals(other: Any): Boolean = other match {
    case that: ToppingDatabase =>
      (that canEqual this) &&
        toppings == that.toppings
    case _ => false
  }

  override def hashCode(): Int = {
    val state = Seq(toppings)
    state.map(_.hashCode()).foldLeft(0)((a, b) => 31 * a + b)
  }
}
