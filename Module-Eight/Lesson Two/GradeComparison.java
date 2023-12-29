import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class GradeComparison {
    public static void main(String[] args) {
        String filename = "ModuleEightLessonTwoAssignmentTwoDataFile.txt";
        try {
            Scanner fileScanner = new Scanner(new File(filename));
            // Assuming the format is consistent and -999 is used to indicate the end of grades for a course
            while (fileScanner.hasNextLine()) {
                String line = fileScanner.nextLine();
                if (line.contains("Student")) {
                    // Process student data
                    System.out.println(line); // Print the student line
                    for (int i = 0; i < 4; i++) { // Four courses per student
                        line = fileScanner.nextLine();
                        double average = calculateAverage(line);
                        System.out.println("Average for " + line.split(":")[0] + ": " + average);
                    }
                }
            }
            fileScanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred while trying to read the file.");
            e.printStackTrace();
        }
    }

    public static double calculateAverage(String gradesLine) {
        String[] parts = gradesLine.trim().split(" ");
        int sum = 0, count = 0;
        for (String part : parts) {
            if (part.equals("-999")) break; // Sentinel value indicating end of grades
            sum += Integer.parseInt(part);
            count++;
        }
        return count > 0 ? (double) sum / count : 0;
    }
}
