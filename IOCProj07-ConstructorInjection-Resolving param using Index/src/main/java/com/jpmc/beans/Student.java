package com.jpmc.beans;

public class Student {
	private int sno;
	private String sname;
	private float avg;

	public Student(int sno, String sname, float avg) {
		this.sno = sno;
		this.sname = sname;
		this.avg = avg;
	}

	public void showDetails() {
		System.out.println("Sno=" + sno + " sname=" + sname + " avg=" + avg);
	}

}
