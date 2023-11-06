// GuessingGame.java
// This program allows a user to guess a randomly generated number from 1 to 10.
// The user is given three attempts to guess the number without the use of loops.
// The program provides feedback if the guess is too high, too low, or correct.

import java.util.Scanner;
import java.util.Random;

public class GuessingGame {
    public static void main(String[] args) {
        // Create a random number generator
        Random random = new Random();
        int computerNumber = random.nextInt(10) + 1; // Generates a number between 1 and 10
        
        // Create a scanner object for user input
        Scanner scanner = new Scanner(System.in);
        int userGuess; // Variable to store user's guess

        // User's first guess
        System.out.println("Guess the number (1 to 10): ");
        userGuess = scanner.nextInt();
        System.out.println("Your guess is " + userGuess + ".");
        if (userGuess == computerNumber) {
            System.out.println("Your guess is correct.");
        } else if (userGuess < computerNumber) {
            // User's second guess if the first guess is too low
            System.out.println("Your guess is too low.");
            System.out.println("Guess the number (1 to 10): ");
            userGuess = scanner.nextInt();
            System.out.println("Your guess is " + userGuess + ".");
            if (userGuess == computerNumber) {
                System.out.println("Your guess is correct.");
            } else if (userGuess < computerNumber) {
                // User's third guess if the second guess is too low
                System.out.println("Your guess is too low.");
                System.out.println("Guess the number (1 to 10): ");
                userGuess = scanner.nextInt();
                System.out.println("Your guess is " + userGuess + ".");
                if (userGuess == computerNumber) {
                    System.out.println("Your guess is correct.");
                } else {
                    // Final feedback if third guess is incorrect
                    System.out.println("Your guess is " + (userGuess < computerNumber ? "too low." : "too high."));
                    System.out.println("You're out of guesses!");
                }
            } else {
                // User's third guess if the second guess is too high
                System.out.println("Your guess is too high.");
                System.out.println("Guess the number (1 to 10): ");
                userGuess = scanner.nextInt();
                System.out.println("Your guess is " + userGuess + ".");
                if (userGuess == computerNumber) {
                    System.out.println("Your guess is correct.");
                } else {
                    // Final feedback if third guess is incorrect
                    System.out.println("Your guess is " + (userGuess < computerNumber ? "too low." : "too high."));
                    System.out.println("You're out of guesses!");
                }
            }
        } else {
            // User's second guess if the first guess is too high
            System.out.println("Your guess is too high.");
            System.out.println("Guess the number (1 to 10): ");
            userGuess = scanner.nextInt();
            System.out.println("Your guess is " + userGuess + ".");
            if (userGuess == computerNumber) {
                System.out.println("Your guess is correct.");
            } else if (userGuess < computerNumber) {
                // User's third guess if the second guess is too low
                System.out.println("Your guess is too low.");
                System.out.println("Guess the number (1 to 10): ");
                userGuess = scanner.nextInt();
                System.out.println("Your guess is " + userGuess + ".");
                if (userGuess == computerNumber) {
                    System.out.println("Your guess is correct.");
                } else {
                    // Final feedback if third guess is incorrect
                    System.out.println("Your guess is " + (userGuess < computerNumber ? "too low." : "too high."));
                    System.out.println("You're out of guesses!");
                }
            } else {
                // User's third guess if the second guess is too high
                System.out.println("Your guess is too high.");
                System.out.println("Guess the number (1 to 10): ");
                userGuess = scanner.nextInt();
                System.out.println("Your guess is " + userGuess + ".");
                if (userGuess == computerNumber) {
                    System.out.println("Your guess is correct.");
                } else {
                    // Final feedback if third guess is incorrect
                    System.out.println("Your guess is " + (userGuess < computerNumber ? "too low." : "too high."));
                    System.out.println("You're out of guesses!");
                }
            }
        }
        // Closing scanner
        scanner.close();
        // Final reveal
        // Final reveal of the correct number if not already guessed
        if (userGuess != computerNumber) {
            System.out.println("The correct number was " + computerNumber + ".");
        }

        // Closing the Scanner object
        scanner.close();
    }
}

// End of GuessingGame.java
// This program demonstrates the use of nested else-if statements for decision making without loops.
        
