package com.access.modifiers;

public class DefaultTest {
	
	// default variables
	String username = "test";
	String password = "Secure*123";
	
	// default method
	void login() {
		System.out.println("Executing login method..!");
	}
		
	// default constructor
	DefaultTest() {
		System.out.println("Executing DefaultTest contructor..!");
	}
	
	public static void main(String[] args) {
		DefaultTest dt = new DefaultTest();
		System.out.println(dt.username);
		System.out.println(dt.password);
		dt.login();
	}
	

}
