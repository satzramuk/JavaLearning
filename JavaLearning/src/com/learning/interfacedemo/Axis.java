package com.learning.interfacedemo;

public class Axis implements RBI {
	
	public void interestFreeLoan() {
		//RBI.UPILimit;
		System.out.println("Free loan");
	}

	public void aadharMandatory() {
		System.out.println("Aadhar added");
		
	}

	@Override
	public boolean panMandatory() {
		return true;
	}

//	@Override
//	public void aadharMandatory(boolean a) {
//		// TODO Auto-generated method stub
//		
//	}
//
//	

}
