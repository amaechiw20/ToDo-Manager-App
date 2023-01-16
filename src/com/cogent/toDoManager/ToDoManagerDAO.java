package com.cogent.toDoManager;
import java.util.Scanner;
/**
 * 
 * @author: William U. Amaechi
 * @date: 	Jan 16, 2023
 * ToDoManagerDAO tell ToDoManger specific instructions that will be done for each case in our Task Array
 */
public class ToDoManagerDAO {
	// addTask: Adds a Task Bean to Task Array if Task Array is not full
	public static void addTask(Task[] tasks) {
		boolean filled = false;
		if(!filled) {
			Scanner sc = new Scanner(System.in);
			Task t = new Task();
			System.out.println("Please type the name of the Task: ");
			String taskName = sc.nextLine();
			System.out.println("Please type the ID of the Task: ");
			int taskID = sc.nextInt();
			t.setTaskID(taskID);
			t.setTaskName(taskName);
			for(int i = 0; i < tasks.length; i++) {
				if(!filled && tasks[i] == null) {
					tasks[i] = t;if(tasks[i] != null)
					System.out.println(tasks[i].getTaskName());
					filled = true;
				}
			}
		}
		if(filled) {
				System.out.println("Task List is Full");
			}
		}

	//updateTask: Update the TaskID or the TaskName of a Task Bean in our Task Array if the Bean is found in our Array
	public static void updateTask() {
	}

	//deleteTask: Deletes a Task bean from our Task Array if Task Bean is found in Array
	public static void deleteTask() {

	}

	//searchTask: Search for Task Bean in our Task Array and display the TaskID and TaskName of Task Bean if found in Array
	public static void searchTask() {

	}

}
