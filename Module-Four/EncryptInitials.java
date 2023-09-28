/*
    Program: EncryptInitials
    Author: Ryan Huang
    Date: 9.28.23
    Description: A program to encrypt user-entered initials into ASCII codes.
    It validates the input, converts it to uppercase, and then
    displays both the initials and the corresponding ASCII codes.
*/

import java.util.Scanner;

public class EncryptInitials {
    public static void main(String[] args) {
        // Initialize Scanner for user input
        Scanner sc = new Scanner(System.in);

        // Prompt for first initial
        System.out.print("Enter the first initial of your first name: ");
        char firstInitial = sc.next().charAt(0);

        // Prompt for second initial
        System.out.print("Enter the first initial of your last name: ");
        char secondInitial = sc.next().charAt(0);

        // Close the scanner
        sc.close();

        // Convert initials to uppercase
        firstInitial = Character.toUpperCase(firstInitial);
        secondInitial = Character.toUpperCase(secondInitial);

        // Validate the initials
        if (!Character.isLetter(firstInitial) || !Character.isLetter(secondInitial)) {
            System.out.println("Error: Invalid character entered.");
            return;
        }

        // Convert initials to ASCII
        int asciiFirst = (int) firstInitial;
        int asciiSecond = (int) secondInitial;

        // Display the initials and ASCII codes
        System.out.println("Initials: " + firstInitial + " " + secondInitial);
        System.out.println("Encrypted Name: " + asciiFirst + " " + asciiSecond);
    }
}

/*
    End of Program
*/
