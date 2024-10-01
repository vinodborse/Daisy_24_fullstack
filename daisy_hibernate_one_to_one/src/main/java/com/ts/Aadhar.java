package com.ts;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Aadhar {

	@Id
	private int id;
	
	private int aadharnumber;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getAadharnumber() {
		return aadharnumber;
	}
	public void setAadharnumber(int aadharnumber) {
		this.aadharnumber = aadharnumber;
	}
	
	public Aadhar() {}
	
	public Aadhar(int id, int aadharnumber) {
		
		this.id = id;
		this.aadharnumber = aadharnumber;
	}
	
	
}
