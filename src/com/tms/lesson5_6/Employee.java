package com.tms.lesson5_6;

public abstract class Employee extends Person{
    int Exp;

    public enum Work {
        WORKER(1),
        DIRECTOR(2);
        public double Koef;

        Work(double koef) {
            this.Koef = koef;
        }

    }

    public Employee(String name, String surname, Work Profession, int exp) {
        this.Exp = exp;
        this.name = name;
        this.surname = surname;
    }
        public Employee(){

        }
    public void  WorkerSalary() {


            double salary = Exp * Work.WORKER.Koef * 1000;
        System.out.println(salary);
        }
    public void DirectorSalary() {


        double salary = Exp * Work.DIRECTOR.Koef * 1000;
        System.out.println(salary);
    }
    }

