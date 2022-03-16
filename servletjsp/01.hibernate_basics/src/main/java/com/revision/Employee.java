package com.revision;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "emp_table_temp")
public class Employee {

	@Column(name = "emp_id", nullable = false)
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(name = "emp_ename", nullable = false, length = 100)
	private String ename;

	@Column(name = "emp_city", nullable = true, length = 100)
	private String city;

	@Column(name = "emp_desi", nullable = false, length = 100)
	private String desi;

	@Column(name = "emp_salary", nullable = false, length = 100)
	private double salary;

	@Column(name = "emp_email", nullable = false, length = 100)
	private String email;

	public Employee() {

	}

	public Employee(String ename, String city, String desi, double salary, String email) {
		super();
		this.ename = ename;
		this.city = city;
		this.desi = desi;
		this.salary = salary;
		this.email = email;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getDesi() {
		return desi;
	}

	public void setDesi(String desi) {
		this.desi = desi;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", ename=" + ename + ", city=" + city + ", desi=" + desi + ", salary=" + salary
				+ ", email=" + email + "]";
	}

}
