package com.jpmc.beans;

public class A {
	@SuppressWarnings("unused")
	private B b;

	public void setB(B b) {
		this.b = b;
	}

	@Override
	public String toString() {
		return "A [b]";
	}

}
