package com.learning.constructor;


class fifth {
	
	 fifth(int a) {
		System.out.println("My first Constructor");
	}
	fifth(double b,int a) {
		System.out.println("My Second Constructor");
	}
	fifth(double b,char a, int c) {
		System.out.println("My third Constructor");
	}
}

public class ConstructorDemo {
	
	public static void main(String[] args) {
		
		new fifth(30);
		 

		
	}

}
