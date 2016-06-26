package aniruddha.dominos.basic_ingredients

/**
  * Created by Aniruddha Sinha on 26-06-2016.
  */
class Topping(name:String,price:Double) {
  def getName:String=name
  def getPrice:Double=price
  override def toString:String="Topping["+name+","+price+"]"
}

object Topping{
  def apply(name:String,price:Double):Topping={
    if(name.isEmpty) throw new Topping.InvalidToppingNameException
    else if(price<10.0) throw new Topping.InvalidPriceValueException
    else new Topping(name,price)
  }

  case class InvalidToppingNameException() extends RuntimeException

  case class InvalidPriceValueException() extends RuntimeException
}