package com.nt.factory;

import com.nt.comps.BlueDart;
import com.nt.comps.Courier;
import com.nt.comps.DTDC;
import com.nt.comps.Flipkart;

public class FlipkartFactory {
	
	
	//static factory method
	public static   Flipkart  getInstance(String courierType) {
		// create Courier object
		  Courier courier=null;
		  if(courierType.equalsIgnoreCase("dtdc"))
			   courier=new DTDC();
		  else if(courierType.equalsIgnoreCase("bDart"))
				  courier=new BlueDart();
		  else
			  throw new IllegalArgumentException("Invlid courier type");
		  
		  //create Target class object
		  Flipkart fpkt=new Flipkart();
		  // set dependent class obj to target class obj
		  fpkt.setCourier(courier);
		  //return target class obj
		  return fpkt;
	}

}
