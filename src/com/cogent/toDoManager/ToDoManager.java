package com.cogent.toDoManager;
import java.util.Scanner;
/**
 * 
 * @author: William U. Amaechi
 * @date: 	Jan 16, 2023
 */
public class ToDoManager {
	int i;
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
			switch (choice) {
			case 1:
					ToDoManagerDAO.addTask(tasks);
				break;
			case 2:
				if (tasks != null) {

				}
				else
					System.out.println("No tasks have been recored");
				break;
			case 3:
				if (tasks != null) {

				}
				else
					System.out.println("No tasks have been recored");
				break;
			case 4:
				if (tasks != null) {

				}
				else
					System.out.println("No tasks have been recored");
				break;
			default:
				System.out.println("Please choose: either 0, 1, 2, 3, 4 ");
				break;
			}
		}while (choice != 0);
	}
}