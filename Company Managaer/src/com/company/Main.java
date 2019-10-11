package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[]  args) {
		Scanner kbd = new Scanner(System.in);
		//Database replacement
		ArrayList<Department> departments = new ArrayList<>();
		ArrayList<Salaried> salaried = new ArrayList<>();
		ArrayList<Hourly> hourlies = new ArrayList<>();
		System.out.println("Welcome to Company Manager\n choose option to continue" );
		while(true){
			mainMenu();
			int temp = kbd.nextInt();
			if(temp == 1){
				salariedPrompt(kbd, salaried);
			}else if(temp == 2){
				hourlyPrompt(kbd, hourlies);
			}else if(temp == 3){
				deptPrompt(kbd, departments);
			}else if(temp == 4){
				showDepts(departments);
			}else if(temp == 0){
				break;
			}
		}
	}
	public static void mainMenu(){
		System.out.println("1)Create Salaried employee\n" +
				"2)Create hourly employee\n" +
				"3)Create Department\n" +
				"4)View Departments");
		System.out.println("0)Exit");
	}

	public static void salariedPrompt(Scanner kbd, ArrayList<Salaried> salaried){
		System.out.println("Enter first name");
		String fname = kbd.next();
		System.out.println("Enter last name");
		String lname = kbd.next();
		System.out.println("Enter title");
		String title = kbd.next();
		System.out.println("Enter daily salary");
		int monthly = kbd.nextInt();
		System.out.println("Enter id number");
		int id = kbd.nextInt();
		Salaried emp = new Salaried(fname,lname,title,id, monthly);
		salaried.add(emp);
	}

	public static void hourlyPrompt(Scanner kbd, ArrayList<Hourly> hourly){
		System.out.println("Enter first name");
		String fname = kbd.next();
		System.out.println("Enter last name");
		String lname = kbd.next();
		System.out.println("Enter title");
		String title = kbd.next();
		System.out.println("Enter hourly rate");
		double rate = kbd.nextDouble();
		System.out.println("Enter id number");
		int id = kbd.nextInt();
		Hourly emp = new Hourly(fname,lname,title,id, rate);
		hourly.add(emp);
	}

	public static void deptPrompt(Scanner kbd, ArrayList<Department> dep){
		System.out.println("Enter department name");
		String dName = kbd.next();
		Department dept = new Department(dName);
		dep.add(dept);
		System.out.println("Created: " + dept.name + " successfully!");
	}

	public static void showDepts(ArrayList<Department> dep){
		for(int i=0; i<dep.size(); i++){
			System.out.println(i+ ") " + dep.get(i).name);
		}
		System.out.println();
	}

}
