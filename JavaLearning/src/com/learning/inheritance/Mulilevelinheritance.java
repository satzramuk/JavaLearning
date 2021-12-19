package com.learning.inheritance;
	
	class Nine {
		void college()
		{
			System.out.println("Going to college next week");
		}
	}
	
	class Ten extends Nine
	{
		void play()
		{
			System.out.println("Going to school");
		}
	}
	
	class Twelve extends Ten
	{
		void play()
		{
			System.out.println("Non static method");
		}
		
	}

	public class Mulilevelinheritance {

	public static void main(String[] args) {
		
		System.out.println("Main method");
		
		Twelve t1 =new Twelve();
		t1.play();
		
		
	}
	}

