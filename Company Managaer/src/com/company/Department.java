package com.company;

import java.util.ArrayList;

public class Department {
    String name;
    Employee manager;
    int budget;
    ArrayList<Employee> staff = new ArrayList<>();

    public Department(String name){
        this.name = name;
    }

    public void setManager(Salaried manager){
        this.manager = manager;
        manager.manager = true;
    }

    public void setManager(Hourly manager){
        this.manager = manager;
        manager.manager = true;
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
