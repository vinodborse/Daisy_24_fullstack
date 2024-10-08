package com.ts.daisy_hibernate_many_to_many;

import java.util.List;

import org.hibernate.annotations.ManyToAny;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToMany;

@Entity
public class Student {
	
	@Id
	private int rollno;
	private String name;
	private String address;
	
	@ManyToMany
	private List<Batch> batch;
	
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	
	
	public List<Batch> getBatch() {
		return batch;
	}
	public void setBatch(List<Batch> batch) {
		this.batch = batch;
	}
	
	public Student() {}
	
	public Student(int rollno, String name, String address, List<Batch> batch) {
		this.rollno = rollno;
		this.name = name;
		this.address = address;
		this.batch = batch;
	}
	
	
	
	
	
	
}
