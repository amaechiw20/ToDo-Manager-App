package com.cogent.toDoManager;
import java.util.Scanner;
/**
 * 
 * @author: William U. Amaechi
 * @date: 	Jan 16, 2023
 */
public class ToDoManager {
	private void menu() { //Menu message to be repeated to user
		System.out.println("*****Menu******");
		System.out.println("1: Adding a new task");
		System.out.println("2: Updating a new task");
		System.out.println("3: Deleting a new Task");
		System.out.println("4: Searching a new task");
		System.out.println("0: Exit");
		System.out.println("Please enter your choice!");
	}


	public static void main (String [] args) {
		ToDoManager manage = new ToDoManager();
		Scanner sc = new Scanner(System.in);
		System.out.println("To Do Manager");
		Task [] tasks = new Task [5];
		int choice;
		do {
			manage.menu();
			choice = sc.nextInt();
			int searchID;
			switch (choice) {
			case 1:
				ToDoManagerDAO.addTask(tasks);
				break;
			case 2:
				System.out.println("Update which task? Please type task ID: ");
				searchID = sc.nextInt();
				ToDoManagerDAO.updateTask(tasks, searchID);

				break;
			case 3:
				System.out.println("Delete which task? Please type task ID: ");
				searchID = sc.nextInt();
				ToDoManagerDAO.deleteTask(tasks, searchID);
				break;
			case 4:
				System.out.println("Search for which task? Please type task ID: ");
				searchID = sc.nextInt();
				ToDoManagerDAO.searchTask(tasks, searchID);
				break;
			default:
				break;
			}
		}while (choice != 0);
	}
}