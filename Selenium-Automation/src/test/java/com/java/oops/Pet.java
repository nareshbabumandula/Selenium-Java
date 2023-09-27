package com.java.oops;

public class Pet extends Animal{
	
	double weight=213.44;
	
	void sleep(String animal) {
		System.out.println(animal + " is sleeping..!");
	}
	
	public static void main(String[] args) {
		Pet p = new Pet();
		p.run("Jimmy");
		p.walk("Jimmy");
		p.eat("Jimmy");
		p.sleep("Jimmy");
		System.out.println(p.color="red");
		System.out.println(p.weight);
		System.out.println(p.legs=4);
		
	}

}
