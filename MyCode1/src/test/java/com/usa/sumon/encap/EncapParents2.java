package com.usa.sumon.encap;

public class EncapParents2 {
	private String Myname;
	private String Mycountry;
	private String Mydistrict;
	private int Myage;
	private int Birthyear;
	private double Mysalary;
	
	
	public String getMyname() {
		System.out.println("My name is Sumon");
		return Myname;
	}
	public void setMyname(String myname) {
		
		Myname = myname;
	}
	public String getMycountry() {
		System.out.println("Bangladesh");
		return Mycountry;
	}
	public void setMycountry(String mycountry) {
		Mycountry = mycountry;
	}
	public String getMydistrict() {
		System.out.println("Madaripur");
		return Mydistrict;
	}
	public void setMydistrict(String mydistrict) {
		Mydistrict = mydistrict;
	}
	public int getMyage() {
		System.out.println(32);
		return Myage;
	}
	public void setMyage(int myage) {
		Myage = myage;
	}
	public int getBirthyear() {
		System.out.println(1985);
		return Birthyear;
	}
	public void setBirthyear(int birthyear) {
		Birthyear = birthyear;
	}
	public double getMysalary() {
		System.out.println(1000.5);
		return Mysalary;
	}
	public void setMysalary(double mysalary) {
		Mysalary = mysalary;
	}



}
