package com.nt.client;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.nt.config.AppConfig;
import com.nt.sbeans.MobilePhone;

public class AwareLookupTest {

	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
		MobilePhone mp = ctx.getBean("mPhone", MobilePhone.class);
		
		System.out.println(mp.iPhone()+ " *** " + mp.onePlus()+ " *** " + mp.samsung());
		ctx.close();

	}

}
