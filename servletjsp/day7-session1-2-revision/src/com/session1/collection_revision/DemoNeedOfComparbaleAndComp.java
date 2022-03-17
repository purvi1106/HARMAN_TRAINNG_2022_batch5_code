package com.session1.collection_revision;

import java.util.*;

//   Comparable vs   Comparator
// natual sort		extra sort sequence

class SalarySorter implements Comparator<Emp> {
	@Override
	public int compare(Emp o1, Emp o2) {
		return Double.compare(o2.getSalary(), o1.getSalary());
	}
}

class NameSorter implements Comparator<Emp> {
	@Override
	public int compare(Emp o1, Emp o2) {
		// if name of two person are same pls decide as per there salay
		int temp = o1.getName().compareTo(o2.getName());
		if (temp == 0) {
			temp = Double.compare(o2.getSalary(), o1.getSalary());
		}
		return temp;
	}
}

class Emp implements Comparable<Emp> {
	private int id;
	private String name;
	private double salary;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public Emp(int id, String name, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Emp [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}

	// e1.compareTo(e2)
	@Override
	public int compareTo(Emp o) {
		return Integer.compare(o.getId(), this.getId());
	}

}

public class DemoNeedOfComparbaleAndComp {

	public static void main(String[] args) {
		List<Emp> list = new ArrayList<>();
		list.add(new Emp(15, "raj", 450000));
		list.add(new Emp(1, "seema", 410000));
		list.add(new Emp(14, "anil", 420000));
		list.add(new Emp(112, "anil", 410990));

		System.out.println("---original list of emp-----");
		printEmps(list);

		Collections.sort(list);
		System.out.println("---sorted as per id----");
		printEmps(list);

		Collections.sort(list, new NameSorter());
		System.out.println("---sorted as per name----");
		printEmps(list);

		Collections.sort(list, new SalarySorter());
		System.out.println("---sorted as per salary----");
		printEmps(list);

	}

	private static void printEmps(List<Emp> list) {
		for (Emp temp : list) {
			System.out.println(temp);
		}
	}

}
