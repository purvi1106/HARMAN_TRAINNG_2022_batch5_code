package com.day3.topic2.ex_handling_io;

public class EmployeeApp {

	public static void main(String[] args) {
		//create user define ex: throw and throws
		//throw and throws: throw is used to throw a exception delebratly 
		// throws comes on method sign
		
		
		Employee employee;
		try {
			employee = new Employee(121, "RAJ", 67000);
			
			employee.incrementSalary(10000);
			System.out.println(employee);
			
		} catch (EmpCreationException e) {
			System.out.println(e.getMessage());
		}
		catch (InvalideSalaryException e) {
			System.out.println(e.getMessage());
		}
		
	}
}
