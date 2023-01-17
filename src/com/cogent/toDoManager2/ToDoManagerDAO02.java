package com.cogent.toDoManager2;

import java.util.Scanner;

import com.cogent.toDoManager.Task;

public class ToDoManagerDAO02 {
	static Task task1 = new Task();
	static Task task2 = new Task();
	static Task task3 = new Task();
	
	public static void printName() {
		Scanner sc = new Scanner(System.in);
		System.out.println("What is your name?");
		String name = sc.nextLine();
		System.out.println("Hello " + name);
	}

	public static void inputTasks() {
		Scanner sc = new Scanner(System.in);
		String taskName;
		int taskID;
		System.out.println("1. Please input Task Name and Task ID.");
		System.out.println("Task Name: ");
		taskName = sc.nextLine();
		System.out.println("Task ID: ");
		taskID = sc.nextInt();
		sc.nextLine();
		task1.setTaskName(taskName);
		task1.setTaskID(taskID);
		System.out.println("2. Please input Task Name and Task ID.");
		System.out.println("Task Name: ");
		taskName = sc.nextLine();
		System.out.println("Task ID: ");
		taskID = sc.nextInt();
		sc.nextLine();
		task2.setTaskName(taskName);
		task2.setTaskID(taskID);
		System.out.println("3. Please input Task Name and Task ID.");
		System.out.println("Task Name: ");
		taskName = sc.nextLine();
		System.out.println("Task ID: ");
		taskID = sc.nextInt();
		sc.nextLine();
		task3.setTaskName(taskName);
		task3.setTaskID(taskID);
	}
	
	public static void arrangeIncreasing() {
		if (task1.getTaskID() <= task2.getTaskID() && task2.getTaskID() <= task3.getTaskID()) {
			System.out.println("Task " + task3.getTaskID() + " : " + task3.getTaskName());
			System.out.println("Task " + task2.getTaskID() + " : " + task2.getTaskName());
			System.out.println("Task " + task1.getTaskID() + " : " + task1.getTaskName());
		}
		else if (task1.getTaskID() <= task3.getTaskID() && task3.getTaskID() <= task2.getTaskID()) {
			System.out.println("Task " + task2.getTaskID() + " : " + task2.getTaskName());
			System.out.println("Task " + task3.getTaskID() + " : " + task3.getTaskName());
			System.out.println("Task " + task1.getTaskID() + " : " + task1.getTaskName());
		}
		else if (task2.getTaskID() <= task1.getTaskID() && task1.getTaskID() <= task3.getTaskID()) {
			System.out.println("Task " + task3.getTaskID() + " : " + task3.getTaskName());
			System.out.println("Task " + task1.getTaskID() + " : " + task1.getTaskName());
			System.out.println("Task " + task2.getTaskID() + " : " + task2.getTaskName());
		}		
		else if (task2.getTaskID() <= task3.getTaskID() && task3.getTaskID() <= task1.getTaskID()) {
			System.out.println("Task " + task1.getTaskID() + " : " + task1.getTaskName());
			System.out.println("Task " + task3.getTaskID() + " : " + task3.getTaskName());
			System.out.println("Task " + task2.getTaskID() + " : " + task2.getTaskName());
		}
		else if (task3.getTaskID() <= task1.getTaskID() && task1.getTaskID() <= task2.getTaskID()) {
			System.out.println("Task " + task2.getTaskID() + " : " + task2.getTaskName());
			System.out.println("Task " + task1.getTaskID() + " : " + task1.getTaskName());
			System.out.println("Task " + task3.getTaskID() + " : " + task3.getTaskName());
		}
		else if (task3.getTaskID() <= task2.getTaskID() && task2.getTaskID() <= task1.getTaskID()) {
			System.out.println("Task " + task1.getTaskID() + " : " + task1.getTaskName());
			System.out.println("Task " + task2.getTaskID() + " : " + task2.getTaskName());
			System.out.println("Task " + task3.getTaskID() + " : " + task3.getTaskName());
		}
	}
	
	public static void arrangeDecreasing() {
		if (task1.getTaskID() <= task2.getTaskID() && task2.getTaskID() <= task3.getTaskID()) {
			System.out.println("Task " + task1.getTaskID() + " : " + task1.getTaskName());
			System.out.println("Task " + task2.getTaskID() + " : " + task2.getTaskName());
			System.out.println("Task " + task3.getTaskID() + " : " + task3.getTaskName());
		}
		else if (task1.getTaskID() <= task3.getTaskID() && task3.getTaskID() <= task2.getTaskID()) {
			System.out.println("Task " + task1.getTaskID() + " : " + task1.getTaskName());
			System.out.println("Task " + task3.getTaskID() + " : " + task3.getTaskName());
			System.out.println("Task " + task2.getTaskID() + " : " + task2.getTaskName());
		}
		else if (task2.getTaskID() <= task1.getTaskID() && task1.getTaskID() <= task3.getTaskID()) {
			System.out.println("Task " + task2.getTaskID() + " : " + task2.getTaskName());
			System.out.println("Task " + task1.getTaskID() + " : " + task1.getTaskName());
			System.out.println("Task " + task3.getTaskID() + " : " + task3.getTaskName());
		}		
		else if (task2.getTaskID() <= task3.getTaskID() && task3.getTaskID() <= task1.getTaskID()) {

			System.out.println("Task " + task2.getTaskID() + " : " + task2.getTaskName());
			System.out.println("Task " + task3.getTaskID() + " : " + task3.getTaskName());
			System.out.println("Task " + task1.getTaskID() + " : " + task1.getTaskName());
		}
		else if (task3.getTaskID() <= task1.getTaskID() && task1.getTaskID() <= task2.getTaskID()) {
			System.out.println("Task " + task3.getTaskID() + " : " + task3.getTaskName());
			System.out.println("Task " + task1.getTaskID() + " : " + task1.getTaskName());
			System.out.println("Task " + task2.getTaskID() + " : " + task2.getTaskName());
			
		}
		else if (task3.getTaskID() <= task2.getTaskID() && task2.getTaskID() <= task1.getTaskID()) {
			System.out.println("Task " + task3.getTaskID() + " : " + task3.getTaskName());
			System.out.println("Task " + task2.getTaskID() + " : " + task2.getTaskName());
			System.out.println("Task " + task1.getTaskID() + " : " + task1.getTaskName());
		}
	}
	
	public static void repeatTask(){

			if(task1.getTaskName().equals(task2.getTaskName())){
				System.out.println("Task " +  task1.getTaskID() + " and "  + "Task " +  task2.getTaskID() + " repeat: " + task1.getTaskName());
			}
			if(task1.getTaskName().equals(task3.getTaskName())){
				System.out.println("Task " +  task1.getTaskID() + " and "  + "Task " +  task3.getTaskID() + " repeat: " + task1.getTaskName());
			}
			if(task2.getTaskName().equals(task3.getTaskName())){
				System.out.println("Task " +  task2.getTaskID() + " and "  + "Task " +  task3.getTaskID() + " repeat: " + task1.getTaskName());
			}
		
	}
}

