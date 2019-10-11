package com.company;

import static org.junit.Assert.*;

public class TestBattery {

    @org.junit.Test
    //Testing Salaried manager assignment
    public void testSalariedManager() {
        Department dept = new Department("test");
        Salaried emp = new Salaried("Bob", "Doe", "Grunt",  1, 2000);
        dept.setManager(emp);
        assertEquals(true,emp.manager);
    }

    @org.junit.Test
    //Testing Hourly manager assignment
    public void testHourlyManager() {
        Department dept = new Department("test");
        Hourly emp = new Hourly("Bob", "Doe", "Grunt",  1, 20);
        dept.setManager(emp);
        assertEquals(true,emp.manager);
    }

    @org.junit.Test
    //Testing Salaried employee functionality
    public void testSalariedEmployee() {
        Salaried emp = new Salaried("Jane", "Doe", "HR recruiter", 1, 100);
        emp.offDays = 14;
        emp.calcDaysWorked(2);
        double pay = emp.calcPay();
        assertEquals(3000, pay, 0);
    }

    @org.junit.Test
    //Testing Salaried employee functionality
    public void testHourlyEmployee() {
        Hourly emp = new Hourly("Jane", "Doe", "HR recruiter", 1, 30);
        emp.hoursWorked(40, false);
        emp.hoursWorked(5,true);
        double pay = emp.calcPay();
        assertEquals(1425, pay, 0);
    }
}