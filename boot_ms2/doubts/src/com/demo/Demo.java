package com.demo;

import java.util.*;

public class Demo {

	public static void main(String[] args) {
		// how to use iterator
		List<String> list = new ArrayList<String>();
		list.add("foo");
		list.add("bar");
		list.add("jar");
		list.add("car");

		
		//iterator				 vs for loop
		//more powerful			it is just like syntex suger, just for printing
		//curd op				can not do anything else only can printing operation
		
		System.out.println(list);
		// remove all the nodes from the list one by one
		Iterator<String> it = list.iterator();
		int i = 0;
		while (it.hasNext()) {
			it.next();
			if (i % 2 == 0) {
				it.remove();
			}
			i++;
		}
		System.out.println(list);

		// how to print it== syntex suger on a concept ie called iterator
//		for(String l: list) {
//			System.out.println(l);
//		}
//		
//		Iterator<String>it= list.iterator();
//		while(it.hasNext()) {
//			System.out.println(it.next());
//		}

	}

}
