package com.niit.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.niit.dao.MyConnection;
import com.niit.model.Student;


@WebServlet("/enroll")
public class EnrollServlet extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//1. retrieve the data
		String name=request.getParameter("sname");
		String course=request.getParameter("course");
		
		System.out.println("Course is "+course);
		//2. store the data in the model class
		Student s=new Student();
		s.setCourse(course);
		s.setName(name);
		
		//3. Establish a connection
		MyConnection m=new MyConnection();
		m.getConnection();
		
		//4. Send the object to the connection class
		m.save(s);
		
		RequestDispatcher rd=request.getRequestDispatcher("success.jsp");
		rd.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
