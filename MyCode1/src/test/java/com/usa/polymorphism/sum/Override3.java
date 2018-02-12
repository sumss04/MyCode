package com.usa.polymorphism.sum;

public class Override3 extends Override2 { 
	public void Child() {
		System.out.println("All childs look cute");
	}

	public static void main(String[] args) {
		Override3 h= new Override3();
		
		h.Child();
		h.Woman();
		h.Man();
		h.Human();
		
	}
}
