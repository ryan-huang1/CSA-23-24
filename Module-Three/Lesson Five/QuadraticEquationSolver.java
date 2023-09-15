/**
 * Program Name: QuadraticEquationSolver
 * Author: Ryan Huang
 * Date: 9.15.23
 * Description: This program solves a quadratic equation of the form ax^2 + bx + c = 0.
 * It demonstrates the use of Java's Math class to perform calculations.
 */

public class QuadraticEquationSolver {
    public static void main(String[] args) {
        // Test case 1: a = 1, b = 1, c = -2
        double a = 1;
        double b = 1;
        double c = -2;
        solveAndDisplay(a, b, c);

        // Test case 2: a = 2, b = -17, c = 21
        a = 2;
        b = -17;
        c = 21;
        solveAndDisplay(a, b, c);
    }

    // Function to calculate and display the roots
    public static void solveAndDisplay(double a, double b, double c) {
        // Calculate the discriminant
        double discriminant = Math.pow(b, 2) - 4 * a * c;

        // Check if discriminant is negative
        if (discriminant < 0) {
            System.out.println("No real roots exist.");
            return;
        }

        // Calculate the roots using the quadratic formula
        double root1 = (-b + Math.sqrt(discriminant)) / (2 * a);
        double root2 = (-b - Math.sqrt(discriminant)) / (2 * a);

        // Display the results
        System.out.println("Quadratic Equation Solver");
        System.out.printf("If a, b and c are %.1f, %.1f, and %.1f, the roots are %.1f and %.1f\n", a, b, c, root1, root2);
    }
}

/**
 * Footer:
 * Additional Remarks: The program currently only handles cases where the roots are real numbers.
 */
