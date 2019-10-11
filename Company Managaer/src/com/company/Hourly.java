package com.company;

import com.company.Employee;

public class Hourly extends Employee {

    double rate, hours, overtime;
    boolean manager = false;

    public Hourly(String fname, String lName, String title, int id, double rate){
        super(fname, lName, title, id);
        this.rate = rate;
    }

    public void hours(double hours, boolean over){
        if(over){
            this.overtime += hours;
        }
        this.hours += hours;
    }

    @Override
    public double calcPay() {
        return rate*hours + rate*1.5*overtime;
    }
}
