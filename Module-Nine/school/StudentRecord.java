package school;

public class StudentRecord {
    private double[] assignments = new double[15];
    private double[] quizzes = new double[7];
    private double[] tests = new double[4];
    private double finalExam;
    private double overallNumericScore;
    private char finalLetterGrade;

    public StudentRecord() {
        // Constructor can be empty if no other initialization is required.
    }

    // Input methods to set scores
    public void setAssignments(double[] scores) {
        this.assignments = scores;
        calculateOverallNumericScore();
    }

    public void setQuizzes(double[] scores) {
        this.quizzes = scores;
        calculateOverallNumericScore();
    }

    public void setTests(double[] scores) {
        this.tests = scores;
        calculateOverallNumericScore();
    }

    public void setFinalExam(double score) {
        this.finalExam = score;
        calculateOverallNumericScore();
    }

    // Private helper methods to calculate overall score and letter grade
    private void calculateOverallNumericScore() {
        double assignmentAverage = calculateAverage(assignments) * 0.4; // 40% weight
        double quizAverage = calculateAverage(quizzes) * 0.2; // 20% weight
        double testAverage = calculateAverage(tests) * 0.2; // 20% weight
        double finalExamScore = finalExam * 0.2; // 20% weight
        overallNumericScore = assignmentAverage + quizAverage + testAverage + finalExamScore;
        calculateFinalLetterGrade();
    }

    private void calculateFinalLetterGrade() {
        if (overallNumericScore >= 90) {
            finalLetterGrade = 'A';
        } else if (overallNumericScore >= 80) {
            finalLetterGrade = 'B';
        } else if (overallNumericScore >= 70) {
            finalLetterGrade = 'C';
        } else if (overallNumericScore >= 60) {
            finalLetterGrade = 'D';
        } else {
            finalLetterGrade = 'F';
        }
    }

    private double calculateAverage(double[] scores) {
        double sum = 0;
        for (double score : scores) {
            sum += score;
        }
        return sum / scores.length;
    }

    // Output method to print student record
    public void printStudentRecord() {
        System.out.println("Student Record:");
        System.out.println("Assignments: " + arrayToString(assignments));
        System.out.println("Quizzes: " + arrayToString(quizzes));
        System.out.println("Tests: " + arrayToString(tests));
        System.out.println("Final Exam: " + finalExam);
        System.out.println("Overall Numeric Score: " + overallNumericScore);
        System.out.println("Final Letter Grade: " + finalLetterGrade);
        System.out.println();
    }

    // Helper method to convert an array to a string
    private String arrayToString(double[] array) {
        StringBuilder sb = new StringBuilder();
        for (double value : array) {
            sb.append(String.format("%.2f ", value));
        }
        return sb.toString().trim();
    }

}
