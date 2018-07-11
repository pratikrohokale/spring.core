package com.jpmc.beans;

import java.util.List;

public class College {
	private List<String> studNames;
	private List<?> listData;

	public void setStudNames(List<String> studNames) {
		this.studNames = studNames;
	}

	public void setListData(List<?> listData) {
		this.listData = listData;
	}

	@Override
	public String toString() {
		return "College [studNames=" + studNames + ", listData=" + listData + "]";
	}

}
