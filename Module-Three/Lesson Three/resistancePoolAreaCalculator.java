/**
 * ResistancePoolAreaCalculator.java
 * Purpose: This program calculates the tiled area at the bottom of a resistance pool,
 *          taking into account a circular island in the middle.
 * Author: Ryan Huang
 * Date: 9.14.23
 */

public class resistancePoolAreaCalculator {
    public static void main(String[] args) {
        // Step 1: Declare Variables
        double poolDiameter = 8.32;
        double islandDiameter = 1.91;
        double poolRadius, islandRadius;
        double poolArea, islandArea, tiledArea;
        final double PI = 3.1415; // constant for pi

        // Step 2: Perform Calculations
        // Calculate the radii
        poolRadius = poolDiameter / 2.0;
        islandRadius = islandDiameter / 2.0;

        // Calculate the areas
        poolArea = PI * Math.pow(poolRadius, 2);
        islandArea = PI * Math.pow(islandRadius, 2);

        // Calculate the tiled area by subtracting island area from pool area
        tiledArea = poolArea - islandArea;

        // Step 3: Display the Output
        System.out.printf("A resistance pool with a diameter of %.2f meters that contains a circular island of %.2f meters has %.2f square meters that needs tile.\n", poolDiameter, islandDiameter, tiledArea);
    }
}

/**
 * Footer: This program was developed to assist maintenance crews in calculating the area that needs to be tiled
 *         in resistance pools with central islands. 
 */
