package com.nt.sbeans;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

@Component("mPhone")
//@Lazy(true)
public class MobilePhone implements ApplicationContextAware {

	private ApplicationContext ctx;

	@Override
	public void setApplicationContext(ApplicationContext ctx) throws BeansException {
		this.ctx = ctx;
	}

	public MobilePhone() {
		System.out.println("MobilePhone:: 0-param constructor");
	}

	public String iPhone() {

		//AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
		IPhoneCharger ipc = ctx.getBean("iPC", IPhoneCharger.class);

		return ipc.charging();
	}

	public String onePlus() {

		//AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
		OnePlusCharger opc = ctx.getBean("oPC", OnePlusCharger.class);

		return opc.charging();
	}

	public String samsung() {

		//AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
		SamsungCharger sc = ctx.getBean("sC", SamsungCharger.class);

		return sc.charging();
	}

}
