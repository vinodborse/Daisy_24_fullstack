package com.ts.daisy_hibernate_many_to_many;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Batch {

	@Id
	private int id;
	private String name;
	private String code;
	
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
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	
	public Batch() {}
	
	public Batch(int id, String name, String code) {
		this.id = id;
		this.name = name;
		this.code = code;
	}
	
	
}
