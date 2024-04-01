package org.example.homework4;

import java.util.Scanner;
public class MinutesToYearsAndDays {
    public static final int MINUTES_IN_YEARS = 365 * 24 * 60;
    public static final int MINUTES_IN_DAYS = 24 * 60;

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Please enter minutes: ");
        long inputMinutes = in.nextLong();
        printYearsAndDays(inputMinutes);
    }

    public static void printYearsAndDays(long minutes) {
        if (minutes < 0) {
            System.out.println("Invalid Value!");
        } else {
            long yy = minutes / MINUTES_IN_YEARS;
            long dd = (minutes - yy * MINUTES_IN_YEARS) / MINUTES_IN_DAYS;
            System.out.println(minutes + " minutes = " + yy + " years and " + dd + " days");
        }
    }
}