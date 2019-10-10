package com.company;

import java.util.ArrayList;

public class Department {
    String name;
    Manager manager;
    int budget;
    ArrayList<Employee> staff = new ArrayList<>();

    public Department(String name){
        this.name = name;
    }

    public void setManager(Manager manager){
        this.manager = manager;
    }

    public void setBudget(int budget) {
        this.budget = budget;
    }

    public void addStaff(Employee emp){
        staff.add(emp);
    }

    public int calcPayroll(){
        int result = 0;
        for(int i=0; i<staff.size();i++){
            result += staff.get(i).calcPay();
        }
        return result;
    }

    public boolean isInDeficit(){
        if(calcPayroll() > budget){
            return false;
        }
        else {
            return true;
        }
    }
}
