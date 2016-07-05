package aniruddha.dominos.pizzamaker

import aniruddha.dominos.basic_ingredients.Topping
import aniruddha.dominos.databases.{PizzaDatabase, ToppingDatabase}
import org.junit.{Assert, Test}

/**
  * Created by aniruddhaS on 7/5/2016.
  */
class OrderTest {
  @Test
  def itShouldBeAbleToAcceptTheNameOfThePizzaAndCalculatePrice(): Unit ={
    //given
    val x=new Order("Chicken Mexicana")
    //when
    Assert.assertEquals(546.0,x.calculateTotalOrderPrice,0.02)
  }
  /*@Test
  def itShouldRemoveAToppingAndCalculateThePrice(): Unit = {
    //given
    val x=new Order("Chicken Mexicana")
    //when
    x.removeToppings(new PizzaDatabase().pizzas.get("Chicken Mexicana").get.getToppings)
    //then
    Assert.assertEquals(0,x.calculateTotalOrderPrice,0.02)
  }*/
}
