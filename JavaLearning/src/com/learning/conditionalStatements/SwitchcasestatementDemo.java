package com.learning.conditionalStatements;

public class SwitchcasestatementDemo {

	public static void main(String[] args) {

		int performancerating=6;


		switch (performancerating) 
		{
		case 1:
			System.out.println("Performance is poor");
			break;

		case 2:
			System.out.println("Slow performer");
			break;

		case 3:
			System.out.println("Meeting Expectation");
			break;

		case 4:
			System.out.println("Well done Keep rocking");
			break;

		case 5:
			System.out.println("Empl of the year");
			break;
		 default:

			System.out.println("You are fired");

		
		}
	}

}
