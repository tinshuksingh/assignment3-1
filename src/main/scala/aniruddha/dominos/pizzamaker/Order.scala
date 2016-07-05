package aniruddha.dominos.pizzamaker

import aniruddha.dominos.basic_ingredients.{Crust, Pizza, Topping}
import aniruddha.dominos.databases.{CrustDatabase, PizzaDatabase}

/**
  * Created by aniruddhaS on 7/5/2016.
  */
class Order(pizzaName:String,toppingName:List[Topping],crustName:Crust){
  def this(pizzaN:String)=this(pizzaN,new PizzaDatabase().pizzas.get(pizzaN).get.getToppings,new CrustDatabase().crusts.get("Regular").get)
 // def this(pizzaN:String,topping:List[Topping])=this(pizzaN,topping::new PizzaDatabase().pizzas.get(pizzaN).get.getToppings,new CrustDatabase().crusts.get("Regular").get)
  def removedToppings:List[Topping]=List()
  val VAT=0.1
  val SERVICE_TAX=0.15
  private def calculateRawPrice:Double=new PizzaDatabase().getPrice(pizzaName)

  private def calculateVAT:Double={
    val raw=calculateRawPrice
    Math.abs(raw-(raw/(1+VAT)));
  }
  private def calculateServiceTax:Double=calculateRawPrice*SERVICE_TAX
  def removeToppings(xs:List[Topping]):List[Topping]={
    xs::removedToppings
    toppingName.diff(xs)
  }

  private def calculateRemoveToppingPrice:Double=removedToppings.map(x=>x.getPrice).sum
  //this is what we need
  def calculateTotalOrderPrice:Double=
    Math.round(calculateRawPrice+calculateVAT+calculateServiceTax-calculateRemoveToppingPrice)
}