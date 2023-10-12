import java.util.Scanner;

public class GallonToLiter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the number of gallons
        System.out.print("Enter the number of gallons: ");
        double gallons = scanner.nextDouble();

        // Convert gallons to liters
        double liters = gallonsToLiters(gallons);

        System.out.printf("%.2f gallons is approximately %.2f liters.\n", gallons, liters);
    }

    public static double gallonsToLiters(double gallons) {
        final double CONVERSION_FACTOR = 3.78541;
        return gallons * CONVERSION_FACTOR;
    }
}
