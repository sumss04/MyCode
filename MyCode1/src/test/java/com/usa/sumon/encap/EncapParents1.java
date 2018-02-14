package com.usa.sumon.encap;

public class EncapParents1 {
	private String name;
	private int rollno;
	private int age;
	private String state;
	private String country;
	
	
	
	public String getName() {
		System.out.println("My name is xyz");
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getRollno() {
		System.out.println("Roll no 041316");
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public int getAge() {
		System.out.println("25");
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getState() {
		System.out.println("NY");
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getCountry() {
		System.out.println("USA");
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}

}
