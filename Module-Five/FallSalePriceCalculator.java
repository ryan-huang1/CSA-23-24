// -----------------------------------------------
// Header:
// Program Name: Fall Sale Price Calculator
// Description: This program calculates the final price of a purchase after applying discounts and tax.
// Author: Ryan Huang
// Date: 2023-10-12
// -----------------------------------------------

import java.util.Scanner;

public class FallSalePriceCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Constants
        final double TAX_RATE = 0.06;
        final double DISCOUNT_10 = 0.10;
        final double DISCOUNT_20 = 0.20;

        // Get purchase price from user
        System.out.print("Enter purchase price: ");
        double purchasePrice = scanner.nextDouble();

        // Determine discount amount
        double discountRate = (purchasePrice <= 100) ? DISCOUNT_10 : DISCOUNT_20;
        double discountAmount = purchasePrice * discountRate;
        double salePrice = purchasePrice - discountAmount;

        // Calculate tax and final price
        double tax = salePrice * TAX_RATE;
        double finalPrice = salePrice + tax;

        // Display the results
        System.out.printf("\nPurchase price:\t%.2f", purchasePrice);
        System.out.printf("\nDiscount (%.0f%%):\t%.2f", discountRate * 100, discountAmount);
        System.out.printf("\nSale price:\t%.2f", salePrice);
        System.out.printf("\nTax:\t%.2f", tax);
        System.out.printf("\nFinal price:\t%.2f\n", finalPrice);
    }
}

// -----------------------------------------------
// Footer:
// This program assists customers in understanding the breakdown of their purchase costs, 
// including discounts and taxes. Stores can use this program during sales events.
// -----------------------------------------------
