package com.tms.lesson3;

public class task1 {
    public static void main(String[] args) {
        int[] a= new int[10];
        a[1] = 1;
        a[2] = 1;
        for (int b = 2;b < a.length; b++) {
            a[b] = a[b - 1]+a [b - 2];
        }
        for (int c = 0;c < a.length; c++) {
            System.out.println(a[c]);
        }
    }
}
