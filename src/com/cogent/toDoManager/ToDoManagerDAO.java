package com.cogent.toDoManager;
import java.util.Scanner;
/**
 * 
 * @author: William U. Amaechi
 * @date: 	Jan 16, 2023
 * 
 * ToDoManagerDAO tell ToDoManger specific instructions that will be done for each case in our Task Array
 */
public class ToDoManagerDAO {
	// addTask: Adds a Task Bean to Task Array if Task Array is not full
	public static void addTask(Task[] tasks) {
		boolean fill = true;
		if(fill) {
			Scanner sc = new Scanner(System.in);
			Task t = new Task();
			System.out.println("Please type the name of the Task: ");
			String taskName = sc.nextLine();
			System.out.println("Please type the ID of the Task: ");
			int taskID = sc.nextInt();
			t.setTaskID(taskID);
			t.setTaskName(taskName);
			for(int i = 0; i < tasks.length; i++) {
				if(fill && tasks[i] == null) {
					tasks[i] = t;
					fill = false;
					System.out.println("Task " + tasks[i].getTaskID() + ": " + tasks[i].getTaskName() + " has been added");
				}
			}
		}
		if(fill == true) {
			System.out.println("Task List is Filled");
		}
	}

	//updateTask: Update the TaskID or the TaskName of a Task Bean in our Task Array if the Bean is found in our Array
	public static void updateTask(Task [] tasks, int id) {
		int newID;
		String newName;
		boolean notFound = true;
		Scanner sc = new Scanner(System.in);
		for(int i = 0; i < tasks.length; i++) {
			if ((tasks[i] != null) && (tasks[i].getTaskID() == id)) {
				System.out.println("Change Task Name to: ");
				newName = sc.nextLine();
				tasks[i].setTaskName(newName);
				System.out.println("Change Task ID to: ");
				newID = sc.nextInt();
				tasks[i].setTaskID(newID);
				System.out.println("Task " + id + " has been updated to Task " + tasks[i].getTaskID() + ": " + tasks[i].getTaskName());
				notFound = false;
			}
		}
		if(notFound) {
			System.out.println("Task " + id + " has not been found");
		}
	}

	//deleteTask: Deletes a Task bean from our Task Array if Task Bean is found in Array
	public static void deleteTask(Task [] tasks, int id) {
		boolean notFound = true;
		Scanner sc = new Scanner(System.in);
		for(int i = 0; i < tasks.length; i++) {
			if ((tasks[i] != null) && (tasks[i].getTaskID() == id)) {
				System.out.println("Task " + tasks[i].getTaskID() + ": " + tasks[i].getTaskName() + "has been deleted");
				tasks [i] = null;
				notFound = false;
			}
		}
		if(notFound) {
			System.out.println("Task " + id + " has not been found");
		}
	}



	//searchTask: Search for Task Bean in our Task Array and display the TaskID and TaskName of Task Bean if found in Array
	public static void searchTask(Task [] tasks, int id) {
		boolean notFound = true;
		Scanner sc = new Scanner(System.in);
		for(int i = 0; i < tasks.length; i++) {
			if ((tasks[i] != null) && (tasks[i].getTaskID() == id)) {
				System.out.println("Task "  + tasks[i].getTaskID() + ": " + tasks[i].getTaskName());
				notFound = false;
			}

		}
		if(notFound) {
			System.out.println("Task " + id + " has not been found");
		}
	}
}

