package com.learning.collectionconcept;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;

public class ArraylistDemo {

	public static void main(String[] args) {
		
		
		
		ArrayList<Object> ar = new ArrayList<Object>();

		ar.add("100,1,testing,t,78");
		ar.add("2.23");
	
	
		
		ar.add(200,1);
		ar.add("testing");
		ar.add('t');
		ar.add(12.33);
		ar.add(true);
		
		
		
		
		// It will print all values in reference object "ar"
		//System.out.println(ar);

		//It will print the value based on array index
		//System.out.println(ar.get(2));
		
		//It will print the size of array value
		//System.out.println(ar.size());
		
		//Default lower index value of array
		//System.out.println("LI =" + 0);


		//Default higher index value of array 
		System.out.println("HI =" + (ar.size()-1));
		
		ArrayList<Integer> marklist = new ArrayList<Integer>();
		marklist.add(100);
		marklist.add(200);
		ArrayList<String> marklist1 = new ArrayList<String>();
		marklist1.add("Tom");
		
		
		ArrayList<String> studentlist = new ArrayList<String>();

		studentlist.add("Tom"); //0
		studentlist.add("Naveen"); //1
		studentlist.add("Ramesh"); //2
		studentlist.add("Suresh"); //3
        System.out.println("********************************************");

		//Typical for loop:
		for(int i=0; i<studentlist.size(); i++) {
		System.out.println(studentlist.get(i));
        
		}
		
		System.out.println("********************************************");
		// for each loop

		for(String s: studentlist){
		System.out.println(s);

		}
		
		
		// JDK 8 - Streams with lambda
		studentlist.stream().forEach(ele->System.out.println(ele));
		
		//iterator: Is an interface which used to iterate value from the collection list.

		Iterator<String> it = studentlist.iterator();

		while(it.hasNext()){

		System.out.println(it.next()); 
		 
		}

		
		
		ArrayList<Integer> numbers = new ArrayList<Integer>(Arrays.asList(10,20,30,40));
		 
		 System.out.println(numbers);
		 
	

		ArrayList<String> numbers1 = new ArrayList<String>(Arrays.asList("Java","Python","Selenium"));
		 
		 System.out.println(numbers1);
		 System.out.println("New Array value is "+numbers1.get(2));
		 



		 




		
	}

}
