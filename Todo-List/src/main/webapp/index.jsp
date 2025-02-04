<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import = "com.todo.dao.TaskDAO, java.util.List, com.todo.model.task" %>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<title>To-Do List</title>
<style>
    /* Basic reset */
    * {
        margin: 0;
        padding: 0;
        box-sizing: border-box;
    }

    /* Body background with darker gradient */
    body {
        font-family: Arial, sans-serif;
        background: linear-gradient(135deg, #006666 0%, #6a4c93 100%);
        color: #fff;
        margin: 20px;
    }

    /* Adjusted Heading Color */
    h2 {
        text-align: center;
        color: #f1f1f1;  /* Lighter color for better visibility */
        margin-bottom: 20px;
    }

    /* Form Styling */
    form {
        background-color: #fff;
        padding: 20px;
        border-radius: 8px;
        box-shadow: 0 4px 6px rgba(0, 0, 0, 0.1);
        margin-bottom: 30px;
        max-width: 400px;
        margin-left: auto;
        margin-right: auto;
    }

    input[type="text"] {
        width: calc(100% - 20px);
        padding: 10px;
        margin-bottom: 10px;
        border: 1px solid #ccc;
        border-radius: 4px;
        font-size: 16px;
    }

    input[type="submit"] {
        background-color: #4CAF50;
        color: white;
        border: none;
        padding: 12px 20px;
        font-size: 16px;
        border-radius: 4px;
        cursor: pointer;
        width: 100%;
        margin-top: 10px;
    }

    input[type="submit"]:hover {
        background-color: #45a049;
    }

    /* Table Styling */
    table {
        width: 80%;
        margin: 0 auto;
        border-collapse: collapse;
    }

    th, td {
        padding: 12px;
        text-align: left;
        border-bottom: 1px solid #ddd;
    }

    th {
        background-color: #555;
    	color: #ffeb3b; 
    }

    /* Table Row Hover Effect */
    tr:hover {
        background-color: #555; /* Darker shade for better contrast */
        color: white;  /* Ensure the text is readable */
    }

    a {
        color: #d9534f;
        text-decoration: none;
        font-weight: bold;
    }

    a:hover {
        text-decoration: underline;
    }
</style>
</head>
<body>
    <h2>To-Do List</h2>
    <form action="TaskServlet" method="post">
        <input type="text" name="title" placeholder="Task Title" required>
        <input type="text" name="description" placeholder="Description">
        <input type="submit" value="Add Task">
    </form>
    
    <!-- Fetch and Display Tasks -->
    <%
        TaskDAO tdao = new TaskDAO();
        List<task> tl = tdao.getTaks();  // Ensure getTasks() is used instead of getTaks()
    %>
    
    <table>
        <tr>
            <th>ID</th>
            <th>Title</th>
            <th>Description</th>
            <th>Action</th>
        </tr>
        
        <% for (task t : tl) { %>
        <tr>
            <td><%= t.getId() %></td>
            <td><%= t.getTitle() %></td>
            <td><%= t.getDescription() %></td>
            <td>
                <a href="TaskServlet?action=delete&id=<%= t.getId() %>">Delete</a>
            </td>        
        </tr>
        <% } %>
    </table>
</body>
</html>
