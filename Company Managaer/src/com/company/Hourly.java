package com.company;

import com.company.Employee;

public class Hourly extends Employee {

    double rate, hours, overtime;

    public Hourly(String fname, String lName, String title, int id, double rate){
        super(fname, lName, title, id);
        this.rate = rate;
    }

    public void hoursWorked(double hours, boolean over){
        if(over){
            this.overtime += hours;
        }else {
            this.hours += hours;
        }
    }

    @Override
    public double calcPay() {
        return rate*hours + rate*1.5*overtime;
    }
}
