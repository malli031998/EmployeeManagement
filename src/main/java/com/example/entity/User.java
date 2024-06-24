package com.example.entity;

public class User {

	private int id;
	private String nane;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNane() {
		return nane;
	}
	public void setNane(String nane) {
		this.nane = nane;
	}
	public User(int id, String nane) {
		super();
		this.id = id;
		this.nane = nane;
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", nane=" + nane + "]";
	}
	
	
	
}

