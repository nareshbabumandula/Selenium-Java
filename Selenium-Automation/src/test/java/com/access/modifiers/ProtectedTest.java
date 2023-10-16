package com.access.modifiers;

public class ProtectedTest {
	
	// protected variables
	protected String username = "test";
	protected String password = "Secure*123";
	
	// protected method
	public void login() {
		System.out.println("Executing login method..!");
	}
		
	// protected constructor
	protected ProtectedTest() {
		System.out.println("Executing ProtectedTest contructor..!");
	}
	
	public static void main(String[] args) {
		ProtectedTest pt = new ProtectedTest();
		System.out.println(pt.username);
		System.out.println(pt.password);
		pt.login();
	}
	

}
