package org.example.homework3;

public class SimpleCalculator {
    public static void main(String[] args) {
        int firstNumber = 15;
        int secondNumber = 2;

        int sum = firstNumber + secondNumber;
        System.out.println("Sum: " + sum);

        int subtraction = firstNumber - secondNumber;
        System.out.println("Subtraction: " + subtraction);

        int multiplication = firstNumber * secondNumber;
        System.out.println("Multiplication: " + multiplication);

        double division = (double) firstNumber / secondNumber;
        System.out.println("Division: " + division);
    }
}