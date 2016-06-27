package aniruddha.dominos.basic_ingredients

import scala.annotation.tailrec

/**
  * Created by AniruddhaS on 6/27/2016.
  */
class Pizza(n:String,p:Double,t:List[Topping],c:Crust) {
  val name=n
  val price=p
  val toppings=t
  val crust=c


  def getName:String=name
  def getPrice:Double=price
  def getToppings:List[Topping]=toppings.toList
  def getCrust:Crust=crust
  override def toString:String="Pizza["+name+","+price+","+toppings+","+crust+"]"


  def canEqual(other: Any): Boolean = other.isInstanceOf[Pizza]

  override def equals(other: Any): Boolean = other match {
    case that: Pizza =>
      (that canEqual this) &&
        name == that.name &&
        price == that.price &&
        toppings == that.toppings &&
        crust == that.crust
    case _ => false
  }

  override def hashCode(): Int = {
    val state = Seq(name, price, toppings, crust)
    state.map(_.hashCode()).foldLeft(0)((a, b) => 31 * a + b)
  }
}

object Pizza{

  def apply(name: String, price: Double, toppings: List[Topping], crust: Crust): Pizza ={
    if(name.isEmpty) throw new InvalidPizzaNameException
    else if(price<100.0) throw new InvalidPizzaPriceValueException
    else if(toppings.isEmpty) throw new PizzaWithoutToppingException
    else if(crust.getPrice<0) throw new Crust.InvalidCrustPriceException
    else if(crust.getName.isEmpty) throw new Crust.InvalidCrustNameException
    else new Pizza(name,price,toppings,crust)
  }

  def apply(n: String, p: Double, t: List[Topping]): Pizza = new Pizza(n, p, t, Crust("Regular",0))

  case class InvalidPizzaNameException() extends RuntimeException

  case class InvalidPizzaPriceValueException() extends RuntimeException

  case class PizzaWithoutToppingException() extends RuntimeException

}