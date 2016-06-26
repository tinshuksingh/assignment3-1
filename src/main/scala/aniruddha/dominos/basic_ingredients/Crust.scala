package aniruddha.dominos.basic_ingredients

/**
  * Created by Aniruddha Sinha on 26-06-2016.
  */
class Crust(name:String,price:Double) {
  def getName:String=name
  def getPrice:Double=price
  override def toString:String="Crust["+name+","+price+"]"
}
object Crust{
  def apply(name: String, price: Double): Crust =
    if(name.isEmpty) throw new InvalidCrustNameException
    else if(price<0) throw new InvalidCrustPriceException
    else new Crust(name,price)

  case class InvalidCrustNameException() extends RuntimeException
  case class InvalidCrustPriceException()extends RuntimeException
}