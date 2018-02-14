package com.usa.polymorphism.sum;

public class Overload {
	public static void  Salary() {
		int salary=2500;
		
		System.out.println("My salary is "+salary+".");
		
	}
	public static void Salary(int x) {
		
		System.out.println("My salary is "+x+".");
	
	}
	public static void Salary(double y) {
		System.out.println("The double number is "+y+".");
		
	}
	public static void Salary(float z) {
		System.out.println("My float number is "+z+".");
		
	}
	public static void Salary(String myName) {
		System.out.println("My name is "+myName+".");
	}
	public static void main(String[] args) {
		Overload b =new Overload();
		b.Salary();
		b.Salary(1000);
		b.Salary(10.5);
		b.Salary("Sumon");
		b.Salary(10.55);
	}
}



