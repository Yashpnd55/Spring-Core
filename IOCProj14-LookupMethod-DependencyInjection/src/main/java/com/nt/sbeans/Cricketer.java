package com.nt.sbeans;

import org.springframework.beans.factory.annotation.Lookup;
import org.springframework.stereotype.Component;

@Component("cricketer")
public abstract class Cricketer {
	
//	private ApplicationContext ctx;
//	
//	@Override
//	public void setApplicationContext(ApplicationContext ctx) throws BeansException {
//		this.ctx=ctx;
//	}
	
	@Lookup
	public abstract CricketBat getBat();
	
	public Cricketer() {
		System.out.println("Cricketer::0-param constructor");
	}
	
	public String batting() {
		
		// AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
		CricketBat batting = getBat();
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
