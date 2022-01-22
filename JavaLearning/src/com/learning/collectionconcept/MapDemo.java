package com.learning.collectionconcept;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class MapDemo {

	public static void main(String[] args) {
		
		//Map<Integer, String> yu = new HashMap<>();
		
		HashMap<Integer, String> hm=new HashMap<Integer, String>();
		

		
		hm.put(1,"Selenium");
		hm.put(12, "Ram");
		hm.put(13, "Kannan");
		hm.put(14, "Dhana");
		hm.put(15, "Dhana");
		
		//iterator: over the keys: by using keyset()
		
				Iterator<Integer> i1=hm.keySet().iterator();
				
				while(i1.hasNext()) {
					int key = i1.next();
					String value =hm.get(key);
					
					System.out.println("key ="+ key + " value = " +value);
					
					
				}
				
				
				
		
		
		
		//System.out.println(hm);
		//System.out.println(hm.get(13));
		
		//**************************Another example
		
		HashMap<String, String> capitalMap= new HashMap<String, String>();
		capitalMap.put("India", "New Delhi");
		capitalMap.put("Australia", "Sydney");
		capitalMap.put("UK", "London");
		//Can store n number of null values but only one null key
		capitalMap.put(null, "Greece");
		capitalMap.put(null, "Swedan");
		capitalMap.put(null, "Rome");
		capitalMap.put(null, "Rogan");
		
		//System.out.println(capitalMap.get(null));
//		capitalMap.put("RYK", "London23");
//		capitalMap.remove("RYK");
//		System.out.println(capitalMap.get("UK"));
//		System.out.println(capitalMap.get(null));
//	
		


	}

}
