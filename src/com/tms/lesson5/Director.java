package com.tms.lesson5;

public class Director extends Employee{
    int countWorker;
    public void addWorker(){
            countWorker++;
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
