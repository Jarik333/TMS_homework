package com.tms.lesson5_6;

import java.util.ArrayList;

public class Office implements SearchWorkerInterface{
    public static void main(String[] args) {
       Worker Jack = new Worker("Jack","Jackson", Employee.Work.WORKER,2);
        Worker Tom = new Worker("Tom","Tompson", Employee.Work.WORKER,1);
        Worker Sam = new Worker("Sam","Simpson", Employee.Work.WORKER,5);
        Director John = new Director("John","Johnson", Employee.Work.DIRECTOR,12);
        Jack.Info();
        Jack.WorkerSalary();
        Tom.Info();
        Tom.WorkerSalary();
        Sam.Info();
        Sam.WorkerSalary();
        John.Info();
        John.addWorker(Jack.name);
        John.addWorker(Tom.name);
        John.DirectorSalary();
        Search(Jack.name, John.workers);

    }



    public static void Search(String name, ArrayList<String> workers) {
        if (workers.contains(name)){
            System.out.println("Yes");
        }
        else{
            System.out.println("Yes");
        }
    }



}
