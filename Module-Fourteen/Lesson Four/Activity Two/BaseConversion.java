import java.util.Scanner;

/**
 * This program converts a base 10 number to any base between 2 and 16.
 * It uses recursion to perform the conversion and handles digits beyond 9 with
 * letters A-F.
 */
public class BaseConversion {

    public static void main(String[] args) {
        // Setup scanner to read from standard input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user for a base 10 number and read the input
        System.out.println("Enter the number base 10 to convert: ");
        int number = scanner.nextInt();

        // Prompt the user for the new base and read the input
        System.out.println("Enter the new base: ");
        int newBase = scanner.nextInt();

        // Validate the new base to ensure it's between 2 and 16
        if (newBase < 2 || newBase > 16) {
            System.out.println("The new base must be between 2 and 16.");
            return;
        }

        // Perform the conversion
        String converted = convertToBase(number, newBase);

        // Output the result
        System.out.println("The number " + number + " [base 10] = " + converted + " [base " + newBase + "]");
        scanner.close(); // Close the scanner
    }

    public static String convertToBase(int number, int base) {
        // Characters representing digits for bases up to 16
        String digits = "0123456789ABCDEF";
        // Base case: when number is less than base, directly return the digit/letter
        if (number < base) {
            return "" + digits.charAt(number);
        } else {
            // Recursively divide the number by the base and find the remainder
            return convertToBase(number / base, base) + digits.charAt(number % base);
        }
    }
}
