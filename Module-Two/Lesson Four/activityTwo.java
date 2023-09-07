/**
 * Header: 
 * Class Name: activityTwo
 * Purpose: This class demonstrates the usage of the 'substring' method in Java for string manipulation.
 * Author: Ryan Huang
 * Date: 9.7.23
 * Version: 1.0
 */

public class activityTwo {

    // Main method: Entry point for the Java application
    public static void main(String args[]) {
        
        // Declare and initialize string variable 'myPet' with the value "Sparky the dog"
        String myPet = "Sparky the dog";

        // Extract a substring from 'myPet' starting at index 4 and ending at index 11 (inclusive)
        // Store the result in string variable 'smallPet'
        String smallPet = myPet.substring(4, 12);

        // Output the extracted substring to the console
        System.out.println(smallPet);
    }
}

/**
 * Footer:
 * End of the activityTwo class.
 * This class showcases how to extract a substring from a given string using the 'substring' method.
 */
