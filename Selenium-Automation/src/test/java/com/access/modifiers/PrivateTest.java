package com.access.modifiers;

public class PrivateTest {
	
	// private variables
	private String username = "test";
	private String password = "Secure*123";
	
	// private method
	private void login() {
		System.out.println("Executing login method..!");
	}
		
	// private constructor
	private PrivateTest() {
		System.out.println("Executing PrivateTest contructor..!");
	}
	
	public static void main(String[] args) {
		PrivateTest pt = new PrivateTest();
		System.out.println(pt.username);
		System.out.println(pt.password);
		pt.login();
	}
	

}
