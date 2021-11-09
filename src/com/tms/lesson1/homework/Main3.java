package com.tms.lesson1.homework;

public class Main3 {
    public static void main(String[] args) {
        int a = 3765;
        int b = a / 1000;
        int c = (a - b * 1000) / 100;
        int d = (a - b * 1000 - c * 100) / 10;
        int f = a % 10;
        System.out.print(b + " тысяч, " + c + " сотен, " + d + " десятков, " + f + " единиц.");

    }
}
