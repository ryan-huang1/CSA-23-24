/*
 * ElectricBill Program
 * Author: Ryan Huang
 * Date: 9.28.23
 * Description: This program calculates an electric bill based on the kilowatt-hours used, 
 * including a base charge, surcharge, city tax, and late payment fee. The bill is displayed in a specified format.
 */

// Import the Scanner class
import java.util.Scanner;

public class ElectricBill {
    public static void main(String[] args) {
        // Constants
        final double COST_PER_KWH = 0.0425;
        final double SURCHARGE_RATE = 0.10;
        final double CITY_TAX_RATE = 0.03;
        final double LATE_PAYMENT_RATE = 0.04;

        // Create a new Scanner object to read input
        Scanner scanner = new Scanner(System.in);

        // Prompt for KWH used
        System.out.print("Enter KWH used: ");
        int kwhUsed = scanner.nextInt();

        // Close the scanner to prevent resource leak
        scanner.close();

        // Calculate charges
        double baseCharge = kwhUsed * COST_PER_KWH;
        double surcharge = baseCharge * SURCHARGE_RATE;
        double cityTax = baseCharge * CITY_TAX_RATE;
        double totalAmount = baseCharge + surcharge + cityTax;
        double latePayment = totalAmount * LATE_PAYMENT_RATE;

        // Round to 2 decimal points
        baseCharge = Math.round(baseCharge * 100.0) / 100.0;
        surcharge = Math.round(surcharge * 100.0) / 100.0;
        cityTax = Math.round(cityTax * 100.0) / 100.0;
        totalAmount = Math.round(totalAmount * 100.0) / 100.0;
        latePayment = Math.round((totalAmount + latePayment) * 100.0) / 100.0;

        // Display the bill
        System.out.println("            APCS  Electric");
        System.out.println("------------------------------------------------");
        System.out.printf("Kilowatts Used \t     %d @ $  %.4f\n", kwhUsed, COST_PER_KWH);
        System.out.println("------------------------------------------------");
        System.out.printf("Base Charge          \t\t$  %.2f\n", baseCharge);
        System.out.printf("Surcharge           \t\t$   %.2f\n", surcharge);
        System.out.printf("Citytax                    \t$   %.2f\n", cityTax);
        System.out.println("                              ______");
        System.out.printf("\nPay this amount          \t$  %.2f\n", totalAmount);
        System.out.printf("\nAfter May 20th Pay     \t$  %.2f\n", latePayment);
    }
}

/*
 * End of ElectricBill Program
 */
