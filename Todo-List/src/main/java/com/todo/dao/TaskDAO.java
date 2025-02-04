package com.todo.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.todo.model.DBConnection;
import com.todo.model.task;

public class TaskDAO 
{
	public void addTask(task task) 
	{
		String AddTask = "insert into task (title,description,status) values (?,?,?)";
		try
		{
			Connection con = DBConnection.getConnection();
			PreparedStatement pstmt = con.prepareStatement(AddTask);
			pstmt.setString(1, task.getTitle());
			pstmt.setString(2, task.getDescription());
			pstmt.setString(3, task.getStatus());
			pstmt.executeUpdate();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	public List<task> getTaks()
	{
		List<task> tl = new ArrayList<>();
		String select_all = "select * from task";
		
		try
		{
			Connection con = DBConnection.getConnection();
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery(select_all);
			
			while(rs.next())
			{
				task task = new task(rs.getInt("id"),
									 rs.getString("title"),
									 rs.getString("description"),
									 rs.getString("status"));
				tl.add(task);
			}			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		return tl;
	}
	
	public void deleteTask(int id)
	{
		String deleteTask = "delete from task where id = ?";
		try
		{
			Connection con = DBConnection.getConnection();
			PreparedStatement pstmt = con.prepareStatement(deleteTask);
			pstmt.setInt(1, id);
			pstmt.executeUpdate();	
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
