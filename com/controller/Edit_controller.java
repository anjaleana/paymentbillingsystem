package com.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bean.Registrationbean;
import com.dao.RegisterDao;  

/**
 * Servlet implementation class Edit_controller
 */
public class Edit_controller extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Edit_controller() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		PrintWriter out= response.getWriter();
		//System.out.println("Anjali sharma");

		String id = request.getParameter("custid");
		int custid = Integer.parseInt(id);
		//System.out.println("Customerid:"+custid);
		//System.out.println("Anjali sharma");
		Registrationbean e = RegisterDao.getCustomerId(custid);
		out.print("<form action = 'EditServlet2' method = 'post'>");
		out.print("<tr><td></td><td><input type ='hidden' name ='custid' value= '"+e.getCustid()+"'></td></tr></br>");
		out.print("<tr><td>Fname:</td><td><input type= 'text' name='fname' value= '"+e.getFname()+"'></td></tr></br>");
		out.print("<tr><td>Mname:</td><td><input type= 'text' name='mname' value= '"+e.getMname()+"'></td></tr></br>");
		out.print("<tr><td>Lname:</td><td><input type= 'text' name='lname' value= '"+e.getLname()+"'></td></tr></br>");
		out.print("<tr><td>Gender:</td><td><input type= 'text' name='gender' value= '"+e.getGender()+"'></td></tr></br>");

		out.print("<tr><td>Date:</td><td><input type= 'text' name='date' value= '"+e.getDate()+"'></td></tr></br>");
		out.print("<tr><td>Nationality:</td><td><input type= 'text' name='nationality' value= '"+e.getNationality()+"'></td></tr></br>");
		out.print("<tr><td>Email:</td><td><input type= 'text' name='email' value= '"+e.getEmail()+"'></td></tr></br>");
		out.print("<tr><td>Address:</td><td><input type= 'text' name='address' value= '"+e.getAddress()+"'></td></tr></br>");
	    out.print("<tr><td>City:</td><td>");
	    out.print("<select name ='country' style='width:150px'>");
	    out.print("<option>Delhi</option>");
	    out.print("<option>Lucknow</option>");
	    out.print("<option>Varansi</option>");
	    out.print("<option>Bangalore</option>");
	    out.print("<option>Kanpur</option>");
	    out.print("<option>Allahabad</option>");
	    out.print("<option>Bareilly</option>");
	    out.print("<option>Ballia</option>");
	    out.print("<option>Hydrabad</option>");
	    out.print("</select>");
	    out.print("</td></tr></br>");
        out.print("<tr><td>Username:</td><td><input type= 'username' name='username' value= '"+e.getUsername()+"'></td></tr></br>");
		out.print("<tr><td>Password:</td><td><input type= 'password' name='password' value= '"+e.getPassword()+"'></td></tr></br>");
		out.print("<tr><td colspan='2'><input type='submit' value = 'Edit&Save'></td></tr></br>");
		out.print("</table>");
		out.print("</form>");



		
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
	}

}
