package com.nt.sbeans;

import java.util.Random;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component("sC")
//@Lazy(true)
public class SamsungCharger {
	
	public SamsungCharger() {
		System.out.println("SamsungCharger:: 0-param constructor");
	}
	
	public String charging() {
		return "Samsung Device is charging - "+new Random().nextInt(100)+"%";
	}

}
