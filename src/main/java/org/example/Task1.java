package org.example;

import java.util.Random;
import java.util.Scanner;

public class Task1 {
    public static void run() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("insert array length");
        int n = scanner.nextInt();
        int[] array = new int[n];
        Random random = new Random();

        for (int i = 0; i< n; i++){
            array[i] = random.nextInt(201) - 100;
        }

        System.out.println("Array: ");
        for (int i = 0; i< n; i++){
            System.out.print(array[i]);
            if (i < n-1)
                System.out.print(", ");
        }
        System.out.println();

        int sum = 0;
        for (int value : array){
            if (value > 0)
                sum += value;
        }
        System.out.println("Sum of positive elements: " + sum);
    }
}
