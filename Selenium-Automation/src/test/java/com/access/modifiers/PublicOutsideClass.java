package com.access.modifiers;

public class PublicOutsideClass {

	public static void main(String[] args) {
		System.out.println("Calling public constructor, variables and methods outside the class");
		PublicTest pt = new PublicTest();
		System.out.println(pt.username);
		System.out.println(pt.password);
		pt.login();
	}

}
