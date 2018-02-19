package com.usa.variable.sum;

public class VariablePractice1 {
	public String name;
	private double salary;
	public void Employee(String empName) {
		name=empName;
	
	}
	public void setSalary(double empSal) {
		salary=empSal;
	}
	public void printEmp() {
		System.out.println("Name: "+name);
		System.out.println("Salary: "+salary);
	}
	
	public static void main(String[] args) {
		VariablePractice1 empOne=new VariablePractice1();
		empOne.setSalary(1000);
		empOne.Employee("Sumon");
		
		
	}
	
	
}
