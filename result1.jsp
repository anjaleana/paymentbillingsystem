<%@ include file = "header.jsp" %>
<%@ page import = "com.util.Demo" %>
<%@page import ="java.sql.Connection"%>
<%@ page import="java.sql.PreparedStatement" %>
<%@ page import = "java.sql.ResultSet"%>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>


<h1><center>This is Registered Customer List</center></h1>
<table border ="2" align = "center" cellpadding = "12">
<tr>
<th>Customer Id</th>
<th>First Name</th>
 <th>Middle Name</th>
 <th>Last Name</th>
 <th>Gender</th>
 <th>date of birth</th>
 <th>nationality</th>
 <th>Email Id</th>
 <th>Address</th>
 <th>Country</th>
 <th>Username</th>
 <th>password</th>
 <th>status</th>
 </tr>
 <%
  try
 {
	  Connection con = Demo.createConnection();
  	  String sql =  "select * From registration1";
      PreparedStatement ps = con.prepareStatement(sql);
      ResultSet res = ps.executeQuery();
      while(res.next())
      {
    	   out.println("<tr><td>"+res.getInt(1)+"</td>");
    	   out.println("<td>"+res.getString(2)+"</td>");
    	   out.println("<td>"+res.getString(3)+"</td>");
    	   out.println("<td>"+res.getString(4)+"</td>");
    	   out.println("<td>"+res.getString(5)+"</td>");
    	   out.println("<td>"+res.getString(6)+"</td>");
    	   out.println("<td>"+res.getString(7)+"</td>");
    	   out.println("<td>"+res.getString(8)+"</td>");
    	   out.println("<td>"+res.getString(9)+"</td>");
    	   out.println("<td>"+res.getString(10)+"</td>");
    	   out.println("<td>"+res.getString(11)+"</td>");
    	   out.println("<td>"+res.getString(12)+"</td>");
    	   out.println("<td colspan='2'><a href = 'Edit_controller'>EDIT</td><td><a href= 'DeleteController'>Delete</a></td>");
    	   out.println("</tr>");

      }

 }
 catch(Exception ex)
 {
	   
 }
 
 %>
 </table>
 
</body>
</html>