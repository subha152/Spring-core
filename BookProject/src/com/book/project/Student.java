package com.book.project;

public class Student {

	private String name;
	private long roll;
	private String email;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getRoll() {
		return roll;
	}
	public void setRoll(long roll) {
		this.roll = roll;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}

	public void display() {
		System.out.println("Name: "+name);
		System.out.println("Roll: "+roll);
		System.out.println("Email: "+email);
		
	}
}
