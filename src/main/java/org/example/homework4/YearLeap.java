package org.example.homework4;

import java.util.Scanner;

public class YearLeap {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Please enter year: ");
        int year = in.nextInt();
        boolean yearsResult = isLeapYear(year);
        System.out.println(year + ": " + yearsResult);
    }
    public static boolean isLeapYear(int years) {
        if (years <= 1 || years >= 9999){
            return false;
        }
        if ((years % 4 == 0 && years % 100 != 0) || (years % 400 == 0)) {
            return true;
        } else return false;
    }
}
