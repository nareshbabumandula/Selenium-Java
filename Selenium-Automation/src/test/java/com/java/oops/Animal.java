package com.java.oops;

public class Animal {
	
	// Characteristics or state
	String color;
	double weight;
	int legs;
	
	// Behavior
	void run(String animal) {
		System.out.println(animal + " is running..!");
	}
	
	void walk(String animal) {
		System.out.println(animal + " is walking..!");
	}
	
	void eat(String animal) {
		System.out.println(animal + " is eating..!");
	}
	
	// No argument constructor
	public Animal() {
		System.out.println("Executing Animal class constructor..!");
	}
	
	public Animal(String name) {
		System.out.println("Executing parameterized Animal class constructor..!");
	}
	
	
	public static void main(String[] args) {
		Animal a = new Animal();
	}

}
