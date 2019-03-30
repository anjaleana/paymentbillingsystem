package com.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.service.RegisterService;
import com.util.Demo;

/**
 * Servlet implementation class DeleteController
 */
public class DeleteController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DeleteController() {
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
        PrintWriter out =  response.getWriter();
        try
        {
        Connection con  = Demo.createConnection();
        String  sql = "select custid from registration1";
        PreparedStatement ps = con.prepareStatement(sql);
        ResultSet res = ps.executeQuery();
        int i = res.getInt(1);
        boolean status;
        
        status=RegisterService.deleteCustomer(i);
        if(status)
        {
        	out.println("Deleted");
        }
        else
        {
        	out.println("NO");
        }
        }
        catch(Exception e)
        {
        	e.getMessage();
        }
        
        
        
	}

}
