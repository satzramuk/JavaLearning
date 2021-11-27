package com.learning.java;

public class StringDemo {

	public static void main(String[] args) {
		

		//Here we will see list of String methods and String concepts

		String name = " SathishKumar ";
		
		
		String empname = "Ravi";
		int number = 3;

		//returns character value for the particular index

		System.out.println("1st one is: "+name.charAt(5));

		System.out.println("**********************************************");

		//returns string length

		System.out.println("2nd one is: "+name.length());

		System.out.println("**********************************************");

		//checks the equality of string with the given object

		System.out.println("3rd one is: "+name.equals("Sathish"));

		System.out.println("**********************************************");

		//checks the equality of string with the given string object without case sensitivity

		System.out.println("4th one is: "+name.equalsIgnoreCase("KARTHIK"));

		System.out.println("**********************************************");

		//Checks if string is empty or not
		System.out.println("5th one is: "+name.isEmpty());

		System.out.println("**********************************************");

		//returns true or false based on the given value is present or not
		System.out.println("6th one is: "+name.contains("a"));

		System.out.println("**********************************************");

		//take a particular portion of the string
		System.out.println("7th one is: "+name.substring(7));

		System.out.println("Empname is: "+empname.substring(1));

		System.out.println("**********************************************");

		//take a particular portion of the string begin and end index
		System.out.println("8th one is: "+name.substring(1, 4));

		System.out.println("Empname is: "+empname.substring(1,3));

		System.out.println("**********************************************");

		//appends the string to the given string
		System.out.println("9th one is: "+name.concat("Maruti"));

		System.out.println("**********************************************");

		//replaces the existing char with given char
		System.out.println("10th one is: "+name.replace("a", "A"));
		System.out.println("10th one is: "+name.replace("Sathish", "Siva"));

		System.out.println("**********************************************");

		//finds the position of a character in the String
		System.out.println("11th one is: "+name.indexOf("a"));

		System.out.println("**********************************************");

		//finds the character specified from the index position
		System.out.println("12th one is: "+name.indexOf("a",10));
		System.out.println("12th one is: "+name.indexOf("mar",4));

		System.out.println("**********************************************");


		//Trim will remove the white spaces before and after
		System.out.println("13th one is: "+name.trim());

		System.out.println("**********************************************");

		//convert the given data type to String
		System.out.println("14th one is: "+String.valueOf(number));

		System.out.println("**********************************************");

		String upperCase = "SATHISHKUMAR";
		System.out.println("15th one is: "+upperCase.toLowerCase());

		System.out.println("**********************************************");

		String lowerCase = "sathishkumar";
		System.out.println("16th one is: "+lowerCase.toUpperCase());

		System.out.println("**********************************************");


		//Returns a Joined String with Given delimiter
		System.out.println("17th one is: "+String.join("-", "Automation","Testing","Learning"));
		System.out.println("18th one is: "+String.join("/", "24","05","2021"));

		System.out.println("**********************************************");


		//split
		String splitThis ="Am,I,teaching,good?";
		String[] splited = splitThis.split(",");

		for (String val : splited) {

			System.out.println("Values are :"+val);

		}









	}

}
