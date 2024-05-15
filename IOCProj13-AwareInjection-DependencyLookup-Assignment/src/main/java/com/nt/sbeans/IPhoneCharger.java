package com.nt.sbeans;

import java.util.Random;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component("iPC")
//@Lazy(true)
public class IPhoneCharger {
	
	public IPhoneCharger() {
		System.out.println("IPhoneCharger:: 0-param constructor");
	}
	
	public String charging() {
		return "IPhone Device is charging - "+new Random().nextInt(100)+"%";
	}

}
