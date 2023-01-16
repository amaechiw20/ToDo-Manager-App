package com.cogent.toDoManager;

public class Task {
	private int taskID;
	private String taskName;
	
	public Task() {
		this.taskID = 0;
		this.taskName = null;
	}
	
	public Task(int taskID, String taskName) {
		this.taskID = taskID;
		this.taskName = taskName;
	}
}
