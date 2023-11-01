package com.java.collections;

import java.util.Iterator;
import java.util.List;
import java.util.Stack;
import java.util.Vector;

public class StackTest {
	
	/*
	 * Java Collection is a framework which provides an architecture to store and manipulate the group of objects
	 * e.g. We can perform push, search, sort, manipulate and delete operations on the objects
	*/

	public static void main(String[] args) {
		
		/*Satck is a subclass of Vecto
		 * 1. Implements LIFO (Last-in-first-out) data structure and additionally contains push(), peek() and push(object o)
		 * 2. Insertion Order is maintained
		 * 2. Accepts duplicate elements
		 * 3. Can contain any number of null values
		 * 4. Thread safe (Synchronized)
		 * 5. Randomly the elements can be accessed.
		 * 6. It has additional methods which ArrayList does not have
		 * */
	
		Stack stack = new Stack();
		stack.push(10);
		stack.push(20);
		stack.push(30);
		stack.push(40);
		stack.push(50);
		stack.push(10);
		stack.push(null);
		stack.push(null);
		
		System.out.println(stack);
		stack.pop(); //  LIFO (Last-in-first-out) --> Removes the object at the top of this stack and returns that object as the value of this function
		System.out.println(stack);
		
		stack.push("Suma");
		stack.push("Nikhila");
		stack.push("Kiran");
		System.out.println(stack.get(0));
		System.out.println(stack.get(1));
		System.out.println(stack.peek()); // Looks at the object at the top of this stack without removing it from the stack.
		
		System.out.println("Capacity of this stack is : " + stack.capacity()); // Returns the current capacity of this Stack.Returns the current capacity (the length of its internal data array, kept in the field elementDataof this vector)
		System.out.println(stack.firstElement()); // Returns the first component (the item at index 0) of this vector.
		System.out.println(stack.lastElement()); // Returns the last component (the item at index 0) of this vector.
	
		
		System.out.println(stack);
		System.out.println(stack.isEmpty());
		System.out.println(stack.size());
		System.out.println(stack.get(0));
		System.out.println(stack.contains(30));
		System.out.println(stack.remove("Kiran"));
		System.out.println(stack);
		
		// for loop over Stack collection
		for (int i = 0; i < stack.size(); i++) {
			System.out.println("Stack object is : " + stack.get(i));
		}
		
		// enhanced for loop over Stack collection
		for (Object object : stack) {
			System.out.println("Value is : " + object);
		}
		
		//lambda expression on Stack object
		stack.forEach(object->System.out.println(object));
		
		Stack<Integer> stackList = new Stack<Integer>(); // Type Safety
		stackList.push(25);
		stackList.push(40);
		stackList.push(60);
				
		List list = new Stack(); // upcasting
		list.add("Ram");
		list.add("Teju");
		list.add("Harish");
		list.add("Kiran");
		list.add("Sai");
		list.add("Akhil");
		System.out.println(list);
		
		List list1 = new Stack(); // upcasting
		list1.add("Pete");
		list1.add("Gena");
		list1.add("Sjoerd");
		
		list.addAll(list1);
		System.out.println(list);
		
		//Iterator interface is used for iterating the elements in a forward direction which has methods like (hasNext(), next() and remove())
		Iterator<String> iter = stack.iterator();
		
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}
		
	}

}
