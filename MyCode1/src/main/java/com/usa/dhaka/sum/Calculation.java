package com.usa.dhaka.sum;

	public class Calculation {
	public void math() {
	int firstint=50;
	int secondint=20;
	int sum=firstint+secondint;
	System.out.println("My summation is "+sum+".");
	}
	public static int division() {
		int x=50;
		int y=10;
		int answer=x/y;
		System.out.println("My answer is "+answer+".");
		return 0;
	}

	public static void main(String[] args) {
		Calculation obj=new Calculation();
		obj.math();
		Calculation.division();
	}

}
