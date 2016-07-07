package aniruddha.dominos.basic_ingredients


import org.junit.{Assert, Test}

/**
  * Created by AniruddhaS on 6/27/2016.
  */
class CrustTest {
@Test(expected = classOf[Crust.InvalidCrustNameException])
  def crustNameMustNoBeEmpty(): Unit ={
    //given
    Crust("",0)
    //when
    //then
  }
  @Test(expected = classOf[Crust.InvalidCrustPriceException])
  def itShouldNotAcceptAnInvalidPriceForTheCrust(): Unit ={
    //given
    Crust("Regular",-1)
    //when
    //then
  }
  @Test
  def returnCorrectly_crustName(): Unit ={
    //given
    val crust=Crust("Thin Crust",150.0)
    //when
    Assert.assertEquals("Thin Crust",crust.getName)
    //then
  }
  @Test
  def returnCorrectly_price(): Unit ={
    //given
    val crust=Crust("Thin Crust",150.0)
    //when
    Assert.assertEquals(150.0,crust.getPrice,0.02)
    //then
  }
  @Test
  def ensureCorrectImplementationOf_toString(): Unit ={
    //given
    val crust=Crust("Thin Crust",150.0)
    //when
    Assert.assertEquals("Crust[Thin Crust,150.0]",crust.toString)
    //then
  }
}
