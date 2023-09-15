/**
 * ComputeThis Class
 * 
 * This class performs a series of mathematical operations and displays the results.
 * It uses Java's Math library for calculations like absolute value, square root, power, etc.
 * 
 * Author: Ryan Huang
 * Last Modified: 9.15.23
 */
public class ComputeThis {
    public static void main(String[] args) {
        // Step 1: Declare and Initialize variables
        int x = 3;
        int y = -5;
        int z = 0;
        double w = 17.5;

        // Step 2: Display initial values with labels
        System.out.println("w = " + w + ", x = " + x + ", y = " + y + ", z = " + z);

        // Step 3: Perform calculations and display with labels

        // Absolute value of y
        z = Math.abs(y);
        System.out.println("z is the absolute value of y and is " + z);

        // Square root of w
        double sqrtW = Math.sqrt(w);
        System.out.println("The square root of w is " + sqrtW);

        // x to the power of z
        double xToThePowerOfZ = Math.pow(x, z);
        System.out.println("x raised to the power of z is " + xToThePowerOfZ);

        // Max of x and y
        int maxXY = Math.max(x, y);
        System.out.println(maxXY + " is the max of x and y");

        // Min of x and y
        int minXY = Math.min(x, y);
        System.out.println(minXY + " is the min of x and y");

        // Round w
        long roundedW = Math.round(w);
        System.out.println("The rounded value of w is " + roundedW);

        // Floor value of w
        double floorW = Math.floor(w);
        System.out.println("The floor value of w is " + floorW);

        // Ceiling value of w
        double ceilW = Math.ceil(w);
        System.out.println("The ceiling value of w is " + ceilW);

        // Random number between 1 and 10
        int randomNum = 1 + (int)(Math.random() * 10);
        System.out.println("A random number between 1 and 10 is " + randomNum);

        // Documentation: This program calculates and displays various mathematical operations using Java's Math class.
    }
}

/**
 * End of ComputeThis Class
 * 
 * Additional Notes: You can extend this class to perform other mathematical operations as needed.
 */
