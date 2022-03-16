package com.empapp.model.service;

import java.util.List;

import com.empapp.model.dao.Employee;

public interface EmployeeService {
	public List<Employee> getAll();
	public void addEmployee(Employee employee);
	public void deleteEmployee(int id);
	public void updateEmployee(int id, Employee employee);
	public Employee findById(int id);
}
