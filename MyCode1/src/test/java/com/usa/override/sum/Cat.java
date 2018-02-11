package com.usa.override.sum;

public class Cat extends Dog {
	public void Move1() {
		System.out.println("All cats can run sharply");
		
	}
	public static void main(String[] args) {
		Cat b=new Cat();
		b.Move1();
		
	}
}
