package com.bitwiseglobal.pizza;

public enum Crust {
	Pan_Pizza(100), Thin_Crust(150), Regular(0), Cheese_Burst(200);
	final int prize;

	public int getPrize() {
		return prize;
	}

	private Crust(int prize) {
		// TODO Auto-generated constructor stub
		this.prize = prize;
	}
}
