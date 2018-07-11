package com.jpmc.beans;

public class DTDC implements Courier {
	public void deliver(int oid) {
		System.out.println("OrederId " + oid + " is delivered via:: DTDC");
	}
}
