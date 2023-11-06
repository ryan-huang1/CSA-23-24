/**
 * Program: TestScoreCalculator
 * Author: Ryan Huang
 * Date: 11.5.23
 * Description: This program reads a set of test scores from an external file. The scores are separated by spaces.
 *              It calculates the sum and average of the scores, excluding the sentinel value 0 which indicates the end of the data.
 *              It prints the scores, the sum, the number of scores, and the average.
 */

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class TestScoreCalculator {
    public static void main(String[] args) {
        // Replace with the actual path of your file
        String filePath = "scores.txt";

        // Initialize variables
        int sum = 0;
        int count = 0;
        double average;

        try {
            // Open the file
            Scanner fileScanner = new Scanner(new File(filePath));
            System.out.println("Scores");

            // Read scores from the file
            while (fileScanner.hasNextInt()) {
                int score = fileScanner.nextInt();
                // Check if the score is the sentinel value (0), then break the loop
                if (score == 0) {
                    break;
                }
                System.out.println(score);
                sum += score;
                count++;
            }

            // Close the file
            fileScanner.close();

            // Calculate the average
            average = (count > 0) ? (double) sum / count : 0;

            // Print the results
            System.out.println("The sum of the numbers = " + sum);
            System.out.println("The number of scores = " + count);
            System.out.printf("The average of the numbers = %.1f\n", average);
        } catch (FileNotFoundException e) {
            System.out.println("Error: File not found.");
        }
    }
}

// End of TestScoreCalculator Program
