package aniruddha.dominos.basic_ingredients



import org.junit.{Assert, Test}

/**
  * Created by AniruddhaS on 6/27/2016.
  */
class PizzaTest {
  @Test(expected = classOf[Pizza.InvalidPizzaNameException])
  def ensureValidity_NameOfThePizza(): Unit ={
    //given
    Pizza("",150.0,List(Topping("Tomato",10.0)),Crust("Thin Crust",150.0))
  }

  @Test(expected = classOf[Pizza.InvalidPizzaPriceValueException])
  def ensureValidity_PriceOfThePizza(): Unit ={
    //given
    Pizza("Peppy Paneer",99.0,List(Topping("Paneer",80.0),
      Topping("Capsicum",10),Topping("Paprika",30)),Crust("Pan Pizza",100))
  }

  @Test(expected = classOf[Pizza.PizzaWithoutToppingException])
  def ensureValidity_ListOfToppings(): Unit ={
    //given
    Pizza("Peppy Paneer",230.0,List(),Crust("Thin Crust",150))
  }

  //ensuring validity of the crust
  @Test(expected = classOf[Crust.InvalidCrustNameException])
  def ensureValidity_CrustNameMustBePresent(): Unit ={
    //given
    Pizza("Peppy Paneer",230.0,List(Topping("Paneer",80.0),
      Topping("Capsicum",10),Topping("Paprika",30)),Crust("",100))
  }
  @Test(expected = classOf[Crust.InvalidCrustPriceException])
  def ensureValidity_CrustPriceMustBePresentAlongWithTheNameAndTheSameMustNotBeNegative(): Unit ={
    //given
    Pizza("Peppy Paneer",230.0,List(Topping("Paneer",80.0),
      Topping("Capsicum",10),Topping("Paprika",30)),Crust("Thin Crust",-4.0))
  }
  //validations over now moving on to data integrity and code functionality
  @Test
  def codeFunctionalityTest_CorrectNameMustBeReturned(): Unit ={
    //given
    val pizza=Pizza("Peppy Paneer",230.0,List[Topping](Topping("Paneer",80.0),Topping("Capsicum",10),Topping("Paprika",30)),Crust("Thin Crust",100))
    //when
    Assert.assertEquals("Peppy Paneer",pizza.getName)
  }

  @Test
  def codeFunctionalityTest_CorrectPriceValueMustBeReturned(): Unit ={
    //given
    val pizza=Pizza("Peppy Paneer",230.0,List[Topping](Topping("Paneer",80.0),Topping("Capsicum",10),Topping("Paprika",30)),Crust("Thin Crust",100))
    //when
    Assert.assertEquals(230.0,pizza.getPrice,0.02)
  }
  @Test
  def codeFunctionalityTest_CorrectListOfToppingsMustBeReturned(): Unit ={
    //given
    val pizza=Pizza("Peppy Paneer",230.0,List[Topping](Topping("Paneer",80.0),Topping("Capsicum",10),Topping("Paprika",30)),Crust("Thin Crust",100))
    //when
    val listOfTopping=List[Topping](Topping("Paneer",80.0),Topping("Capsicum",10),Topping("Paprika",30))
   // Assert.assertTrue(pizza.getToppings.size==3)
    Assert.assertEquals(pizza.getToppings,listOfTopping)
  }
  @Test
  def codeFunctionalityTest_CorrectCrustMustBeReturned(): Unit ={
    //given
    val pizza=Pizza("Peppy Paneer",230.0,List[Topping](Topping("Paneer",80.0),Topping("Capsicum",10),Topping("Paprika",30)),Crust("Thin Crust",100))
    //when
    val crust=Crust("Thin Crust",100)
    //then
    Assert.assertEquals(pizza.getCrust,crust)
  }
  @Test
  def ListOfToppingsTest_forADeeperObjectLevelFunctionality(): Unit ={
    //given
    val pizza=Pizza("Peppy Paneer",230.0,List[Topping](Topping("Paneer",80.0),Topping("Capsicum",10),Topping("Paprika",30)),Crust("Thin Crust",100))
    //when
    val listOfTopping=List[Topping](Topping("Paneer",80.0),Topping("Capsicum",10),Topping("Paprika",30))
    //then
    Assert.assertEquals(listOfTopping(0),pizza.getToppings(0))
    Assert.assertEquals(listOfTopping(1),pizza.getToppings(1))
    Assert.assertEquals(listOfTopping(2),pizza.getToppings(2))
  }
}

