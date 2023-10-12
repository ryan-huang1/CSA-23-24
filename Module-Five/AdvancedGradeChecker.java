// -----------------------------------------------
// Header:
// Program Name: Advanced Grade Checker
// Description: This program takes in a grade from the user and provides a letter grade based on the value.
// Author: Ryan Huang
// Date: 2023-10-12
// -----------------------------------------------
import java.io.*;
import java.util.*;

public class AdvancedGradeChecker {

    public static void main(String[] args) {
        Scanner kbReader = new Scanner(System.in);
        System.out.println("What is your grade? ");
        int theGrade = kbReader.nextInt();

        if (theGrade > 90) {
            System.out.println("You made an A.");
        } else if (theGrade > 80) {
            System.out.println("You made a B.");
        } else if (theGrade > 70) {
            System.out.println("You made a C.");
        } else {
            System.out.println("You failed.");
        }
    }
}
// -----------------------------------------------
// Footer:
// This program provides a more detailed grading feedback to the student based on their numerical grade.
// Future iterations can expand to include more grade ranges, such as D and F separately.
// -----------------------------------------------
