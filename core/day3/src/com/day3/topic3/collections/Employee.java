package com.day3.topic3.collections;
//Comparator: used for extra sort seq

import java.util.Comparator;
//extra sort seq
class EmployeeSalarySorter implements Comparator<Employee>{
	@Override
	public int compare(Employee o1, Employee o2) {
		return Double.compare(o2.getSalary(), o1.getSalary());// i want to rev sort
	}
}

class Employee implements Comparable<Employee>{
	private int id;
	private String name;
	private double salary;

	public Employee(int id, String name, double salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;

	}

	public void print() {
		System.out.println("id : " + id + " name : " + name + " salary: " + salary);
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public double getSalary() {
		return salary;
	}

	
	public void incrementSalary(double incrment) {

		this.salary = this.salary + incrment;

	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}

	//logic to tell java : hey sort as per id
	//java will internally call method e1.compareTo(e2)
	@Override
	public int compareTo(Employee o) {
		return Integer.compare(this.getId(), o.getId());
		//return Integer.compare( o.getId(),this.getId());	//for reverse sort
	}

}