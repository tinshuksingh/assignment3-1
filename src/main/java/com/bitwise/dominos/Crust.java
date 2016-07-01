package com.bitwise.dominos;

import java.util.HashMap;
import java.util.Map;

public class Crust {

static Map<String,Integer> crustList= new HashMap<String, Integer>();
	
	static{
		crustList.put("Pan Pizza", 100);
		crustList.put("Thin Crust", 150);
		crustList.put("Regular", 0);
		crustList.put("Cheese Burst", 200);
	}
	
	public static int getCostOfCrust(String name) throws InvalidCrustException{
		if(!crustList.containsKey(name))
		{
			throw new InvalidCrustException();
		}
		
		return crustList.get(name);
		
	}
	
}
