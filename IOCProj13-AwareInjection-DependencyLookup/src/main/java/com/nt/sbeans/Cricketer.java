package com.nt.sbeans;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

import com.nt.config.AppConfig;

@Component("cricketer")
public class Cricketer implements ApplicationContextAware {
	
	private ApplicationContext ctx;
	
	@Override
	public void setApplicationContext(ApplicationContext ctx) throws BeansException {
		this.ctx=ctx;
	}
	
	public Cricketer() {
		System.out.println("Cricketer::0-param constructor");
	}
	
	public String batting() {
		
		// AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
		CricketBat batting = ctx.getBean("cBat",CricketBat.class);
		return "Cricketer is batting: "+batting.scoreRuns();
	}
	
	public String bowling() {
		return "Cricketer is bowling";
	}
	
	public String fielding() {
		return "Cricketer is fielding";
	}
	
	public String wicketKeeping() {
		return "Cricketer is keeping the Wickets";
	}

}
