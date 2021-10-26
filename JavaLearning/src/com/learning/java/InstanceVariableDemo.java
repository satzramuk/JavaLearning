package com.learning.java;

public class InstanceVariableDemo {
	
	int roll = 10; //
	
	
	
	
	public static void main(String[] args) {
		
		InstanceVariableDemo obj = new InstanceVariableDemo();
		obj.show();
		
		
	}
	
	
	public  void show() {
		
		System.out.println("Roll number is "+roll);
	}
	
	
	
}
