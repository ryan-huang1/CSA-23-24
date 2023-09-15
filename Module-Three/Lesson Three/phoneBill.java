/**
 * Main.java
 * Purpose: This program calculates the total monthly cell phone bill
 *          based on a base rate, data overage charges, and a tax rate.
 * Author: Ryan Huang
 * Date: 9.14.23
 */

public class phoneBill {
    public static void main(String[] args) {
        // Declare constants (Constants)
        final double BASE_RATE = 50.0;  // Base rate for the monthly bill
        final double DATA_OVERAGE_FEE = 0.50;  // Cost per MB over the 5GB limit
        final double TAX_RATE = 0.0534;  // Tax rate of 5.34%
        
        // Declare variable for additional data usage (Declaration)
        double additionalDataUsage = 17.0;  // 17 MB over the 5GB limit
        
        // Calculate the cost for the extra data usage (Calculations)
        double overageCost = additionalDataUsage * DATA_OVERAGE_FEE;
        
        // Calculate the total bill before tax (Calculations)
        double totalBeforeTax = BASE_RATE + overageCost;
        
        // Calculate the tax amount (Calculations)
        double taxAmount = totalBeforeTax * TAX_RATE;
        
        // Calculate the total bill after tax (Calculations)
        double totalAfterTax = totalBeforeTax + taxAmount;
        
        // Round down to the nearest dollar and cast to an integer (Casting)
        int finalTotal = (int) Math.floor(totalAfterTax);
        
        // Display the final total
        System.out.println("My cell phone bill should be $" + finalTotal);
    }
}

/**
 * Footer:
 * This program successfully calculates the total monthly cell phone bill based
 * on a given base rate, data overage, and tax rate. It rounds down the final
 * amount to the nearest dollar.
 */
