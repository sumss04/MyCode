package com.usa.dhaka.sum;

public class Dhaka1 {
	public void Madaripur() {
		String district;
		district="My district name is madaripur";
		System.out.println(district+".");
	}
	public void Salary() {
		int income;
		income= 10000;
		System.out.println("My monthly salary is "+income+".");
	}
	public static void main(String[] args) {
		Dhaka1 obj=new Dhaka1();
		obj.Madaripur();
		Dhaka1 obj1=new Dhaka1();
		obj1.Salary();
	
	}

}
