package com.tms.lesson8;

import java.util.ArrayList;
import java.util.Scanner;

public class BaseInput {
  public static ArrayList<String> someInput = new ArrayList<>();
    public static void Input() throws InputException{
        Scanner in = new Scanner(System.in);
        String input = in.next();
        if (someInput.size() == 5){
            throw new InputException();
        }
        someInput.add(input);
    }
    public static void Delete() throws DeleteException{
        Scanner in = new Scanner(System.in);
        String deleteInput = in.next();
       int index = someInput.indexOf(deleteInput);
       if (index == -1){
           throw new DeleteException();
       }
       someInput.remove(index);
    }
}
class InputException extends Exception{

    private int number;
    public InputException(){


    }

}
class DeleteException extends Exception {

    private int number;

    public DeleteException() {


    }
}
