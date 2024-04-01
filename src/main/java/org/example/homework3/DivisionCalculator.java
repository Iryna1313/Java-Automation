package org.example.homework3;

public class DivisionCalculator {
    public static void main(String[] args){
        int dividend = 21;
        int divisor = 4;

        int quotient = dividend / divisor;
        int remainder = dividend % divisor;

        System.out.println("Dividend: " + dividend);
        System.out.println("Divisor: " + divisor);
        System.out.println("Integer part of division: " + quotient);
        System.out.println("Remainder of division: " + remainder);
    }
}