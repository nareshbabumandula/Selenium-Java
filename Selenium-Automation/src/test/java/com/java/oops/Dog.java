package com.java.oops;

public class Dog extends Pet {
	
	void bite(String animal) {
		System.out.println(animal + " can bite");
	}
	
	// No argument explicit constructor
	Dog(){
		this.color="white";
		this.legs=4;
		this.weight=11.55;
	}
	
	// Parameterized constructor
	Dog(String colour, int legs, double weight){
		this.color=colour;
		this.legs=legs;
		this.weight=weight;
	}

	public static void main(String[] args) {
		Dog d1 = new Dog();
		Dog d2 = new Dog("Black", 4, 13.55);
		d1.walk("Puppy");
		d1.run("Puppy");
		d1.sleep("Puppy");
		d1.eat("Puppy");
		d1.bite("Jack");
		System.out.println(d1.color);
		System.out.println(d1.weight);
		System.out.println(d1.legs);
		System.out.println(d2.color);
		System.out.println(d2.weight);
		System.out.println(d2.legs);
	}

}
