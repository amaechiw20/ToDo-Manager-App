package com.cogent.toDoManager;
import java.io.Serializable;
/**
 * 
 * @author: William U. Amaechi
 * @date: 	Jan 16, 2023
 * 
 * Task beans holds the TaskID and the TaskName that our client will use in ToDoManager
 */
public class Task implements Serializable {
	private int taskID; // The ID number for this Task Bean
	private String taskName; // The name for this Task Bean
	
	public Task() { //Defauly
		this.taskID = 0;
		this.taskName = null;
	}
	
	//getters for TaskID and TaskName
	public int getTaskID() {
		return taskID;
	}
	public String getTaskName(){
		return taskName;
	}
	
	//setters for TaskID and TaskName
	public void setTaskID(int taskID) {
		this.taskID = taskID;
	}
	
	public void setTaskName(String taskName) {
		this.taskName = taskName;
		
	}
}
