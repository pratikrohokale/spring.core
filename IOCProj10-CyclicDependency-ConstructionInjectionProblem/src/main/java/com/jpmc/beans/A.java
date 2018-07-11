package com.jpmc.beans;

public class A {
	@SuppressWarnings("unused")
	private B b;

	public A(B b) {
		this.b = b;
	}

	@Override
	public String toString() {
		return "A [b]";
	}

}
