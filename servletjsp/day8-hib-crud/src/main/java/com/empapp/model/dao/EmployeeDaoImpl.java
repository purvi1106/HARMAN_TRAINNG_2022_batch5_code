package com.empapp.model.dao;

import java.sql.*;
import java.util.*;

import com.empapp.factory.ConnectionFactory;
import com.empapp.model.exception.EmployeeNotFoundException;

public class EmployeeDaoImpl implements EmployeeDao {

	private Connection connection;

	public EmployeeDaoImpl() {
		connection = ConnectionFactory.getConnection();
	}

	@Override
	public List<Employee> getAll() {
		Employee tempEmp = null;
		List<Employee> employees = new ArrayList<Employee>();
		try {
			Statement stmt = connection.createStatement();
			ResultSet rs = stmt.executeQuery("select * from emp3");

			while (rs.next()) {
				tempEmp = new Employee(rs.getInt("id"), 
						rs.getString("name"), rs.getDouble("salary"), rs.getInt("age"));
				employees.add(tempEmp);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return employees;
	}

	@Override
	public void addEmployee(Employee employee) {
		PreparedStatement stmt = null;
		try {
			stmt = connection.prepareStatement("insert into emp3(name, salary, age) values(?,?,?)");
			stmt.setString(1, employee.getName());
			stmt.setDouble(2, employee.getSalary());
			stmt.setInt(3, employee.getAge());

			stmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void deleteEmployee(int id) {
		PreparedStatement stmt = null;
		try {
			stmt = connection.prepareStatement("delete from emp3 where id=?");
			stmt.setInt(1, id);
			stmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void updateEmployee(int id, Employee employee) {
		PreparedStatement stmt = null;
		try {
			stmt = connection.prepareStatement("update emp3 set salary = ? where id=?");
			stmt.setDouble(1, employee.getSalary());
			stmt.setInt(2, id);
			stmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	@Override
	public Employee findById(int id) {
		Employee tempEmp = null;
		try {
			PreparedStatement stmt = 
					connection.prepareStatement("select * from emp3 where id=?");
			stmt.setInt(1, id);
			ResultSet rs = stmt.executeQuery();

			if (rs.next()) {
				tempEmp = 
						new Employee(rs.getInt("id"), rs.getString("name"), rs.getDouble("salary"), rs.getInt("age"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		if(tempEmp==null)
			throw new EmployeeNotFoundException("emp with id "+ id +" is not found");
		return tempEmp;
	}

}
