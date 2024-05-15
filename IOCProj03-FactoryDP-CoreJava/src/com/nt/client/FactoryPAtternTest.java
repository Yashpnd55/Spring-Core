package com.nt.client;

import com.nt.comps.Bike;
import com.nt.factory.BikeFactory;

public class FactoryPAtternTest {

	public static void main(String[] args) {
		//get Bike Object
		Bike bike=BikeFactory.getInstance("luxory");
		bike.drive("raja");
		System.out.println(bike.getClass());
		System.out.println("---------------------------------");
		Bike bike1=BikeFactory.getInstance("standard");
		bike1.drive("rajesh");
		System.out.println(bike1.getClass());

	}

}
