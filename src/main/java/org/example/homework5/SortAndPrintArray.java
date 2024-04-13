package org.example.homework5;

import java.util.Random;

public class SortAndPrintArray {
    public static int[] getIntegers(int size){
        int[] array = new int[size];
        Random random = new Random();
        for (int i = 0; i < size; i++){
            array[i] = random.nextInt(100);
        }
        return array;
    }
    public static void printArray(int[] array){
        for (int i = 0; i < array.length; i++){
            System.out.println("Item: " + i + " includes " + array[i]);
        }
    }
    public static int[] sortIntegers(int[] array){
        int a = array.length;
        int[] sortedArray = array.clone();
        for (int i = 0; i < a - 1; i++){
            for (int j = 0; j < a - i -1; j++){
                if (sortedArray[j] < sortedArray[j + 1]){
                    int tempor = sortedArray[j];
                    sortedArray[j] = sortedArray[j + 1];
                    sortedArray[j + 1] = tempor;
                }
            }
        }
        return sortedArray;
    }
    public static void main(String[] args){
        int[] numbers = getIntegers(5);
        System.out.println("Actual array: ");
        printArray(numbers);
        int[] sortedNumbers = sortIntegers(numbers);
        System.out.println("\nSorted array: ");
        printArray(sortedNumbers);
    }
}
