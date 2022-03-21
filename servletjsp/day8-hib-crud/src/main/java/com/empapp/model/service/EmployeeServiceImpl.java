package com.empapp.model.service;

import java.util.List;

import com.empapp.model.dao.Employee;
import com.empapp.model.dao.EmployeeDao;
import com.empapp.model.dao.EmployeeDaoImpl;
import com.empapp.model.dao.EmployeeDaoImplHibernate;
//service layer is just like brain of our application
//Cross cutting concern* tx , security, caching
public class EmployeeServiceImpl implements EmployeeService{

	private EmployeeDao employeeDao;
	
	// :( Spring framwork => 100% loose coupling bw the modules 
	public EmployeeServiceImpl() {
		employeeDao=new EmployeeDaoImplHibernate();
	}

	@Override
	public List<Employee> getAll() {
		return employeeDao.getAll();
	}

	@Override
	public void addEmployee(Employee employee) {
		employeeDao.addEmployee(employee);
	}

	@Override
	public void deleteEmployee(int id) {
		employeeDao.deleteEmployee(id);
	}

	@Override
	public void updateEmployee(int id, Employee employee) {
		employeeDao.updateEmployee(id, employee);
	}

	@Override
	public Employee findById(int id) {
		return employeeDao.findById(id);
	}

}
