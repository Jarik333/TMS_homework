package com.tms.lesson5;

public class Office {
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
        John.addWorker();
        John.addWorker();
        John.DirectorSalary();


    }
}
