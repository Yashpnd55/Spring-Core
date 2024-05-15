package com.nt.client;

import com.nt.comps.Flipkart;
import com.nt.factory.FlipkartFactory;

public class StrategyDPTest {

	public static void main(String[] args) {
		// get Flipkart class obj
		Flipkart fpkt=FlipkartFactory.getInstance("bDart");
		//invoke the  b.method
		String resultMsg=fpkt.shopping(new String[] {"shirt","x-mstree"},
				                                               new float[] {3000.0f,5000.0f});
		System.out.println(resultMsg);

	}

}
