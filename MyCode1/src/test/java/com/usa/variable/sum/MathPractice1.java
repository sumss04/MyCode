package com.usa.variable.sum;

public class MathPractice1 {
	String name; //instance variable
	 int age; //inastance variable
	static int companycode=2000; //static variable
	public int getSalary() {
		int salary=6000; //local variable
		int tax=1000;//local variable
		int netsalary=salary-tax;
		return netsalary;
		
	}

}
