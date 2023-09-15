/**
 * Main.java
 * Program to calculate and display the perimeter and area of a rectangle,
 * as well as the perimeter and area of a larger rectangle that is 1 unit longer and 1 unit wider.
 * 
 * Author: Ryan Huang
 * Date: 9.12.23
 */

public class Main {
    public static void main(String[] args) {
        // Declare variables for dimensions, perimeter, and area
        int length, width, perimeter, area, bigPerimeter, bigArea;

        // Assign initial values to length and width
        length = 5;
        width = 4;

        // Calculate perimeter using the formula: 2 * (length + width)
        perimeter = 2 * (length + width);

        // Calculate area using the formula: length * width
        area = length * width;

        // Calculate the perimeter of a larger rectangle that is 1 unit longer and 1 unit wider
        bigPerimeter = 2 * ((length + 1) + (width + 1));

        // Calculate the area of a larger rectangle that is 1 unit longer and 1 unit wider
        bigArea = (length + 1) * (width + 1);

        // Display results
        System.out.println("Length  = " + length);
        System.out.println("Width = " + width);
        System.out.println("Perimeter = " + perimeter);
        System.out.println("Area = " + area);
        System.out.println("BigPerimeter = " + bigPerimeter);
        System.out.println("BigArea = " + bigArea);
    }

    // End of program
}
