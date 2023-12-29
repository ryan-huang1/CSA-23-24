import java.util.Random;
import java.util.Scanner;

public class GuessingGame {
    public static void main(String[] args) {
        // Create a Random object for generating random numbers
        Random random = new Random();
        // Create a Scanner object for reading user input
        Scanner scanner = new Scanner(System.in);

        // Generate a random number between 1 and 100
        int numberToGuess = random.nextInt(100) + 1;
        // Set the initial payout amount
        double payout = 2.00;
        // Declare a variable to store the user's guess
        int guess;
        // Flag to track if the user has won
        boolean hasWon = false;

        // Welcome message
        System.out.println("Welcome to the Guessing Game!");

        do {
            // Prompt the user for a guess and show current payout
            System.out.printf("Payout is $%.2f. Your guess: ", payout);
            // Read the user's guess
            guess = scanner.nextInt();
            // Deduct the cost of a guess
            payout -= 0.25;

            // Check if the guess is too low, too high, or correct
            if (guess < numberToGuess) {
                System.out.println("Your guess is too low.");
            } else if (guess > numberToGuess) {
                System.out.println("Your guess is too high.");
            } else {
                // User guessed correctly; display winning message
                System.out.printf("Congratulations. Computer's number is %d. This guess cost you $%.2f.\n", numberToGuess, 2.00 - payout);
                hasWon = true;
            }

        // Continue looping as long as the user hasn't won and still has money
        } while (!hasWon && payout > 0);

        // If the user didn't guess correctly and ran out of money
        if (!hasWon) {
            System.out.println("Sorry, you have run out of money. Better luck next time!");
        }

        // Close the scanner to prevent resource leaks
        scanner.close();
    }
}
