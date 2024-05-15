package com.nt.sbeans;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("wmg")
public class WishMessageGenerator {

	@Autowired
	private LocalDate ld;

	public WishMessageGenerator() {
		System.out.println("WishMessageGenerator::0-param constructor");

	}

	public String showWishMessage(String user) {

		System.out.println("WishMessageGenerator.showWishMessage()");

		int M = ld.getMonthValue();

		if (M == 10 || M == 11 || M == 12 || M == 1 || M == 2)
			return "WINTER";
		else if (M == 3 || M == 4 || M == 5)
			return "SUMMER";
		else if(M == 6 || M == 7 || M == 8 || M == 9)
			return "MONSOON";
		else 
			return "This month is not applicable";

	}
}
