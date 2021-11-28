package com.tms.lesson8;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws InputException, DeleteException {
        System.out.println("Для завершения работы введите 0");
        System.out.println("Для добавления элемента введите 1");
        System.out.println("Для удаления элемента введите 2");
       for (int i = 1;;i++) {
           Scanner in = new Scanner(System.in);
           int menu = in.nextInt();
           try {

           if (menu == 1) {
               BaseInput.Input();
           }
       }
       catch (InputException exception){
           System.out.println("Память переполнена");
       }
           try {


               if (menu == 2) {
                   BaseInput.Delete();
               }
           }
           catch (DeleteException exception){
               System.out.println("Обращение к несуществующему обьекту");
           }
           if (menu == 0){
                break;
           }
       }




    }
}
