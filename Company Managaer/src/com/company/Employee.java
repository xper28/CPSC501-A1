package com.company;

public abstract class Employee {

    String fName, lName, title;
    int id;
    boolean manager;

    public Employee(){

    }

    public Employee(String fname, String lName, String title, int id){
        this.fName = fname;
        this.lName = lName;
        this.title = title;
        this.id = id;
    }

    public Employee(String fname, String lName, int id){
        this.fName = fname;
        this.lName = lName;
        this.id = id;
    }

    public void setfName(String newName){
        this.fName = newName;
    }

    public void setlName(String newName){
        this.lName = newName;
    }

    public void setTitle(String newTitle){
        this.title = newTitle;
    }

    public String getfName(){
        return fName;
    }

    public String getlName(){
        return lName;
    }

    public String getTitle(){
        return title;
    }

    public int getID(){
        return id;
    }

    public abstract double calcPay();



}
