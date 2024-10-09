package com.ts;

public class Student {

	private Batch bt;
	
	public void hello() {
		System.out.println("Student name is RAHUL");
		bt.batchName();
	}
	
	public Batch getBt() {
		return bt;
	}
	public void setBt(Batch bt) {
		this.bt = bt;
	}
	public Student() {}
	
	public Student(Batch bt) {
		this.bt = bt;
	}
	
	
	

}
