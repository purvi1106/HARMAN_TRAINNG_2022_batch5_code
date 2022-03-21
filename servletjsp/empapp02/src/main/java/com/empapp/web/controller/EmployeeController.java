package com.empapp.web.controller;

import java.util.*;
import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.empapp.model.dao.Employee;
import com.empapp.model.service.EmployeeService;
import com.empapp.model.service.EmployeeServiceImpl;

@WebServlet("/empcontroller")
public class EmployeeController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	private EmployeeService employeeService = new EmployeeServiceImpl();

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String action = request.getParameter("action");
		if (action.equals("showall")) {
			List<Employee> employees = employeeService.getAll();

			request.setAttribute("employees", employees);

			RequestDispatcher rd = request.getRequestDispatcher("show.jsp");
			rd.forward(request, response);

		} else if (action.equals("add")) {
			// he want to add new emp
			RequestDispatcher rd = request.getRequestDispatcher("add.jsp");
			rd.forward(request, response);
		} else if (action.equals("del")) {
			int id = Integer.parseInt(request.getParameter("id"));
			employeeService.deleteEmployee(id);
			response.sendRedirect("empcontroller?action=showall");

		} else if (action.equals("update")) {
			int id = Integer.parseInt(request.getParameter("id"));
			Employee employee = employeeService.findById(id);
			request.setAttribute("employee", employee);
			RequestDispatcher rd = request.getRequestDispatcher("update.jsp");
			rd.forward(request, response);
		}
	}

	// in the same doPost method i want to handle both update and add employee case?

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// now what i need to do? i need to take data from the req

		int id = Integer.parseInt(request.getParameter("id").trim());
		String name = request.getParameter("name");
		double salary = Double.parseDouble(request.getParameter("salary"));
		int age = Integer.parseInt(request.getParameter("age"));

		Employee employee = new Employee(name, salary, age);
		if (id == 0) {
			employeeService.addEmployee(employee);
		} else {
			employeeService.updateEmployee(id, employee);
		}

		// What is the diff bw redirect and requestdispaching*
		// after Post redirect to Get
		// Pls study about a design patten ie called PRG design pattern, double form
		// submission problem
		response.sendRedirect("empcontroller?action=showall");
	}

}
