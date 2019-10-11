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
}