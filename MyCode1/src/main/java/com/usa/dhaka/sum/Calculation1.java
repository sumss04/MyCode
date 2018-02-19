package com.usa.dhaka.sum;

public class Calculation1 {
	public void math() {
		int x=45;
		x -=15;
		System.out.println(x);
		
	}
	public static boolean myBoolean() {
		
		boolean myBool=10==10;
		System.out.println(myBool);
		return false;
		
	}
	
	public static void main(String[] args) {
		
		Calculation1 obj=new Calculation1();
		obj.math();
		Calculation1.myBoolean();

	}
}
