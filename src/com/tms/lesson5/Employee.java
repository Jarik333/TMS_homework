package com.tms.lesson5;

public abstract class Employee extends Person{
    int Exp;

    public enum Work {
        WORKER(1),
        DIRECTOR(2);
        private double Koef;

        Work(double koef) {
            this.Koef = koef;
        }

    }

    public Employee(String name, String surname, Work Profession, int exp) {
        this.Exp = exp;
        this.name = name;
        this.surname = surname;
    }
        public Employee(){}
    public double WorkerSalary() {


            double salary = Exp * Work.WORKER.Koef * 1000;
            return salary;
        }
    public double DirectorSalary() {


        double salary = Exp * Work.DIRECTOR.Koef * 1000;
        return salary;
    }
    }

