package com.nt.client;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.nt.config.AppConfig;
import com.nt.sbeans.Cricketer;

public class TraditionalLookupTest {

	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
		Cricketer cktr = ctx.getBean("cricketer",Cricketer.class);
		System.out.println("********* "+cktr.batting());
		System.out.println(cktr.bowling());
		System.out.println("----------------------------------");
		System.out.println("$$$$$$$$$$ "+cktr.batting());
		ctx.close();

	}

}
