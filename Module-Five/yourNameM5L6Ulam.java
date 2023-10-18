/**
 * Author: Ryan
 * Program name: M5L6Ulam
 * Date: Oct 18th
 * Description: This program tests Ulam's Hypothesis for numbers 1-25 
 * Numbers 1-25 converge to 1 by these rules: If odd, multiply by 3 and add 1. If even, divide by 2.
 */

public class yourNameM5L6Ulam
{
    public static void main(String args[])
    {
        // Variables
        int num;
        int print;

        // Counting loop to repeat for numbers 1-25
        for (num = 1; num <= 25; num++)
        {
            // Reset print to num
            print = num;

            // Print the first number of the sequence.
            System.out.print(print + ":  ");

            // Result controlled loop: keeps doing calculations and printing the sequence until 1 is reached
            do
            {
                // Check if the number is even or odd
                if (print % 2 == 0)
                {
                    // Even: divide by 2
                    print = print / 2;
                }
                else
                {
                    // Odd: multiply by 3 and add 1
                    print = (print * 3) + 1;
                }

                // Print the new value of print
                System.out.print(print + "  ");

            } // end do
            while (print != 1);

            // Start the next line
            System.out.println();
        } // end for loop
    } // end main method
} // end class
