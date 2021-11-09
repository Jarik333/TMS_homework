package com.tms.lesson2;

public class Main {
    public static void main(String[] args) {
        char a = 'a';
        char b = 'b';
        char c = 'c';
        char e = 'e';
        switch (e){
            case 'e':
            case 'a':
                System.out.println("Гласная");
                break;
            case 'b':
            case 'c':
                System.out.println("Согласная");
                break;
            default:
                System.out.println("Неверное значение");
        }
    }
}
