package aniruddha.dominos.basic_ingredients


import org.junit.{Assert, Test}

/**
  * Created by Aniruddha Sinha on 26-06-2016.
  */
class ToppingTest {
  @Test(expected = classOf[Topping.InvalidToppingNameException])
  def toppingNameMustNotBeEmpty(): Unit ={
    //given
    Topping("",160.0)
    //when
    //then
  }
  @Test(expected = classOf[Topping.InvalidPriceValueException])
  def priceOfToppingNotLessThanMinimum(): Unit ={
    //given
    Topping("Tomato",9.9)
    //when
    //then
  }
  @Test
  def itShouldCorrectlyReturnTheNameOfTheTopping(): Unit ={
    //given
    val topping=Topping("Tomato",10.0)
    //when
    Assert.assertEquals("Tomato",topping.getName)
    //then
  }
  @Test
  def itShouldReturnTheCorrectPriceOfTheTopping(): Unit ={
    //given
    val topping=Topping("Tomato",12.2)
    //when
    Assert.assertEquals(12.2,topping.getPrice,Math.ulp(0.02))
    //then
  }
  @Test
  def exactToStringMustBeImplemented(): Unit ={
    //given
    val topping=Topping("Barbecue Chicken",90.0)
    //when
    Assert.assertEquals("Topping[Barbecue Chicken,90.0]",topping.toString)
    //then
  }
}
