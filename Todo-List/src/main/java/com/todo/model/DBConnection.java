package com.todo.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection 
{
	private static final String URL = "jdbc:mysql://localhost:3306/todolist";
	private static final String USER_NAME = "root";
	private static final String USER_PASSWORD = "root";
	
	static
	{
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	public static Connection getConnection()
	{
		try {
			return DriverManager.getConnection(URL, USER_NAME, USER_PASSWORD);
		} 
		catch (SQLException e) 
		{
			e.printStackTrace();
			return null;
		}
	} 
}
