package com.jpmc.beans;

public class BlueDart implements Courier{
	public void deliver(int oid) {
		System.out.println("OrederId " + oid + " is delivered via:: BlueDart");
	}
}
