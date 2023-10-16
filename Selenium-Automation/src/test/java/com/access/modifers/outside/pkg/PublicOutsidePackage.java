package com.access.modifers.outside.pkg;

import com.access.modifiers.PublicTest;

public class PublicOutsidePackage {

	public static void main(String[] args) {
		System.out.println("Calling public constructor, variables and methods outside the package");
		PublicTest pt = new PublicTest();
		System.out.println(pt.username);
		System.out.println(pt.password);
		pt.login();

	}

}
