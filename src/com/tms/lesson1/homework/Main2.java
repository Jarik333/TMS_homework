package com.tms.lesson1.homework;

public class Main2 {
    public static void main(String[] args) {
        int a = 3;
        int b = 10;
        if (b % a == 0) {
            System.out.print("Деление без остатка.");
        }
        else {
            int c = b % a;
            int d = b / a;
            System.out.println("Целая часть:" + d + " Остаток:" + c );
        }
    }
}
