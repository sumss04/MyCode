package com.usa.polymorphism.sum;
// 

public class Override3 extends Override2 { 

	public void Child() {
		System.out.println("All Childs look cute.");
	}

	 public static void main(String[] args) {
		
	
		Override3 obj= new Override3();
		obj.Child();
		
		
		
	}
}
