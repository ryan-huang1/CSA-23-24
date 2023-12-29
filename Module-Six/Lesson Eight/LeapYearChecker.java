import java.util.Scanner;

public class LeapYearChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input;

        do {
            // Prompt the user to enter a year
            System.out.print("Enter a year: ");
            int year = scanner.nextInt();
            
            // Display the entered year
            System.out.println("The year you entered is " + year + ".");

            // Determine if the year is a leap year
            if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
                System.out.println("The year " + year + " is a leap year.");
            } else {
                System.out.println("The year " + year + " is not a leap year.");
            }

            // Ask if the user wants to check another year
            System.out.print("Check another year? (yes/no): ");
            input = scanner.next();
        } while (input.equalsIgnoreCase("yes"));

        // Close the scanner
        scanner.close();
    }
}
