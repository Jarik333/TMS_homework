package com.tms.lesson5;

public class Director extends Employee{
    int countWorker;
    public void addWorker(){
            countWorker++;
    }
    public double DirectorSalary(){
        return Exp * Work.DIRECTOR.Koef * 1000 * countWorker;
    }
}
