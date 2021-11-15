package com.tms.lesson4;


import java.util.Arrays;

public class Arrayss {
    static private int[] SortArrayss(int[] a){
        java.util.Arrays.sort(a);
        return a;
    }
    static private int Max(int[] a){
        int b = 0;
        for(int c = 1; c < a.length;c++) {

            if (a[c] > b) {
                b = a[c];
            }
        }
        return b;
    }
    static private int Index(int a[], int b){
        int index = 0;
        for (int c = 0;c < a.length; c++){
            if (b == a[c]){
                index = c;
                break;
            }
        }
        return index;
    }
    public static void main(String[] args) {
        int b[]= {2,6,8,1};
        SortArrayss(b);
        System.out.println(java.util.Arrays.toString(b));
        System.out.println(Max(b));
        System.out.println(Index(b,8));
    }

}
