//package com.bitwise.dominos;
//
//import static org.junit.Assert.assertEquals;
//
//import java.util.ArrayList;
//import java.util.List;
//
//import org.junit.Test;
//import org.junit.runner.RunWith;
//import org.springframework.boot.test.SpringApplicationConfiguration;
//import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
//
//@RunWith(SpringJUnit4ClassRunner.class)
//@SpringApplicationConfiguration(classes = DominosApplication.class)
//public class DominosApplicationTests {
//
//	@Test
//	public void contextLoads() {
//	}
//	
//	
//	@Test
//	public void shouldBeAbleToReturnPizzaPrice() {
//		Pizza pizza = new Pizza("Chicken Maxicana","Cheese Chicken Sauce","Cheese Burst");
//		int price=pizza.getPizzaPrice();
//		assertEquals(300,price);
//	}
//	
//	@Test
//	public void shouldBeAbleToCalculatePizzaPriceWithTopping() {
//		Pizza pizza = new Pizza("Chicken Maxicana","Cheese Chicken Sauce","Cheese Burst");
//	
//		List<String> extraTopping= new ArrayList<String>();
//		extraTopping.add("Chicken Sausage");
//		extraTopping.add("Chicken Salami");
//		extraTopping.add("Tomato");
//		
//		pizza.setExtraTopping(extraTopping);
//		
//		int totalPrice=pizza.getTotalPrice();
//		assertEquals(515,totalPrice);
//		
//	}
//	
//	@Test
//	public void shouldReturnMultiplePizzaPriceWithTax() throws InvalidOrderException {
//		Order order = new Order();
//		order.setVat(10);
//		order.setServiceTax(15);
//		Pizza pizza = new Pizza("Chicken Maxicana",null,null);
//		order.getPizzaList().add(pizza);
//		pizza = new Pizza("Veggie Paradise", null, null);
//		order.getPizzaList().add(pizza);
//		pizza = new Pizza("Zesty Chicken", null, null);
//		order.getPizzaList().add(pizza);
//		
//		float totalPrice=order.getTotalAmount();
//		assertEquals(1012.5,totalPrice,2);
//		
//	}
//
//	@Test(expected = InvalidOrderException.class)
//	public void shouldThrowExceptionIfPizzaListIsNull() throws InvalidOrderException
//	{
//		Order order = new Order();
//		order.setPizzaList(null);
//		order.getTotalAmount();
//	}
//	
//	@Test(expected = InvalidOrderException.class)
//	public void shouldThrowExceptionIfPizzaListIsEmpty() throws InvalidOrderException
//	{
//		Order order = new Order();
//		order.getTotalAmount();
//	}
//}
