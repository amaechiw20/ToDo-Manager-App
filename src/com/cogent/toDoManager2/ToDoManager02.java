package com.cogent.toDoManager2;

import java.util.Scanner;

/**
 * 
 * @author: William U. Amaechi
 * @date: 	Jan 16, 2023
 */



public class ToDoManager02 {
	private void menu() { //Menu message to be repeated to user
		System.out.println("*****Menu******");
		System.out.println("1: Print your Name");
		System.out.println("2: Input Tasks");
		System.out.println("3: Arrange Task: Increasing Order");
		System.out.println("4: Arrange Task: Decreasing Order");
		System.out.println("5: Repeat Tasks");
		System.out.println("0: Exit");
		System.out.println("Please enter your choice!");
	}

	public static void main(String[] args) {
		ToDoManager02 manage = new ToDoManager02();
		Scanner sc = new Scanner(System.in);
		int choice;
		System.out.println("To Do Manager");
		do {
			manage.menu();
			choice = sc.nextInt();
			switch (choice) {
			case 1: 
				ToDoManagerDAO02.printName();
				break;
			case 2: 
				System.out.println("Input tasks.");
				ToDoManagerDAO02.inputTasks();
				break;
			case 3: 
				System.out.println("Arrange Tasks in Increasing Order.");
				ToDoManagerDAO02.arrangeIncreasing();
				break;
			case 4:
				System.out.println("Arrange Tasks in Decreasing Order.");
				ToDoManagerDAO02.arrangeDecreasing();
				break;
			case 5:
				System.out.println("Arrange Tasks in Increasing Order.");
				ToDoManagerDAO02.repeatTask();
			default: // Exit Menu
				break;
			}
		}while (choice != 0);
	}
}

