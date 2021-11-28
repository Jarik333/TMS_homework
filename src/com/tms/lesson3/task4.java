package com.tms.lesson3;

public class task4 {
    public static void main(String[] args) {
        int a[]={2,4,6,6,7};
        int MaxCount = 0;
        int num = 0;
        for (int i = 0; i < a.length; i++) {
            int count = 0;
            for (int j = 0; j < a.length; j++) {
                if (a[i] == a[j]) {
                    count++;
                }
                if (count > MaxCount) {
                    MaxCount = count;
                    num = a[i];
                }
            }
        }
        System.out.println(num);
        System.out.println(MaxCount);
    }
}
