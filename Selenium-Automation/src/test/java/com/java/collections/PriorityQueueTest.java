package com.java.collections;

import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.TreeSet;

/*
 * PriorityQueue:
 * 1. Insertion Order is not maintained
 * 2. Follows FIFO data structure
 */
public class PriorityQueueTest {

	public static void main(String[] args) {
		
		PriorityQueue<String> queue = new PriorityQueue<String>();
		queue.add("Suma");
		queue.add("Nikhila");
		queue.add("John");
		queue.add("Peter");
		queue.add("Alex");
		queue.add("Sony");
		System.out.println(queue);
		queue.remove(); // first-in-first-out
		System.out.println(queue);
		System.out.println("Head element is : " + queue.poll()); // Retrieves and removes the head of this queue,or returns null if this queue is empty.
		System.out.println(queue);
		System.out.println("Head element is : " + queue.peek()); //Retrieves, but does not remove, the head of this queue,or returns null if this queue is empty.
		System.out.println(queue);
		
		
		
		Iterator iter = queue.iterator();
		
		while (iter.hasNext()) {
			System.out.println(iter.next());
		}
		
		PriorityQueue<String> queue1 = new PriorityQueue<String>();
		System.out.println("Head element is : " + queue1.poll()); // Retrieves and removes the head of this queue,or returns null if this queue is empty.
		
		PriorityQueue<String> queue2 = new PriorityQueue<String>(); 
		//System.out.println("Head element is : " + queue2.remove()); // Retrieves and removes the head of this queue. This method differs from poll only in that it throws an exception if this queue is empty
		
		PriorityQueue<String> queue3 = new PriorityQueue<String>();
		queue3.add("Suma");
		queue3.add("Nikhila");
		queue3.add("John");
		queue3.add("Peter");
		queue3.add("Alex");
		queue3.add("Sony");
		
		TreeSet<String> set = new TreeSet<String>();
		set.addAll(queue3);
		System.out.println(set);
		
	}

}
