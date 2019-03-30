package com.service;

import java.sql.SQLException;

import com.bean.Registrationbean;
import com.dao.RegisterDao;

public class RegisterService {

	public static boolean registerCustomer(Registrationbean s)throws ClassNotFoundException, SQLException
	{
		  RegisterDao dao = new RegisterDao();
		  boolean status = dao.registerCustomer(s);
		  return status;
	}
	public static boolean deleteCustomer(int id)throws ClassNotFoundException,SQLException
	{
		  RegisterDao dao =new  RegisterDao();
		  boolean status = dao.deleteCustomer(id);
		  return status;
	}
	
	
 
}
