/**
 * Program: NumberClassifier
 * Author: Ryan Huang
 * Date: 11.5.23
 * Description: This program reads a file of random integer values and determines how many numbers
 *              are less than 500 and how many are greater than or equal to 500.
 */

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class NumberClassifier {
    public static void main(String[] args) {
        // Define the path to the data file
        String filePath = "numbers.txt"; // Replace with your actual file name

        // Initialize counters
        int lessThan500 = 0;
        int greaterThanOrEqualTo500 = 0;
        int totalNumbers = 0;

        try {
            // Create a File instance to reference the data file
            File file = new File(filePath);
            
            // Create a Scanner instance to read the file
            Scanner scanner = new Scanner(file);

            // Read numbers from the file until the end of file is reached
            while (scanner.hasNextInt()) {
                int number = scanner.nextInt();
                totalNumbers++; // Increment the total number count
                
                // Increment the appropriate counter based on the value of the number
                if (number < 500) {
                    lessThan500++;
                } else {
                    greaterThanOrEqualTo500++;
                }
            }
            
            // Close the scanner
            scanner.close();
            
            // Output the results
            System.out.println("The number of numbers less than 500 is " + lessThan500);
            System.out.println("The number of numbers greater than or equal to 500 is " + greaterThanOrEqualTo500);
            System.out.println("The total number of numbers is " + totalNumbers);
        } catch (FileNotFoundException e) {
            // If the file is not found, print an error message
            System.out.println("Error: File not found.");
        }
    }
}

// End of NumberClassifier Program
