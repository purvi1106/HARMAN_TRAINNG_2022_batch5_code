package com.empapp.web.controller;
import java.util.*;

import com.empapp.model.dao.Employee;
import com.empapp.model.service.EmployeeService;
import com.empapp.model.service.EmployeeServiceImpl;

public class DemoEmpApp {

	public static void main(String[] args) {
		EmployeeService employeeService=new EmployeeServiceImpl();
		List<Employee>employees=employeeService.getAll();
		System.out.println("all emp....");
		for(Employee employee: employees)
			System.out.println(employee);
//		Employee employee=employeeService.findById(11);
//		System.out.println(employee);
		
	//	Employee employee=new Employee("anita", 91000, 41);
//		employeeService.addEmployee(employee);
		
	//	employeeService.updateEmployee(3, employee);
	}
}
