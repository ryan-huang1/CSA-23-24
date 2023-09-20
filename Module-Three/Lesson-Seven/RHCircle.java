/*
 * File Name: RHCircle.java
 * Author: Ryan Huang
 * Date Created: 09.20.23
 * Purpose: This class defines a Circle object with methods for calculating area, circumference, and diameter.
 */

public class RHCircle {
    // Instance Variable
    private double radius;

    // Default Constructor
    public RHCircle() {
        this.radius = 0.0;
    }

    // Parameterized Constructor
    public RHCircle(double radius) {
        this.radius = radius;
    }

    // Method to calculate area
    public double area() {
        double a = Math.PI * radius * radius;
        return a;
    }

    // Method to calculate circumference
    public double circumference() {
        double c = 2 * Math.PI * radius;
        return c;
    }

    // Method to calculate diameter
    public double diameter() {
        double d = 2 * radius;
        return d;
    }
}

/*
 * File Footer: End of RHCircle.java
 */
