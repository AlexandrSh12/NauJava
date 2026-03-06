package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Choose task from 1 to 5:");

        int choice = scanner.nextInt();
        System.out.println("You have chosen task: " + choice);

        switch (choice) {
            case 1 -> Task1.run();
            case 2 -> Task2.run();
            case 3 -> Task3.run();
            case 4 -> Task4.run();
            case 5 -> Task5.run();
            default -> System.out.println("There is no such task");
        }
    }
}