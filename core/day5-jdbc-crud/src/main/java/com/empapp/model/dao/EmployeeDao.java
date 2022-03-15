package com.empapp.model.dao;
import java.util.*;
//Dao :data access object ie it is a abstraction over crud operation

public interface EmployeeDao {
	public List<Employee> getAll();
	public void addEmployee(Employee employee);
	public void deleteEmployee(int id);
	public void updateEmployee(int id, Employee employee);
	public Employee findById(int id);
}
