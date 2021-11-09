package com.tms.lesson2;

public class Main5 {
    public static void main(String[] args) {
        int[] array = {2,5,7,3,0,1};
        int c = 0;
        int d = 0;
        for (int i = 1; i < array.length; i++){
            int a = array[i];
            if (array[i] > array[i - 1]) {
                c = array[i];
            }
            if (d < c){
                d = c;
            }

        }
        System.out.println(d);
    }
}
