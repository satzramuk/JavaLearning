package com.learning.collectionconcept;

import java.util.*;


public class HashtableDemo {

	public static void main(String[] args) {

		Map<String, Integer> hmarks = new Hashtable<String, Integer>();

		hmarks.put("Naveen", 25);
		hmarks.put("Ravi", 26);
		hmarks.put("Raji", 27);
		hmarks.put("Tamil", 25);
		hmarks.put(null, 25); //null pointer exception will be thrown since it does not allow any null keys and null values.
		hmarks.put("Ram", null);

		System.out.println(hmarks.get("Naveen"));
		System.out.println(hmarks.get(null));
		System.out.println(hmarks.get("Ram"));

	}

}
