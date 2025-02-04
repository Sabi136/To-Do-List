package com.todo.model;

public class task 
{
	private int id;
	private String title;
	private String description;
	private String status;
	
	public task(int id, String title, String description, String status) {
		super();
		this.id = id;
		this.title = title;
		this.description = description;
		this.status = status;
	}

	public task(String title, String description, String status) {
		super();
		this.title = title;
		this.description = description;
		this.status = status;
	}

	public task(String title, String description) {
		super();
		this.title = title;
		this.description = description;
	}
	
	public task() {
		super();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
}
