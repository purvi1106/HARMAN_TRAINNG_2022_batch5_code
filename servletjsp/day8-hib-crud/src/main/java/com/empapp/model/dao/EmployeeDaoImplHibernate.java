package com.empapp.model.dao;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.empapp.factory.HibernateConnectionFactory;
import com.empapp.model.exception.EmployeeNotFoundException;

public class EmployeeDaoImplHibernate implements EmployeeDao {

	private SessionFactory factory;

	public EmployeeDaoImplHibernate() {
		factory = HibernateConnectionFactory.getSessionFactory();
	}

	@Override
	public List<Employee> getAll() {
		Session session = factory.openSession();
		List<Employee> employees = session.createQuery("select e from Employee e", Employee.class).getResultList();
		session.close();
		return employees;
	}

	@Override
	public void addEmployee(Employee employee) {
		Session session = factory.openSession();
		Transaction tx = session.getTransaction();
		try {
			tx.begin();
			session.save(employee);
			tx.commit();
		} catch (HibernateException ex) {
			ex.printStackTrace();
		}

		session.close();
	}

	@Override
	public void deleteEmployee(int id) {
		Employee empToDelete = findById(id);

		Session session = factory.openSession();
		Transaction tx = session.getTransaction();
		try {
			tx.begin();
			session.delete(empToDelete);
			tx.commit();
		} catch (HibernateException ex) {
			ex.printStackTrace();
		}

		session.close();

	}

	@Override
	public void updateEmployee(int id, Employee employee) {
		Employee empToUpdate = findById(id);
		empToUpdate.setSalary(employee.getSalary());
		Session session = factory.openSession();
		Transaction tx = session.getTransaction();
		try {
			tx.begin();
			session.update(empToUpdate);
			tx.commit();
		} catch (HibernateException ex) {
			ex.printStackTrace();
		}

		session.close();
	}

	@Override
	public Employee findById(int id) {
		Session session = factory.openSession();
		Employee employee = session.get(Employee.class, id);
		session.close();
		if (employee == null)
			throw new EmployeeNotFoundException("emp with id " + id + " is not found");

		return employee;
	}

}
