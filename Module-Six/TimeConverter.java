/**
 * Program: TimeConverter
 * Author: Ryan Huang
 * Date: 11.5.23
 * Description: This program converts a given number of minutes into a combination of days, hours, and minutes.
 *              It ensures that the minute representation does not exceed 59 as per the problem statement.
 *              The program prompts the user for the number of minutes and then outputs the result in a
 *              readable format, taking into account singular and plural forms.
 */

import java.util.Scanner;

public class TimeConverter {
    public static void main(String[] args) {
        // Create a Scanner object for keyboard input
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input: ");
        
        // Read the total number of minutes from the user
        int totalMinutes = scanner.nextInt();

        // Perform calculations to convert minutes to days, hours, and minutes
        int days = totalMinutes / (24 * 60);
        int hours = (totalMinutes % (24 * 60)) / 60;
        int minutes = totalMinutes % 60;

        // Build the output string
        String output = "";
        if (days > 0) {
            output += days + " day" + (days > 1 ? "s " : " ");
        }
        if (hours > 0 || days > 0) {
            output += hours + " hour" + (hours != 1 ? "s " : " ");
        }
        output += minutes + " minute" + (minutes != 1 ? "s" : "");

        // Output the results
        System.out.println("Output: " + output);
        
        // Close the scanner
        scanner.close();
    }
}

// End of TimeConverter Program
