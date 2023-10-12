import java.util.Scanner;

/**
 * Insurance Cost Calculator for Automobile Drivers.
 * This program determines the insurance cost for drivers based on their age.
 * 
 * Author: Ryan Huang
 * Date: 2023-10-12
 */
public class InsuranceCostCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the driver's age
        System.out.print("Enter the driver's age: ");
        int age = scanner.nextInt();

        // Calculate the insurance cost
        double cost = calculateInsuranceCost(age);

        // Display the results
        System.out.printf("\nDriver age = %d\n", age);
        System.out.printf("Insurance cost = %.2f\n", cost);
    }

    public static double calculateInsuranceCost(int age) {
        if (age >= 16 && age < 18) {
            return age * 88;
        } else if (age >= 18 && age < 25) {
            return age * 72;
        } else if (age >= 25) {
            return 500;
        } else {
            return 0; // Invalid age for driving
        }
    }
}

/*
Footer comments:

Test Results:
1. Driver age = 17
   Insurance cost = 1496.00

2. Driver age = 20
   Insurance cost = 1440.00

3. Driver age = 26
   Insurance cost = 500.00
*/
