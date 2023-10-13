// -----------------------------------------------
// Header:
// Program Name: Linear Equation Solver
// Description: Solves linear equations of the form Ax + B = 0 based on user input.
// Author: Ryan Huang
// Date: 2023-10-12
// -----------------------------------------------

import java.util.Scanner;

public class LinearEquationSolver {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 6; i++) { // Since we have 6 equations as examples
            System.out.print("Enter A: ");
            double A = scanner.nextDouble();
            System.out.print("Enter B: ");
            double B = scanner.nextDouble();

            // Decision making
            if (A == 0 && B == 0) {
                System.out.printf("%.2fx + %.2f = 0-->There are infinite solutions\n\n", A, B);
            } else if (A == 0) {
                System.out.printf("%.2fx + %.2f = 0-->No solution\n\n", A, B);
            } else {
                double x = -B / A;
                System.out.printf("%.2fx %+f = 0-->x = %.5f\n\n", A, B, x);
            }
        }
    }
}

// -----------------------------------------------
// Footer:
// This program efficiently determines the solution to linear equations.
// It considers all possible scenarios regarding the values of A and B.
// -----------------------------------------------
