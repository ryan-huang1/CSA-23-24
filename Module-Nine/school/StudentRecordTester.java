package school;

import java.io.*;
import java.util.Scanner;

public class StudentRecordTester {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please provide the filename with student records:");

        String fileName = scanner.nextLine();
        processStudentRecords(fileName);

        scanner.close();
    }

    private static void processStudentRecords(String fileName) {
        try (Scanner fileScanner = new Scanner(new File(fileName))) {
            while (fileScanner.hasNextLine()) {
                // Assuming each student's scores are on a separate line and comma-separated.
                String[] scores = fileScanner.nextLine().split(",");
                double[] assignments = parseScores(scores, 0, 15);
                double[] quizzes = parseScores(scores, 15, 22);
                double[] tests = parseScores(scores, 22, 26);
                double finalExam = Double.parseDouble(scores[26]);

                // Create and populate a StudentRecord object
                StudentRecord studentRecord = new StudentRecord();
                studentRecord.setAssignments(assignments);
                studentRecord.setQuizzes(quizzes);
                studentRecord.setTests(tests);
                studentRecord.setFinalExam(finalExam);

                // Print the student's record
                studentRecord.printStudentRecord();
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + e.getMessage());
        }
    }

    // Helper method to parse scores from a section of the array
    private static double[] parseScores(String[] scoreStrings, int start, int end) {
        double[] scores = new double[end - start];
        for (int i = start; i < end; i++) {
            scores[i - start] = Double.parseDouble(scoreStrings[i].trim());
        }
        return scores;
    }
}
