package com.learning.loopingstatements;

public class EnhancedForLoopDemo {

	public static void main(String[] args) {

		int arry[] = {5,6,4,3,6,7};
		             //0 =5,1=6,2=4,3,4,5
		
		int sum=0;
		
		for(int i=0;i<arry.length;i++) {
			
			System.out.println(arry[i]);
			//arr[0], 1
			
		}
		
		System.out.println("****************");
       for(int j:arry) {
			
    	   System.out.println(j);
    	     
			sum+=j;
			
		}
       System.out.println("sum is"+sum);
		
		
		
		
	}

}
