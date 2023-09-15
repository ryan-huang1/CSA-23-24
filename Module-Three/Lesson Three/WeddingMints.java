/**
 * WeddingMints Program
 * Author: Ryan Huang
 * Date: 9.14.23
 * 
 * This program calculates the number of bags that can be filled with mints
 * and the number of mints that will be left over.
 * 
 * Total number of mints is initialized to 500, and each bag can hold 3 mints.
 */

public class weddingMints {
    public static void main(String[] args) {
        // Declare and initialize the total number of mints to 500.
        int totalMints = 500;

        // Declare the number of bags and mints left over.
        int numberOfBags, mintsLeftOver;

        // Calculate the number of bags that can be filled.
        numberOfBags = totalMints / 3;

        // Calculate the number of mints left over.
        mintsLeftOver = totalMints % 3;

        // Print the results in the specified format.
        System.out.println("Total Mints = " + totalMints);
        System.out.println("Number of Bags = " + numberOfBags);
        System.out.println("Mints Leftover = " + mintsLeftOver);
    }
}

/**
 * Footer Comments:
 * 
 * This program calculates and prints the number of bags that can be filled
 * and the mints that will be left over based on a given total number of mints.
 * 
 * The calculations use integer division and the modulus operator to ensure
 * that the numbers are whole integers, as partially filled bags or broken mints
 * are not allowed.
 */
