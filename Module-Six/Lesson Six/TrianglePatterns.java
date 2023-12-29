import java.util.Scanner;

public class TrianglePatterns {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        while (true) { // Infinite loop to keep asking the user until they choose to exit
            System.out.print("How many rows: ");
            int rows = scanner.nextInt(); // Read the number of rows from user

            System.out.print("What character: ");
            char character = scanner.next().charAt(0); // Read the character from user

            // Nested loops to print the triangle pattern
            for (int i = 1; i <= rows; i++) { // Outer loop for each row
                for (int j = 0; j < i; j++) { // Inner loop for printing characters in each row
                    System.out.print(character);
                }
                System.out.println(); // New line after each row
            }

            System.out.println(); // New line for readability after each pattern

            // Ask the user if they want to print another shape
            System.out.print("Print another shape? (yes/no): ");
            String decision = scanner.next();
            if (!decision.equalsIgnoreCase("yes")) {
                break; // Exit the loop if the user says anything other than 'yes'
            }
        }

        scanner.close(); // Close the scanner to prevent resource leaks
    }
}
