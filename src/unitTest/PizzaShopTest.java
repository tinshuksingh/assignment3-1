
package unitTest;

import com.bitwise.pizzashop.*;
import java.io.PrintStream;
import java.util.ArrayList;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class PizzaShopTest
{

    public PizzaShopTest()
    {
    }

    @Before
    public void beforeEachTest()
    {
        PizzaMenu.addToppingToMenu("Tomato", new Topping("Tomato", 10D));
        PizzaMenu.addToppingToMenu("Pineapple", new Topping("Pineapple", 20D));
        PizzaMenu.addToppingToMenu("Olives", new Topping("Olives", 15D));
        PizzaMenu.addToppingToMenu("Cheese", new Topping("Pineapple", 20D));
        PizzaMenu.addToppingToMenu("Barbeque Chicken", new Topping("Barbeque Chicken", 100D));
        PizzaMenu.addToppingToMenu("Baby Corn", new Topping("Baby Corn", 20D));
        PizzaMenu.addToppingToMenu("Jalapeno", new Topping("Jalapeno", 15D));
        PizzaMenu.addToppingToMenu("Barbeque Chicken", new Topping("Barbeque Chicken", 100D));
        PizzaMenu.addToppingToMenu("Chicken Salami", new Topping("Chicken Salami", 95D));
        PizzaMenu.addToppingToMenu("Paneer", new Topping("Paneer", 80D));
        PizzaMenu.addToppingToMenu("Onion", new Topping("Onion", 10D));
        PizzaMenu.addCrustToMenu("Pan Pizza", new Crust("Pan Pizza", 100D));
        PizzaMenu.addCrustToMenu("Regular", new Crust("Regular", 0.0D));
        PizzaMenu.addCrustToMenu("Thin Crust", new Crust("Thin Crust", 150D));
        PizzaMenu.addCrustToMenu("Cheese Burst", new Crust("Cheese Burst", 200D));
        PizzaMenu.addPizzaToMenu("Margherita", new Pizza("Margherita", new Topping[] {
            new Topping("Tomato", 10D)
        }, new Crust("Regular", 0.0D)));
        PizzaMenu.addPizzaToMenu("Veggie Paradise", new Pizza("Veggie Paradise", new Topping[] {
            new Topping("Baby Corn", 10D), new Topping("Olives", 15D), new Topping("Capsicum", 10D), new Topping("Paprika", 30D)
        }, new Crust("Regular", 0.0D)));
        PizzaMenu.addPizzaToMenu("Zesty Chicken", new Pizza("Zesty Chicken", new Topping[] {
            new Topping("Chicken Sausage", 110D), new Topping("Barbeque Chicken", 100D), new Topping("Capsicum", 10D), new Topping("Paprika", 30D)
        }, new Crust("Regular", 0.0D)));
        PizzaMenu.addPizzaToMenu("Chicken Maxicana", new Pizza("Chicken Maxicana", new Topping[] {
            new Topping("Spicy Chicken", 90D), new Topping("Tomato", 10D), new Topping("Onion", 10D), new Topping("Paprika", 30D)
        }, new Crust("Regular", 0.0D)));
        PizzaMenu.addPizzaToMenu("Veg Hawaiian Delight", new Pizza("Veg Hawaiian Delight", new Topping[] {
            new Topping("Baby Corn", 20D), new Topping("Jalapeno", 15D), new Topping("Pineapple", 20D)
        }, new Crust("Regular", 0.0D)));
        PizzaMenu.addPizzaToMenu("Non Veg Hawaiian Delight", new Pizza("Non Veg Hawaiian Delight", new Topping[] {
            new Topping("Chicken Salami", 95D), new Topping("Jalapeno", 15D), new Topping("Pineapple", 20D)
        }, new Crust("Regular", 0.0D)));
        PizzaMenu.addPizzaToMenu("Peppy Paneer", new Pizza("Peppy Paneer", new Topping[] {
            new Topping("Paneer", 80D), new Topping("Capsicum", 10D), new Topping("Paprika", 30D)
        }, new Crust("Regular", 0.0D)));
    }

    @Test
    public void retrieveToppingName()
    {
        Assert.assertEquals("Tomato", PizzaMenu.getToppingFromMenu("Tomato").getName());
    }

    @Test
    public void retrievePizzaName()
    {
        Assert.assertEquals("Margherita", PizzaMenu.getPizzaFromMenu("Margherita").getName());
    }

    @Test
    public void retrieveCrustName()
    {
        Assert.assertEquals("Pan Pizza", PizzaMenu.getCrustFromMenu("Pan Pizza").getName());
    }

    @Test
    public void retrieveToppingPrice()
    {
        Assert.assertEquals("10.0", Double.toString(PizzaMenu.getToppingFromMenu("Tomato").getItemPrice()));
    }

    @Test
    public void retrieveCrustPrice()
    {
        Assert.assertEquals("150.0", Double.toString(PizzaMenu.getCrustFromMenu("Thin Crust").getItemPrice()));
    }

    @Test(expected=NullPointerException.class)
    public void placeOrderShouldThrowNullPointerIfOrderNull()
    {
        Order order = new Order(null);
    }

    @Test
    public void placeAnOrder1()
    {
     //   System.out.println("################Order 1#####################");
        Item pizza = PizzaMenu.getPizzaFromMenu("Veggie Paradise");
        Item size = PizzaMenu.getPizzaSizePriceFromMenu("medium");
        Item pizza1 = PizzaMenu.getPizzaFromMenu("Zesty Chicken");
        Item size1 = PizzaMenu.getPizzaSizePriceFromMenu("medium");
        Item pizza2 = PizzaMenu.getPizzaFromMenu("Chicken Maxicana");
        Item size2 = PizzaMenu.getPizzaSizePriceFromMenu("medium");
        PizzaShop shop = new PizzaShop();
        shop.addCurrentToOrderList(new Item[] {
            pizza, size
        });
        shop.addCurrentToOrderList(new Item[] {
            pizza1, size1
        });
        shop.addCurrentToOrderList(new Item[] {
            pizza2, size2
        });
        double price = shop.calculate(Order.getOrderList());
        Assert.assertEquals("1012.5", Double.toString(price));
    }

    @Test
    public void placeAnOrder2()
    {
       // System.out.println("################Order 2#####################");
        Item pizza = PizzaMenu.getPizzaFromMenu("Veg Hawaiian Delight");
        Item size = PizzaMenu.getPizzaSizePriceFromMenu("medium");
        Item topping = PizzaMenu.getToppingFromMenu("Olives");
        Item topping1 = PizzaMenu.getToppingFromMenu("Cheese");
        Item crust = PizzaMenu.getCrustFromMenu("Pan Pizza");
        Item pizza1 = PizzaMenu.getPizzaFromMenu("Non Veg Hawaiian Delight");
        Item size1 = PizzaMenu.getPizzaSizePriceFromMenu("medium");
        Item topping2 = PizzaMenu.getToppingFromMenu("Barbeque Chicken");
        Item crust2 = PizzaMenu.getCrustFromMenu("Cheese Burst");
        PizzaShop shop2 = new PizzaShop();
        shop2.addCurrentToOrderList(new Item[] {
            pizza, size, topping, topping1, crust
        });
        shop2.addCurrentToOrderList(new Item[] {
            pizza1, size1, topping2, crust2
        });
        double price = shop2.calculate(Order.getOrderList());
        Assert.assertEquals("1068.75", Double.toString(price));
    }

    @Test
    public void placeAnOrder3()
    {
       // System.out.println("#############Order 3########################");
        Item pizza = PizzaMenu.getPizzaFromMenu("Peppy Paneer");
        Item size = PizzaMenu.getPizzaSizePriceFromMenu("medium");
        Item topping = PizzaMenu.getToppingFromMenu("Olives");
        Item topping3 = PizzaMenu.getToppingFromMenu("Baby Corn");
        Item crust = PizzaMenu.getCrustFromMenu("Thin Crust");
        Item pizza2 = PizzaMenu.getPizzaFromMenu("Veg Hawaiian Delight");
        Item size1 = PizzaMenu.getPizzaSizePriceFromMenu("medium");
        Item pizza3 = PizzaMenu.getPizzaFromMenu("Margherita");
        Item size2 = PizzaMenu.getPizzaSizePriceFromMenu("medium");
        Item pizza4 = PizzaMenu.getPizzaFromMenu("Zesty Chicken");
        Item size3 = PizzaMenu.getPizzaSizePriceFromMenu("medium");
        Item topping1 = PizzaMenu.getToppingFromMenu("Cheese");
        Item topping4 = PizzaMenu.getToppingFromMenu("Onion");
        Item crust2 = PizzaMenu.getCrustFromMenu("Cheese Burst");
        PizzaShop shop3 = new PizzaShop();
        shop3.addCurrentToOrderList(new Item[] {
            pizza, size, topping, topping3, crust
        });
        shop3.addCurrentToOrderList(new Item[] {
            pizza, size, topping, topping3, crust
        });
        shop3.addCurrentToOrderList(new Item[] {
            pizza, size, topping1, crust
        });
        shop3.addCurrentToOrderList(new Item[] {
            pizza, size, topping1, crust
        });
        shop3.addCurrentToOrderList(new Item[] {
            pizza2, size1
        });
        shop3.addCurrentToOrderList(new Item[] {
            pizza3, size2
        });
        shop3.addCurrentToOrderList(new Item[] {
            pizza4, size3, topping, topping3, topping4, crust2
        });
        double price = shop3.calculate(Order.getOrderList());
        Assert.assertEquals("3131.25", Double.toString(price));
    }

    @Test
    public void placeOrderNoItemsSelected()
    {
        PizzaShop shop3 = new PizzaShop();
        double price = shop3.calculate(Order.getOrderList());
        Assert.assertEquals("0.0", Double.toString(price));
    }
    
    @Test(expected=NullPointerException.class)
    public void InvalidPizzaName()
    {
        Assert.assertEquals("Margher", PizzaMenu.getPizzaFromMenu("Margher").getName());
        
        
    }
    
    @Test(expected=NullPointerException.class)
    public void InvalidToppingName()
    {
        Assert.assertEquals("Toma", PizzaMenu.getToppingFromMenu("Toma").getName());
    }


    @Test(expected=NullPointerException.class)
    public void InvalidCrustName()
    {
        Assert.assertEquals("PanPizza", PizzaMenu.getCrustFromMenu("PanPizza").getName());
    }

    @Test(expected=NullPointerException.class)
    public void InvalidToppingPrice()
    {
        Assert.assertEquals("1200.0", Double.toString(PizzaMenu.getToppingFromMenu("Tom").getItemPrice()));
    }

    @Test(expected=NullPointerException.class)
    public void InvalidCrustPrice()
    {
        Assert.assertEquals("150.0", Double.toString(PizzaMenu.getCrustFromMenu("Thinust").getItemPrice()));
    }
    
    @Test(expected=NullPointerException.class)
    public void InvalidOrder()
    {
        Item pizza = PizzaMenu.getPizzaFromMenu("vbcvb");
        Item size = PizzaMenu.getPizzaSizePriceFromMenu("huge");
        PizzaShop shop3 = new PizzaShop();
        shop3.addCurrentToOrderList(new Item[] {
            pizza, size});
        double price = shop3.calculate(Order.getOrderList());

    }


}
