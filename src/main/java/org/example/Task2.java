package org.example;

import java.util.Random;
import java.util.Scanner;
import java.util.ArrayList;

public class Task2 {
    public static void run() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("insert array length");
        int n = scanner.nextInt();

        ArrayList<Double> list = new ArrayList<>();
        Random random = new Random();

        for (int i = 0; i < n; i++){
           double value = random.nextDouble() * 200 - 100;
           value = Math.round(value * 100.0) /100.0;
           list.add(value);
        }

        System.out.println("List: " + list);

        for (int i = 1; i < list.size(); i++) {
            double current = list.get(i);
            int j = i - 1;
            while (j >= 0 && list.get(j) > current) {
                list.set(j + 1, list.get(j));
                j--;
            }
            list.set(j + 1, current);
        }

        System.out.println("Sorted list: " + list);
    }
}
