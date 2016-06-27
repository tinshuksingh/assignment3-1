package aniruddha.dominos.basic_ingredients

/**
  * Created by Aniruddha Sinha on 26-06-2016.
  */
class Crust(n:String,p:Double) {
  val name=n
  val price=p
  def getName:String=name
  def getPrice:Double=price
  override def toString:String="Crust["+name+","+price+"]"

  def canEqual(other: Any): Boolean = other.isInstanceOf[Crust]

  override def equals(other: Any): Boolean = other match {
    case that: Crust =>
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
object Crust{
  def apply(name: String, price: Double): Crust =
    if(name.isEmpty) throw new InvalidCrustNameException
    else if(price<0) throw new InvalidCrustPriceException
    else new Crust(name,price)

  case class InvalidCrustNameException() extends RuntimeException
  case class InvalidCrustPriceException()extends RuntimeException
}