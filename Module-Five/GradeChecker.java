// -----------------------------------------------
// Header:
// Program Name: Grade Checker
// Description: This program takes in a grade from the user and checks if the grade is passing (greater than or equal to 70).
// Author: Ryan Huang
// Date: 2023-10-12
// -----------------------------------------------
import java.io.*;
import java.util.*;

public class GradeChecker {

    public static void main(String[] args) {
        Scanner kbReader = new Scanner(System.in);
        System.out.print("What is your grade? ");
        int myGrade = kbReader.nextInt();

        if (myGrade >= 70) {
            System.out.println("Congratulations, you passed!");
        } else {
            System.out.println("Better luck next time!");
        }
    }
}
// -----------------------------------------------
// Footer:
// This program provides a simple way to check if a student's grade is passing or failing.
// Future iterations can expand on more detailed grading criteria and feedback.
// -----------------------------------------------
