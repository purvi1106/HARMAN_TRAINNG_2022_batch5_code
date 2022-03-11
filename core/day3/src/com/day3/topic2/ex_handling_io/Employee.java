package com.day3.topic2.ex_handling_io;

class Employee {
	private int id;
	private String name;
	private double salary;

	public Employee(int id, String name, double salary) throws EmpCreationException {
		this.id = id;
		this.name = name;
		this.salary = salary;
		if(salary<10000)
			throw new EmpCreationException("salary is too low as per govt guideline");
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

	//in the case of checked ex if method throw that ex then method sign
	//must contain throws keywords
	
	//while in case of un-checked ex it is optional
	public void incrementSalary(double incrment)  {
		if(incrment>=salary || incrment<=0) {
			throw new InvalideSalaryException("this increment is not allowed");
		}
		this.salary = this.salary+ incrment;
		
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}

}