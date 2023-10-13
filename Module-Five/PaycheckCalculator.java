// -----------------------------------------------
// Header:
// Program Name: Employee Paycheck Calculator
// Description: This program calculates an employee's paycheck based on standard rate of pay, 
//              taking into account overtime pay for hours worked over 40.
// Author: Ryan Huang
// Date: 2023-10-12
// -----------------------------------------------
import java.util.Scanner;

public class PaycheckCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Getting the number of hours worked and the standard rate of pay
        System.out.print("Enter the number of hours worked: ");
        double hoursWorked = scanner.nextDouble();
        System.out.print("Enter the standard rate of pay: ");
        double standardRate = scanner.nextDouble();

        // Calculations
        double regularHours = Math.min(40, hoursWorked);
        double overtimeHours = Math.max(0, hoursWorked - 40);
        double regularPay = regularHours * standardRate;
        double overtimeRate = standardRate * 1.5;
        double overtimePay = overtimeHours * overtimeRate;
        double grossPay = regularPay + overtimePay;

        // Displaying the results
        System.out.printf("\nHours worked\nRegular hours = %.2f\nOvertime hours = %.2f\nTotal hours = %.2f\n\n", regularHours, overtimeHours, hoursWorked);
        System.out.printf("Regular pay = %.2f\n", regularPay);
        System.out.printf("Overtime pay = %.2f\n", overtimePay);
        System.out.printf("Gross pay (total pay) = %.2f\n", grossPay);
    }
}
// -----------------------------------------------
// Footer:
// This program can be further enhanced by incorporating additional factors that might affect 
// an employee's pay such as bonuses, tax deductions, etc.
// The program serves as a foundational tool for simple paycheck calculations.
// -----------------------------------------------
