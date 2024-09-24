package com.ts;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Teacher {
	@Id
	private int id;
	private String name;
	private int mobile;
	private String subject;
	
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getMobile() {
		return mobile;
	}
	public void setMobile(int mobile) {
		this.mobile = mobile;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	
	public Teacher() {}
	
	public Teacher(int id, String name, int mobile, String subject) {
		
		this.id = id;
		this.name = name;
		this.mobile = mobile;
		this.subject = subject;
	}
	
	
	
}
