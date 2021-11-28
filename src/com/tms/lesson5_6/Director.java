package com.tms.lesson5_6;

import java.util.ArrayList;

public class Director extends Employee{
    int countWorker;
    public ArrayList<String> workers = new ArrayList<String>();
    public void addWorker(String name){
            countWorker++;
           workers.add(name);
    }
    public void DirectorSalary(){
        System.out.println(Exp * Work.DIRECTOR.Koef * 1000 * countWorker);
    }
    public Director(String name, String surname, Work Profession, int exp){
        this.Exp = exp;
        this.name = name;
        this.surname = surname;
    }
}
