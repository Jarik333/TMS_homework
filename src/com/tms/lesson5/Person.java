package com.tms.lesson5;

public class Person {
    public String name;
    public String surname;
    public Person(String name,String surname){
        this.name = name;
        this.surname = surname;
    }
    public Person(){

    };
    public void Info(){
        System.out.println(name + surname);
    }
}
