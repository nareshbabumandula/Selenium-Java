package com.java.oops;

class MethodOverloadTest{
	
	int a=10;
	int b=20;

	public void addition(){ 
		int c=a+b;
		System.out.println("Addition of a and b is : " +c);
	}

	public void addition(int a, int b){
		int c=a+b;
		System.out.println("Addition of a and b with integer arguments is : " +c);
	}

	public void addition(double a, double b){
		double c = a+b;
		System.out.println("Addition of a and b with double arguments is : " +c);
	}


	// No argument constructor
	MethodOverloadTest(){
		System.out.println("This is a no argument constructor..!");
	}

	// No argument constructor
	MethodOverloadTest(int a, int b){
		System.out.println("This is a parameterized constructor with parameters : " +a + "," +b);
	}


	public static void main(String[] args){
		MethodOverloadTest mot = new MethodOverloadTest();
		mot.addition();
		mot.addition(30,60);
		mot.addition(120.556,10.675);
	}

}