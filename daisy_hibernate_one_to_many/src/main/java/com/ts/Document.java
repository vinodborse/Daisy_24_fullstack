package com.ts;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Document {

	@Id
	private int id;
	private String type;
	private String docnumber;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getDocnumber() {
		return docnumber;
	}
	public void setDocnumber(String docnumber) {
		this.docnumber = docnumber;
	}
	
	public Document() {}
	
	public Document(int id, String type, String docnumber) {
		this.id = id;
		this.type = type;
		this.docnumber = docnumber;
	}
	
	
}
