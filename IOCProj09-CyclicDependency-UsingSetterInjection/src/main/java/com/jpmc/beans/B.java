package com.jpmc.beans;

public class B {
	@SuppressWarnings("unused")
	private A a;

	public void setA(A a) {
		this.a = a;
	}

	@Override
	public String toString() {
		return "B [a]";
	}

}
