package com.jpmc.beans;

import java.util.Arrays;
import java.util.Random;

public class Flipkart {

	private BlueDart blueDart;
	
	public void setBlueDart(BlueDart blueDart) {
		this.blueDart = blueDart;
	}


	public void shopping(String items[]) {
		float billAmt = 0.0f;
		int oid = 0;
		Random rad = null;
		billAmt = items.length * 500;
		rad = new Random();
		oid = rad.nextInt(1000);
		System.out.println("Order Id: " + oid + " bill Amount: " + billAmt + " listOfItems: " + Arrays.toString(items));
		blueDart.deliver(oid);
	}

}