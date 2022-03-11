package com.day3.topic3.collections;

import java.util.*;//container ready ds

//collection(java 1.2) + generics(java 1.5)
public class CollectionDemo1 {

	public static void main(String[] args) {

		List<String> l = new ArrayList<>();// aka growable array

		l.add("foo");
		l.add("raj");
		l.add("amit");
		l.add("sumit");
		l.add("kapil");

		System.out.println(l);
		
		Collections.sort(l);
		
		System.out.println(l);
		// -6+1=-5 => ignore -ve
		//BS: data should be pr-sorted 
		int index= Collections.binarySearch(l, "apple");
		System.out.println(index);
		// System.out.println(l);
		// System.out.println(l.get(1));//very good performace

		// enhance for loop: array, collection
//		for (String temp : l) {
//			System.out.println(temp);
//		}
		// using iterator: cursor, pointer which is used to iterate collection
//		Iterator<String> it=l.iterator();
//		while(it.hasNext()) {
//			System.out.println(it.next());
//		}

//		Iterator<String> it = l.iterator();
//		it.next();
//		it.remove();
//		it.next();
//		it.remove();
//		
//		System.out.println(l);
	}
}
