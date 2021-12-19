package com.learning.java;

public class ArrayDemo {

	
			

			
			
			
	
	
	
	
	public static void main(String[] args) {
		
		int i[] = new int[4];
		
		i[0] = 10;
		i[1] = 12;
		i[2] = 13; 
		i[3] = 14;
		
		//or another way
		
		int i1[]={10,12,13,14};
		
		for(int j=0;j<i1.length;j++){

			System.out.println("Values are :"+i[j]);

			}

		
		System.out.println("Array value is :"+i1[3]);
		
		int studentmarks[] = {100, 90, 60, 25};
		
		String studentmarks1[] = {"100", "90", "60", "25"};
		
		System.out.println(studentmarks1);
		
      System.out.println(studentmarks[1]);		

		////Example for student
      
      int a[]={33,50,80,70};//declaration, instantiation and initialization  
    //printing array  
    for(int i2=0;i2<a.length;i2++) {//length is the property of array  
    System.out.println(a[i2]);  
    }
      
//Example for object array
	
	Object ob[] = new Object[3];
	ob[0] = 10;
	ob[1] = "ravi";
	ob[2] = 20.5;
	ob[3] = "02/02/1993";
	
	for(int j=0;j<ob.length;j++){

		System.out.println("Values are :"+ob[j]);

		}



		
}	
	}


