package aniruddha.dominos.databases

import org.junit.{Assert, Test}

/**
  * Created by AniruddhaS on 6/27/2016.
  */
class ToppingDbTest {
  @Test
  def itShouldReturnTheCorrectNameAndPriceForTheToppingNameEntered(): Unit ={
    //given
    val x=new ToppingDatabase
    //when
    val price=x.getPrice("Barbecue Chicken")
    val price2=x.getPrice("Smoked Chicken")
    //then
    Assert.assertEquals(100,price,0.02)
    Assert.assertEquals(150,price2,0.02)
  }
  @Test(expected = classOf[NoSuchElementException])
  def itShouldRaiseAnExceptionProvidedAnInvalidKeyIsEntered(): Unit ={
    //given
    val x=new ToppingDatabase
    //when
    val price=x.getPrice("Pork sausage")
  }
}
