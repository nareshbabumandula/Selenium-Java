package com.access.modifiers;

public class DefaultOutsideClass {

	public static void main(String[] args) {
		System.out.println("Calling default constructor, variables and methods outside the class");
		DefaultTest dt = new DefaultTest();
		System.out.println(dt.username);
		System.out.println(dt.password);
		dt.login();
	}

}
