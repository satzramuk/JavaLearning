package com.learning.java;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionhandlingDemo {

	public static void main(String[] args) {

		System.out.println("Enter some input");
		Scanner sc = new Scanner(System.in);
		
		try {
			int myinputvalue = sc.nextInt();
			int number = myinputvalue % 0;
			System.out.println("The value :"+number);

		}
		catch (ArithmeticException e) {
			System.err.println("Divisible by 0 is not possible");
		}
		catch (InputMismatchException e) {
			System.err.println("Input must be number");
		}
		finally {
			sc.close();
		}
		
		System.out.println("Program next step completed");
		
		
		
	}

}
