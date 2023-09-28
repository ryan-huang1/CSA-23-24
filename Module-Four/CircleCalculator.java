/*
 * CircleCalculator Program
 * Author: Ryan Huang
 * Date: 9.28.23
 * Description: This program takes two radii as input, calculates the diameter and area for each circle, 
 * and displays them in columns.
 */

// Import the Scanner class
import java.util.Scanner;

public class CircleCalculator {
    public static void main(String[] args) {
        // Create a new Scanner object to read input
        Scanner scanner = new Scanner(System.in);

        // Prompt for the first radius
        System.out.print("Enter Radius 1: ");
        double radius1 = scanner.nextDouble();

        // Prompt for the second radius
        System.out.print("Enter Radius 2: ");
        double radius2 = scanner.nextDouble();

        // Close the scanner to prevent resource leak
        scanner.close();

        // Calculate diameter and area for the first circle
        double diameter1 = 2 * radius1;
        double area1 = Math.PI * Math.pow(radius1, 2);

        // Calculate diameter and area for the second circle
        double diameter2 = 2 * radius2;
        double area2 = Math.PI * Math.pow(radius2, 2);

        // Round area to the tenths place
        area1 = Math.round(area1 * 10.0) / 10.0;
        area2 = Math.round(area2 * 10.0) / 10.0;

        // Display results
        System.out.println("Circle\t\tRadius\tDiameter\tArea");
        System.out.println("1\t\t" + radius1 + "\t\t" + diameter1 + "\t\t" + area1);
        System.out.println("2\t\t" + radius2 + "\t\t" + diameter2 + "\t\t" + area2);
    }
}

/*
 * End of CircleCalculator Program
 */