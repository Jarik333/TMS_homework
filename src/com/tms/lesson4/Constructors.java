package com.tms.lesson4;

public class Constructors {
    String name;
    int age;
    Constructors(String name){
        this.name = name;
    }
    Constructors(int age){
        this.age = age;
        Constructors constructors = new Constructors(24);
    }

    public static void main(String[] args) {
        Constructors constructors2 = new Constructors("Jack");
    }
}

