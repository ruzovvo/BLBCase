package com.db.blb.utils;

import java.io.*;
import java.util.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.db.blb.beans.Trader;

public class DBHelper 
{
	private static Connection connection;
	static String url;
	
	private DBHelper()	{}
         
	public static Connection getConnection()
	{
		if (connection == null)
		{
			try
			{
				String url = "jdbc:mysql://localhost:8888/buylocalbondsdb"; 
				// assuming "DataSource" is your DataSource name
				Class.forName("com.mysql.jdbc.Driver");
	         
				try
				{            	
					connection = DriverManager.getConnection(url,"root","m2d3_vO"); 
					System.out.println("After DriverManager.getConnection " + connection);
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
		}
		else {System.out.println("Singleton is working!!!");}
		return connection;
	}
	
	public static boolean UserLogin(Trader trader)
	{
		try {
			ResultSet rs;
			String query = "select user, pwdHash from traders where user=" + trader.getUsername();
			Statement s = getConnection().createStatement();
			s.executeQuery(query);
			rs = s.getResultSet();
			String pwdHashFromDB = rs.getString(2);
			System.out.println(pwdHashFromDB);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return true;
	}
}