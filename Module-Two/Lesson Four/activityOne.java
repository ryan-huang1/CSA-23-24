/**
 * Header: 
 * Class Name: activityOne
 * Purpose: This class is designed to demonstrate basic string manipulation and output in Java.
 * Author: Ryan Huang
 * Date: 9.7.23
 * Version: 1.0
 */

public class activityOne {

    // Main method: Entry point for the Java application
    public static void main(String args[]) {
        
        // Declare and initialize string variable 'nm' with the value "Hello"
        String nm = "Hello";

        // Declare and initialize string variable 'nx' with the value "good buddy"
        String nx = "good buddy";

        // Concatenate 'nm' and 'nx' and store the result in string variable 'c'
        // Note: There is an extra empty string between nm and nx, which doesn't add a space between them
        String c = nm + "" + nx;

        // Output the concatenated string to the console
        System.out.println(c);
    }
}

/**
 * Footer:
 * End of the activityOne class.
 * This class demonstrates basic operations like string declaration, initialization, concatenation, and output.
 */
