package com.tms.lesson4;

public class User {
    public static void main(String[] args) {
    Person.TOM.GetName();
    Person.JACK.UpAge();
    Person.JACK.GetInfo();
    }
    public class Adress {

    }

    public enum Person{
        TOM("Tom","Tommen",12,"male"),
        JACK("Jack","Lincoln",44,"male");
        private String name;
        private String surname;
        private int age;
        private String sex;
        Person(String name,String surname,int age,String sex){
            this.age = age;
            this.name = name;
            this.sex = sex;
            this.surname = surname;
        }
        void GetName(){
            System.out.println(this.name);
            System.out.println(this.surname);
        }
        void UpAge(){
            this.age += 1;
        }
        void GetInfo(){
            System.out.println(this.name);
            System.out.println(this.age);
            System.out.println(this.surname);
            System.out.println(this.sex);

        }
    }

}
