package com.company;

public class Salaried extends Employee {

    int bonus, offDays, days, monthly;

    public Salaried(String fname, String lName, String title, int id, int monthly){
        super(fname, lName, title, id);
        this.monthly = monthly;
    }

    public void worked(int daysMissed){
        int loss = 0;
        if(daysMissed>offDays) {
            loss = offDays - daysMissed;
        }
        days = 30 + loss;
    }

    @Override
    public double calcPay() {
        if(days == 0){
            System.out.println("Employee has not worked this month!");
        }
        return monthly * days;
    }

    public double calcBonus(double percentage){
        return monthly*percentage;
    }
}
