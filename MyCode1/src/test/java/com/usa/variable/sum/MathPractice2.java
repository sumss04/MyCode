  package com.usa.variable.sum;

public class MathPractice2 {
	public static void main(String[] args) {
		MathPractice1 obj=new MathPractice1();
		
		//accessing instance variable name age
		
		obj.name="Naba";
		obj.age=1;
		System.out.println("Name: "+obj.name);
		System.out.println("Age: "+obj.age);
		//accessing static variable
		obj.companycode=2000;
		System.out.println("Company code: "+obj.companycode);
		
		int netsalary=obj.getSalary();
		System.out.println("Salary:"+netsalary);
		
	}

}
