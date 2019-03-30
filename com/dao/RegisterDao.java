package com.dao;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.*;
import com.bean.Registrationbean;
import com.util.Demo;
import java.sql.ResultSet;


public class RegisterDao {

	public boolean registerCustomer(Registrationbean s) throws SQLException
	
	{
		Connection con = Demo.createConnection();
		String sql =  "insert into registration1 value(0,?,?,?,?,?,?,?,?,?,?,?)";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, s.getFname());
		ps.setString(2, s.getMname());
		ps.setString(3,s.getLname());
		ps.setString(4, s.getGender());
		ps.setString(5, s.getDate());
		ps.setString(6, s.getNationality());
		ps.setString(7,s.getEmail());
		ps.setString(8,s.getAddress());
		ps.setString(9,s.getCountry());
		ps.setString(10, s.getUsername());
		ps.setString(11,s.getPassword());
		int i = ps.executeUpdate();
		//System.out.println(i);
		if(i>0)
		{
			return true;
		}
	    return true;
		 
	}
	/*public boolean viewData()
	{
		 List<Registrationbean> list = new ArrayList<Registrationbean>();
		 try
		 {
			  Connection con = Demo.createConnection();
			  String sql = "select* from registration1";
			  PreparedStatement ps = con.prepareStatement(sql);
			  ResultSet res = ps.executeQuery();
			  while(res.next())
			  {
				  list.add(new Registrationbean(res.getInt("custid"),res.getString("fname"),res.getString("mname"),res.getString("lname"),res.getString("gender"),res.getString("date"),res.getString("nationality"),res.getString("email"),res.getString("address"),res.getString("country"),res.getString("username"),res.getString("password")));
			  }
			  
			
			  
		 }
		 catch(Exception e)
		 {
			  e.getMessage();
		 }
		 return list;
	}*/
	public boolean  deleteCustomer(int id) throws SQLException
	{
		  
			    Connection con = Demo.createConnection();
			    String sql = "delete from registration1 where custid="+id;
			    PreparedStatement ps = con.prepareStatement(sql);
			    int i = ps.executeUpdate();
			    if(i>0)
			    {
			    	return true;
			    }
			    return true;
			    
	}
	public static int Update(Registrationbean s) throws SQLException
	{
		int status=0;
		try
		{
		Connection  con = Demo.createConnection();
		String sql = "update registration1 set fname =?, mname=?,lname=?,gender= ?,date=?,nationality=?,email=?,address=?,country=?,username=?,password=? where custid=?";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1,s.getFname());
		ps.setString(2, s.getMname());
		ps.setString(3, s.getLname());
		ps.setString(4,s.getGender());
		ps.setString(5,s.getDate());
		ps.setString(6,s.getNationality());
		ps.setString(7,s.getEmail());
		ps.setString(8,s.getAddress());
		ps.setString(9,s.getCountry());
		ps.setString(10,s.getUsername());
		ps.setString(11,s.getPassword());
		ps.setInt(12, s.getCustid());
		status = ps.executeUpdate();
		con.close();
	    }
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
	 return status;	
	}
	public static Registrationbean getCustomerId(int custid)
	{
		Registrationbean e = new Registrationbean();
		try
		{
			Connection con = Demo.createConnection();
			String sql = "select * from registration1 where custid=?";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setInt(1, custid);
			ResultSet res = ps.executeQuery();
			while(res.next())
			{
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

				 e.setCustid(res.getInt(1));
				 e.setFname(res.getString(2));
				 e.setMname(res.getString(3));
				 e.setLname(res.getString(4));
				 e.setGender(res.getString(5));
				 e.setDate(res.getString(6));
				 e.setNationality(res.getString(7));
				 e.setEmail(res.getString(8));
				 e.setAddress(res.getString(9));
				e.setCountry(res.getString(10));
				 e.setUsername(res.getString(11));
				 e.setPassword(res.getString(12));
				 
			}
			con.close();
			
		}
		catch(Exception e1)
		{
			e1.printStackTrace();
		}
		return e;
		
	}
	public static List<Registrationbean> getAllEmployees() {
		// TODO Auto-generated method stub
		List<Registrationbean> list = new ArrayList<>();
		try
		{
			Connection con = Demo.createConnection();
			PreparedStatement ps = con.prepareStatement("select * from registration1");
			ResultSet rs = ps.executeQuery();
			while(rs.next())
			{
				Registrationbean e = new Registrationbean();
				e.setCustid(rs.getInt(1));
				e.setFname(rs.getString(2));
				e.setMname(rs.getString(3));
				e.setLname(rs.getString(4));
				e.setGender(rs.getString(5));
				e.setDate(rs.getString(6));
				e.setNationality(rs.getString(7));
				e.setEmail(rs.getString(8));
				e.setAddress(rs.getString(9));
				e.setCountry(rs.getString(10));
				e.setUsername(rs.getString(11));
				e.setPassword(rs.getString(12));
				list.add(e);
				
			}
			con.close();
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return list;
	}

}
