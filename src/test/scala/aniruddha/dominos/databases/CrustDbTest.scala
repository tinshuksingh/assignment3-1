package aniruddha.dominos.databases

import org.junit.{Assert, Test}

/**
  * Created by AniruddhaS on 6/27/2016.
  */
class CrustDbTest {
  @Test
  def itShouldReturnTheCorrectNameAndPriceForTheToppingNameEntered(): Unit ={
    //given
    val x=new CrustDatabase
    //when
    val price=x.getPrice("Regular")
    //then
    Assert.assertEquals(0,price,0.02)
  }

  @Test
  def itShouldReturnTheCorrectNameAndPriceForTheToppingNameEntered_II(): Unit ={
    //given
    val x=new CrustDatabase
    //when
    val price=x.getPrice("Thin Crust")
    //then
    Assert.assertEquals(150,price,0.02)
  }

  @Test(expected = classOf[NoSuchElementException])
  def itShouldRaiseAnExceptionProvidedAnInvalidKeyIsEntered(): Unit ={
    //given
    val x=new CrustDatabase
    //when
    val price=x.getPrice("MyTheoretical Crust")
  }
}
