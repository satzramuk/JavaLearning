package com.learning.polymorphism;


class abc {

	 void blank(int a) {
	 
	 System.out.println("Super Class");
	 }
	 
	}

	class abcd  extends abc{

	 void blank(int a) {
	 
	 System.out.println("Sub Class");
	 
	 }
	 
	}



public class MethodOverridingDemo {

	public static void main(String[] args) {
		
		abcd er = new abcd();
		er.blank(30);

	}

}
