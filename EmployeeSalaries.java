package org.example;
import java.util.ArrayList;
import java.util.Scanner;

public class EmployeeSalaries2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Double> salaries = new ArrayList<>();

        System.out.print("Enter the number of employees: ");
        int numEmployees = scanner.nextInt();

        for (int i = 0; i < numEmployees; i++) {
            System.out.print("Enter salary for employee " + (i + 1) + ": ");
            salaries.add(scanner.nextDouble());
        }

        double sum = 0;
        for (double salary : salaries) {
            sum += salary;
        }
        double averageSalary = sum / salaries.size();

        String category;
        if (averageSalary < 30000) {
            category = "Low Salary";
        } else if (averageSalary >= 30000 && averageSalary <= 70000) {
            category = "Medium Salary";
        } else {
            category = "High Salary";
        }

        System.out.println("The average salary is: $" + averageSalary);
        System.out.println("Salary Category: " + category);

        scanner.close();
    }
}
