package com.access.modifers.outside.pkg;

import com.access.modifiers.ProtectedTest;

public class ProtectedOutsidePackage extends ProtectedTest {

	public static void main(String[] args) {
		System.out.println("Calling protected constructor, variables and methods outside the package");
		//ProtectedTest pt = new ProtectedTest();
		//System.out.println(pt.username);
		//System.out.println(pt.password);
		//pt.login();
		
		ProtectedOutsidePackage pop = new ProtectedOutsidePackage();
		System.out.println(pop.username);
		System.out.println(pop.password);
		pop.login();
	
	}

}
