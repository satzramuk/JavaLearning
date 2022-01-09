package com.learning.interfacedemo;

public class Customer {

	public static void main(String[] args) {
		
		HDFCChennai chennai = new HDFCChennai();
		chennai.panMandatory();
		
		Axis mybank = new Axis();
		//RBI mybank = new Axis();
		mybank.aadharMandatory();
		boolean panMandatory = mybank.panMandatory();
		System.out.println(panMandatory);
		mybank.interestFreeLoan();
		System.out.println(Axis.UPILimit);
		

	}

}
