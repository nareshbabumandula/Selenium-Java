package com.java.basics;

public class NonPrimitiveDataTypes {

	public static void main(String[] args) {
		
		String str = "hello world";
		System.out.println(str);
				
		String[] names = {"ravi", "john", "tej", "swathi","kalpana"};
		System.out.println(names[0]);
		System.out.println(names[1]);
		System.out.println(names[2]);
		System.out.println(names[5]); // ArrayIndexOutOfBoundsException

	}

}
