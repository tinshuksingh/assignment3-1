package com.bitwiseglobal.pizza;

public enum Toppings {
	Tomato(10),
	Baby_Corn(10),
	Pineapple(20),
	Jalapeno(15),
	Chicken_Salami(95),
	Olives(15),
	Capsicum(10),
	Paprika(30),
	Panner(80),
	Chicken_Sausage(110),
	Barbeque_Chicken(100),
	Spicy_Chicken(90),
	Onion(10),
	Cheese(20),
	Smoked_Chicken(150);

	private final int prize;

	public int getPrize() {
		return prize;
	}

	private Toppings(int prize) {
		// TODO Auto-generated constructor stub
		this.prize = prize;
	}

}
