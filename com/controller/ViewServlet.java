package com.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bean.Registrationbean;
import com.dao.RegisterDao;
import java.util.*;

/**
 * Servlet implementation class ViewServlet
 */
public class ViewServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ViewServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		//out.print("<% include file = 'header.jsp'%>");
		out.print("<body>");
		out.print("<h1><center><p style = 'color:red'>This is Registered Customer List</center></h1>");
		List<Registrationbean> list = RegisterDao.getAllEmployees();
		out.print("<table border='2' width ='100%'>");
		out.print("<tr><th>ID</th><th>First Name</th><th>Middle Name</th><th>Last Name</th><th>Gender</th><th>date</th><th>nationality</th><th>Email</th><th>Address</th><th>Country</th><th>Username</th><th>Password</th><th>Edit</th><th>Delete</th>");
		for(Registrationbean e :list)
			
		{
			out.print("<tr><td>"+e.getCustid()+"</td><td>"+e.getFname()+"</td><td>"+e.getMname()+"</td><td>"+e.getLname()+"</td><td>"+e.getGender()+"</td><td>"+e.getDate()+"</td><td>"+e.getNationality()+"</td><td>"+e.getEmail()+"</td><td>"+e.getAddress()+"</td><td>"+e.getCountry()+"</td><td>"+e.getUsername()+"</td><td>"+e.getPassword()+"</td><td><a href='Edit_controller?custid="+e.getCustid()+"'>edit</td></tr>");
			
		}
	   out.print("</table>");
	   out.close();
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
