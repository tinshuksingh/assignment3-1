package aniruddha.dominos.databases

import aniruddha.dominos.basic_ingredients.Crust

import scala.collection.immutable.HashMap

/**
  * Created by AniruddhaS on 6/27/2016.
  */
class CrustDatabase {
  val crusts:Map[String,Crust]=
    HashMap("Pan Pizza"->Crust("Pan Pizza",100),
      ("Thin Crust"->Crust("Thin Crust",150)),
      ("Regular"->Crust("Regular",0)),
      ("Cheese Burst"->Crust("Cheese Burst",200))
  )
  def getPrice(s:String):Double= crusts(s).getPrice


  def canEqual(other: Any): Boolean = other.isInstanceOf[CrustDatabase]

  override def equals(other: Any): Boolean = other match {
    case that: CrustDatabase =>
      (that canEqual this) &&
        crusts == that.crusts
    case _ => false
  }

  override def hashCode(): Int = {
    val state = Seq(crusts)
    state.map(_.hashCode()).foldLeft(0)((a, b) => 31 * a + b)
  }
}
