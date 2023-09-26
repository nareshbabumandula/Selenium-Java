package com.java.oops;

public class EncapsulationTest extends Employee{

	public static void main(String[] args) {
		EncapsulationTest et = new EncapsulationTest();
		et.setEmpName("Suma");
		System.out.println(et.getEmpName());
		et.setEmpID(222);
		System.out.println(et.getEmpID());
		
		
	}

}
