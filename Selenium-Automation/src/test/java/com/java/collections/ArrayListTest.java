package com.java.collections;

import java.util.ArrayList;
import java.util.List;

public class ArrayListTest {

	public static void main(String[] args) {
		
		ArrayList alist = new ArrayList();
		alist.add(10);
		alist.add(20);
		alist.add(30);
		alist.add(40);
		alist.add(50);
		alist.add("Suma");
		alist.add("Nikhila");
		alist.add("Kiran");
				
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
				

	}

}
