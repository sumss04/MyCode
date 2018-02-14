package com.usa.override.sum;

public class Student {
	int roll=1234;
	float marks=(float) 85.95;
	String name="Naba";
	void show() {
		System.out.println("Roll: "+roll);
		System.out.println("Marks: "+marks);
		System.out.println("Name: "+name);
	}

	public static void main(String[] args) {
		Student obj=new Student();
		obj.show();
		
		

	}

}
