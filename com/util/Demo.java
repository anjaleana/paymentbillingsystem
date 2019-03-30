package com.util;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
public class Demo
{
	
	  public static Connection createConnection()
	  {
	  Connection con=null;
	  try
	  {
		  
		  try{
			   Class.forName("com.mysql.jdbc.Driver");
			   
			  
		  }
		  catch(ClassNotFoundException e)
		  {
			  e.printStackTrace();
		  }
		  con = DriverManager.getConnection("jdbc:mysql://localhost:3306/hibernate","root","anjali");
		  System.out.println("printed Connection obect:"+con);
	  }
	  catch(Exception e)
	  {
		  e.printStackTrace();
	  
	  }
	  
	  return con;
	  
}
		  
}
