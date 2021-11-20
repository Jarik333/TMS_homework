package com.tms.lesson5;

public abstract class Employee {
    int Exp;

    public enum Work {
        WORKER(1),
        DIRECTOR(2);
        private double Koef;

        Work(double koef) {
            this.Koef = koef;
        }

    }

    public Employee(Work Profession, int exp) {
        this.Exp = exp;
    }

    public double WorkerSalary() {


            double salary = Exp * Work.WORKER.Koef * 1000;
            return salary;
        }
    public double DirectorSalary() {


        double salary = Exp * Work.DIRECTOR.Koef * 1000;
        return salary;
    }
    }

