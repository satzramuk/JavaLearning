package com.learning.polymorphism;

public class MethodOverloadingDemo {
	
	public void methoda(int a) {
		System.out.println("First Method name");
		
		
	}
	
	public void methoda(int a, double b, String sb) {
		System.out.println("Second Method name");
	}
	

	public static void main(String[] args) {
		
		
			MethodOverloadingDemo db = new MethodOverloadingDemo();
			db.methoda(32);
			db.methoda(5, 75.10,"Test");
			
			
			

		
		
	}

}
