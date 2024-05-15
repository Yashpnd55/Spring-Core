package com.nt.factory;

import com.nt.comps.Bike;
import com.nt.comps.ElectricBike;
import com.nt.comps.LuxoryBike;
import com.nt.comps.SportsBike;
import com.nt.comps.StandardBike;

//factory pattern
public class BikeFactory {
	
	//static factory method having factory pattern logic
	public static  Bike   getInstance(String type) {
		if(type.equalsIgnoreCase("standard"))
			return  new StandardBike();
		else if(type.equalsIgnoreCase("luxory"))
			return new LuxoryBike();
		else if(type.equalsIgnoreCase("sports"))
			return  new SportsBike();
		else if(type.equalsIgnoreCase("electric"))
			return new  ElectricBike();
		else
			throw new IllegalArgumentException("invalid bike Type");
		
	}

}
