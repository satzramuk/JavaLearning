package com.learning.collectionconcept;

import java.util.ArrayList;

public class ArrayCloneDemo {
	
	public static void main(String[] args) {
		
		ArrayList<String> ar1 = new ArrayList<String>();

		ar1.add("Tom"); //0
		ar1.add("Naveen"); //1
		ar1.add("Suresh");

		
		ArrayList<String> cloneList = (ArrayList<String>)ar1.clone();
		System.out.println(cloneList);
		cloneList.clear();
		System.out.println(cloneList);
		System.out.println(ar1.contains("Ravi"));
		System.out.println(ar1.indexOf("Naveen")>0);
		//list1.remove(1);
		System.out.println(ar1.remove("Suresh"));
		System.out.println(ar1);

	}

}
