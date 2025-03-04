package org.example;

import java.util.Scanner;

public class ATMWithdrawlSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final int CORRECT_PIN = 1234;
        int attempts = 0;
        boolean authenticated = false;

        // Allow the user up to 3 attempts to enter the correct PIN
        while (attempts < 3) {
            System.out.print("Enter your PIN: ");
            int enteredPin = scanner.nextInt();

            if (enteredPin == CORRECT_PIN) {
                authenticated = true;
                break;
            } else {
                attempts++;
                System.out.println("Incorrect PIN. Attempts remaining: " + (3 - attempts));
            }
        }

        if (authenticated) {
            System.out.println("PIN accepted. You may proceed with your withdrawal.");
            System.out.print("Enter withdrawal amount: ");
            double amount = scanner.nextDouble();
            System.out.println("You have successfully withdrawn $" + amount);
        } else {
            System.out.println("Too many incorrect attempts. Your account is locked.");
        }

        scanner.close();
    }
}


