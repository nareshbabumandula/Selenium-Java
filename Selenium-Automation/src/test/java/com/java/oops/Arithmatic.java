package com.java.oops;

public class Arithmatic {
	
	int x=10; // instance variable or data member or characteristic
	int y=20;
	
	// Behavior or method or functionality
	// Method with no arguments and without any return value
	void addition(){
		int z = x+y;
		System.out.println("Addition of x and y is : " +z);
	}
	
	// Method with arguments and without any return value
	void subtraction(int x, int y){
		int z = x-y;
		System.out.println("Subtraction of x and y is : " +z);
	}
	
	// Method without arguments and with return value
	int multiplication(){
		int z = x*y;
		System.out.println("Multiplication of x and y is : " +z);
		return z;
	}
	
	// Method with arguments and with return value
	int divison(int x, int y){
		int z = y/x;
		System.out.println("Division of x and y is : " +z);
		return z;
	}
	
	void modulus(){
		int x=100; // local variables
		int y=300;
		int z = y%x;
		System.out.println("Modulus of x and y is : " +z);
	}

	public static void main(String[] args) {
		// Create object reference for the current class which is Arithmatic class
		// Syntax : Classname objRef = new Constructor();
		Arithmatic arth = new Arithmatic();
		System.out.println(arth.x);
		System.out.println(arth.y);
		arth.addition();
		arth.subtraction(100, 40);
		int res = arth.multiplication();
		System.out.println("Return value of multiplication method is : " +res);
		int ouput = arth.divison(20, 100);
		System.out.println("Return value of divison method is : " +ouput);
		arth.modulus();
	}

}
