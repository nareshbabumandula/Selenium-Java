package com.java.basics;

public class VariablesTest {
	
	int a=10; // instance variable
	static int b=20; // global variable or static variable which we can access across all the instances
	
	void m1() {
		int a=30; // local variable --> defined inside a method and the scope is only inside the method
		System.out.println("Value of a is : "+ a);
	}
	
	static void m2() {
		System.out.println("Static method..!");
	}
		
	public static void main(String[] args) {
		
		VariablesTest vt1 = new VariablesTest();
		VariablesTest vt2 = new VariablesTest();
		vt1.m1();
		
		System.out.println(vt1.a);
		System.out.println(b);
		System.out.println(vt1.b);
		System.out.println(vt2.b);
		System.out.println(VariablesTest.b);
		m2(); // static method call
	}

}
