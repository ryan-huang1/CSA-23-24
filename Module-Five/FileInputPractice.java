// FileInputPractice.java
// This class is designed to read numbers from a file and compute their sum.

import java.util.Scanner;
import java.io.File;
import java.io.IOException;

public class FileInputPractice {
    public static void main (String[] args) throws IOException {
        Scanner input = new Scanner(new File("NumData.in"));
        Scanner sc;
        String currentLine;
        String answer;
        int sum;
        int i;

        while (input.hasNextLine()) {
            currentLine = input.nextLine();
            sc = new Scanner(currentLine);
            sum = 0;
            answer = "";
            while(sc.hasNextInt()) {
                i = sc.nextInt();
                if (sum == 0) answer += i;
                else answer += "+" + i;
                sum += i;
            }
            answer += "=" + sum;
            System.out.println(answer);
        }
        input.close(); // It's a good practice to close the Scanner
    }
}

// End of FileInputPractice.java
