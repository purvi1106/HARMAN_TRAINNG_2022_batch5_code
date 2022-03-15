package com.calapp.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.calapp.service.Calculator;

public class CalController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// waiter was resp taking the order
		Integer x = Integer.parseInt(request.getParameter("x"));
		Integer y = Integer.parseInt(request.getParameter("y"));

		Integer sum = Calculator.add(x, y);

		// it take help of view to show it
		//u want to tranfer control to a jsp page
		request.setAttribute("sum", sum);
		RequestDispatcher rd=request.getRequestDispatcher("show.jsp");
		rd.forward(request, response);
	}

}










//Integer sum=x+y;//i want to write a service layer, BL

//		PrintWriter out= response.getWriter();
//		out.print(sum);
// it take the help of kitchen peoples to proess
