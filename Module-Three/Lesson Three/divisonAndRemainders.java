/**
 * This program demonstrates the use of the division and remainder operators in Java.
 * It calculates the quotient and remainder when dividing 19 by 3, and then
 * reconstructs the original number using these values.
 *
 * Author: Ryan Huang
 * Date: 9.13.23
 */

public class divisonAndRemainders {
    public static void main(String[] args) {

        // Declare two integer variables to store the quotient and remainder
        int quotient, remainder;

        // Calculate the quotient of dividing 19 by 3
        quotient = 19 / 3;

        // Calculate the remainder of dividing 19 by 3
        remainder = 19 % 3;

        // Print the calculated quotient
        System.out.println("The quotient : " + quotient);

        // Print the calculated remainder
        System.out.println("The remainder: " + remainder);

        // Reconstruct and print the original number using the quotient and remainder
        System.out.println("The original : " + (quotient * 3 + remainder));
    }
}

/**
 * Output:
 * The quotient : 6
 * The remainder: 1
 * The original : 19
 */
