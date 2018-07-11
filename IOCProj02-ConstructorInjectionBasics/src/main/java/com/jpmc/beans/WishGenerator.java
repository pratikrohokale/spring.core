package com.jpmc.beans;

import java.util.Date;

public class WishGenerator {

	private Date date;

	public WishGenerator(Date date) {
		this.date = date;
	}

	@SuppressWarnings("deprecation")
	public String generateWishMessage(String name) {
		int hours = 0;
		hours = date.getHours();
		if (hours <= 12)
			return "GM" + name;
		else if (hours <= 18)
			return "GA" + name;
		else
			return "GN" + name;
	}// method

}// class
