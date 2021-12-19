package com.learning.polymorphism;


class Adder
{  
	static String add(int a, String b)
	{
		return a+b;
	}  
	static double add(double a, double b)
	{
		return a+b;
	}  
}  


public class MethodDemo1 {

	public static void main(String[] args) {

System.out.println("Value of addition is :"+Adder.add(30, "Ravi"));
	}

}
