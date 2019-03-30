package com.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bean.Registrationbean;
import com.service.RegisterService;
import com.util.Demo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.*;

/**
 * Servlet implementation class SelectController
 */
public class SelectController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SelectController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
        List<Registrationbean> dataList = new ArrayList<Registrationbean>();
        PrintWriter out = response .getWriter();
        try
        {
        	Connection con = Demo.createConnection();
        	String sql =  "select * From registration1";
			PreparedStatement ps = con.prepareStatement(sql);
            ResultSet res = ps.executeQuery();
            
            //out.println("<html><body><h2>Registered Customer</h2>");
           // out.println("<table border='1' cellspacing = '0' cellpadding='5'>");
           // out.println("<tr>");
           // out.println("<th>CustID</th>");
           // out.println("<th>Fist Name</th>");
            //out.println("<th>Middle Name</th>");
            //out.println("<th>LAst Name</th>");
           // out.println("<th>gender</th>");
            //out.println("<th>date</th>");
           // out.println("<th>nationality</th>");
            //out.println("<th>email</th>");
           // out.println("<th>address</th>");
            //out.println("<th>country</th>");
           // out.println("<th>username</th>");
            //out.println("<th>password</th>");
           // out.println("</tr>");
        	while(res.next())
        	{
				 // dataList.add(new Registrationbean(res.getInt("custid"),res.getString("fname"),res.getString("mname"),res.getString("lname"),res.getString("gender"),res.getString("date"),res.getString("nationality"),res.getString("email"),res.getString("address"),res.getString("country"),res.getString("username"),res.getString("password")));
                 //System.out.println(res.getInt(1));
                 //System.out.println(res.getString(2));
                 //System.out.println(res.getString(3));
                 //System.out.println(res.getString(4));
                 //System.out.println(res.getString(5));
                 //System.out.println(res.getString(6));
                 //System.out.println(res.getString(7));
                 //System.out.println(res.getString(8));
                 //System.out.println(res.getString(9));
                 //System.out.println(res.getString(10));
                 //System.out.println(res.getString(11));
                 //System.out.println(res.getString(12));
               //out.println("<tr>");
               //out.println("<td>"+res.getInt(1)+"</td>");
               //out.println("<td>"+res.getString(2)+"</td>");
               //out.println("<td>"+res.getString(3)+"</td>");
               //out.println("<td>"+res.getString(4)+"</td>");
              // out.println("<td>"+res.getString(5)+"</td>");
               //out.println("<td>"+res.getString(6)+"</td>");
               //out.println("<td>"+res.getString(7)+"</td>");
               //out.println("<td>"+res.getString(8)+"</td>");
               //out.println("<td>"+res.getString(9)+"</td>");
               //out.println("<td>"+res.getString(10)+"</td>");
              // out.println("<td>"+res.getString(11)+"</td>");
               //out.println("<td>"+res.getString(12)+"</td>");
               //out.println("<tr>");

        	}
        	out.println("</table>");
        	out.println("</body>");
        	out.println("</html>");
        	//request.setAttribute("list", dataList);
        	//request.getRequestDispatcher("result1.jsp").forward(request, response);


        	
        }
        catch(SQLException e)
        {
        	e.printStackTrace();
        }

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
