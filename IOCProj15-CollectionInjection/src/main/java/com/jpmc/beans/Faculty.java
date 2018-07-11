package com.jpmc.beans;

import java.util.Set;

public class Faculty {
	private Set<Long> phones;

	public void setPhones(Set<Long> phones) {
		this.phones = phones;
	}

	@Override
	public String toString() {
		return "Faculty [phones=" + phones + "]";
	}

}
