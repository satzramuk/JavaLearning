package com.learning.conditionalStatements;

public class IfelseIfstatementDemo {

	public static void main(String[] args) {

		String browser = "Chrome";

		if(browser.equalsIgnoreCase("Firefox"))
		{
			System.out.println("TC executed on firefox");
		}
		else if(browser.equalsIgnoreCase("Edge"))
		{
			System.out.println("TC executed on Edge");

		}
		else if(browser.equalsIgnoreCase("IE"))
		{
			System.out.println("TC executed on IE");

		}
		else
		{
			System.out.println("Entered the valid browser");
		}

        		

	}
}

