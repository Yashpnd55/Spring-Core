package com.nt.sbeans;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

import com.nt.config.AppConfig;

@Component("cricketer")
@Lazy(true)
public class Cricketer {
	
	public Cricketer() {
		System.out.println("Cricketer::0-param constructor");
	}
	
	public String batting() {
		
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
		CricketBat batting = ctx.getBean("cBat",CricketBat.class);
		ctx.close();
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
