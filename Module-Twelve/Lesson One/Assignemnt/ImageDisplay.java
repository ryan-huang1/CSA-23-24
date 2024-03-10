import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ImageDisplay {

    public static void main(String[] args) {
        try {
            File inputFile = new File("file.txt"); // Update this path
            Scanner fileReader = new Scanner(inputFile);
            int rowCount = 0;

            while (fileReader.hasNextLine()) {
                int value = Integer.parseInt(fileReader.nextLine());
                if (rowCount % 64 == 0) {
                    System.out.println(); // Start a new line after every 64 values
                }

                char displayChar = mapValueToChar(value);
                System.out.print(displayChar);

                rowCount++;
            }

            fileReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }

    private static char mapValueToChar(int value) {
        char displayChar;
        int category = value / 8;

        switch (category) {
            case 0:
                displayChar = ' ';
                break;
            case 1:
                displayChar = '.';
                break;
            case 2:
                displayChar = ',';
                break;
            case 3:
                displayChar = '-';
                break;
            case 4:
                displayChar = '+';
                break;
            case 5:
                displayChar = 'o';
                break;
            case 6:
                displayChar = 'O';
                break;
            case 7:
            case 8:
                displayChar = 'X';
                break; // Values above 55 fall into case 7, but division limits it to 7 or 8
            default:
                displayChar = '?'; // In case of an unexpected value
        }

        return displayChar;
    }
}
