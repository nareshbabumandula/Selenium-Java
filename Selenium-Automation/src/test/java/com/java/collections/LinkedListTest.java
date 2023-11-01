package com.java.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class LinkedListTest {

	/*
	 * Java Collection is a framework which provides an architecture to store and manipulate the group of objects
	 * e.g. We can perform add, search, sort, manipulate and delete operations on the objects
	 */

	public static void main(String[] args) {

		/*LinkedList uses a doubly linked list to store the elements
		 * 1. Insertion Order is maintained
		 * 2. Accepts duplicate elements
		 * 3. Can contain any number of null values
		 * 4. Thread not safe
		 * 5. Randomly the elements can be accessed.
		 * 6. Manipulation is fast in LinkedList when compared to ArrayList because no shiftingis required.
		 * */

		LinkedList llist = new LinkedList();
		llist.add(10);
		llist.add(20);
		llist.add(30);
		llist.add(40);
		llist.add(50);
		llist.add(10);
		llist.add(null);
		llist.add(null);
		llist.add("Suma");
		llist.add("Nikhila");
		llist.add("Kiran");

		System.out.println("Peek element of list is : " + llist.peek()); // Retrieves, but does not remove, the head (first element) of this list.
		System.out.println("Before Poll : " + llist.get(0));
		System.out.println("Poll element of list is : " + llist.poll()); // Retrieves  and remove, the head (first element) of this list.
		System.out.println("After Poll : " + llist.get(0));
		System.out.println(llist.get(0));
		System.out.println(llist.get(1));
		System.out.println("PeekFirst element of list is : " + llist.peekFirst()); // Retrieves, but does not remove the first element of this list,or returns null if this list is empty.
		System.out.println("PollFirst element of list is : " + llist.pollFirst()); // Retrieves and removes the first element of this list,or returns null if this list is empty.
		System.out.println("PeekLast element of list is : " + llist.peekLast()); // Retrieves, but does not remove the last element of this list,or returns null if this list is empty.
		System.out.println("PollLast element of list is : " + llist.pollLast()); // Retrieves and removes the last element of this list,or returns null if this list is empty.

		System.out.println(llist);
		System.out.println(llist.isEmpty());
		System.out.println(llist.size());
		System.out.println(llist.get(0));
		System.out.println(llist.contains(30));
		System.out.println(llist.remove("Kiran"));
		System.out.println(llist);

		// for loop over LinkedList collection
		for (int i = 0; i < llist.size(); i++) {
			System.out.println("Arraylist object is : " + llist.get(i));
		}

		// enhanced for loop over LinkedList collection
		for (Object object : llist) {
			System.out.println("Value is : " + object);
		}

		//lambda expression on LinkedList object
		llist.forEach(object->System.out.println(object));

		LinkedList<Integer> linList = new LinkedList<Integer>(); // Type Safety
		linList.add(25);
		linList.add(40);
		linList.add(60);


		List list = new LinkedList(); // upcasting
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
