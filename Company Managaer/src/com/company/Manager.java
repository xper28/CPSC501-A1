package com.company;

public class Manager extends Employee {

    double monthly;

    public Manager(String fname, String lName, int id, int salary){
        super(fname, lName, id);
        this.monthly = salary;
    }

    @Override
    public double calcPay() {
        return monthly;
    }
}
