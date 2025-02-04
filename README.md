# To-Do List Application

This is a simple To-Do List application built using Java, JSP, and MySQL. The app allows users to add and delete tasks with a clean and modern user interface styled with HTML and CSS.

## Features

- **Add Task**: Users can add a new task with a title and description.
- **Delete Task**: Users can delete tasks from the list.
- **Responsive UI**: The app has a responsive and user-friendly interface.

## Technologies Used

- **Backend**: Java (Servlets, JSP)
- **Database**: MySQL (Task data is stored in a database)
- **Frontend**: HTML, CSS
- **Server**: Apache Tomcat

## Directory Structure

/todo-list-app
|-- /src
|   |-- /com
|   |   |-- /todo
|   |   |   |-- TaskDAO.java         # Handles database operations related to tasks
|   |   |   |-- TaskServlet.java     # Servlet that processes task-related requests
|   |   |   |-- Task.java            # Model representing a task entity
|-- /WebContent
|   |-- index.jsp                   # Main JSP page where tasks are displayed
|   |-- /css
|   |   |-- style.css               # Custom styles for the application
|-- /lib                            # External libraries (e.g., MySQL JDBC driver)
|-- /WEB-INF
|   |-- web.xml                     # Web application configuration
