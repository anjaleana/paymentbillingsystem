package com.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bean.Registrationbean;
import java.io.PrintWriter;
import java.sql.SQLException;

import com.service.RegisterService;

/**
 * Servlet implementation class Accountant_Controller
 */
public class Accountant_Controller extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Accountant_Controller() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		// TODO Auto-generated method stub
	    response.setContentType("text/html");
	    PrintWriter out = response.getWriter();
		String fname = request.getParameter("fname");
		String mname = request.getParameter("mname");
		String lname = request.getParameter("lname");
		String gender = request.getParameter("gender1");
		String date = request.getParameter("date");
		String nationality = request.getParameter("nationality");
		String email = request.getParameter("email");
		String  address = request.getParameter("address");
		String country = request.getParameter("country");
		String username = request.getParameter("username");
		String password = request.getParameter("password");
	     
		Registrationbean br = new Registrationbean(0,fname,mname,lname,gender,date,nationality,email,address,country,username,password);
		
		boolean status= false;
		try
		{
			status = RegisterService.registerCustomer(br);
		}
		catch(ClassNotFoundException e)
		{
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if(status)
		{
			  response.sendRedirect("result.jsp");
		}
		else
		{
			out.println("registration unsucessful");
			
			
			
			
			
			
			
			
		}
		
	}

}
