/*
 * File Name: RHCircleTester.java
 * Author: Ryan Huang
 * Date Created: 09.20.23
 * Purpose: This class tests the functionality of the RHCircle class.
 */

public class RHCircleTester {
    public static void main(String args[]) {
        // Create first circle object with radius 35.5
        RHCircle cir1 = new RHCircle(35.5);
        System.out.println("The area of the first circle is: " + cir1.area());
        System.out.println("The circumference of the first circle is: " + cir1.circumference());
        System.out.println("The diameter of the first circle is: " + cir1.diameter());

        // Create second circle object with radius 20
        RHCircle cir2 = new RHCircle(20);
        System.out.println("The area of the second circle is: " + cir2.area());
        System.out.println("The circumference of the second circle is: " + cir2.circumference());
        System.out.println("The diameter of the second circle is: " + cir2.diameter());

        // Create third circle object with radius 50
        RHCircle cir3 = new RHCircle(50);
        System.out.println("The area of the third circle is: " + cir3.area());
        System.out.println("The circumference of the third circle is: " + cir3.circumference());
        System.out.println("The diameter of the third circle is: " + cir3.diameter());
    }
}

/*
 * File Footer: End of RHCircleTester.java
 */
