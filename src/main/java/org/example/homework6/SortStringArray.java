package org.example.homework6;

import java.util.Scanner;

public class SortStringArray {
    public static void printArray(String[] array){
        System.out.println("Sorted array ");
        for (String str : array){
            System.out.println(str);
        }
    }

    public static void sortArrayByStringLength(String[] array){
        for (int i = 0; i < array.length - 1; i++){
            for (int j = 0; j < array.length - 1 - i; j++){
                if (array[j].length() > array[j + 1].length()){
                    String temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }

    public static void fillTheArray(Scanner scanner, String[] array){
        for (int i = 0; i < array.length; i++){
            System.out.println("Enter a string element # " + (i + 1) + ": ");
            array[i] = scanner.nextLine();
        }
    }

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of elements in the array ");
        int length = Integer.parseInt(scanner.nextLine());

        String[] array = new String[length];
        fillTheArray(scanner, array);
        sortArrayByStringLength(array);
        printArray(array);
    }
}
