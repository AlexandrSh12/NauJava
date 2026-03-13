package org.example;

import java.util.ArrayList;

public class Task3 {
    public static void run() {
        ArrayList<Employee> employees = new ArrayList<>();

        employees.add(new Employee("Ivanov Ivan Ivanych", 35, "Boss", 120000.00));
        employees.add(new Employee("Semenov Semen Semenych", 28, "IDK", 85000.00));
        employees.add(new Employee("Lobanov Anton Ivanych", 42, "CEO", 95000.00));
        employees.add(new Employee("Kolbasenko Vadim Ivanych", 31, "IT", 75000.00));
        employees.add(new Employee("Puchkov Dim Yurich", 38, "MGMT", 110000.00));

        System.out.println("Employee list:");
        employees.forEach(System.out::println);
        System.out.println();

        boolean hasHighSalary = employees.stream()
                .anyMatch(e -> e.getSalary() > 100000.00);

        System.out.println("Есть ли сотрудник с зарплатой более 100000.00: " + hasHighSalary);
    }
}
