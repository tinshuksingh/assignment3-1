package com.bitwise.pizzashop;

public class SetPizzaPrice {
	
	public SetPizzaPrice(String pizzaName ) {
		// TODO Auto-generated constructor stub
		
		if("Margherita".equals(pizzaName)){
			PizzaMenu.addPizzaSizePriceToMenu("small", new Size("Margherita",80,"small"));
			PizzaMenu.addPizzaSizePriceToMenu("large", new Size("Margherita",300,"large"));
			PizzaMenu.addPizzaSizePriceToMenu("medium", new Size("Margherita",150,"medium"));
		}
		
		if("Veggie Paradise".equals(pizzaName)){
			PizzaMenu.addPizzaSizePriceToMenu("small", new Size("Veggie Paradise",115,"small"));
			PizzaMenu.addPizzaSizePriceToMenu("large", new Size("Veggie Paradise",460,"large"));
			PizzaMenu.addPizzaSizePriceToMenu("medium", new Size("Veggie Paradise",230,"medium"));
				
		}
		
		if("Chicken Maxicana".equals(pizzaName)){
			PizzaMenu.addPizzaSizePriceToMenu("small", new Size("Chicken Maxicana",150,"small"));
			PizzaMenu.addPizzaSizePriceToMenu("large", new Size("Chicken Maxicana",600,"large"));
			PizzaMenu.addPizzaSizePriceToMenu("medium", new Size("Chicken Maxicana",300,"medium"));	
		}
		
		if("Zesty Chicken".equals(pizzaName)){
			PizzaMenu.addPizzaSizePriceToMenu("small", new Size("Zesty Chicken",140,"small"));
			PizzaMenu.addPizzaSizePriceToMenu("large", new Size("Zesty Chicken",560,"large"));
			PizzaMenu.addPizzaSizePriceToMenu("medium", new Size("Zesty Chicken",280,"medium"));
		}
		
		if("Veg Hawaiian Delight".equals(pizzaName)){
			PizzaMenu.addPizzaSizePriceToMenu("small", new Size("Veg Hawaiian Delight",100,"small"));
			PizzaMenu.addPizzaSizePriceToMenu("large", new Size("Veg Hawaiian Delight",400,"large"));
			PizzaMenu.addPizzaSizePriceToMenu("medium", new Size("Veg Hawaiian Delight",200,"medium"));
		}
		
		if("Non Veg Hawaiian Delight".equals(pizzaName)){
			PizzaMenu.addPizzaSizePriceToMenu("small", new Size("Non Veg Hawaiian Delight",110,"small"));
			PizzaMenu.addPizzaSizePriceToMenu("large", new Size("Non Veg Hawaiian Delight",440,"large"));
			PizzaMenu.addPizzaSizePriceToMenu("medium", new Size("Non Veg Hawaiian Delight",220,"medium"));
		}
		
		if("Peppy Paneer".equals(pizzaName)){
			PizzaMenu.addPizzaSizePriceToMenu("small", new Size("Peppy Paneer",115,"small"));
			PizzaMenu.addPizzaSizePriceToMenu("large", new Size("Peppy Paneer",460,"large"));
			PizzaMenu.addPizzaSizePriceToMenu("medium", new Size("Peppy Paneer",230,"medium"));
		}
		
		
		
		
		

	}

}
