package com.java.basics;

public class DataTypes {
	
	// user defined non static method or java concrete method
	void m1() {
		System.out.println("This is method m1..!");
	}
	
	// user defined static method
	public static void m2() {
		System.out.println("This is method m2..!");
	}

	public static void main(String[] args) {
		//Primitive data types - byte, short, int, long, float, double, char & boolean
		byte b=122;
	    Byte by = Byte.valueOf(b); // Converting byte (primitive) into Byte (Object) explicitly
	    Byte by1 = b; // Autoboxing --> Converting byte (primitive) into Byte (Object) implicitly
	   	    
	    Integer a = new Integer(234);
	    int ii = a.intValue(); // Converting Integer to int explicitly which is also called as unboxing
	    int j=a; //// Converting Integer to int implicitly which is also called as unboxing
	    	    
	    // Syntax for creating an object reference for a class
	    //Classname objRef = new Constructor();
	    DataTypes dt = new DataTypes();
	    dt.m1();
	    m2();
	    DataTypes.m2();
	    		
		short s = 2445;
		int i = 3463636;
		long l = 980980;
		float f = 12.5f;
		double d = 345.456474;
		char c = 't';
		boolean bflag= true;
		
		System.out.println("Byte value is : " + b);
		System.out.println(s);
		System.out.println(i);
		System.out.println(l);
		System.out.println(f);
		System.out.println(d);
		System.out.println(c);
		System.out.println(bflag);
		
		// Type Casting - Converting one type of data into another types
		// byte --> short --> int --> long --> float --> double ----> Widening Type Casting
		byte b1=119;
		short s1=b1; // implicit casting - no need to do any conversion explicitly
		System.out.println(b1 + " " +s1);
		
		// double --> float --> long --> int --> short --> byte ------> Narrowing Type Casting	
		short s2=130;
		byte b2=(byte)s2;  // explicit casting - we need to convert/cast the byte to short explicitly
		System.out.println(s2 + " " + b2);
		
		// Wrapper classes --> Wrapper classes in java provides the mechanism to convert primitive data types to its corresponding object and object to datatype
		byte b3 = 108;
		Byte b4 = new Byte(b3); // Autoboxing
		System.out.println("Min value for a byte container is : " + b4.MIN_VALUE);
		System.out.println("Max value for a byte container is : " + b4.MAX_VALUE);
		
		byte b5= b4; // unboxing
		System.out.println("Value of b5 after unboxing is : " +b4);
		
		
	}

}
