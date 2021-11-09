package com.tms.lesson2;

public class Mane2 {
    public static void main(String[] args) {
        String a = "January";
        String b = "February";
        String c = "March";
        String d = "April";
        String e = "May";
        String f = "June";
        String t = "July";
        String g = "August";
        String h = "September";
        String j = "October";
        String k = "November";
        String s = "December";
        switch (g){
            case "January":
            case "February":
            case "December":
                System.out.println("Winter");
                break;
            case "March":
            case "April":
            case "May":
                System.out.println("Spring");
                break;
            case "June":
            case "July":
            case "August":
                System.out.println("Summer");
                break;
            case "September":
            case "October":
            case "November":
                System.out.println("Autumn");
                break;
            default:
                System.out.println("Error");
        }
    }
}
