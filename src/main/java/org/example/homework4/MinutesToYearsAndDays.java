package org.example.homework4;

import java.util.Scanner;

public class MinutesToYearsAndDays {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Please enter minutes: ");
        long inputMinutes = in.nextLong();
        printYearsAndDays(inputMinutes);
    }
    public static final int Minutes_In_Years = 365 * 24 * 60;
    public static final int Minutes_In_Days = 24 * 60;

    public static void printYearsAndDays(long minutes) {
        if (minutes < 0) {
            System.out.println("Invalid Value!");
        } else {
            long yy = minutes / Minutes_In_Years;
            long dd = (minutes - yy * Minutes_In_Years) / Minutes_In_Days;
            System.out.println(minutes + " minutes = " + yy + " years and " + dd + " days");
        }
    }
}