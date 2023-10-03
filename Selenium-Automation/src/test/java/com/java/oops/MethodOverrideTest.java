package com.java.oops;

class MethodOverrideTest extends MethodOverloadTest {

	int a=100;
	int b=200;

	public void addition(){ 
		int c=a+b;
		System.out.println("Addition of a and b in sub class is : " +c);
	}

	void Test() {
		super.addition();
		this.addition();
	}

	public static void main(String[] args){
		MethodOverrideTest mot = new MethodOverrideTest();
		mot.addition();
		//mot.Test();
		
		// Upcasting
		MethodOverloadTest mo = mot;
		mo.addition(); // Child class overridden method
		mo.addition(234.345, 4.456); // Parent class method
		mo.addition(40, 20); // Parent class method
		
		//Downcasting
		MethodOverrideTest mott = (MethodOverrideTest)mo;
		System.out.println(mott.a);
		System.out.println(mott.b);
		mott.addition();
		mott.Test();
		
	}

}