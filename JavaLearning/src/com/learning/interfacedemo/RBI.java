package com.learning.interfacedemo;

public interface RBI {
	
	 int UPILimit = 100000;
	
	
	
	void aadharMandatory();
	
	boolean panMandatory();
	
	default void housingLoan(){
		System.out.println("get loan");
	}
	
	static void bikeLoan(){
		System.out.println("bike loan");
	}

}
