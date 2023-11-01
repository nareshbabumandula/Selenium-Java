package com.java.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListTest {

	/*
	 * Java Collection is a framework which provides an architecture to store and manipulate the group of objects
	 * e.g. We can perform add, search, sort, manipulate and delete operations on the objects
	 */

	public static void main(String[] args) {

		/*ArrayList uses a dynamic array to store the elements
		 * 1. Insertion Order is maintained
		 * 2. Accepts duplicate elements
		 * 3. Can contain any number of null values
		 * 4. Thread not safe
		 * 5. Randomly the elements can be accessed.
		 * */

		ArrayList alist = new ArrayList();
		alist.add(10);
		alist.add(20);
		alist.add(30);
		alist.add(40);
		alist.add(50);
		alist.add(10);
		alist.add(null);
		alist.add(null);

		alist.add("Suma");
		alist.add("Nikhila");
		alist.add("Kiran");
		System.out.println(alist.get(0));
		System.out.println(alist.get(1));

		System.out.println(alist);
		System.out.println(alist.isEmpty());
		System.out.println(alist.size());
		System.out.println(alist.get(0));
		System.out.println(alist.contains(30));
		System.out.println(alist.remove("Kiran"));
		System.out.println(alist);

		// for loop over ArrayList collection
		for (int i = 0; i < alist.size(); i++) {
			System.out.println("Arraylist object is : " + alist.get(i));
		}

		// enhanced for loop over ArrayList collection
		for (Object object : alist) {
			System.out.println("Value is : " + object);
		}

		//lambda expression on ArrayList object
		alist.forEach(object->System.out.println(object));

		ArrayList<Integer> arrList = new ArrayList<Integer>(); // Type Safety
		arrList.add(25);
		arrList.add(40);
		arrList.add(60);


		List list = new ArrayList(); // upcasting
		list.add("Ram");
		list.add("Teju");
		list.add("Harish");
		list.add("Kiran");
		list.add("Sai");
		list.add("Akhil");
		System.out.println(list);

		List list1 = new ArrayList(); // upcasting
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
