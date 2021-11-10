package com.tms.lesson3;

public class task2 {
    public static void main(String[] args) {
        int[] array = {2, 4, 4 ,5 , 1};
        int b = 0;
        int c = array[0];
        for(int a = 1; a < array.length;a++){

            if (array[a]>b){
                b = array[a];
            }
            if (array[a]<c){
                c = array[a];
            }
            if (a == array.length - 1 ){
                System.out.println(b + c);
            }
        }

    }
}
