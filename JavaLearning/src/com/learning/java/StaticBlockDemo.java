package com.learning.java;

public class StaticBlockDemo {
	
	static int i;
	
	static {
		int i=10;
		System.out.println("Inside static block1");
	}
	
	static {
		System.out.println("Inside static block2");
	}

	public static void main(String[] args) {

		System.out.println("Inside main method");

	}

}

