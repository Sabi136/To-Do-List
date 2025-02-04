package com.todo.servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.todo.dao.TaskDAO;
import com.todo.model.task;

/**
 * Servlet implementation class TaskServlet
 */
public class TaskServlet extends HttpServlet 
{
	private TaskDAO tdao = new TaskDAO();
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String title = req.getParameter("title");
		String description = req.getParameter("description");
		
		task t = new task();
		t.setTitle(title);
		t.setDescription(description);
		
		tdao.addTask(t);
		resp.sendRedirect("index.jsp");
	}
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String action = req.getParameter("action");

        if (action != null && action.equals("delete")) {
            int taskId = Integer.parseInt(req.getParameter("id").trim());
            tdao.deleteTask(taskId);
        }

        // Redirect to the task list page after deletion
        resp.sendRedirect("index.jsp");
	}
}
