package org.example.homework6;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ReverseArrayOfIntegers {

    public static void reverseArray(int[] array){
        int size = array.length;
        for (int i = 0; i < size/2; i++){
            int temp = array[i];
            array[i] = array[size - 1 - i];
            array[size - 1 - i] = temp;
        }
    }
    public static void main(String[] args){
        int[] array = {1, 22, 43, 75, 91, 4};
        reverseArray(array);
        System.out.println(Arrays.toString(array));
    }
}
