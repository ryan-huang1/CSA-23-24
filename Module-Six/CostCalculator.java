/**
 * Program: CostCalculator
 * Author: Ryan Huang
 * Date: 11.5.23
 * Description: This program reads a list of item costs from a file, calculates the total and average cost,
 *              and prints the costs along with the total and average. The list of costs ends with a sentinel value of 0.00,
 *              which is not processed. The program uses a while loop for efficient loop control and properly formatted output.
 */

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.text.DecimalFormat;

public class CostCalculator {
    public static void main(String[] args) throws FileNotFoundException {
        // Define the path to the data file
        String filePath = "data.txt";
        
        // Create a File instance to reference the data file
        File file = new File(filePath);
        
        // Create a Scanner instance to read the file
        Scanner scanner = new Scanner(file);
        
        // Initialize variables to keep track of the sum and count
        double sum = 0.0;
        int count = 0;
        
        // Print the header for item costs
        System.out.println("Item Costs");
        
        // Use a while loop to process each cost in the file
        while (scanner.hasNextDouble()) {
            double cost = scanner.nextDouble();
            if (cost == 0.00) break;
            System.out.printf("$%.2f \n", cost);
            sum += cost;
            count++;
        }
        
        // Close the scanner
        scanner.close();
        
        // Calculate the average cost
        double average = sum / count;
        
        // Set up a formatter to ensure the output is in the correct money format
        DecimalFormat df = new DecimalFormat("$###,##0.00");
        
        // Print the results
        System.out.println("\nThe sum of the cost= " + df.format(sum));
        System.out.println("The number of costs = " + count);
        System.out.println("The average cost = " + df.format(average));
    }
}

// End of CostCalculator Program
