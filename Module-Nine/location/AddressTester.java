package location;

import java.util.Scanner;

public class AddressTester {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter an address with a street number or post office box number, city, state, and zip.");

        System.out.print("Street: ");
        String street = scanner.nextLine();

        System.out.print("City: ");
        String city = scanner.nextLine();

        System.out.print("State (2 letters): ");
        String state = scanner.nextLine();

        System.out.print("Zip (5 digits): ");
        String zip = scanner.nextLine();

        try {
            Address address = new Address(street, city, state, zip);
            address.printAddress();
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }

        scanner.close();
    }
}
