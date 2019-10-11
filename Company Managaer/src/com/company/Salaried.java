package com.company;

public class Salaried extends Employee {

    int bonus, offDays, daysWorked, daily;

    public Salaried(String fname, String lName, String title, int id, int daily){
        super(fname, lName, title, id);
        this.daily = daily;
    }

    public void calcDaysWorked(int daysMissed){
        int loss = 0;
        if(daysMissed>offDays) {
            loss = offDays - daysMissed;
        }
        daysWorked = 30 + loss;
    }

    @Override
    public double calcPay() {
        if(daysWorked == 0){
            System.out.println("Employee has not worked this month!");
        }
        return daily * daysWorked;
    }

    public double calcBonus(double percentage){
        return daily*percentage;
    }
}
