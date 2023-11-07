package com.exceptions;

public class NoExceptionHandingTest {
	
	void arithmaticoperations(){
		int a=10;
		int b=0;
		int c=a+b;
		System.out.println("Addition of a and b is : " + c);
		int d=a-b;
		System.out.println("Subtraction of a and b is : " + d);
		int e=a*b;
		System.out.println("Mutiplication of a and b is : " + e);
		int f=a/b; // java.lang.ArithmeticException: / by zero
		System.out.println("Division of a and b is : " + f);
		int g=b%a;
		System.out.println("Modulus of a and b is : " + g);
	}

	public static void main(String[] args) {
		NoExceptionHandingTest not = new NoExceptionHandingTest();
		not.arithmaticoperations();

	}

}
