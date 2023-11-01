package com.java.collections;

import java.util.Iterator;
import java.util.List;
import java.util.Vector;

public class VectorTest {

	/*
	 * Java Collection is a framework which provides an architecture to store and manipulate the group of objects
	 * e.g. We can perform add, search, sort, manipulate and delete operations on the objects
	 */

	public static void main(String[] args) {

		/*Vector uses a dynamic array to store the data elements
		 * 1. Insertion Order is maintained
		 * 2. Accepts duplicate elements
		 * 3. Can contain any number of null values
		 * 4. Thread safe (Synchronized)
		 * 5. Randomly the elements can be accessed.
		 * 6. It has additional methods which ArrayList does not have
		 * */

		Vector vec = new Vector();
		vec.add(10);
		vec.add(20);
		vec.add(30);
		vec.add(40);
		vec.add(50);
		vec.add(10);
		vec.add(null);
		vec.add(null);

		vec.add("Suma");
		vec.add("Nikhila");
		vec.add("Kiran");
			
		System.out.println(vec.get(0));
		System.out.println(vec.get(1));
	
		System.out.println("Capacity of this vector is : " + vec.capacity()); // Returns the current capacity of this vector.Returns the current capacity (the length of its internal data array, kept in the field elementDataof this vector)
		System.out.println(vec.firstElement()); // Returns the first component (the item at index 0) of this vector.
		System.out.println(vec.lastElement()); // Returns the last component (the item at index 0) of this vector.


		System.out.println(vec);
		System.out.println(vec.isEmpty());
		System.out.println(vec.size());
		System.out.println(vec.get(0));
		System.out.println(vec.contains(30));
		System.out.println(vec.remove("Kiran"));
		System.out.println(vec);

		// for loop over ArrayList collection
		for (int i = 0; i < vec.size(); i++) {
			System.out.println("Arraylist object is : " + vec.get(i));
		}

		// enhanced for loop over ArrayList collection
		for (Object object : vec) {
			System.out.println("Value is : " + object);
		}

		//lambda expression on ArrayList object
		vec.forEach(object->System.out.println(object));

		Vector<Integer> vecList = new Vector<Integer>(); // Type Safety
		vecList.add(25);
		vecList.add(40);
		vecList.add(60);

		List list = new Vector(); // upcasting
		list.add("Ram");
		list.add("Teju");
		list.add("Harish");
		list.add("Kiran");
		list.add("Sai");
		list.add("Akhil");
		System.out.println(list);
		

		List list1 = new Vector(); // upcasting
		list1.add("Pete");
		list1.add("Gena");
		list1.add("Sjoerd");

		list.addAll(list1);
		System.out.println(list);

		//Iterator interface is used for iterating the elements in a forward direction which has methods like (hasNext(), next() and remove())
		Iterator<String> iter = list.iterator();

		while(iter.hasNext()) {
			System.out.println(iter.next());
		}


	}

}
