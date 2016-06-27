package aniruddha.dominos.basic_ingredients

/**
  * Created by Aniruddha Sinha on 26-06-2016.
  */
class Topping(n:String,p:Double) {
  val name=n
  val price=p
  def getName:String=name
  def getPrice:Double=price
  override def toString:String="Topping["+name+","+price+"]"

  def canEqual(other: Any): Boolean = other.isInstanceOf[Topping]

  override def equals(other: Any): Boolean = other match {
    case that: Topping =>
      (that canEqual this) &&
        name == that.name &&
        price == that.price
    case _ => false
  }

  override def hashCode(): Int = {
    val state = Seq(name, price)
    state.map(_.hashCode()).foldLeft(0)((a, b) => 31 * a + b)
  }
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