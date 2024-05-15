package com.nt.sbeans;

import java.util.Random;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component("oPC")
//@Lazy(true)
public class OnePlusCharger {
	
	public OnePlusCharger() {
		System.out.println("OnePlusCharger:: 0-param constructor");
	}
	
	public String charging() {
		return "OnePlus Device is charging - "+new Random().nextInt(100)+"%";
	}


}
