package com.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bean.Registrationbean;
import com.dao.RegisterDao;

/**
 * Servlet implementation class EditServlet2
 */
public class EditServlet2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public EditServlet2() {
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
		String custid1 = request.getParameter("custid");
		int custid = Integer.parseInt(custid1);
		String fname = request.getParameter("fname");
		String mname = request.getParameter("mname");
		String lname = request.getParameter("lname");
		String gender = request.getParameter("gender");
		String  date = request.getParameter("date");
		String nationality = request.getParameter("nationlaity");
		String email = request.getParameter("email");
		String  address = request.getParameter("address");
		String country = request.getParameter("country");
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		Registrationbean e = new Registrationbean();
		e.setCustid(custid);
		e.setFname(fname);
		e.setMname(mname);
		e.setLname(lname);
		e.setGender(gender);
		e.setDate(date);
		e.setNationality(nationality);
		e.setEmail(email);
		e.setAddress(address);
		e.setCountry(country);
		e.setUsername(username);
		e.setPassword(password);
		int status=0;
		try {
			status = RegisterDao.Update(e);
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		if(status>0)
			 response.sendRedirect("ViewServlet");
		else
			  out.print("Sorry! Unable to connnect");
		
		
		
		
		
		
		
	}

}
