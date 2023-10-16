package com.access.modifiers;

public class PublicTest {
	
	// public variables
	public String username = "test";
	public String password = "Secure*123";
	
	// public method
	public void login() {
		System.out.println("Executing login method..!");
	}
		
	// public constructor
	public PublicTest() {
		System.out.println("Executing PublicTest contructor..!");
	}
	
	public static void main(String[] args) {
		PublicTest pt = new PublicTest();
		System.out.println(pt.username);
		System.out.println(pt.password);
		pt.login();
	}
	

}
