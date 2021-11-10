package com.tms.lesson3;

public class task3 {
    public static void main(String[] args) {
        int[] array = {1, 4, 7, 3, 2};
        int a = 0;
        int b = 0;
        for (int c = 0;c < array.length;c++){
            if ((c + 1) % 2 == 0){
                a += array[c];
            }
            else{
                b += array[c];
            }
        }
        System.out.println(b - a);
    }
}
