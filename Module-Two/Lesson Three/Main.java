/**
 * Main Class - Sum and Average Program
 * 
 * This program assigns four different three-digit integers to four different variables.
 * It then calculates the sum of these numbers and stores it in a fifth variable.
 * The average of the numbers is also computed and stored in a sixth variable.
 * Finally, the sum and average are displayed.
 * 
 * Author: Ryan Huang
 * Date: 9.6.23
 */

public class Main {
    public static void main(String[] args) {
        // Step 1: Assign four different three-digit integers to four variables
        int num1 = 475; // First number
        int num2 = 821; // Second number
        int num3 = 369; // Third number
        int num4 = 562; // Fourth number

        // Step 2: Sum the four numbers and store the result in a fifth variable
        int sum = num1 + num2 + num3 + num4; // Compute the sum

        // Step 3: Compute the average and store it in a sixth variable
        // To get the exact decimal value, cast the sum to double before dividing by 4
        double average = (double) sum / 4; // Compute the average

        // Step 4: Display the results to the user

        // Display a thank-you message
        System.out.println("Thank you for entering your four numbers!");
        System.out.println(); // Print an empty line for better readability

        // Display the sum
        System.out.println("The sum of the four numbers is: ");
        System.out.println(sum); // Print the sum
        System.out.println(); // Print an empty line for better readability

        // Display the average
        System.out.println("The average of the four numbers is: ");
        System.out.println(average); // Print the average
    }
}
