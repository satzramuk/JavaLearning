package com.learning.interfacedemo;

public class IndianBankDeo implements RBI{
	
	public static void main(String[] args) {
		IndianBankDeo obj = new IndianBankDeo();
		obj.aadharMandatory();
		System.out.println(obj.panMandatory());
	}

	@Override
	public void aadharMandatory() {

		boolean value = true;
		System.out.println(value);
	}

	@Override
	public boolean panMandatory() {
		// TODO Auto-generated method stub
		return false;
	}
	
	
}
