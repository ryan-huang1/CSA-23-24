/**
 * WeightOnMars.java
 * Author: Ryan Huang
 * Date: 9.27.23
 * 
 * This program calculates the equivalent weight of a person on Mars
 * based on their weight on Earth. It uses a conversion factor of 0.38
 * to compute the weight on Mars and then displays the result.
 *
 */

import java.util.Scanner;

public class WeightOnMars {
    public static void main(String[] args) {
        // Initialize the Scanner
        Scanner scanner = new Scanner(System.in);

        // Declare variables
        String userName;
        double weightOnEarth;
        double weightOnMars;

        // Prompt the user for their name
        System.out.print("Please enter your name: ");
        userName = scanner.nextLine();

        // Prompt the user for their weight on Earth
        System.out.print("Please enter your weight on Earth (in lbs): ");
        weightOnEarth = scanner.nextDouble();

        // Calculate weight on Mars
        weightOnMars = weightOnEarth * 0.38;

        // Display the result
        System.out.printf("%s's weight on Earth is %.1flbs and weight on Mars is %.1flbs%n", userName, weightOnEarth, weightOnMars);

        // Close the scanner
        scanner.close();
    }
}

/**
 * Footer:
 * Thanks for using the WeightOnMars program.
 */
