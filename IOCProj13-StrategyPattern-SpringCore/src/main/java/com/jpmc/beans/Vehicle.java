package com.jpmc.beans;

public class Vehicle {
	private Engine engg;

	public void setEngg(Engine engg) {
		this.engg = engg;
	}
	
	public void move(){
		engg.start();
		System.out.println("Vehicle is moved...");
	}
	
	public void park(){
		System.out.println("Vehicle is parked");
		engg.stop();
	}
}
