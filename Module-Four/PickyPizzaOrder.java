/*
 * PickyPizzaOrder Program
 * Author: Ryan Huang
 * Date: 9.28.23
 * Description: This program takes a 3-topping pizza order and displays it for the customer to review.
 */

// Import the Scanner class
import java.util.Scanner;

public class PickyPizzaOrder {
    public static void main(String[] args) {
        // Create a new Scanner object to read input
        Scanner scanner = new Scanner(System.in);

        // Prompt for crust type
        System.out.print("Enter the type of crust (thin, hand tossed, deep dish): ");
        String crust = scanner.nextLine();

        // Prompt for first topping
        System.out.print("Enter topping 1: ");
        String topping1 = scanner.nextLine();

        // Prompt for second topping
        System.out.print("Enter topping 2: ");
        String topping2 = scanner.nextLine();

        // Prompt for third topping
        System.out.print("Enter topping 3: ");
        String topping3 = scanner.nextLine();

        // Close the scanner to prevent resource leak
        scanner.close();

        // Display the order for the customer to review
        System.out.println("You have ordered a " + crust + " crust pizza with " + topping1 + ", " + topping2 + ", " + topping3);
    }
}

/*
 * End of PickyPizzaOrder Program
 */