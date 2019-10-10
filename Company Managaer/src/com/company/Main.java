package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	Scanner kbd = new Scanner(System.in);
	//Database replacement
	ArrayList<Department> dep = new ArrayList<>();
	ArrayList<Salaried> salaried = new ArrayList<>();
	ArrayList<Hourly> hourly = new ArrayList<>();
	System.out.println("Welcome to Company Manager\n press any key then enter to continue" );

	while(true){
		System.out.println("1)Create Salaried employee\n" +
				"2)Create hourly employee\n" +
				"3)Create Department\n" +
				"4)Create Manager\n" +
				"5)View Departments\n");
		System.out.println("0)Exit");
		//Replace temp with query
		int temp = kbd.nextInt();
		//if(kbd.next())
		if(temp == 1){
			System.out.println("Enter first name");
			String fname = kbd.next();
			System.out.println("Enter last name");
			String lname = kbd.next();
			System.out.println("Enter title");
			String title = kbd.next();
			System.out.println("Enter monthly salary");
			int monthly = kbd.nextInt();
			System.out.println("Enter id number");
			int id = kbd.nextInt();
			Salaried emp = new Salaried(fname,lname,title,id, monthly);
			salaried.add(emp);
		}else if(temp == 2){
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
		}else if(temp == 3){
			System.out.println("Enter department name");
			String dName = kbd.next();
			Department dept = new Department(dName);
			dep.add(dept);
			System.out.println("Created: " + dept.name + " successfully!");
		}else if(temp == 4){
			System.out.println("Enter Manager's first name");
			String fname = kbd.next();
			System.out.println("Enter Manager's last name");
			String lname = kbd.next();
			System.out.println("Enter Manager's id");
			int id = kbd.nextInt();
			System.out.println("Enter Manager's salary");
			int pay = kbd.nextInt();
			Manager m = new Manager(fname, lname, id, pay);
			System.out.println("Added: " + m.getfName() + " " + m.getlName() + " successfully!");
		}else if(temp == 5){
			for(int i=0; i<dep.size(); i++){
				System.out.println(i+ ") " + dep.get(i).name);
			}
		}else if(temp == 0){
			break;
		}
    }
    }
}
