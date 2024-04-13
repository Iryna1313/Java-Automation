package org.example.homework5;

import java.util.Random;

public class NumberGenerator {
    public static void main(String[] args){
        Random random = new Random();
        int[] occurrences = new int[101];
        int sum = 0;
        int count = 0;

        while (true){
            int randomItem = random.nextInt(100) + 1;
            count++;
            System.out.println("Generated item : " + randomItem);

            if (occurrences[randomItem] == 1){
                System.out.println("Item " + randomItem + " reappeared for the second time");
                break;
            }
            occurrences[randomItem]++;
            sum += randomItem;
        }
        System.out.println("Total sum of generated numbers: " + sum);
        System.out.println("Total number of generated numbers: " + count);
    }
}
