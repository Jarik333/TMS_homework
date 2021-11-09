package com.tms.lesson2;

public class Main6 {
    public static void main(String[] args) {
        int[] a = {3, 5, 2, 7, 1};
        int b;
        boolean sorted = false;
        while(!sorted){
            sorted = true;
            for (int i = 0; i < a.length - 1; i++) {
                if (a[i] > a[i + 1]) {
                    b = a[i];
                    a[i] = a[i + 1];
                    a[i + 1] = b;
                    sorted = false;
                }
            }
            System.out.println(a[0], a[1], a[2], a[3], a[4],);
        }
    }
}
