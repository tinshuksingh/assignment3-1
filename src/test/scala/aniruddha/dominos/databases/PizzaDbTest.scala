package aniruddha.dominos.databases

import org.junit.{Assert, Test}

/**
  * Created by aniruddhaS on 7/5/2016.
  */
class PizzaDbTest {
  @Test
  def shouldReturnTheNameAndPriceOfThePizzaEntered(): Unit ={
    //given
    val x=new PizzaDatabase
    //when
    val price=x.getPrice("Zesty Chicken")
    //then
    Assert.assertEquals(530.0,price,0.02)
  }
  @Test(expected = classOf[NoSuchElementException])
  def itShouldRaiseAnInvalidFlagForInvalidPizzaName(): Unit ={
    //given
    val x=new PizzaDatabase
    //when
    x.getPrice("Zasty Chickens")
  }

}
