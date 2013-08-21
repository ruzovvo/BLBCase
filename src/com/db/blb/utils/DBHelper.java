package com.db.blb.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBHelper 
{
	static Connection con;
	static String url;
         
	public static Connection getConnection()
	{
		try
		{
			String url = "jdbc:odbc:" + "BLBDB"; 
			// assuming "DataSource" is your DataSource name
			Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
         
			try
			{            	
				con = DriverManager.getConnection(url,"blbcaseadmin","blbcasepwd");    								
				// assuming your SQL Server's	username is "username"               
				// and password is "password"
			}
       		catch (SQLException ex)
			{
				ex.printStackTrace();
			}
		}
		catch(ClassNotFoundException e)
		{
			System.out.println(e);
		}
		return con;
	}
}