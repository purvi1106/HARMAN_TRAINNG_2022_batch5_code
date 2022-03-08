package com.day2.batch5.session2;
// FulltimeEmployee: id, name,salary, pfAccount   	
//PartTimeEmployee:  id, name,salary, noOfHors, ratePerHr
abstract class Employee{
	private int id;
	private String name;
	private double salary;
	
	//ctr can not inheritance : how a object create 
	public Employee(int id, String name, double salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
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

	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	public void print() {
		System.out.println("id : "+ id + " name : "+ name+" salary : "+ salary);
	}
}

//re-usablity?
class FulltimeEmployee extends Employee{
	private String pfAccount;
	
	public FulltimeEmployee(int id, String name, double salary,  String pfAccount) {
		super(id, name, salary);
		this.pfAccount=pfAccount;

	}
	public void print() {
		super.print();// calling method of base classes
		System.out.println("pfAccount: "+ pfAccount);
	}
}

class ParttimeEmployee extends Employee{
	private int noOfHours;
	private double ratePerHour;
	
	public ParttimeEmployee(int id, String name, double salary,int noOfHours, double ratePerHour ) {
		super(id, name, salary);
		this.noOfHours=noOfHours;
		this.ratePerHour=ratePerHour;

	}
	public void print() {
		super.print();// calling method of base classes
		System.out.println("noOfHours: "+ noOfHours+" ratePerHour: "+ ratePerHour);
	}
}

public class DemoInheritance {

	public static void main(String[] args) {
		
		Employee employee=new FulltimeEmployee(1, "raj", 5000,"35454545");
		employee.print();
	}
}
