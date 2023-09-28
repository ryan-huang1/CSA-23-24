 /**
 * Program: CreditCardAddon
 * Purpose: This program calculates an add-on letter for an 8-digit credit card number based on a specific algorithm.
 *          The add-on letter is determined by summing the four 2-digit numbers in the credit card number,
 *          finding the integer remainder when divided by 26, and mapping this remainder to an ASCII character.
 * Author : Ryan Huang
 * Date   : 9.28.23
 */

import java.util.Scanner;

public class CreditCardAddon {
    public static void main(String[] args) {
        // Initialize Scanner for input
        Scanner scanner = new Scanner(System.in);
        
        // Take input for the 8-digit credit card number as four 2-digit numbers
        System.out.print("Enter the credit card number (XX XX XX XX): ");
        String creditCardInput = scanner.nextLine();
        String[] creditCardParts = creditCardInput.split(" ");
        
        // Add the four 2-digit numbers
        int totalSum = 0;
        for (String part : creditCardParts) {
            totalSum += Integer.parseInt(part);
        }
        
        // Calculate the integer remainder of the sum when divided by 26
        int remainder = totalSum % 26;
        
        // Determine the ASCII character corresponding to the remainder
        char addonLetter = (char) ('A' + remainder);
        
        // Output the credit card number along with the calculated add-on letter
        System.out.println("The correct number and code is " + creditCardInput + " " + addonLetter);
        
        // Close the scanner
        scanner.close();
    }
}

/**
 * Footer:
 * This program successfully calculates and outputs the add-on letter for an 8-digit credit card number
 * based on the specified algorithm. The add-on letter is appended to the original credit card number for the final output.
 */
