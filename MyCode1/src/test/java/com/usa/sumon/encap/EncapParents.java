package com.usa.sumon.encap;

public class EncapParents {
	
	private String name;
	
	private String fatherName;
	
	private String address;
	
	private String state;
	
	private int zip;
	
	private int salary;
	
	

	public String getName() {
		System.out.println("My name is sumon");
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getFatherName() {
		System.out.println("My father name is Mohammad");
		return fatherName;
	}

	public void setFatherName(String fatherName) {
		this.fatherName = fatherName;
	}

	public String getAddress() {
		System.out.println("Mr.sumon living in elmhurst");
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getState() {
		System.out.println("NY");
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public int getZip() {
		System.out.println("11373");
		return zip;
	}

	public void setZip(int zip) {
		this.zip = zip;
	}

	public int getSalary() {
		System.out.println("My salary $100000");
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}
	
}

