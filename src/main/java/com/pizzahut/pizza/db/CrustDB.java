/**
 * 
 */
package com.pizzahut.pizza.db;

import com.pizzahut.pizza.order.Crust;

/**
 * @author virendra
 *
 */
public enum CrustDB {
	PanPizza(new Crust("Pan Pizza", 100)),
	ThinCrust(new Crust("Thin Crust", 150)),
	Regular(new Crust("Regular", 0)),
	CheeseBurst(new Crust("Cheese Burst", 200));
	
	CrustDB(Crust crust) {
		this.setCrust(crust);
	}
	
	public Crust getCrust() {
		return crust;
	}

	public void setCrust(Crust crust) {
		this.crust = crust;
	}

	private Crust crust;
	
	

}
