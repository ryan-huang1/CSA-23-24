/**
 * NameProgram
 * Author: Ryan Huang
 * Date: 9.7.23
 * Description: This program displays the full name, the length of the first name,
 * and a 3-letter substring from the last name. It demonstrates basic operations
 * like string concatenation, length calculation, and substring extraction.
 */

public class assignment {
    public static void main(String[] args) {
        // Declare and initialize variables for first and last names
        String firstName = "Ryan";
        String lastName = "Huang";

        // Display the full name
        String fullName = "My name is " + firstName + " " + lastName;
        System.out.println(fullName);

        // Display the length of the first name
        int firstNameLength = firstName.length();
        String lengthMessage = "My first name is " + firstNameLength + " letters long";
        System.out.println(lengthMessage);

        // Display a 3-letter substring from the last name
        String substringOfLastName = lastName.substring(1, 4);  // "uan" from "Huang"
        String substringMessage = "A substring of my last name is " + substringOfLastName;
        System.out.println(substringMessage);
    }
}

/**
 * Footer: End of NameProgram
 */
