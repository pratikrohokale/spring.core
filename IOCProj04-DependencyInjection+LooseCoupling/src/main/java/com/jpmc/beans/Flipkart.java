package com.jpmc.beans;

import java.util.Arrays;
import java.util.Random;

public class Flipkart {

	private Courier courier;

	public void setCourier(Courier courier) {
		this.courier = courier;
	}

	public void shopping(String items[]) {
		float billAmt = 0.0f;
		int oid = 0;
		Random rad = null;
		billAmt = items.length * 500;
		rad = new Random();
		oid = rad.nextInt(1000);
		System.out.println("Order Id: " + oid + " bill Amount: " + billAmt + " listOfItems: " + Arrays.toString(items));
		courier.deliver(oid);
	}

}