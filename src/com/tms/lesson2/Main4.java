package com.tms.lesson2;

import java.util.Scanner;

public class Main4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = 0;
        if (a > b) {
            for (b = b; b < a; b++) {
                if (b % 3 == 0) {
                     c += b;
                }
            }
            System.out.println(c);
        } else {
            for (a = a; a < b; a++) {
                if (a % 3 == 0) {
                     c += a;
                }
            }
            System.out.println(c);
        }
    }
}
