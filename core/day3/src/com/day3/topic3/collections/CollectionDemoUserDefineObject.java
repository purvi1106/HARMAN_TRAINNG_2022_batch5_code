package com.day3.topic3.collections;

import java.util.*;//container ready ds

//collection(java 1.2) + generics(java 1.5)
public class CollectionDemoUserDefineObject {

	public static void main(String[] args) {

		List<Employee> l = new LinkedList<>();// aka growable array

		l.add(new Employee(190, "raj", 59000));
		l.add(new Employee(189, "amit", 57000));
		l.add(new Employee(3, "ekta", 49000));
		l.add(new Employee(192, "kapil", 99000));
		l.add(new Employee(149, "seema", 19000));
		
		printAllEmps(l);
		//java dont know how to sort user define object
		
		//Comparble vs Comarator: to define custom sorting tech
		//Comparble : used for natual sort
		//Comarator : used for extra sort sequ
		System.out.println("-----after sorting as per id------");
		Collections.sort(l);
		
		printAllEmps(l);
		System.out.println("-----after sorting as per salary(rev sort)------");
		Collections.sort(l, new EmployeeSalarySorter());
		printAllEmps(l);
	}

	static void printAllEmps(List<Employee> l) {
		for(Employee temp: l) {
			System.out.println(temp);
		}
	}
}
