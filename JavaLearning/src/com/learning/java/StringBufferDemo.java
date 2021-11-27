package com.learning.java;

public class StringBufferDemo {

	public static void main(String[] args) {

		// To demonstrate the String Buffer is Mutable

		System.out.println("String is Immutable");
		String name = "Sathish";
		System.out.println("Appending a name to Original :"+name.concat("Kumar"));
		System.out.println("Original name : "+name);
		System.out.println("******************************");
		System.out.println("String is Mutable");
		StringBuffer name1 = new StringBuffer("Sathish");
		System.out.println("Appending a name to Original :"+name1.append("Kumar"));
		System.out.println("Original Name :"+name1);


		//StringBuffer Methods
		//Reverse

		System.out.println("Reversed name :"+name1.reverse());

		System.out.println("**********************************************");
		//Replace
		StringBuffer replacethis = new StringBuffer("Arul");
		System.out.println("Replacing the value :"+replacethis.replace(0, 3, "Riya"));
		System.out.println("**********************************************");
		//Delete
		StringBuffer delete = new StringBuffer("xyzRiya");
		System.out.println("Deleting the value :"+delete.delete(0, 3));
		System.out.println("**********************************************");
		//Insert
		StringBuffer insert = new StringBuffer("Ravi");
		System.out.println("Inserting the value :"+insert.insert(4, "Kumar"));
		System.out.println("**********************************************");

		//Capacity
		System.out.println("Capacity :"+insert.capacity());

		//Like String we have chartAt, Substring, length methods as well










	}

}
